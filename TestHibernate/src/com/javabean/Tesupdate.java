package com.javabean;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.Utils.HibernateUtil;

public class Tesupdate {
	@Test
	public void testupdate() {
		Session session = HibernateUtil.getHibernatesession();
		Transaction transaction = session.beginTransaction();
		Customer customer = session.get(Customer.class, 2l);
		customer.setC_mobile("110");
		session.update(customer);
		transaction.commit();
		session.close();
	}
}
