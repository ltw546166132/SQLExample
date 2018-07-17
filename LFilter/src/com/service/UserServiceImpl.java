package com.service;

import java.sql.SQLException;
import com.bean.UserBean;
import com.dao.UserDaoImpl;

public class UserServiceImpl implements UserService<UserBean>{

	@Override
	public UserBean getBean(String name, String password) throws SQLException {
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		UserBean userbean = userDaoImpl.selectBean(name, password);
		return userbean;
	}

}
