package com.info.FourthHibernateProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*Make this class entry in hibernate config file*/
@Entity
@Table(name = "STUDENT") // Make sure the db is same
public class Student {

	@Id
	@GeneratedValue
	private int student_id;

	@Column(name = "student_name")
	private String name;

	public Student() {

	}

	public Student(int student_id, String name) {
		super();
		this.student_id = student_id;
		this.name = name;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
