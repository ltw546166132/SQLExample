package com.sql.service;

import java.sql.SQLException;
import java.util.List;
import com.dao.javabean.Student;
import com.sql.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService{

	@Override
	public List<Student> findAll() throws SQLException {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		List<Student> findAllStudents = studentDaoImpl.findAll();
		return findAllStudents;
	}

	@Override
	public void insert(Student stu) throws SQLException {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		studentDaoImpl.insert(stu);
	}

}
