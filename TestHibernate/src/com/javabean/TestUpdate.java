package com.javabean;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.Utils.HibernateUtil;

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
