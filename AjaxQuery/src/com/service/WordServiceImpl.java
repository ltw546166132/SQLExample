package com.service;

import java.sql.SQLException;
import java.util.List;
import com.bean.Words;
import com.dao.WordDao;
import com.dao.WordDaoImpl;

public class WordServiceImpl implements WordService{

	@Override
	public List<Words> getlist(String keyword) throws SQLException {
		WordDao wordDao = new WordDaoImpl();
		List<Words> getwordlist = (List<Words>) wordDao.getwordlist(keyword);
		return getwordlist;
	}

}
