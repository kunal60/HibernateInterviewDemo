package com.info.SecondHibernateProject;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/*Make this class entry in hibernate config file*/
@Entity
@Table(name = "STUDENT_INFORMATION2")//Make sure the db is same
public class Student_NewInfo {

	@Id
	private int roll_no;

	@Column(name = "full_name")
	private String name;

	@Transient
	// If you use Transient Annotation, hibernate will not insert address data
	// into db
	private String address;

	//Example of Temporal Datatype
	@Temporal(TemporalType.DATE)
	private Date birth;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date birthTime;

	public Student_NewInfo() {

	}

	public Student_NewInfo(String name, int roll_no, String address) {

		this.name = name;
		this.roll_no = roll_no;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Date getBirthTime() {
		return birthTime;
	}

	public void setBirthTime(Date birthTime) {
		this.birthTime = birthTime;
	}

	
	
}
