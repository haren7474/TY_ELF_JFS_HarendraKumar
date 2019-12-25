package com.tyss.forestrymanagementsystem_hibernate.services;

import java.util.List;

import com.tyss.forestrymanagementsystem_hibernate.dto.ContractBean;

public interface ContractServices 
{
	public List<ContractBean> getAllContract();
	public boolean deleteContract(int contractId);
	public boolean addContract(ContractBean contract);
	public boolean modifyContract(int contractId, int quantity);
}
