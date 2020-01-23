package com.tyss.usermoduleboot.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Entity
@Data
@Table(name="user_info")
public class UserBean 
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
	
	@Column(unique= true, nullable=false)
	private String phone;
	
	@Column
	private String gender;
	
	@Column
	private String role;
	
	}
