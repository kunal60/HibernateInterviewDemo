package com.info.ThirdHibernateProject;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.info.FirsthibernateProject.HibernateUtil;

public class Main {

	public static void main(String[] args) {

		// Write the Student_Info object into the database
		System.out.println("Inserting data into the database");
		Student_Info3 student = new Student_Info3();
		student.setName("Keshav");

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		// this would save the Student_Info object into the database
		session.save(student);
		session.getTransaction().commit();
		session.close();

		System.out.println("Fetching data from the database");
		Session session1 = sessionFactory.openSession();
		// In session.createQuery("Pass the className instead of Database Table
		// Name")
		List<Student_Info3> studentInfoList = session1.createQuery("FROM Student_Info3").list();
		for (Student_Info3 eachStudentInfo : studentInfoList) {
			Student_Info3 st = (Student_Info3) eachStudentInfo;
			System.out.println(st.getName() + " " + st.getSerial_num());
		}
		session1.close();

		sessionFactory.close();
	}
}
