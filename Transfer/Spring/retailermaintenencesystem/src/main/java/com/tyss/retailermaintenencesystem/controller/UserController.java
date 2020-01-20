package com.tyss.retailermaintenencesystem.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.retailermaintenencesystem.dto.UserBean;
import com.tyss.retailermaintenencesystem.dto.UserResponse;
import com.tyss.retailermaintenencesystem.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping(path = "/auth", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse auth(@RequestBody UserBean bean) {
		UserBean userBean = service.auth(bean.getEmail(), bean.getPassword());
		UserResponse response = new UserResponse();
		if (userBean != null) {
			response.setStatusCode(201);
			response.setDescription("User found for given credentials");
			response.setMessage("success");
			response.setBean(Arrays.asList(userBean));
		} else {
			response.setStatusCode(401);
			response.setDescription("Invalid credentials");
			response.setMessage("failure");
		}
		return response;
	}

	@PostMapping(path = "/register", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse register(@RequestBody UserBean bean) {
		UserResponse response = new UserResponse();
		if (service.register(bean)) {
			response.setStatusCode(201);
			response.setDescription("User added");
			response.setMessage("success");
		} else {
			response.setStatusCode(401);
			response.setDescription("Email/ Phone already exists");
			response.setMessage("failure");
		}
		return response;
	}

}
