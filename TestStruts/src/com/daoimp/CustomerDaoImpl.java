package com.daoimp;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.dao.CustomerDao;
import com.javabean.Customer;
import com.utils.HibernateUtil;

public class CustomerDaoImpl implements CustomerDao{

	@Override
	public List<Customer> findcustomer() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<Customer> list = session.createQuery("from Customer").list();
		transaction.commit();
		return list;
	}

}
