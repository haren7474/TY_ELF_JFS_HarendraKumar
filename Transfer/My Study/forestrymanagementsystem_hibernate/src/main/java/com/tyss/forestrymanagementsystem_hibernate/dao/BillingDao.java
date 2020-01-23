package com.tyss.forestrymanagementsystem_hibernate.dao;

import java.util.List;

import com.tyss.forestrymanagementsystem_hibernate.dto.BillingBean;
import com.tyss.forestrymanagementsystem_hibernate.dto.ResultBillingDto;

public interface BillingDao 
{
	public List<Object[]> getAllBills();
	public boolean updateBill(int billId, double paidAmount);
	public boolean generateBill(BillingBean bill);
	public boolean isContractIdPresent(int contractId);
}


