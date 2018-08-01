package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import com.Utils.HibernateUtil;
import com.javabean.Customer;
import com.javabean.LinkMan;

public class TestOnetoMany {
	public static void main(String[] args) {
		testonetomany();
	}
	@Test
	public static void testonetomany() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		//创建客户
		Customer customer1 = new Customer();
		customer1.setC_name("1122");
		Customer customer2 = new Customer();
		customer2.setC_name("2233");
		//创建联系人
		LinkMan linkMan1 = new LinkMan();
		linkMan1.setL_name("link1");
		LinkMan linkMan2 = new LinkMan();
		linkMan2.setL_name("link2");
		LinkMan linkMan3 = new LinkMan();
		linkMan3.setL_name("link3");
		//设置关系
		linkMan1.setCustomer(customer1);
		linkMan2.setCustomer(customer1);
		linkMan3.setCustomer(customer2);
		customer1.getLinkmans().add(linkMan1);
		customer1.getLinkmans().add(linkMan2);
		customer2.getLinkmans().add(linkMan3);
		//保存数据
		session.save(customer1);
		session.save(customer2);
		session.save(linkMan1);
		session.save(linkMan2);
		session.save(linkMan3);
		transaction.commit();
	}
}
