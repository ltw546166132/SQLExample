package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.Utils.HibernateUtil;
import com.javabean.Customer;

public class Tesupdate {
	@Test
	public void testupdate() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = session.get(Customer.class, 2l);
		customer.setC_mobile("119");
		session.update(customer);
		transaction.commit();
		session.close();
	}
}
