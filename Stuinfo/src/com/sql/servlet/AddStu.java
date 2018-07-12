package com.sql.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.javabean.Student;
import com.sql.service.StudentServiceImpl;

/**
 * Servlet implementation class AddStu
 * 实现添加一条人员信息类
 */
@WebServlet("/AddStu")
public class AddStu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStu() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");
		String birthday = request.getParameter("birthday");
		String[] hobbyarray = request.getParameterValues("hobby");
		String info = request.getParameter("info");
		String hobby1 = Arrays.toString(hobbyarray);
		String hobby2 = hobby1.substring(1, hobby1.length()-1);
		try {
			Date datebirthday = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
			StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
			Student student = new Student(name, gender, phone, datebirthday, hobby2, info);
			studentServiceImpl.insert(student);
			
		} catch (SQLException | ParseException e) {
			e.printStackTrace();
		}finally {			
			response.sendRedirect("StudentList");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
