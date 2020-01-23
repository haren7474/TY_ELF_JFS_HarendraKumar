package com.tyss.fms.dto;

import lombok.Data;

@Data
public class ProductBean {
	private int productId;
	private String productName;
	private int productQuantity;
	private double productPrice;
	private String productComments;
	private int productOwnerId;

	@Override
	public String toString() {
		return productId + "\t" + productOwnerId + "\t" + productQuantity + "\t\t" + productPrice + "\t\t" + productName
				+ "\t\t" + productComments;
	}
}
