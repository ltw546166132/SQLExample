package com.javabean;

import java.util.HashSet;
import java.util.Set;

public class Customer {

	private Long c_id;
	private String c_name;
	private String c_source;
	private String c_industry;
	private String c_level;
	private String c_phone; 
	private String c_mobile;
//	private Set<LinkMan> linkmans = new HashSet<LinkMan>();
	
	
	public Customer() {}
	public Customer(String c_name, String c_level) {
		this.c_name = c_name;
		this.c_level = c_level;
	}
	public Long getC_id() {
		return c_id;
	}
	public void setC_id(Long c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_source() {
		return c_source;
	}
	public void setC_source(String c_source) {
		this.c_source = c_source;
	}
	public String getC_industry() {
		return c_industry;
	}
	public void setC_industry(String c_industry) {
		this.c_industry = c_industry;
	}
	public String getC_level() {
		return c_level;
	}
	public void setC_level(String c_level) {
		this.c_level = c_level;
	}
	public String getC_phone() {
		return c_phone;
	}
	public void setC_phone(String c_phone) {
		this.c_phone = c_phone;
	}
	public String getC_mobile() {
		return c_mobile;
	}
	public void setC_mobile(String c_mobile) {
		this.c_mobile = c_mobile;
	}
}
