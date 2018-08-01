package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import com.Utils.HibernateUtil;
import com.javabean.Role;
import com.javabean.UserBean;

public class ManytoManyAlter {
	@Test
	public void testAlter() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		UserBean userBean1 = session.get(UserBean.class, 1l);
		Role role1 = session.get(Role.class, 1l);
		Role role3 = session.get(Role.class, 3l);
		userBean1.getRoles().remove(role1);
		userBean1.getRoles().add(role3);
		session.save(userBean1);
		transaction.commit();
	}
}
