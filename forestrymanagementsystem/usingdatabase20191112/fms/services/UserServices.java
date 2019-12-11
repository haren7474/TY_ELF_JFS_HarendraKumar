package com.tyss.fms.services;

import java.util.HashMap;
import java.util.List;

import com.tyss.fms.dto.UserBean;


public interface UserServices 
{
	public List<UserBean> getAllUser();
	public boolean modifyUser(int userId, String email);
	public boolean deleteUser(int userId);
	public boolean addUser(UserBean user);
	public String signIn(int id, String password);
	public String getUserType(int id);
	public String getUserName(int id);
	public HashMap<Integer, String> getUserIdWithGivenUserType(String userType);
}
