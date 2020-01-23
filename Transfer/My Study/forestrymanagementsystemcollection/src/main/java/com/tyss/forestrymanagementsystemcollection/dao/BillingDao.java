package com.tyss.forestrymanagementsystemcollection.dao;

import java.util.List;

import com.tyss.forestrymanagementsystemcollection.dto.BillingBean;
import com.tyss.forestrymanagementsystemcollection.dto.FactoryResponse;

public interface BillingDao 
{
	public List<BillingBean> getAllBills();
	public boolean updateBill(int billId, double paidAmount);
	public boolean generateBill(BillingBean bill);
	public boolean isContractIdPresent(int contractId);
}


