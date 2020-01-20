package com.tyss.retailermaintenencesystem.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tyss.retailermaintenencesystem.dto.UserResponse;
import com.tyss.retailermaintenencesystem.exception.UserException;

@RestControllerAdvice
public class UserControllerAdvice {
	@ExceptionHandler(UserException.class)
	public UserResponse handleEmployeeException(UserException e) {
		UserResponse response = new UserResponse();
		response.setStatusCode(501);
		response.setMessage("Exception from UserAdvice");
		response.setDescription(e.getMessage());
		return response;
	}
}
