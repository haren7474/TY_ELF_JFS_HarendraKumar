package com.tyss.forestrymanagementsystem_hibernate.services;

import java.util.List;

import com.tyss.forestrymanagementsystem_hibernate.dao.ContractDao;
import com.tyss.forestrymanagementsystem_hibernate.dto.ContractBean;
import com.tyss.forestrymanagementsystem_hibernate.factory.ForestryManagementSystemFactory;

public class ContractServicesImpl implements ContractServices
{
	ContractDao dao= ForestryManagementSystemFactory.isntanceOfContractDaoImpl();
	@Override
	public boolean deleteContract(int contractId) {
		return dao.deleteContract(contractId);
	}

	@Override
	public boolean addContract(ContractBean customer) 
	
	{
		return dao.addContract(customer);
	}

	@Override
	public List<ContractBean> getAllContract() {
		return dao.getAllContract();
	}
}
