package com.itheima.crm.web.action;

import org.hibernate.criterion.DetachedCriteria;

import com.itheima.crm.domain.Customer;
import com.itheima.crm.domain.PageBean;
import com.itheima.crm.service.CustomerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
	
	Customer customer = new Customer();
	@Override
	public Customer getModel() {
		return customer;
	}
	
	//注入Service
	private CustomerService customerService;
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	private Integer currPage = 1;
	public void setCurrPage(Integer currPage) {
		if(currPage == null) {
			this.currPage = 1;
		}else {
			this.currPage = currPage;
		}
	}
	
	private Integer pageSize = 3;
	public void setPageSize(Integer pageSize) {
		if(pageSize==null) {
			this.pageSize = 3;
		}else {
			this.pageSize = pageSize;
		}
	}

	//客户管理跳转添加页面saveUI
	public String saveUI() {
		return "saveUI";
	}
	
	public String save() {
		customerService.save(customer);
		return NONE;
	}
	
	//分页查询客户方法
	public String findAll() {
		//最好使用DetachedCriteria对象(条件查询--带分页)
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Customer.class);
		//调用业务层查询
		PageBean<Customer> pagebean = customerService.findByPage(detachedCriteria, currPage, pageSize);
		ActionContext.getContext().getValueStack().push(pagebean);
		return "findAll";
	}
	
}
