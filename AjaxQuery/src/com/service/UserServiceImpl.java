package com.service;

import java.sql.SQLException;
import com.dao.UserDao;
import com.dao.UserDaoImpl;

public class UserServiceImpl implements UserService<Boolean>{

	@Override
	public Boolean checkname(String name) throws SQLException {
		UserDao<Boolean> userDao = new UserDaoImpl();
		Boolean count = userDao.checkName(name);
		return count;
	}

}
