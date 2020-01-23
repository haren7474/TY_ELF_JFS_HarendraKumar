package com.tyss.phonesimulator.services;

import java.util.List;

import com.tyss.phonesimulator.dto.Contact;

public interface ContactServices 
{
	public boolean addContact(Contact contact);
	public boolean deleteContact(String contactName);
	public boolean modifyContact(String contactName, String groupName);
	public List<Contact> getAllContact();
}
