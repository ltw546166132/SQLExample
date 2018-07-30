package com.javabean;

import java.util.Set;

public class Role {
	private Long r_id;
	private String r_name;
	private String r_memo;
	private Set<UserBean> userset;
	public Long getR_id() {
		return r_id;
	}
	public void setR_id(Long r_id) {
		this.r_id = r_id;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public String getR_memo() {
		return r_memo;
	}
	public void setR_memo(String r_memo) {
		this.r_memo = r_memo;
	}
	public Set<UserBean> getUserset() {
		return userset;
	}
	public void setUserset(Set<UserBean> userset) {
		this.userset = userset;
	}
}
