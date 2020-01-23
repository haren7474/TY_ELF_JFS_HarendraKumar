package com.tyss.fms.dto;

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
	
	@Override
	public String toString()
	{
		return userId+ "\t" + mobileNumber + "\t" + fullName + "\t" + town + "\t" + email + "\t" + userType;
	}
}