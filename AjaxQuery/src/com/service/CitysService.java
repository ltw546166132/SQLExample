package com.service;

import java.sql.SQLException;
import java.util.List;

public interface CitysService {
	public List<?> getCityList(int pid) throws SQLException;
}
