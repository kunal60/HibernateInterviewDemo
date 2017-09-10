package com.info.FirsthibernateProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*Make this class entry in hibernate config file*/
@Entity
@Table(name = "STUDENT_INFORMATION") //Make sure the db is same
public class Student_Info {

	@Id
	private int roll_no;
	
	@Column(name="full_name")
	private String name;

	public Student_Info() {

	}

	public Student_Info(String name, int roll_no) {

		this.name = name;
		this.roll_no = roll_no;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
