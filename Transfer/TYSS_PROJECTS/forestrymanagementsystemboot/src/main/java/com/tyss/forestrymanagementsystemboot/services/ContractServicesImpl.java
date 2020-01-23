package com.tyss.forestrymanagementsystemboot.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.forestrymanagementsystemboot.dao.ContractDao;
import com.tyss.forestrymanagementsystemboot.dto.ContractBean;
import com.tyss.forestrymanagementsystemboot.exception.DateFromPastException;

@Service
public class ContractServicesImpl implements ContractServices {
	@Autowired
	private ContractDao dao;

	@Override
	public boolean deleteContract(int contractId) {
		return dao.deleteContract(contractId);
	}

	@Override
	public boolean addContract(ContractBean contractBean) {
		if (contractBean.getDeliveryDate() != null) {
			Date newDate = contractBean.getDeliveryDate();
			System.out.println("Delivery Date in format YYYY-MM-DD");
			Date currentDate = new Date();
			if (newDate.getTime() - currentDate.getTime() < 0) {
				try {
					throw new DateFromPastException("Delivery date can't be from past");
				} catch (DateFromPastException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			} else {
				SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
				String day = simpleDateformat.format(newDate);
				contractBean.setDay(day);
			}
		}
		return dao.addContract(contractBean);
	}

	@Override
	public List<ContractBean> getAllContract() {
		return dao.getAllContract();
	}

	@Override
	public boolean modifyContract(ContractBean contractBean) {
		if (contractBean.getDeliveryDate() != null) {

			Date newDate = contractBean.getDeliveryDate();
			System.out.println("Please enter Delivery Date in format YYYY-MM-DD");

			Date currentDate = new Date();
			if (newDate.getTime() - currentDate.getTime() < 0) {
				try {
					throw new DateFromPastException("Delivery date can't be from past");
				} catch (DateFromPastException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			} else {
				SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
				String day = simpleDateformat.format(newDate);
				contractBean.setDay(day);
			}
		}
		return dao.modifyContract(contractBean);
	}

	@Override
	public ContractBean getContractById(int contractId) {
		return dao.getContractById(contractId);
	}
}
