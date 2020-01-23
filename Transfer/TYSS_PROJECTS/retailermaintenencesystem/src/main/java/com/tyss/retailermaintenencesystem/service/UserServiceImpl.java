package com.tyss.retailermaintenencesystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tyss.retailermaintenencesystem.dto.UserBean;
import com.tyss.retailermaintenencesystem.exception.UserException;
import com.tyss.retailermaintenencesystem.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	@Override
	public UserBean auth(String email, String password) {
		UserBean bean = repository.findByEmail(email);
		if (bean != null) {
			if (encoder.matches(password, bean.getPassword())) {
				return bean;
			}
			throw new UserException("Password not matching");
		} else {
			throw new UserException("Email does not exist");
		}
	}

	@Override
	public boolean register(UserBean bean) {
		bean.setPassword(encoder.encode(bean.getPassword()));
		UserBean userBean = null;
		try {
			userBean = repository.save(bean);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

		return true;
	}

}
