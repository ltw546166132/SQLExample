package com.dao;

import java.sql.SQLException;
import java.util.List;

public interface CitysDao {
	public List<?> getCityList(int pid) throws SQLException;
}
