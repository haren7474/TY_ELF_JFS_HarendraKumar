package com.tyss.jpawithhibernate.onetoonebi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="EmployeePersonal")
public class EmployeePersonalBi {
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
	@OneToOne(cascade= CascadeType.ALL, mappedBy = "employeePersonal")
	private EmployeeProfessionalBi empPro;

}
