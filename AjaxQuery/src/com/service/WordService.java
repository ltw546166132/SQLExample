package com.service;

import java.sql.SQLException;
import java.util.List;

public interface WordService {
	public List<?> getlist(String keyword) throws SQLException;
}
