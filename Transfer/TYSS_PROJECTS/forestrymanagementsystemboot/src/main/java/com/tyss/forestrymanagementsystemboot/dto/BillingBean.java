package com.tyss.forestrymanagementsystemboot.dto;

import java.time.LocalDateTime;

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

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "billing")
@SequenceGenerator(name = "billing_seq", initialValue = 5001, allocationSize = 5499)
public class BillingBean {
	@Id
	@Column(name = "bill_Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "billing_seq")
	private int billId;

	@Column(name = "paid_Amount")
	private double paidAmount;

	@Column(name = "bill_Timestamp")
	@CreationTimestamp
	private LocalDateTime billTimestamp;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "contractId")
	private ContractBean contractBean;

}
