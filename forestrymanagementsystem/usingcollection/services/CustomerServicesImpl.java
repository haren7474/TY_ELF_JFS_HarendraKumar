package com.tyss.fms.services;

import java.util.List;

import com.tyss.fms.dao.CustomerDao;
import com.tyss.fms.dto.CustomerBean;
import com.tyss.fms.factory.ForestryManagementSystemFactory;

public class CustomerServicesImpl implements CustomerServices {

	CustomerDao dao= ForestryManagementSystemFactory.isntanceOfCustomerDaoImpl();
	@Override
	public List<CustomerBean> getAllCustomer() {
		return dao.getAllCustomer();
	}

	@Override
	public boolean modifyCustomer(String customerID, String email) 
	{
		return dao.modifyCustomer(customerID, email);
	}

	@Override
	public boolean deleteCustomer(String customerID) {
		return dao.deleteCustomer(customerID);
	}

	@Override
	public boolean addCustomer(CustomerBean customer) 
	{
		return dao.addCustomer(customer);
	}

}
