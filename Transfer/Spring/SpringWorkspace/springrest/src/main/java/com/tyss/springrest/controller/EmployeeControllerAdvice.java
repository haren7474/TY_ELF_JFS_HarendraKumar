package com.tyss.springrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tyss.springrest.dto.EmployeeResponse;
import com.tyss.springrest.exception.EmployeeException;

@RestControllerAdvice
public class EmployeeControllerAdvice {
	@ExceptionHandler(EmployeeException.class)
	public EmployeeResponse handleEmployeeException(EmployeeException e) {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("Exception ");
		response.setDescription(e.getMessage());
		return response;
	}

}
