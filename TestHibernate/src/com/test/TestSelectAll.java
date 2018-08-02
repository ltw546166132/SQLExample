package com.test;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.Utils.HibernateUtil;
import com.javabean.Customer;

public class TestSelectAll {
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getHibernatesession();
		Transaction transaction = session.beginTransaction();
		/**
		 * Query对象操作不需要写sql语句但要写hql语句
		 */
//		Query query = session.createQuery("from Customer");	
//		List<Customer> list = query.list();
//		for (Customer customer : list) {
//			System.out.println(customer);
//		}
//		
//		query.setFirstResult(1);
//		query.setMaxResults(3);
//		List<Customer> list2 = query.list();
//		for (Customer customer : list2) {
//			System.out.println(customer);
//		}
		
		/**
		 * CriteriaBuilder对象操作不需要sql语句
		 */
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Customer> createQuery = criteriaBuilder.createQuery(Customer.class);
		Root<Customer> root = createQuery.from(Customer.class);
		createQuery.where(criteriaBuilder.like(root.get("c_name"), "%d%"));
		List<Customer> list3 = session.createQuery(createQuery).getResultList();
		for (Customer customer : list3) {
			System.out.println(customer);
		}
		transaction.commit();
		session.close();
	}
}
