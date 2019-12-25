package com.tyss.forestrymanagementsystem_hibernate.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "contract")
public class ContractBean {
	@Id
	@Column(name = "contract_Id")
	private int contractId;

	@Column(name = "customer_Id")
	private int customerId;

	@Column(name = "product_Id")
	private int productId;

	@Column(name = "haulier_Id")
	private int haulierId;

	@Column(name = "delivery_Date")
	private Date deliveryDate;

	@Column(name = "day")
	private String day;

	@Column(name = "quantity")
	private int quantity;

	@Override
	public String toString() {
		return contractId + "\t" + customerId + "\t" + productId + "\t" + haulierId + "\t" + quantity + "\t\t"
				+ deliveryDate.toString().substring(0, 10) + "\t" + day;
	}
}
