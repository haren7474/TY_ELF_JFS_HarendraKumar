package com.tyss.fms.dao;

import java.util.List;

import com.tyss.fms.dto.CustomerBean;

public interface CustomerDao 
{
	public List<CustomerBean> getAllCustomer();
	public boolean modifyCustomer(String customerID, String email);
	public boolean deleteCustomer(String customerID);
	public boolean addCustomer(CustomerBean customer);
}
