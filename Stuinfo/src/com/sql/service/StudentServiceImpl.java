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

	@Override
	public void updateone(Student stu) throws SQLException {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		studentDaoImpl.updateone(stu);
	}

	@Override
	public Student findstubysid(String sid) throws SQLException {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		Student stu = studentDaoImpl.findstubyid(sid);
		return stu;
	}

	@Override
	public List<Student> findselect(String name, String gender) throws SQLException {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		List<Student> stus = studentDaoImpl.findselect(name,gender);
		return stus;
	}

}
