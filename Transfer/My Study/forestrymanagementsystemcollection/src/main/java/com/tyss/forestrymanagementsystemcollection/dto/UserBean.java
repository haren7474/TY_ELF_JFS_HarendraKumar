package com.tyss.forestrymanagementsystemcollection.dto;


import lombok.Data;

@Data
public class UserBean
{
	
	private int userId;
	
	private String userType;
	
	private String fullName;
	
	private String streetAdd1;
	
	private String streetAdd2;
	
	private String town;
	
	private int postalCode;
	
	private String email;
	
	private String mobileNumber;
	
	private String password;
	
	
	public UserBean(int userId, String userType, String fullName, String streetAdd1, String streetAdd2, String town,
			int postalCode, String email, String mobileNumber, String password) {
		this.userId = userId;
		this.userType = userType;
		this.fullName = fullName;
		this.streetAdd1 = streetAdd1;
		this.streetAdd2 = streetAdd2;
		this.town = town;
		this.postalCode = postalCode;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}


	public UserBean() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString()
	{
		return userId+ "\t" + mobileNumber + "\t" + fullName + "\t" + town + "\t" + email + "\t" + userType;
	}
}