package com.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.Utils.HibernateUtil;
import com.javabean.Customer;
import com.javabean.LinkMan;

public class TestSelect {
	public static void main(String[] args) {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<Customer> list = session.createQuery("from Customer").list();
		for (Customer customer : list) {
			System.out.println(customer.getC_name());
			Set<LinkMan> linkmans = customer.getLinkmans();
			for (Iterator<LinkMan> iterator = linkmans.iterator(); iterator.hasNext(); ) {
				System.out.println(iterator.next().getL_name());
			}
		}
		transaction.commit();
	}
}
