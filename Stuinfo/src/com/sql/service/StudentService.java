package com.sql.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.javabean.Student;

public interface StudentService {
	public List<?> findAll() throws SQLException;
	public void insert(Student stu) throws SQLException;
	public void updateone(Student stu) throws SQLException;
	public Student findstubysid(String sid) throws SQLException;
	public List<?> findselect(String name, String gender) throws SQLException;
}
