package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.Utils.HibernateUtil;
import com.javabean.Customer;
import com.javabean.LinkMan;

public class TestOnetoMany {
	@Test
	public void testonetomany() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		//创建客户
		Customer customer1 = new Customer();
		customer1.setC_name("李四");
		Customer customer2 = new Customer();
		customer2.setC_name("王五");
		//创建联系人
		LinkMan linkMan1 = new LinkMan();
		linkMan1.setL_name("link1");
		LinkMan linkMan2 = new LinkMan();
		linkMan2.setL_name("link2");
		LinkMan linkMan3 = new LinkMan();
		linkMan3.setL_name("link3");
		transaction.commit();
		//设置关系
		
	}
}
