package com.capgemini.jdbc.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserBean implements Serializable
{
	private int userId;
	private String userName;
	private String email;
	private String password;
	
}
