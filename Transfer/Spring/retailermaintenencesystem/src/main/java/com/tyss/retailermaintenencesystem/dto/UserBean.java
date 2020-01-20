package com.tyss.retailermaintenencesystem.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString.Exclude;



@Entity
@Data
@Table(name="user_info")
public class UserBean 
{
	@Id
	@Column
	@GeneratedValue
	private int userId;
	
	@Column
	private String name;
	
	@Column(unique= true, nullable=false)
	private String email;
	
	@Column
	private String password;
	
	
	@OneToMany(cascade=CascadeType.MERGE, mappedBy="userBean")
	private List<ProductBean> productBean;
	
	}
