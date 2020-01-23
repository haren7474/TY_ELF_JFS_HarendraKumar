package com.tyss.forestrymanagementsystemjpahiber.services;

import java.util.List;

import com.tyss.forestrymanagementsystemjpahiber.dao.BillingDao;
import com.tyss.forestrymanagementsystemjpahiber.dto.BillingBean;
import com.tyss.forestrymanagementsystemjpahiber.factory.ForestryManagementSystemFactory;

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

	@Override
	public BillingBean getBillById(int billId) {
		return billingDao.getBillById(billId);
	}
}
