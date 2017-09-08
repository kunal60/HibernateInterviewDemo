package com.info.FirsthibernateProject;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

	public static void main(String[] args) {

		// Write the Student_Info object into the database
		System.out.println("Inserting data into the database");
		Student_Info student = new Student_Info();
		student.setName("Rishi");
		student.setRoll_no(9);
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
		List<Student_Info> studentInfoList = session1.createQuery("FROM Student_Info").list();
		for (Student_Info eachStudentInfo : studentInfoList) {
			Student_Info st = (Student_Info) eachStudentInfo;
			System.out.println(st.getName() + " " + st.getRoll_no());
		}
		session1.close();

		sessionFactory.close();
	}
}
