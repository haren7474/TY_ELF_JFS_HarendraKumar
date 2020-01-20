package com.tyss.forestrymanagementsystemboot.dao;

import java.util.List;

import com.tyss.forestrymanagementsystemboot.dto.ContractBean;

public interface ContractDao 
{
	public List<ContractBean> getAllContract();
	public boolean deleteContract(int contractId);
	public boolean addContract(ContractBean contract);
	public boolean modifyContract(ContractBean contractBean);
	public ContractBean getContractById(int contractId);
}
