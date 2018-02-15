package com.info.hqlDemo;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.info.FirsthibernateProject.HibernateUtil;;

public class Main {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		String hql = "FROM Books";
		Query q = session.createQuery(hql);
		List<Books> l = q.getResultList();
		System.out.println(l);
	

	}
}
