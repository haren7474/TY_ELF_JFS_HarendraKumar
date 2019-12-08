package com.tyss.fms.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerBean implements Serializable
{
	private String customerID;
	private String customerName;
	private String streetAdd1;
	private String streetAdd2;
	private String town;
	private int postalCode;
	private String email;
	private String mobileNumber;
	private String password;
}