package com.tyss.retailermaintenencesystem.service;

import com.tyss.retailermaintenencesystem.dto.UserBean;

public interface UserService {
	public UserBean auth(String email, String password);
	public boolean register(UserBean bean);
}
