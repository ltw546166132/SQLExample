package com.sql.dao;

import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
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


}
