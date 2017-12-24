package com.info.TablePerClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.info.FirsthibernateProject.HibernateUtil;

public class Main {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		System.out.println("Inserting data into the database");
		Employee e1 = new Employee();
		e1.setName("sonoo");

		Regular_Employee e2 = new Regular_Employee();
		e2.setName("Vivek Kumar");
		e2.setSalary(50000);
		e2.setBonus(5);

		Contract_Employee e3 = new Contract_Employee();
		e3.setName("Arjun Kumar");
		e3.setPay_per_hour(1000);
		e3.setContract_duration("15 hours");

		session.persist(e1);//persist method return type void
		session.persist(e2);
		session.persist(e3);

		session.getTransaction().commit();
		session.close();

		System.out.println("I am done");

		sessionFactory.close();
	}
}
