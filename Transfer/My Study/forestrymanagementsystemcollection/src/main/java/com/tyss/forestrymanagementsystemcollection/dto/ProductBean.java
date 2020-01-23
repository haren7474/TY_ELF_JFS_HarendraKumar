package com.tyss.forestrymanagementsystemcollection.dto;

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

	public ProductBean() {
	}

	public ProductBean(int productId, String productName, int productQuantity, double productPrice,
			String productComments, int productOwnerId) {
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		this.productComments = productComments;
		this.productOwnerId = productOwnerId;
	}

}
