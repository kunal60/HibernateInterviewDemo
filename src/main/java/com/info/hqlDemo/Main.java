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
		// Query1
		String hql = "FROM Books AS B";
		Query q = session.createQuery(hql);
		List<Books> l = q.getResultList();
		System.out.println(l);

		// Query2
		// Taking Input from user
		Query q1 = session.createQuery("FROM Books B WHERE B.book_id = :a1");
		q1.setParameter("a1", "A1111");
		List l1 = q1.getResultList();
		System.out.println(l1);

		// Query3
		// https://www.w3resource.com/sql/joins/cross-join.php
		Query q2 = session.createQuery("FROM Books B,Persons P");
		List l2 = q2.getResultList();
		System.out.println(l2);
	}
}
