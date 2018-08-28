package com.service;

import javax.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;
import com.dao.AccountDao;

@Transactional
public class AccountServiceImpl implements AccountService {
	
	@Resource(name="AccountDao")
	private AccountDao accountdao;
	
	@Override
	public void transfer(String from, String to, int money) {
		accountdao.outmoney(from, money);
		accountdao.intomoney(to, money);
	}

}
