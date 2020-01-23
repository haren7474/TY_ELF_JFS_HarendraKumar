package com.tyss.forestrymanagementsystemboot.dao;

import java.util.List;

import com.tyss.forestrymanagementsystemboot.dto.UserBean;

public interface UserDao 
{
	public List<UserBean> getAllUser();
	public boolean modifyUser(UserBean userBean);
	public boolean deleteUser(int userId);
	public boolean addUser(UserBean user);
	public UserBean signIn(int id, String password);
	public String getUserName(int id);
	public List<UserBean> getUserWithGivenType(String userType);
	public UserBean getUserById(int userId);
}
