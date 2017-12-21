package com.info.InterviewQuestions1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.info.FirsthibernateProject.HibernateUtil;

public class Main {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = (Transaction) session.beginTransaction();
		
		Student_Info entityObject = (Student_Info)session.get(Student_Info.class, 10);
		entityObject.setName("updated namess");
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
