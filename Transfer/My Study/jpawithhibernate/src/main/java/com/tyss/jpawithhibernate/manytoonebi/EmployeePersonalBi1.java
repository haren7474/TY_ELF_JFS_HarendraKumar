package com.tyss.jpawithhibernate.manytoonebi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="EmployeePersonal")
public class EmployeePersonalBi1 {
	@Id
	@Column
	private int eid;
	@Column
	private String ename;
	@Column
	private String email;
	@Column
	private String pass;
	@Column
	private int age;

	@Exclude
	@OneToMany(cascade=CascadeType.ALL, mappedBy="employeePersonalBi")
	private List<EmployeeExperienceBi> employeeExperienceBi;
}
