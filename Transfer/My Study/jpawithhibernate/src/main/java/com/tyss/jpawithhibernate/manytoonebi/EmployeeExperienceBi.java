package com.tyss.jpawithhibernate.manytoonebi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EmployeeExperience")
public class EmployeeExperienceBi 
{
	@Id
	@Column
	private int expId;
	@Column
	private String company;
	@Column
	private int numberOfYears;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private EmployeePersonalBi1 employeePersonalBi;
}
