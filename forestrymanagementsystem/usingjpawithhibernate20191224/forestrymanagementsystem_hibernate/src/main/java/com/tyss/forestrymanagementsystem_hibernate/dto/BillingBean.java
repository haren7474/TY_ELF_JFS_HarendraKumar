package com.tyss.forestrymanagementsystem_hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "billing")
public class BillingBean {
	@Id
	@Column(name = "bill_Id")
	private int billId;

	@Column(name = "contract_Id")
	private int contractId;

	@Column(name = "paid_Amount")
	private double paidAmount;

	@Column(name = "bill_Timestamp")
	private String billTimestamp;

}
