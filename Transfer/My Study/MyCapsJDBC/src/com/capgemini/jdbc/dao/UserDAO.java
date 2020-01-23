package com.capgemini.jdbc.dao;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;

public interface UserDAO 
{
	public List<UserBean> getAllUser();
	public UserBean userLogin(String userName, String password);
	public boolean updateUser(int userId, String password, String email);
	public boolean deleteUser(int userId, String password);
	public boolean insertUser(UserBean user);
}
