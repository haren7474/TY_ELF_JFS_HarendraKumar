package com.tyss.retailermaintenencesystem.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tyss.retailermaintenencesystem.dto.ProductResponse;
import com.tyss.retailermaintenencesystem.exception.ProductException;

@RestControllerAdvice
public class ProductControllerAdvice {
	@ExceptionHandler(ProductException.class)
	public ProductResponse handleEmployeeException(ProductException e) {
		ProductResponse response = new ProductResponse();
		response.setStatusCode(501);
		response.setMessage("Exception from ProductAdvice");
		response.setDescription(e.getMessage());
		return response;
	}
}
