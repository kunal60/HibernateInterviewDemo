package com.info.TablePerClass;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("contractemployee")
public class Contract_Employee extends Employee {

	@Column(name = "pay_per_hour")
	private int pay_per_hour;

	@Column(name = "contract_duration")
	private String contract_duration;

	public void setPay_per_hour(int pay_per_hour) {
		this.pay_per_hour = pay_per_hour;

	}

	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;

	}


}