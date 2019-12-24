package com.tyss.forestrymanagementsystem_hibernate.dto;

import lombok.Data;

@Data
public class ResultBillingDto {
	private int billId;
	private int contractId;
	private int productId;
	private String customerName;
	private String haulierName;
	private String ownerName;
	private String productName;
	private int quantity;
	private double price;
	private double billedAmount;
	private double paidAmount;
	private double leftToPay;
	private boolean isFullyPaid;
	private String deliveryDate;
	private String billTimestamp;

	@Override
	public String toString() {
		return getBillId() + "\t" + getContractId() + "\t\t" + getCustomerName() + "\t\t" + getHaulierName() + "\t\t"
				+ getOwnerName() + "\t\t" + getProductName() + "\t\t" + getQuantity() + "\t\t" + getPrice() + "\t"
				+ getBilledAmount() + "\t\t" + getPaidAmount() + "\t\t" + getLeftToPay() + "\t\t" + isFullyPaid() + "\t\t"
				+ getDeliveryDate() + "\t" + getBillTimestamp();
	}

}
