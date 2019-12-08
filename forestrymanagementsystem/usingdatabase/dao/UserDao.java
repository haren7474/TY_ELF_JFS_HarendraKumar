package com.tyss.fms.dao;

import java.util.HashMap;
import java.util.List;

import com.tyss.fms.dto.UserBean;

public interface UserDao 
{
	public List<UserBean> getAllUser();
	public boolean modifyUser(int userId, String email);
	public boolean deleteUser(int userId);
	public boolean addUser(UserBean user);
	public Integer signIn(int id, String password);
	public String getUserType(int id);
	public HashMap<Integer, String> getUserIdWithGivenUserType(String userType);
}
