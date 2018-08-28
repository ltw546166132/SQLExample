package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class AccountDaoImpl extends HibernateDaoSupport implements AccountDao {

	@Override
	public void outmoney(String from, int money) {
//		session.createQuery("update account set money = money-? where name=?", money, from);
	}

	@Override
	public void intomoney(String to, int money) {
//		this.getJdbcTemplate().update("update account set money = money+? where name=?", money, to);
	}

}
