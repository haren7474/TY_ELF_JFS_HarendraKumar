package com.flexirent.dto;

public class UserDto 
{
	private String firstName;
	private Integer type;
	private String emailId;
	private String userName;
	private String password;
	
	public UserDto(String firstName, Integer type, String emailId, String userName, String password) 
	{
		this.firstName = firstName;
		this.type = type;
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
	}

	public UserDto(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUsername() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		
	
	
}
