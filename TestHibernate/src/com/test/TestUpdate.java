package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.Utils.HibernateUtil;
import com.javabean.Customer;

public class TestUpdate {
	public static void main(String[] args) {
		Session session = HibernateUtil.getHibernatesession();
		Transaction transaction = session.beginTransaction();
		Customer customer = session.get(Customer.class, 2l);
		customer.setC_level("4");
		session.update(customer);
		transaction.commit();
		session.close();
	}
}
