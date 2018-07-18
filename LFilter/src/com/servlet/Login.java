package com.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.UserBean;
import com.service.UserServiceImpl;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = null;
		String password = null;
		String auto = null;;
		Cookie[] cookies = request.getCookies();
		if(cookies!=null) {
			for (Cookie cookie : cookies) {
				if(cookie.getName()=="username") {
					name = cookie.getName();
				}
			}
		}else {
			name = request.getParameter("name");
			password = request.getParameter("password");
			auto = request.getParameter("auto");
			System.out.println(name+".."+password+".."+auto);
		}
		
		
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		try {
			UserBean bean = userServiceImpl.getBean(name, password);
			if(bean!=null) {
				HttpSession session = request.getSession();
				session.setAttribute("username", name);
				session.setAttribute("password", password);
				Cookie cookiename = new Cookie("username", name);
				Cookie cookiepassword = new Cookie("userpassword", password);
				response.addCookie(cookiename);
				response.addCookie(cookiepassword);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
