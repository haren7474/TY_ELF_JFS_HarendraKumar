package com.tyss.empspringmvc.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.CascadeType;

import lombok.Data;

@Data
@Entity
@Table(name="employee_info")
public class EmployeeBean 
{
	@Id
	@Column
	@GeneratedValue
	private int id;
	
	@Column
	private String name;
	
	@Column(unique= true, nullable=false)
	private String email;
	
	@Column
	private String password;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="bean")
	private List<EmployeeAddressBean> addressBeans;
}
