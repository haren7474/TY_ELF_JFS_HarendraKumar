package com.tyss.springboot.exception;

public class EmployeeException extends RuntimeException {
	private String msg;
	public EmployeeException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
