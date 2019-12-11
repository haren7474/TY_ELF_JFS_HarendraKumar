package com.tyss.fms.services;

import java.util.List;

import com.tyss.fms.dto.ContractBean;

public interface ContractServices 
{
	public List<ContractBean> getAllContract();
	public boolean deleteContract(int contractId);
	public boolean addContract(ContractBean contract);
}
