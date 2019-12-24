package com.tyss.forestrymanagementsystem_hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="user")
public class UserBean
{
	@Id
	@Column(name="user_Id")
	private int userId;
	
	@Column(name="user_Type")
	private String userType;
	
	@Column(name="full_Name")
	private String fullName;
	
	@Column(name="street_Add1")
	private String streetAdd1;
	
	@Column(name="street_Add2")
	private String streetAdd2;
	
	@Column(name="town")
	private String town;
	
	@Column(name="postal_Code")
	private int postalCode;
	
	@Column(name="email")
	private String email;
	
	@Column(name="mobile_Number")
	private String mobileNumber;
	
	@Column(name="password")
	private String password;
	
	@Override
	public String toString()
	{
		return userId+ "\t" + mobileNumber + "\t" + fullName + "\t" + town + "\t" + email + "\t" + userType;
	}
}