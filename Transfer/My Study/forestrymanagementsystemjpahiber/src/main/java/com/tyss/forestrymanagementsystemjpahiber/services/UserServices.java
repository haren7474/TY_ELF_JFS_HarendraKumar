package com.tyss.forestrymanagementsystemjpahiber.services;

import java.util.List;

import com.tyss.forestrymanagementsystemjpahiber.dto.UserBean;


public interface UserServices 
{
	public List<UserBean> getAllUser();
	public boolean modifyUser(int userId, String email);
	public boolean deleteUser(int userId);
	public boolean addUser(UserBean user);
	public UserBean signIn(int id, String password);
	//public String getUserType(int id);
	public String getUserName(int id);
	public List<UserBean> getUserWithGivenType(String userType);
	public UserBean getUserById(int userId);
}
