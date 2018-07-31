package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import com.Utils.HibernateUtil;
import com.javabean.Role;
import com.javabean.UserBean;

public class TestManytoMany {
	@Test
	public void testManytomany() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		UserBean userBean1 = new UserBean();
		userBean1.setU_name("user1");
		UserBean userBean2 = new UserBean();
		userBean2.setU_name("user2");
		
		Role role1 = new Role();
		role1.setR_name("研发部");
		Role role2 = new Role();
		role2.setR_name("市场部");
		Role role3 = new Role();
		role3.setR_name("工业部");
		
		userBean1.getRoles().add(role1);
		userBean1.getRoles().add(role2); 
		userBean2.getRoles().add(role2);
		userBean2.getRoles().add(role3);
		role1.getUserset().add(userBean1);
		role2.getUserset().add(userBean1);
		role2.getUserset().add(userBean2);
		role3.getUserset().add(userBean2);
		session.save(userBean1);
		session.save(userBean2);
		session.save(role1);
		session.save(role2);
		session.save(role3);			
		transaction.commit();
		
	}
}
