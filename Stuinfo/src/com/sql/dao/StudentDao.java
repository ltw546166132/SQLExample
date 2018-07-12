package com.sql.dao;

import java.sql.SQLException;
import java.util.List;

import com.dao.javabean.Student;

public interface StudentDao {
	public List<?> findAll() throws SQLException;
	void insert(Student stu) throws SQLException;
	void dodelete(String sid) throws SQLException;
}
