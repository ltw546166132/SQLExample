package com.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import com.bean.CityBean;
import com.util.JDBCUtil;

public class CitysDaoImp implements CitysDao{

	@Override
	public List<CityBean> getCityList(int pid) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtil.getDataSource());
		Properties properties = JDBCUtil.getProperties();
		List<CityBean> citylist = queryRunner.query(properties.getProperty("getCitys"), new BeanListHandler<CityBean>(CityBean.class), pid);
		return citylist;
	}

}
