package com.info.InterviewQuestions1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.info.FirsthibernateProject.HibernateUtil;

public class MainSavePersistDemo {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = (Transaction) session.beginTransaction();

		Student_Info s1 = new Student_Info();
		s1.setRoll_no(2);
		s1.setName("Kunal");
		Object obj = session.save(s1);// save method return type Serializable
										// Object
		Integer primaryKeyValue = (Integer) obj;
		System.out.println("Primary key of this save method is " + primaryKeyValue);

		Student_Info s2 = new Student_Info();
		s2.setRoll_no(3);
		s2.setName("Keshav");
		session.persist(s2);// persist method return type void

		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
