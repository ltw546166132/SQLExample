package com.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.beanutils.BeanUtils;
import com.bean.User;
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
		name = request.getParameter("name");
		password = request.getParameter("password");
		auto = request.getParameter("auto");
		System.out.println(name+".."+password+".."+auto);
		Map<String, String[]> parameterMap = request.getParameterMap();
		UserBean user = new UserBean();
		try {
			BeanUtils.populate(user, parameterMap);
			System.out.println("bean..."+user.toString());
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
 		
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		try {
			UserBean bean = userServiceImpl.getBean(name, password);
			if(bean!=null) {
				if("auto".equals(auto)) {
					Cookie cookie = new Cookie("autolaogin", name+"#"+password);
					cookie.setMaxAge(60*60*24);
					response.addCookie(cookie);
				}
				
				HttpSession session = request.getSession();
				session.setAttribute("userbean", bean);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}else {
				response.sendRedirect("login.jsp");
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
