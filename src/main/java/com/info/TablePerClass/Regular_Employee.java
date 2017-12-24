package com.info.TablePerClass;

import javax.persistence.*;

@Entity
//@DiscriminatorValue("regularemployee")
public class Regular_Employee extends Employee {

	@Column(name = "salary")
	private float salary;

	@Column(name = "bonus")
	private int bonus;

	public void setSalary(int salary) {
		this.salary = salary;

	}

	public void setBonus(int bonus) {
		this.bonus=bonus;
		
	}

	
}