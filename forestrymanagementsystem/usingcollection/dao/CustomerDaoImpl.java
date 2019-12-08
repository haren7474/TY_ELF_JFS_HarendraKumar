package com.tyss.fms.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.tyss.fms.dto.CustomerBean;
import com.tyss.fms.factory.ForestryManagementSystemFactory;
import com.tyss.fms.services.CustomerServices;

public class CustomerDaoImpl implements CustomerDao {
	private List<CustomerBean> customerList = new ArrayList<CustomerBean>();

	@Override
	public List<CustomerBean> getAllCustomer() {
		return customerList;
	}

	@Override
	public boolean modifyCustomer(String customerID, String email) 
	{
		int count = 0;
		CustomerBean cb=null;
		ListIterator<CustomerBean> itr= customerList.listIterator();
		
		while(itr.hasNext())
		{
			 cb= itr.next();
			 if(cb.getCustomerID().equalsIgnoreCase(customerID))
			 {
				 count++;
				cb.setEmail(email);
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
	public boolean deleteCustomer(String customerID) 
	{
		int count = 0;
		CustomerBean cb=null;
		ListIterator<CustomerBean> itr= customerList.listIterator();
		
		while(itr.hasNext())
		{
			 cb= itr.next();
			 if(cb.getCustomerID().equalsIgnoreCase(customerID))
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
	public boolean addCustomer(CustomerBean customer) 
	{
		int count = 0;
		CustomerBean cb=null;
		ListIterator<CustomerBean> itr= customerList.listIterator();
		
		while(itr.hasNext())
		{
			 cb= itr.next();
			 if(cb.getCustomerID().equalsIgnoreCase(customer.getCustomerID()))
			 {
				 count++;
			 }
		}
		
		if (count == 0) 
		{
			customerList.add(customer);
			return true;
		} else 
		{
			return false;
		}

	}

}
