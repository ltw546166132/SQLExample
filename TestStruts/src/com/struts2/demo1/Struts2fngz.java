package com.struts2.demo1;

import com.javabean.UserBean;
import com.opensymphony.xwork2.ActionSupport;

public class Struts2fngz extends ActionSupport{
	private UserBean user;
	public UserBean getUser() {
		return user;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	
	public String getParameters() {
		System.out.println(user);
		return NONE;
		
	}
}
