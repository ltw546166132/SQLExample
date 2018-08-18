package com.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import com.javabean.Customer;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CustomerService;
import com.serviceimp.CustomerServiceImpl;

public class ActionCustomer extends ActionSupport{
	public String findcustomer() {
		System.out.println("findcustomer方法");
		CustomerService cusservice = new CustomerServiceImpl();
		List<Customer> cuslist = cusservice.findcustomer();
		ServletActionContext.getRequest().setAttribute("customerlist", cuslist);
		return "findsuccess";
	}
}
