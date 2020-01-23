package com.tyss.retailermaintenencesystem.exception;

public class ProductException extends RuntimeException {
	
	private String msg;

	public ProductException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return this.msg;
	}
}
