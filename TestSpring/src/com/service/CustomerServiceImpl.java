package com.service;

import org.springframework.transaction.annotation.Transactional;
import com.dao.CustomerDao;
import com.javabean.Customer;

@Transactional
public class CustomerServiceImpl implements CustomerService{
	private CustomerDao customerdao;
	public void setCustomerdao(CustomerDao customerdao) {
		this.customerdao = customerdao;
	}
	@Override
	public void save(Customer customer) {
		customerdao.save(customer);
		System.out.println("CustomerSevice执行Save方法");
	}

}
