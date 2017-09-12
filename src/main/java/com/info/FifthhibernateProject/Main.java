package com.info.FifthhibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.info.FirsthibernateProject.HibernateUtil;

public class Main {

	public static void main(String[] args) {

		// Write the Student object into the database
		System.out.println("Inserting data into the database");
		StudentAddress studentAddress = new StudentAddress();
		studentAddress.setDetail("J&kk");

		Student student1 = new Student();
		student1.setName("Rishii");
		student1.setStudentAddress(studentAddress);// Imp Step

		Student student2 = new Student();
		student2.setName("Keshavv");
		student2.setStudentAddress(studentAddress);

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		// this would save the Students object into the database
		session.save(student1);
		session.save(student2);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
