package com.tyss.forestrymanagementsystemcollection.dto;

import java.util.Date;

import lombok.Data;

@Data
public class BillingBean {
	private int billId;
	private int contractId;
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
	private Date deliveryDate;
	private String billTimestamp;
	private String deliveryDay;

	@Override
	public String toString() {
		return getBillId() + "\t" + getContractId() + "\t\t" + getCustomerName() + "\t\t" + getHaulierName() + "\t\t"
				+ getOwnerName() + "\t\t" + getProductName() + "\t\t" + getQuantity() + "\t\t" + getPrice() + "\t"
				+ getBilledAmount() + "\t\t" + getPaidAmount() + "\t\t" + getLeftToPay() + "\t\t" + isFullyPaid() + "\t\t"
				+ getDeliveryDate().toString().substring(0, 10) + "\t" + getBillTimestamp()+ "\t" + getDeliveryDay();
	}
	
	public BillingBean() {
	}

	public BillingBean(int billId, int contractId, String customerName, String haulierName, String ownerName,
			String productName, int quantity, double price, double billedAmount, double paidAmount, double leftToPay,
			boolean isFullyPaid, Date deliveryDate, String billTimestamp, String deliveryDay) {
		this.billId = billId;
		this.contractId = contractId;
		this.customerName = customerName;
		this.haulierName = haulierName;
		this.ownerName = ownerName;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.billedAmount = billedAmount;
		this.paidAmount = paidAmount;
		this.leftToPay = leftToPay;
		this.isFullyPaid = isFullyPaid;
		this.deliveryDate = deliveryDate;
		this.billTimestamp = billTimestamp;
		this.deliveryDay = deliveryDay;
	}
	
}
