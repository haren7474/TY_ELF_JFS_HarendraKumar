package com.tyss.forestrymanagementsystemcollection.dao;

import java.util.List;

import com.tyss.forestrymanagementsystemcollection.dto.ContractBean;

public interface ContractDao 
{
	public List<ContractBean> getAllContract();
	public boolean deleteContract(int contractId);
	public boolean addContract(ContractBean contract);
	public boolean modifyContract(int contractId, int quantity);
}
