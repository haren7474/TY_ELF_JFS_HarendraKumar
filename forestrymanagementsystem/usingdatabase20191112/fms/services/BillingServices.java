package com.tyss.fms.services;

import java.util.List;

import com.tyss.fms.dto.BillingBean;

public interface BillingServices 
{
	public List<BillingBean> getAllBills();
	public boolean updateBill(int billId, double paidAmount);
	public boolean generateBill(BillingBean bill);
	public boolean isContractIdPresent(int contractId);
}
