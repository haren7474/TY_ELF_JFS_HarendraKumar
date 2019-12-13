package com.tyss.phonesimulator.services;

import java.util.List;

import com.tyss.phonesimulator.dao.ContactDao;
import com.tyss.phonesimulator.dto.Contact;
import com.tyss.phonesimulator.factory.ContactFactory;

public class ContactServicesImpl implements ContactServices
{
	ContactDao cDao= ContactFactory.isntanceOfContactDaoImpl();
	@Override
	public boolean addContact(Contact contact) {
		return cDao.addContact(contact);
	}

	@Override
	public boolean deleteContact(String contactName) {
		return cDao.deleteContact(contactName);
	}

	@Override
	public boolean modifyContact(String contactName, String groupName) {
		return cDao.modifyContact(contactName, groupName);
	}

	@Override
	public List<Contact> getAllContact() {
		return cDao.getAllContact();
	}

}
