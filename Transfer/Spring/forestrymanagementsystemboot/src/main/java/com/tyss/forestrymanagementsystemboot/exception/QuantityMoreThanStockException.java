package com.tyss.forestrymanagementsystemboot.exception;

public class QuantityMoreThanStockException extends Exception {
	private String msg;

	public QuantityMoreThanStockException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}
}
