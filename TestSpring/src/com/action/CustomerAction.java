package com.action;

import javax.servlet.ServletContext;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import com.javabean.Customer;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CustomerService;
import com.service.CustomerServiceImpl;

public class CustomerAction extends ActionSupport{
	
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String saveUI() {
		return "saveUI";
	}
	
	private CustomerService customerService;
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public String save() {
//		ServletContext servletContext = ServletActionContext.getServletContext();
//		WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
//		CustomerService customerService = (CustomerService) webApplicationContext.getBean("customerService");
		System.out.println("Action数据封装"+customer);
		customerService.save(customer);
		return NONE;
	}
}
