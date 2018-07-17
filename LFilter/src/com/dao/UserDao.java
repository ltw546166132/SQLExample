package com.dao;

import java.sql.SQLException;

public interface UserDao<T> {
	public T selectBean (String name, String password) throws SQLException;
}
