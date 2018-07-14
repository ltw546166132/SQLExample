package com.dao;

import java.sql.SQLException;
import java.util.List;

public interface WordDao {
	public List<?> getwordlist(String keyword) throws SQLException;
}
