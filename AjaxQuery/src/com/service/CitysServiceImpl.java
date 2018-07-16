package com.service;

import java.sql.SQLException;
import java.util.List;
import com.bean.CityBean;
import com.dao.CitysDao;
import com.dao.CitysDaoImp;

public class CitysServiceImpl implements CitysService{

	@Override
	public List<CityBean> getCityList(int pid) throws SQLException {
		CitysDao citysDao = new CitysDaoImp();
		List<CityBean> cityList = (List<CityBean>) citysDao.getCityList(pid);
		return cityList;
	}

}
