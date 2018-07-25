package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Utils.HibernateUtil;
import com.javabean.Customer;

public class TestDelete {
	public static void main(String[] args) {
		Session session = HibernateUtil.getHibernatesession();
		Transaction transaction = session.beginTransaction();
		Customer customer = session.get(Customer.class, 2l);
		session.delete(customer);
		transaction.commit();
		session.close();
	}
}
