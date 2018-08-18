package com.serviceimp;

import java.util.List;

import com.dao.CustomerDao;
import com.daoimp.CustomerDaoImpl;
import com.javabean.Customer;
import com.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{

	@Override
	public List<Customer> findcustomer() {
		CustomerDao cusdao = new CustomerDaoImpl();
		List<Customer> findcustomer = cusdao.findcustomer();
		return findcustomer;
	}

}
