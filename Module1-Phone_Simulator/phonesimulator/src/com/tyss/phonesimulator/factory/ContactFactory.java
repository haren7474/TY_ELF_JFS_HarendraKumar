package com.tyss.phonesimulator.factory;

import com.tyss.phonesimulator.dao.ContactDao;
import com.tyss.phonesimulator.dao.ContactDaoImpl;
import com.tyss.phonesimulator.services.ContactServices;
import com.tyss.phonesimulator.services.ContactServicesImpl;

public class ContactFactory {
	private ContactFactory() {
	}

	public static ContactDao isntanceOfContactDaoImpl() {
		ContactDao contactDao = new ContactDaoImpl();
		return contactDao;
	}

	public static ContactServices instanceOfCustomerServices() {
		ContactServices contactServices = new ContactServicesImpl();
		return contactServices;
	}
}