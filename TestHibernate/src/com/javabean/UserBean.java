package com.javabean;

import java.util.HashSet;
import java.util.Set;

public class UserBean {
	private Long u_id;
	private String u_code;
	private String u_name;
	private String u_password;
	private String u_state;
	private Set<Role> roles = new HashSet<Role>();
	public Long getU_id() {
		return u_id;
	}
	public void setU_id(Long u_id) {
		this.u_id = u_id;
	}
	public String getU_code() {
		return u_code;
	}
	public void setU_code(String u_code) {
		this.u_code = u_code;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public String getU_state() {
		return u_state;
	}
	public void setU_state(String u_state) {
		this.u_state = u_state;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	} 
}
