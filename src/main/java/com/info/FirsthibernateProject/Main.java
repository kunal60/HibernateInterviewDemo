package com.info.FirsthibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

	public static void main(String[] args) {

		// Write the Student_Info object into the database
		Student_Info student = new Student_Info();

		student.setName("Gargi");
		student.setRoll_no(5);

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// this would save the Student_Info object into the database
		session.save(student);
		System.out.println("Im here main 4");
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
