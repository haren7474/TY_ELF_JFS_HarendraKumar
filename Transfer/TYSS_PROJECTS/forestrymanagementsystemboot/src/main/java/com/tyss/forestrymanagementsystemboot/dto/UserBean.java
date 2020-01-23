package com.tyss.forestrymanagementsystemboot.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="user")
@SequenceGenerator(name="user_seq", initialValue=1, allocationSize=499)
public class UserBean
{
	@Id
	@Column(name="user_Id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="user_seq")
	private int userId;
	
	@Column(name="user_Type", nullable=false)
	private String userType;
	
	@Column(name="full_Name", nullable=false)
	private String fullName;
	
	@Column(name="street_Add1", nullable=false)
	private String streetAdd1;
	
	@Column(name="street_Add2")
	private String streetAdd2;
	
	@Column(name="town", nullable=false)
	private String town;
	
	@Column(name="postal_Code", nullable=false)
	private int postalCode;
	
	@Column(name="email", unique= true, nullable=false)
	private String email;
	
	@Column(name="mobile_Number", nullable=false)
	private String mobileNumber;
	
	@Column(name="user_Image_Url")
	private String userImageUrl;
	
	@Column(name="password")
	private String password;
	
}