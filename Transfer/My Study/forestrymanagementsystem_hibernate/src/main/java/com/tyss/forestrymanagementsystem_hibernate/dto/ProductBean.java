package com.tyss.forestrymanagementsystem_hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="product")
public class ProductBean {
	@Id
	@Column(name="product_Id")
	private int productId;
	
	@Column(name="product_Name")
	private String productName;
	
	@Column(name="product_Quantity")
	private int productQuantity;
	
	@Column(name="product_Price")
	private double productPrice;
	
	@Column(name="productComments")
	private String productComments;
	
	@Column(name="productOwnerId")
	private int productOwnerId;

	@Override
	public String toString() {
		return productId + "\t" + productOwnerId + "\t" + productQuantity + "\t\t" + productPrice + "\t\t" + productName
				+ "\t\t" + productComments;
	}
}
