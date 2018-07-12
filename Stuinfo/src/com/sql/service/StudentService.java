package com.sql.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.javabean.Student;

public interface StudentService {
	public List<?> findAll() throws SQLException;
	public void insert(Student stu) throws SQLException;
	public void dodelete(String sid) throws SQLException;
}
