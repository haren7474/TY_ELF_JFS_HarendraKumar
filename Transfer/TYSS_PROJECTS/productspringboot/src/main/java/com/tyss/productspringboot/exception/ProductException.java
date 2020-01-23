package com.tyss.productspringboot.exception;

public class ProductException extends RuntimeException {
	private String msg;

	public ProductException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}

}
