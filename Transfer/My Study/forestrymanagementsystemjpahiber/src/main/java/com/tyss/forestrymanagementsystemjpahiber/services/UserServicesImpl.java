package com.tyss.forestrymanagementsystemjpahiber.services;

import java.util.HashMap;
import java.util.List;

import com.tyss.forestrymanagementsystemjpahiber.dao.UserDao;
import com.tyss.forestrymanagementsystemjpahiber.dto.UserBean;
import com.tyss.forestrymanagementsystemjpahiber.factory.ForestryManagementSystemFactory;

public class UserServicesImpl implements UserServices {

	UserDao dao= ForestryManagementSystemFactory.isntanceOfCustomerDaoImpl();
	@Override
	public List<UserBean> getAllUser() {
		return dao.getAllUser();
	}

	@Override
	public boolean modifyUser(int userId, String email) 
	{
		return dao.modifyUser(userId, email);
	}

	@Override
	public boolean deleteUser(int userId) {
		return dao.deleteUser(userId);
	}

	@Override
	public boolean addUser(UserBean user) 
	{
		return dao.addUser(user);
	}

	@Override
	public UserBean signIn(int id, String password)
	{
		return dao.signIn(id, password);
	}

//	@Override
//	public String getUserType(int id) 
//	{
//		return dao.getUserType(id);
//	}
	
	@Override
	public String getUserName(int id) 
	{
		return dao.getUserName(id);
	}

	@Override
	public List<UserBean> getUserWithGivenType(String userType) {
		return dao.getUserWithGivenType(userType);
	}

	@Override
	public UserBean getUserById(int userId) {
		return dao.getUserById(userId);
	}

}
