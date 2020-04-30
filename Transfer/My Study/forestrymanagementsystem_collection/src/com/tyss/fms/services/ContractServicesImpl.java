package com.tyss.fms.services;

import java.util.List;

import com.tyss.fms.dao.ContractDao;
import com.tyss.fms.dto.ContractBean;
import com.tyss.fms.factory.ForestryManagementSystemFactory;

public class ContractServicesImpl implements ContractServices
{
	ContractDao dao= ForestryManagementSystemFactory.isntanceOfContractDaoImpl();
	@Override
	public boolean deleteContract(String contractNo) {
		return dao.deleteContract(contractNo);
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