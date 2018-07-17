package com.dao;

import java.sql.SQLException;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import com.bean.UserBean;
import com.util.JDBCUtil;

public class UserDaoImpl implements UserDao<UserBean>{

	@Override
	public UserBean selectBean(String name, String password) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtil.getDataSource());
		UserBean userbean = queryRunner.query("select * from t_user where name=? and password=?", new BeanHandler<UserBean>(UserBean.class), name, password);
		return userbean;
	}
	
}
