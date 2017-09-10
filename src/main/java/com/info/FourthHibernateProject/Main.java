package com.info.FourthHibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.info.FirsthibernateProject.HibernateUtil;

public class Main {

	public static void main(String[] args) {

		// Write the Student_Info object into the database
		System.out.println("Inserting data into the database");
		Student student = new Student();
		student.setName("Gargiii");
		
		StudentDetail studentDetail = new StudentDetail();
		studentDetail.setMobileNumber("9560591740");
		studentDetail.setStudent(student);

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		// this would save the Student_Info object into the database
		session.save(studentDetail);
		session.getTransaction().commit();
		session.close();

		System.out.println("Done");
		

		sessionFactory.close();
	}
}
