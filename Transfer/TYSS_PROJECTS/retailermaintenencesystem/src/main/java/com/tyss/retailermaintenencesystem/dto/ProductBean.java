package com.tyss.retailermaintenencesystem.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class ProductBean {
	@Id
	@Column
	@GeneratedValue
	private int productId;

	@Column
	private String productName;

	@Column
	private int productQuantity;

	@Column
	private double productPrice;

	@Column
	private String productComments;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "user_Id", referencedColumnName = "userId")
	private UserBean userBean;

}
