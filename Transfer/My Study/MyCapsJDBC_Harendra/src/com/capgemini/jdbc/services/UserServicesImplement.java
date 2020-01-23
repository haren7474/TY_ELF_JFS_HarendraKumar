package com.capgemini.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.factory.UserFactory;

public class UserServicesImplement implements UserServices
{
	UserDAO dao= UserFactory.isntanceOfUserDaoImpl();

	@Override
	public List<UserBean> getAllUser() 
	{
		return dao.getAllUser();
	}

	@Override
	public UserBean userLogin(String userName, String password) 
	{
		return dao.userLogin(userName, password);
	}

	@Override
	public boolean updateUser(int userId, String password, String email) 
	{
		return dao.updateUser(userId, password, email);
	}

	@Override
	public boolean deleteUser(int userId, String password) 
	{
		return dao.deleteUser(userId, password);
	}

	@Override
	public boolean insertUser(UserBean user) 
	{
		return dao.insertUser(user);
	}
	
}
