package com.tyss.forestrymanagementsystemjpahiber.services;

import java.util.List;

import com.tyss.forestrymanagementsystemjpahiber.dto.ContractBean;

public interface ContractServices 
{
	public List<ContractBean> getAllContract();
	public boolean deleteContract(int contractId);
	public boolean addContract(ContractBean contract);
	public boolean modifyContract(int contractId, int quantity);
	public ContractBean getContractById(int contractId);
}
