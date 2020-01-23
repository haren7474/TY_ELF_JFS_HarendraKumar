package com.tyss.forestrymanagementsystemcollection.services;

import java.util.List;

import com.tyss.forestrymanagementsystemcollection.dao.ContractDao;
import com.tyss.forestrymanagementsystemcollection.dto.ContractBean;
import com.tyss.forestrymanagementsystemcollection.factory.ForestryManagementSystemFactory;

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

	@Override
	public boolean modifyContract(int contractId, int quantity) {
		return dao.modifyContract(contractId, quantity);
	}
}
