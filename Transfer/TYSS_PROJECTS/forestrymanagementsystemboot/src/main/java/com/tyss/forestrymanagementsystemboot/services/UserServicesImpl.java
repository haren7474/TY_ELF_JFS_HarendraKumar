package com.tyss.forestrymanagementsystemboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.forestrymanagementsystemboot.dao.UserDao;
import com.tyss.forestrymanagementsystemboot.dto.UserBean;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	private UserDao dao;

	@Override
	public List<UserBean> getAllUser() {
		return dao.getAllUser();
	}

	@Override
	public boolean modifyUser(UserBean userBean) {
		return dao.modifyUser(userBean);
	}

	@Override
	public boolean deleteUser(int userId) {
		return dao.deleteUser(userId);
	}

	@Override
	public boolean addUser(UserBean user) {
		return dao.addUser(user);
	}

	@Override
	public UserBean signIn(int id, String password) {
		return dao.signIn(id, password);
	}

//	@Override
//	public String getUserType(int id) 
//	{
//		return dao.getUserType(id);
//	}

	@Override
	public String getUserName(int id) {
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
