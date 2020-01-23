package com.tyss.forestrymanagementsystemboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.forestrymanagementsystemboot.dao.BillingDao;
import com.tyss.forestrymanagementsystemboot.dto.BillingBean;

@Service
public class BillingServicesImpl implements BillingServices {
	@Autowired
	private BillingDao billingDao;

	@Override
	public List<BillingBean> getAllBills() {
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
