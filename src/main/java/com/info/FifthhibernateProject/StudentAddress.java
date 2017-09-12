package com.info.FifthhibernateProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*Make this class entry in hibernate config file*/
@Entity
@Table(name = "StudentAddress") // Make sure the db is same
public class StudentAddress {

	@Id
	@GeneratedValue
	@Column(name = "Addrss_id")
	private int id;

	@Column(name = "Address_Detail")
	private String detail;

	public StudentAddress() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
