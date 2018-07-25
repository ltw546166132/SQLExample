package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Utils.HibernateUtil;
import com.javabean.Customer;

public class TesSave {
	public static void main(String[] args) {
		Session session = HibernateUtil.getHibernatesession();
		//手动开启事务
		Transaction beginTransaction = session.beginTransaction();
		
		Customer customer = new Customer();
		customer.setC_name("admin");
		customer.setC_level("1");
		customer.setC_mobile("123456");
		customer.setC_phone("123456");
		session.save(customer);
		//提交事务
		beginTransaction.commit();
		//资源释放
		session.close();
	}
}
