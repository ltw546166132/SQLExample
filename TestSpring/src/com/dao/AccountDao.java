package com.dao;

public interface AccountDao {
	public void outmoney(String from, int money);
	public void intomoney(String to, int money);
}
