package com.struts2.demo1;

import com.javabean.UserBean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class FengzModel extends ActionSupport implements ModelDriven<UserBean>{
	UserBean user = new UserBean(); 
	@Override
	public UserBean getModel() {
		return user;
	}
	
	public String fzModel() {
		System.out.println(user.toString());
		return NONE;
	}
}
