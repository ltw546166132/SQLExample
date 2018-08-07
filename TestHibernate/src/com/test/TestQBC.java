package com.test;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import com.Utils.HibernateUtil;
import com.javabean.Customer;
import com.javabean.LinkMan;

public class TestQBC {
	@Test
	/**
	 * QBC排序查询
	 */
	public void testqbc() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Criteria createCriteria = session.createCriteria(Customer.class);
		createCriteria.addOrder(Order.asc("c_id")); //升序
		List<Customer> list = createCriteria.list();
		for (Customer customer : list) {
			System.out.println(customer.toString());
		}
		transaction.commit();
	}
	
	@Test
	/**
	 * QBC分页查询
	 */
	public void testfenye() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(LinkMan.class);
		criteria.setFirstResult(0);
		criteria.setMaxResults(3);
		List<LinkMan> list = criteria.list();
		for (LinkMan linkman : list) {
			System.out.println(linkman.toString());
		}
		transaction.commit();
	}
	
	@Test
	/**
	 * QBC条件查询
	 *  =  eq
	 *  >  gt
	 *  >=  ge
	 *  <  lt 
	 *  <=  le
	 *  <>  ne
	 *  like 
	 *  in
	 *  and
	 */
	public void testtiaojian() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(LinkMan.class);
		criteria.add(Restrictions.eq("l_id", 3l));
		List<LinkMan> list = criteria.list();
		for (LinkMan linkMan : list) {
			System.out.println(linkMan.toString());
		}
		transaction.commit();
	}
	
	@Test
	/**
	 * QBC统计查询
	 * add :普通的条件。where后面的条件
	 * addOrder :排序
	 * setProject :聚合函数 和 group by having
	 */
	public void testtongji() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(LinkMan.class);
		criteria.setProjection(Projections.rowCount());
		Long num = (Long) criteria.uniqueResult();
		System.out.println(num);
		transaction.commit();
	}
	
	
}
