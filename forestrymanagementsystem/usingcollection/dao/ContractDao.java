package com.tyss.fms.dao;

import java.util.List;

import com.tyss.fms.dto.ContractBean;

public interface ContractDao 
{
	public List<ContractBean> getAllContract();
	public boolean deleteContract(String contractNo);
	public boolean addContract(ContractBean customer);
}
