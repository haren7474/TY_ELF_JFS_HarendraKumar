package com.tyss.forestrymanagementsystem_hibernate.dao;

import java.util.List;

import com.tyss.forestrymanagementsystem_hibernate.dto.ContractBean;

public interface ContractDao 
{
	public List<ContractBean> getAllContract();
	public boolean deleteContract(int contractId);
	public boolean addContract(ContractBean contract);
	public boolean modifyContract(int contractId, int quantity);
}
