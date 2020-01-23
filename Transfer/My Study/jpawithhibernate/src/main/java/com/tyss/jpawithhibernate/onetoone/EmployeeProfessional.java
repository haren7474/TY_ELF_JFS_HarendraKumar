package com.tyss.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;
@Data
@Entity
@Table(name="EmployeeProfessional")
public class EmployeeProfessional {
	@Id
	@Column
	private int pid;
	@Column
	private String pan;
	@Column
	private String company;
	@Column
	private double salary;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="eid")
	private EmployeePersonal employeePersonal;
}
