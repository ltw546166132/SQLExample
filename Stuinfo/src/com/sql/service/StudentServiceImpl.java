package com.sql.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.javabean.PageBean;
import com.dao.javabean.Student;
import com.sql.dao.StudentDao;
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
	public void dodelete(String sid) throws SQLException {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		studentDaoImpl.dodelete(sid);
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

	@Override
	public PageBean<Student> stupagebean(int page) throws SQLException {
		PageBean<Student> pageBean = new PageBean<Student>();
		int count = new StudentDaoImpl().getcount();
		pageBean.setCurrentPage(page);
		pageBean.setList(new StudentDaoImpl().paging(StudentDao.PAGE_MACH, page));
		pageBean.setPageSize(StudentDao.PAGE_MACH);
		pageBean.setTotalSize(count);
		pageBean.setTotalPage((count-1)/StudentDao.PAGE_MACH+1);
		return pageBean;
	}

}
