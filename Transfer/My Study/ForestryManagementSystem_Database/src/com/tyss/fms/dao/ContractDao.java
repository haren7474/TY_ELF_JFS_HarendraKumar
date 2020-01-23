package com.tyss.fms.dao;

import java.util.List;

import com.tyss.fms.dto.ContractBean;

public interface ContractDao 
{
	public List<ContractBean> getAllContract();
	public boolean deleteContract(int contractId);
	public boolean addContract(ContractBean contract);
}
