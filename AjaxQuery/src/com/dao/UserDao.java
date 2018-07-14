package com.dao;

import java.sql.SQLException;

public interface UserDao<T> {
	public T checkName(String name) throws SQLException;
}
