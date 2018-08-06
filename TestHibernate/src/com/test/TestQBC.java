package com.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.junit.Test;

import com.Utils.HibernateUtil;
import com.javabean.Customer;

public class TestQBC {
	@Test
	/**
	 * QBC排序查询
	 */
	public void testqbc() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Criteria createCriteria = session.createCriteria(Customer.class);
		createCriteria.addOrder(Order.asc("c_id")); //升序
		List<Customer> list = createCriteria.list();
		for (Customer customer : list) {
			System.out.println(customer.toString());
			
		}
		transaction.commit();
	}
}
