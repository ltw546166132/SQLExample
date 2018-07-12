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
import com.sql.service.StudentService;
import com.sql.service.StudentServiceImpl;

/**
 * Servlet implementation class EditStu
 */
@WebServlet("/EditStu")
public class EditStu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditStu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String sid = request.getParameter("sid");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");
		String birthday = request.getParameter("birthday");
		String[] hobbyarray = request.getParameterValues("hobby");
		String info = request.getParameter("info");
		
		try {
			int id = Integer.parseInt(sid);
			String hobby1 = Arrays.toString(hobbyarray);
			System.out.println("爱好...."+hobby1);
			String hobby2 = hobby1.substring(1, hobby1.length()-1);
			Date birthday1 = new SimpleDateFormat("yyyy-mm-dd").parse(birthday);
			Student stu = new Student(id, name, gender, phone, birthday1, hobby2, info);
			StudentService studentService = new StudentServiceImpl();
			studentService.updateone(stu);
			response.sendRedirect("StudentList");
		} catch (ParseException | SQLException e) {
			// TODO Auto-generated catch block
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
