package com.tyss.myfirstwebapp.services;

import com.tyss.myfirstwebapp.beans.UserBean;

public interface UserServices {
	public UserBean searchUser(int userId);
	public UserBean authenticate(int usedId, String password);
	public boolean deleteUser(int userId);
	public boolean addUser(UserBean user);
	public boolean updateUser(UserBean user);
	public java.util.List<UserBean> getAllUsers();
}
