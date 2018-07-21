package com.javabean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testhibernate {
	public static void main(String[] args) {
		//1加载Hibernate核心配置文件
		Configuration configure = new Configuration().configure();
		//创建sessionFactory对象
		SessionFactory buildSessionFactory = configure.buildSessionFactory();
		//获取Session对象:类似JDBC中的Connection
		Session session = buildSessionFactory.openSession();
		//手动开启事务
		Transaction beginTransaction = session.beginTransaction();
		
		Customer customer = new Customer();
		customer.setC_name("admin");
		customer.setC_level("5");
		customer.setC_mobile("123456");
		customer.setC_phone("123456");
		session.save(customer);
		//提交事务
		beginTransaction.commit();
		//资源释放
		session.close();
	}
}
