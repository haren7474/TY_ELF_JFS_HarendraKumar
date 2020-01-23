package com.tyss.phonesimulator.dto;

import lombok.Data;

@Data
public class Contact 
{
	private int contactId;
	private String contactName;
	private String contactNumber;
	private String contactGroup;
	
	@Override
	public String toString()
	{
		return contactId + "\t" + contactName + "\t" + contactNumber + "\t" + contactGroup;	
	}
}
