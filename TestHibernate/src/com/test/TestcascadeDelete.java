package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.Utils.HibernateUtil;
import com.javabean.Customer;

public class TestcascadeDelete {
	@Test
	public void testdelete() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = session.get(Customer.class, 1l);
		session.delete(customer);
		transaction.commit();
	}
}
