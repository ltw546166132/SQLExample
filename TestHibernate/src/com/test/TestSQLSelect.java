package com.test;

import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.junit.Test;
import com.Utils.HibernateUtil;
import com.javabean.Customer;

public class TestSQLSelect {
	@Test
	/**
	 * SQL语句查询
	 * 
	 */
	public void testsql() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		SQLQuery sqlQuery = session.createSQLQuery("select * from c_customer");
		sqlQuery.addEntity(Customer.class);
		List<Customer> list = sqlQuery.list();
		for (Customer customer : list) {
			System.out.println(customer.toString());
		}
		transaction.commit();
	}
}
