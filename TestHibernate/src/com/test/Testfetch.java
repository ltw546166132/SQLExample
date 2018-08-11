package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.Test;
import com.Utils.HibernateUtil;
import com.javabean.Customer;
import com.javabean.LinkMan;

public class Testfetch {
	
	@Test
	public void testfetch() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		LinkMan linkman = session.load(LinkMan.class, 2l);
		System.out.println("linkman"+linkman.toString());
		Customer customer = linkman.getCustomer();
		System.out.println("linkman"+customer.toString());
		transaction.commit();
	}
	
	@Test
	public void testbatchsize(){
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from LinkMan");
		List<LinkMan> list = query.list();
		for (LinkMan linkMan : list) {
			System.out.println(linkMan.getL_name());
			Customer customer = linkMan.getCustomer();
			System.out.println(customer.getC_name());
		}
		transaction.commit();
	}
}
