package com.dao;

public class UserDaoImpl implements UserDao{

	@Override
	public void save() {
		System.out.println("DAO保存用户");
	}

}
