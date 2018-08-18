package com.javabean;

import java.util.Date;

public class UserBean {
	private String username;
	private String password;
	private Date birthday;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "UserBean [username=" + username + ", password=" + password + ", birthday=" + birthday + "]";
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
