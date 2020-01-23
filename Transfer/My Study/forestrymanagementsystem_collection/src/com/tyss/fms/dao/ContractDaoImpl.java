package com.tyss.fms.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.tyss.fms.dto.ContractBean;

public class ContractDaoImpl implements ContractDao{
	private List<ContractBean> contractList = new ArrayList<ContractBean>();

	@Override
	public boolean deleteContract(String contractNo) {
		int count = 0;
		ContractBean cb=null;
		ListIterator<ContractBean> itr= contractList.listIterator();
		
		while(itr.hasNext())
		{
			 cb= itr.next();
			 if(cb.getContractNo().equalsIgnoreCase(contractNo))
			 {
				 count++;
				 itr.remove();
				 break;
			 }
		}
		
		if (count == 0) 
		{
			return false;
		} else 
		{
			return true;
		}
	}

	@Override
	public boolean addContract(ContractBean contract) 
	{
		int count = 0;
		ContractBean cb=null;
		ListIterator<ContractBean> itr= contractList.listIterator();
		
		while(itr.hasNext())
		{
			 cb= itr.next();
			 if(cb.getContractNo().equalsIgnoreCase(contract.getContractNo()))
			 {
				 count++;
			 }
		}
		
		if (count == 0) 
		{
			contractList.add(contract);
			return true;
		} else 
		{
			return false;
		}
	}

	@Override
	public List<ContractBean> getAllContract() {
		return contractList;
	}

}
