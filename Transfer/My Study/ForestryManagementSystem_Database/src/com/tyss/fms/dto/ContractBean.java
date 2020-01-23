package com.tyss.fms.dto;

import lombok.Data;

@Data
public class ContractBean 
{
	private int contractId;
	private int customerId;
	private int productId;
	private int haulierId;
	private String deliveryDate;
	private String day;
	private int quantity;
	
	@Override
	public String toString()
	{
		return contractId+ "\t" + customerId + "\t" + productId + "\t" + haulierId + "\t" + quantity + "\t\t" + deliveryDate + "\t" + day;
	}
}
