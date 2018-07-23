package com.javabean;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Utils.HibernateUtil;

public class TestSelectAll {
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getHibernatesession();
		Transaction transaction = session.beginTransaction();
		
	}
}
