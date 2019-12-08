package com.tyss.fms.dto;

import lombok.Data;

@Data
public class ProductBean 
{
	private String productId;
	private String productName;
	private int productQuantity;
	private double productPrice;
	private String productComments;
}
