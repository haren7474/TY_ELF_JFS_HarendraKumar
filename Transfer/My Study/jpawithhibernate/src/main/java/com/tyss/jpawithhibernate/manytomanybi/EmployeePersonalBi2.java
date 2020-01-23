package com.tyss.jpawithhibernate.manytomanybi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="EmployeePersonal")
public class EmployeePersonalBi2 {
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

	@ManyToMany(cascade=CascadeType.ALL, mappedBy="empList")
	@Exclude
	private List<TrainingInfoBi2> trainingInfo;
}
