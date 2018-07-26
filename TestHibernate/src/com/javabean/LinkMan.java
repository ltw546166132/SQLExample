package com.javabean;

public class LinkMan {
	
	/**
	 * 通过ORM方式表示：一个联系人只能属于某一个客户
	 * 放置的是一的一方的对象
	 */
	private Customer customer;
	private Long l_id;
	private String l_name;
	private String l_gender;
	private String l_phone;
	private String l_mobile;
	private String l_email;
	private String l_qq;
	private String l_position;
	private String l_memo;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
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
	public String getL_email() {
		return l_email;
	}
	public void setL_email(String l_email) {
		this.l_email = l_email;
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
