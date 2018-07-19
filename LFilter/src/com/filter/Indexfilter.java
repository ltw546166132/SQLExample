package com.filter;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.bean.UserBean;
import com.service.UserServiceImpl;
import com.util.CookiesUtil;

/**
 * Servlet Filter implementation class Loginfilter
 */
@WebFilter("/Loginfilter")
public class Indexfilter implements Filter {

    /**
     * Default constructor. 
     */
    public Indexfilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httprequest = (HttpServletRequest) request;
		HttpSession session = httprequest.getSession();
		if(session.getAttribute("userbean") != null) {
			chain.doFilter(request, response);
		}else {
			Cookie[] cookies = httprequest.getCookies();
			if(cookies!=null) {
				Cookie cookie = CookiesUtil.getCookie(cookies, "atuologin");
				if(cookie!=null) {
					String value = cookie.getValue();
					String[] split = value.split("#");
					String username = split[0];
					String userpassword = split[1];
					UserServiceImpl userserviceimpl = new UserServiceImpl();
					try {
						UserBean bean = userserviceimpl.getBean(username, userpassword);
						if (bean!=null) {
							session.setAttribute("userbean", bean);
							chain.doFilter(request, response);
						} else {
							chain.doFilter(request, response);
						}
						
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}else {
					chain.doFilter(request, response);
				}
				
			}else {
				chain.doFilter(request, response);
			}
			
		}
		//chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
