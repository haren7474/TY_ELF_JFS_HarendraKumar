package com.tyss.forestrymanagementsystem_hibernate.services;

import java.util.List;

import com.tyss.forestrymanagementsystem_hibernate.dao.BillingDao;
import com.tyss.forestrymanagementsystem_hibernate.dto.BillingBean;
import com.tyss.forestrymanagementsystem_hibernate.dto.ResultBillingDto;
import com.tyss.forestrymanagementsystem_hibernate.factory.ForestryManagementSystemFactory;

public class BillingServicesImpl implements BillingServices
{
	BillingDao billingDao= ForestryManagementSystemFactory.instanceOfBillingDaoImpl();
	@Override
	public List<Object[]> getAllBills()
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
