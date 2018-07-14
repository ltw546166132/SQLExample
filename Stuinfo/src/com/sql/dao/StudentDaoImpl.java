package com.sql.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.dao.javabean.Student;
import com.util.JDBCUtil;

public class StudentDaoImpl implements StudentDao{

	@Override
	public List<Student> findAll() throws SQLException {
		DataSource datasource = JDBCUtil.getDataSource();
		QueryRunner queryRunner = new QueryRunner(datasource);
		String sql = "select * from student";
		List<Student> query = queryRunner.query(sql, new BeanListHandler<Student>(Student.class));		
		return query;
	}

	@Override
	public void insert(Student stu) throws SQLException{
		QueryRunner queryrunner = new QueryRunner(JDBCUtil.getDataSource());
		queryrunner.update("insert into student values(null,?,?,?,?,?,?)", stu.getSname(), stu.getGender(), stu.getPhone(), stu.getBirthday(), stu.getHobby(), stu.getInfo());
		
	}

	@Override
	public void dodelete(String sid) throws SQLException {
		QueryRunner queryrunner = new QueryRunner(JDBCUtil.getDataSource());
		queryrunner.update("delete from student where sid=?",sid);
	}
	
	@Override
	public void updateone(Student stu) throws SQLException {
		QueryRunner queryrunner = new QueryRunner(JDBCUtil.getDataSource());
		queryrunner.update("update student set sname=?, gender=?, phone=?, birthday=?, hobby=?, info=? where sid=?",
				stu.getSname(), stu.getGender(), stu.getPhone(), stu.getBirthday(), stu.getHobby(), stu.getInfo(), stu.getSid());
	}

	@Override
	public Student findstubyid(String sid) throws SQLException {
		QueryRunner queryrunner = new QueryRunner(JDBCUtil.getDataSource());
		Student stu = queryrunner.query("select * from student where sid=?", new BeanHandler<Student>(Student.class),sid);
		return stu;
	}

	@Override
	/**
	 * 模糊查询
	 */
	public List<Student> findselect(String name,String gender) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtil.getDataSource());
		String sql ="select * from student where 1=1 ";
		List<String> parameter = new ArrayList<String>();
		if(!gender.isEmpty()) {
			parameter.add(gender);
			sql = sql + "and gender=? ";
		}
		if(!name.isEmpty()) {
			parameter.add('%'+name+'%');
			sql = sql + "and sname like ?";
		}
		List<Student> stus = queryRunner.query(sql, new BeanListHandler<Student>(Student.class), parameter.toArray());
		return stus;
	}

	@Override
	public List<Student> paging(int many, int page) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtil.getDataSource());
		int parameter = (page-1)*many;
		List<Student> list = queryRunner.query("select * from student limit ? offset ?", new BeanListHandler<Student>(Student.class), many, parameter);
		return list;
	}

	@Override
	/**
	 * 得到总列数
	 */
	public int getcount() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtil.getDataSource());
		Long count = (Long) queryRunner.query("select count(*) from student", new ScalarHandler<Long>());
		return count.intValue();
	}


}
