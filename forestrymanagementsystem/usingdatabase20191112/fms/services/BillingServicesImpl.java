package com.tyss.fms.services;

import java.util.List;

import com.tyss.fms.dao.BillingDao;
import com.tyss.fms.dto.BillingBean;
import com.tyss.fms.factory.ForestryManagementSystemFactory;

public class BillingServicesImpl implements BillingServices
{
	BillingDao billingDao= ForestryManagementSystemFactory.instanceOfBillingDaoImpl();
	@Override
	public List<BillingBean> getAllBills() 
	{
		return billingDao.getAllBills();
	}

	@Override
	public boolean updateBill(int billId, double paidAmount) {
		return billingDao.updateBill(billId, paidAmount);
	}

	@Override
	public boolean generateBill(BillingBean bill) {
		return billingDao.generateBill(bill);
	}

	@Override
	public boolean isContractIdPresent(int contractId) {
		return billingDao.isContractIdPresent(contractId);
	}
}
