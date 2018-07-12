package com.sql.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.javabean.Student;
import com.sql.service.StudentServiceImpl;

/**
 * Servlet implementation class FindSelect
 * 模糊查询
 */
@WebServlet("/FindSelect")
public class FindSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindSelect() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String sname = request.getParameter("name");
		String gender = request.getParameter("gender");
		StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
		try {
			List<Student> list = studentServiceImpl.findselect(sname, gender);
			request.setAttribute("findStudents", list);
			request.getRequestDispatcher("findAllStu.jsp").forward(request, response);
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
