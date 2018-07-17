package com.service;

import java.sql.SQLException;

public interface UserService<T> {
	public T getBean(String name, String password) throws SQLException;
}
