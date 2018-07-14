package com.dao;

import java.sql.SQLException;
import java.util.Properties;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import com.util.JDBCUtil;

public class UserDaoImpl implements UserDao<Boolean>{

	@Override
	public Boolean checkName(String name) throws SQLException {
		QueryRunner queryrunner = new QueryRunner(JDBCUtil.getDataSource());
		Properties properties = JDBCUtil.getProperties();
		Long count = queryrunner.query(properties.getProperty("checkname"), new ScalarHandler<>(), name);
		return count>0;
	}

}
