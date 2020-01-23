package com.tyss.forestrymanagementsystemjpahiber.dto;

import java.util.Date;

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
@Table(name = "contract")
@SequenceGenerator(name="contract_seq", initialValue=2001, allocationSize=2499)
public class ContractBean {
	@Id
	@Column(name = "contract_Id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="contract_seq")
	private int contractId;

	@Column(name = "customer_Id")
	private int customerId;

//	@Column(name = "product_Id")
//	private int productId;

	@Column(name = "haulier_Id")
	private int haulierId;

	@Column(name = "delivery_Date")
	private Date deliveryDate;

	@Column(name = "day")
	private String day;

	@Column(name = "quantity")
	private int quantity;
	
	@OneToOne(cascade= CascadeType.MERGE)
	@JoinColumn(name="productId")
	private ProductBean productBean;

	@Override
	public String toString() {
		return contractId + "\t" + customerId + "\t" + productBean.getProductId() + "\t" + haulierId+ "\t" + quantity + "\t\t"
				+ deliveryDate.toString().substring(0, 10) + "\t" + day;
	}
}
