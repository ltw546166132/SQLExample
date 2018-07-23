package com.javabean;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.Utils.HibernateUtil;

public class TestSelectAll {
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getHibernatesession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from Customer");
		List<Customer> list = query.list();
		for (Customer customer : list) {
			System.out.println(customer);
		}
		transaction.commit();
		session.close();
	}
}
