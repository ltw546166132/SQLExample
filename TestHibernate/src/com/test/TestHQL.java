package com.test;

import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.Test;
import com.Utils.HibernateUtil;
import com.javabean.Customer;
import com.javabean.LinkMan;

public class TestHQL {
//	@Test
//	public void buildcustomer() {
//		Session session = HibernateUtil.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		Customer customer = new Customer();
//		customer.setC_name("王五");
//		for(int i=1;i<=10;i++) {
//			LinkMan linkMan = new LinkMan();
//			linkMan.setL_name("LinkMan3"+i);	
//			linkMan.setCustomer(customer);
//			session.save(linkMan);
//		}
//		transaction.commit();
//	}
	
	@Test
	public void testHQL() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
//		List<Customer> list = session.createQuery("from Customer").list();
//		for (Customer customer : list) {
//			System.out.println(customer.toString());
//		}
		
		//按名称绑定参数
		Query query = session.createQuery("from Customer where c_source = :来源 and c_name like :名称");
		query.setParameter("来源", "朋友");
		query.setParameter("名称", "李%");
		List<Customer> list2 = query.list();
		for (Customer cus : list2) {
			System.out.println(cus);
		}
		
		transaction.commit();
	}
	
	@Test
	/**
	 * 投影查询
	 */
	public void demotouy() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
//		Query query = session.createQuery("select c.c_name from Customer c");
//		List<Object> list = query.list();
//		for (Object obj : list) {
//			System.out.println(obj.toString());
//		}
//		
//		Query query1 = session.createQuery("select c.c_name, c.c_level from Customer c");
//		List<Object[]> list2 = query1.list();
//		for (Object[] objects : list2) {
//			System.out.println(objects[0]);
//			System.out.println(objects[1]);
//		}
		
		List<Customer> list3 = session.createQuery("select new Customer(c_name,c_level) from Customer").list();
		for (Customer customer : list3) {
			System.out.println(customer.toString());
		}
		
		transaction.commit();
	}
	
	@Test
	/**
	 * 分页查询
	 */
	public void hqlfenye() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from LinkMan");
		query.setFirstResult(10);
		query.setMaxResults(10);
		List<LinkMan> list = query.list();
		for (LinkMan linkMan : list) {
			System.out.println(linkMan.toString());
		}
		transaction.commit();
	}
	
	@Test
	/**
	 * 分组查询
	 */
	public void hqlfenzhu() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<Object[]> list = session.createQuery("select c_name,count(*) from Customer group by c_name having count(*)>=2").list();
		for (Object[] object : list) {
			System.out.println(Arrays.toString(object));
		}
		transaction.commit();
	}
	
	@Test
	/**
	 * HQL多表查询
	 */
	public void testduobiao() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		//SQL: select * from c_customer c inner join linkman l on c.c_id=l.l_cust_id 
		//HQL内连接: from Customer c inner join c.linkmans
		//HQL迫切内连接 : from Customer c inner join fetch c.linkmans
		Query query = session.createQuery("from Customer c inner join c.linkmans");
		List<Object[]> list = query.list();
		for (Object[] objects : list) {
			System.out.println(objects.length);
			System.out.println(Arrays.toString(objects));
		}		
		transaction.commit();
	}
	
	@Test
	/**
	 * HQL迫切内连
	 */
	public void  testpoqie() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("select distinct c from Customer c inner join fetch c.linkmans");
		List<Customer> list = query.list();
		for (Customer customer : list) {
			System.out.println(customer.toString());
		}
		transaction.commit();
	}
	
}
