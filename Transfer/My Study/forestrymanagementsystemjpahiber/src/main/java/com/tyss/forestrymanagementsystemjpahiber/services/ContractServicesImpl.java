package com.tyss.forestrymanagementsystemjpahiber.services;

import java.util.List;

import com.tyss.forestrymanagementsystemjpahiber.dao.ContractDao;
import com.tyss.forestrymanagementsystemjpahiber.dto.ContractBean;
import com.tyss.forestrymanagementsystemjpahiber.factory.ForestryManagementSystemFactory;

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

	@Override
	public ContractBean getContractById(int contractId) {
		return dao.getContractById(contractId);
	}
}
