package com.javabean;

public class LinkMan {
	public LinkMan(){};
	
	@Override
	public String toString() {
		return "LinkMan [l_id=" + l_id + ", l_name=" + l_name + ", l_cust_id=" + l_cust_id + ", l_gender=" + l_gender
				+ ", l_phone=" + l_phone + ", l_mobile=" + l_mobile + ", l_qq=" + l_qq + ", l_position=" + l_position
				+ ", l_memo=" + l_memo + "]";
	}
	
	/**
	 * 通过ORM方式表示：一个联系人只能属于某一个客户
	 * 放置的是一的一方的对象
	 */
	private Customer cusomer;
	private Long l_id;
	private String l_name;
	private Long l_cust_id;
	private String l_gender;
	private String l_phone;
	private String l_mobile;
	private String l_qq;
	private String l_position;
	private String l_memo;
	
	public Customer getCusomer() {
		return cusomer;
	}
	public void setCusomer(Customer cusomer) {
		this.cusomer = cusomer;
	}
	
	public Long getL_id() {
		return l_id;
	}
	public void setL_id(Long l_id) {
		this.l_id = l_id;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public Long getL_cust_id() {
		return l_cust_id;
	}
	public void setL_cust_id(Long l_cust_id) {
		this.l_cust_id = l_cust_id;
	}
	public String getL_gender() {
		return l_gender;
	}
	public void setL_gender(String l_gender) {
		this.l_gender = l_gender;
	}
	public String getL_phone() {
		return l_phone;
	}
	public void setL_phone(String l_phone) {
		this.l_phone = l_phone;
	}
	public String getL_mobile() {
		return l_mobile;
	}
	public void setL_mobile(String l_mobile) {
		this.l_mobile = l_mobile;
	}
	public String getL_qq() {
		return l_qq;
	}
	public void setL_qq(String l_qq) {
		this.l_qq = l_qq;
	}
	public String getL_position() {
		return l_position;
	}
	public void setL_position(String l_position) {
		this.l_position = l_position;
	}
	public String getL_memo() {
		return l_memo;
	}
	public void setL_memo(String l_memo) {
		this.l_memo = l_memo;
	}
	
}
