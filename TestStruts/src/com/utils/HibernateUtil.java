package com.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	static {
		//1加载Hibernate核心配置文件
		Configuration configure = new Configuration().configure();
		//创建sessionFactory对象
		sessionFactory = configure.buildSessionFactory();
	}
	public static Session getHibernatesession() {
		//获取Session对象:类似JDBC中的Connection
		return sessionFactory.openSession();
	} 
	
	public static Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}
