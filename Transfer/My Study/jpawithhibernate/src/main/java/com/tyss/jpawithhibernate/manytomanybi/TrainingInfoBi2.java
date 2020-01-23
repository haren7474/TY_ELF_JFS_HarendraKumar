package com.tyss.jpawithhibernate.manytomanybi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "TrainingInfo")
public class TrainingInfoBi2 {
	@Id
	@Column
	private int tid;
	@Column
	private String tname;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "EmployeePersonal_TrainingInfo", 
	joinColumns = @JoinColumn(name = "tid"), 
	inverseJoinColumns = @JoinColumn(name = "eid"))

	private List<EmployeePersonalBi2> empList;
}
