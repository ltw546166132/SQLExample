package com.service;

import java.sql.SQLException;
import java.util.List;
import com.bean.Words;
import com.dao.WordDaoImpl;

public class WordServiceImpl implements WordService{

	@Override
	public List<Words> getlist(String keyword) throws SQLException {
		WordDaoImpl wordDaoImpl = new WordDaoImpl();
		List<Words> getwordlist = wordDaoImpl.getwordlist(keyword);
		return getwordlist;
	}

}
