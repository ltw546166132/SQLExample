package com.service;

import java.sql.SQLException;

public interface UserService<T> {
	public T checkname(String name) throws SQLException; 
}
