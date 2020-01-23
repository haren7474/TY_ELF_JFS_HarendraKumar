package com.capgemini.jdbc.factory;

import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.dao.UserDAOImplement;
import com.capgemini.jdbc.services.UserServices;
import com.capgemini.jdbc.services.UserServicesImplement;

public class UserFactory 
{
	private UserFactory()
	{
	}
	
	public static UserDAO isntanceOfUserDaoImpl()
	{
		UserDAO dao= new UserDAOImplement();
		return dao;
	}
	
	public static UserServices instanceOfUserServices()
	{
		UserServices services= new UserServicesImplement();
		return services;
	}
}
