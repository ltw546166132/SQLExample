package com.sql.servlet;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.javabean.PageBean;
import com.dao.javabean.Student;
import com.sql.service.StudentService;
import com.sql.service.StudentServiceImpl;

/**
 * Servlet implementation class Paging
 */
@WebServlet("/Paging")
public class Paging extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Paging() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		int currentPage = Integer.parseInt(request.getParameter("currentPage"));
		StudentService studentService = new StudentServiceImpl();
		try {
			PageBean<Student> pageBean = studentService.stupagebean(currentPage);
			request.setAttribute("pageBean", pageBean);
			request.getRequestDispatcher("list_page.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
