package com.info.SecondHibernateProject;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.info.FirsthibernateProject.HibernateUtil;

public class Main {

	public static void main(String[] args) {

		// Write the Student_Info object into the database
		System.out.println("Inserting data into the database");
		Student_NewInfo student = new Student_NewInfo();
		student.setName("Rishi");
		student.setRoll_no(50);// Keep changing this value;otherwise it will
								// throw unique constraint error
		student.setAddress("Rajouri");

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
		List<Student_NewInfo> studentInfoList = session1.createQuery("FROM Student_NewInfo").list();
		for (Student_NewInfo eachStudentInfo : studentInfoList) {
			Student_NewInfo st = (Student_NewInfo) eachStudentInfo;
			System.out.println(st.getName() + " " + st.getRoll_no());
		}
		session1.close();

		sessionFactory.close();
	}
}
