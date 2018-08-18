package com.struts2.demo1;

import com.opensymphony.xwork2.ActionSupport;

public class ActionDemo2 extends ActionSupport{
	public String find() {
		System.out.println("通配符find");
		return NONE;
	}
	public String update() {
		System.out.println("通配符update");
		return NONE;
	}
}
