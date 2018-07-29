package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import com.Utils.HibernateUtil;
import com.javabean.Customer;
import com.javabean.LinkMan;

public class TestcascadeSave {
	@Test
	public void savecascade() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setC_name("kehu1");
		customer.setC_phone("123456");
		customer.setC_mobile("123456");
		LinkMan linkMan1 = new LinkMan();
		linkMan1.setL_name("linkman1");
		linkMan1.setL_phone("linkmanphone123456");
		LinkMan linkMan2 = new LinkMan();
		linkMan2.setL_name("linkman2");
		linkMan2.setL_phone("linkmanphone654321");
		linkMan1.setCustomer(customer);
		linkMan2.setCustomer(customer);
		customer.getLinkmans().add(linkMan1);
		customer.getLinkmans().add(linkMan2);
		session.save(customer);
		transaction.commit();
	}
}
