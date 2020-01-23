package com.tyss.forestrymanagementsystemjpahiber.dao;

import java.util.List;

import com.tyss.forestrymanagementsystemjpahiber.dto.BillingBean;

public interface BillingDao 
{
	public List<BillingBean> getAllBills();
	public boolean updateBill(int billId, double paidAmount);
	public boolean generateBill(BillingBean bill);
	public boolean isContractIdPresent(int contractId);
	public BillingBean getBillById(int billId);
}


