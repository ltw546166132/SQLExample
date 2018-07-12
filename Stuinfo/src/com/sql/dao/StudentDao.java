package com.sql.dao;

import java.sql.SQLException;
import java.util.List;

import com.dao.javabean.Student;

public interface StudentDao {
	int PAGE_MACH = 5;
	public List<?> findAll() throws SQLException;
	void insert(Student stu) throws SQLException;
	void dodelete(String sid) throws SQLException;
	public void updateone(Student stu) throws SQLException;
	public Student findstubyid(String sid) throws SQLException;
	public List<?> findselect(String name, String gender) throws SQLException;
	public List<?> paging(int many, int page) throws SQLException;
	public int getcount() throws SQLException;
}
