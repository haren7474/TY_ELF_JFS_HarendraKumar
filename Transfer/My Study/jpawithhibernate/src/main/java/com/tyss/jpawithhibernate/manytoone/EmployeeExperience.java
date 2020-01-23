package com.tyss.jpawithhibernate.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tyss.jpawithhibernate.onetoone.EmployeePersonal;

import lombok.Data;

@Data
@Entity
@Table(name="EmployeeExperience")
public class EmployeeExperience 
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
	private EmployeePersonal employeePersonal;
}
