package com.info.ThirdHibernateProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Make this class entry in hibernate config file*/
@Entity
@Table(name = "STUDENT_INFORMATION3")//Make sure the db is same
public class Student_Info3 {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int serial_num ;
	
	@Column(name="full_name")
	private String name;

	public Student_Info3() {

	}

	public Student_Info3(String name, int serial_num ) {

		this.name = name;
		this.serial_num  = serial_num ;
	}

	public int getSerial_num () {
		return serial_num ;
	}

	public void setSerial_num (int serial_num ) {
		this.serial_num  = serial_num ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
