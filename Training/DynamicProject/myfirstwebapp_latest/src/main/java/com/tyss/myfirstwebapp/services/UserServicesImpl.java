package com.tyss.myfirstwebapp.services;

import java.util.List;

import com.tyss.myfirstwebapp.beans.UserBean;
import com.tyss.myfirstwebapp.dao.UserDao;
import com.tyss.myfirstwebapp.dao.UserDaoImpl;

public class UserServicesImpl implements UserServices
{
	UserDao dao= new UserDaoImpl();
	@Override
	public UserBean searchUser(int userId) {
		return dao.searchUser(userId);
	}
	@Override
	public UserBean authenticate(int usedId, String password) {
		return dao.authenticate(usedId, password);
	}
	@Override
	public boolean addUser(UserBean user) {
		return dao.addUser(user);
	}
	@Override
	public boolean deleteUser(int userId) {
		return dao.deleteUser(userId);
	}
	@Override
	public boolean updateUser(UserBean user) {
		return dao.updateUser(user);
	}
	@Override
	public List<UserBean> getAllUsers() {
		return dao.getAllUsers();
	}
}
