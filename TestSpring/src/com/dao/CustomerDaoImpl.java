package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import com.javabean.Customer;
import com.utils.HibernateUtil;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao{

	@Override
	public void save(Customer customer) {
//		Session session = HibernateUtil.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		session.save(customer);
//		transaction.commit();
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Customer.class);
		detachedCriteria.add(Restrictions.like("c_name", "zz%"));
		this.getHibernateTemplate().save(customer);
		this.getHibernateTemplate().findByCriteria(detachedCriteria,1,10);
		System.out.println("执行Customer DAO");
	}

}
