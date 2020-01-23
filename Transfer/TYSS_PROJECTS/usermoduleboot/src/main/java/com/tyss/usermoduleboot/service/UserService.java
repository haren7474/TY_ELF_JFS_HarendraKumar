package com.tyss.usermoduleboot.service;

import com.tyss.usermoduleboot.dto.UserBean;

public interface UserService {
	public UserBean auth(String email, String password);
	public boolean register(UserBean bean);
}
