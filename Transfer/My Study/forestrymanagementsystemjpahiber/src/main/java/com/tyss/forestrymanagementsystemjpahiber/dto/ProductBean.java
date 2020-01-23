package com.tyss.forestrymanagementsystemjpahiber.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="product")
@SequenceGenerator(name="product_seq", initialValue=1001, allocationSize=1499)
public class ProductBean {
	@Id
	@Column(name="product_Id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="product_seq")
	private int productId;
	
	@Column(name="product_Name")
	private String productName;
	
	@Column(name="product_Quantity")
	private int productQuantity;
	
	@Column(name="product_Price")
	private double productPrice;
	
	@Column(name="productComments")
	private String productComments;
	
	@OneToOne(cascade= CascadeType.MERGE)
	@JoinColumn(name="userId")
	private UserBean userBean;

	@Override
	public String toString() {
		return productId + "\t" + userBean.getFullName() + "\t" + productQuantity + "\t\t" + productPrice + "\t\t" + productName
				+ "\t\t" + productComments;
	}
}
