package com.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import com.bean.Words;
import com.util.JDBCUtil;

public class WordDaoImpl implements WordDao{

	@Override
	public List<Words> getwordlist(String keyword) throws SQLException {
		Properties properties = JDBCUtil.getProperties();
		QueryRunner queryRunner = new QueryRunner(JDBCUtil.getDataSource());
		List<Words> list = queryRunner.query(properties.getProperty("words"), new BeanListHandler<Words>(Words.class), keyword+'%');
		return list;
	}

}
