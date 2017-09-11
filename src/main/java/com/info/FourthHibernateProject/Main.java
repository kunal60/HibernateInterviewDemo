package com.info.FourthHibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.info.FirsthibernateProject.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		// One to one example
		// Write the Student_Info object into the database
		System.out.println("Inserting data into the database");
		Student student = new Student();
		student.setName("Rishi");

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

		System.out.println("Done one direction mapping");

		// Bidirection One to one Example
		Student student1 = new Student();
		student1.setName("JohnCena");
		StudentDetail studentDetail1 = new StudentDetail();
		studentDetail1.setMobileNumber("999999");
		studentDetail1.setStudent(student1);// Important Step
		student1.setStudentDetail(studentDetail1);
		Session session1 = sessionFactory.openSession();
		session1.beginTransaction();
		// this would save the Student_Info object into the database
		session1.save(student1);
		session1.getTransaction().commit();
		session1.close();
		System.out.println("Done Bi direction mapping");
		sessionFactory.close();
	}
}
