package com.tyss.forestrymanagementsystemcollection.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

public class ContractBean {
	private int contractId;
	private int customerId;
	private int productId;
	private int haulierId;
	private Date deliveryDate;
	private String day;
	private int quantity;

	@Override
	public String toString() {
		return contractId + "\t" + customerId + "\t" + productId + "\t" + haulierId + "\t" + quantity + "\t\t"
				+ deliveryDate.toString().substring(0, 10) + "\t" + day;
	}

	public ContractBean(int contractId, int customerId, int productId, int haulierId, Date deliveryDate, String day,
			int quantity) {
		this.contractId = contractId;
		this.customerId = customerId;
		this.productId = productId;
		this.haulierId = haulierId;
		this.deliveryDate = deliveryDate;
		this.day = day;
		this.quantity = quantity;
	}

	public ContractBean() {
	}
}
