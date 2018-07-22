package com.javabean;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Utils.HibernateUtil;

public class TestSelect {
	public static void main(String[] args) {
		Session session = HibernateUtil.getHibernatesession();
		Transaction transaction = session.beginTransaction();
		Customer customer = session.get(Customer.class, 2l);
		System.out.println(customer);
		transaction.commit();
		session.close();
	}
}
