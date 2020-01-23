package com.tyss.forestrymanagementsystemcollection.factory;

import com.tyss.forestrymanagementsystemcollection.dao.BillingDao;
import com.tyss.forestrymanagementsystemcollection.dao.BillingDaoImpl;
import com.tyss.forestrymanagementsystemcollection.dao.ContractDao;
import com.tyss.forestrymanagementsystemcollection.dao.ContractDaoImpl;
import com.tyss.forestrymanagementsystemcollection.dao.LandDao;
import com.tyss.forestrymanagementsystemcollection.dao.LandDaoImpl;
import com.tyss.forestrymanagementsystemcollection.dao.ProductDao;
import com.tyss.forestrymanagementsystemcollection.dao.ProductDaoImpl;
import com.tyss.forestrymanagementsystemcollection.dao.UserDao;
import com.tyss.forestrymanagementsystemcollection.dao.UserDaoImpl;
import com.tyss.forestrymanagementsystemcollection.services.BillingServices;
import com.tyss.forestrymanagementsystemcollection.services.BillingServicesImpl;
import com.tyss.forestrymanagementsystemcollection.services.ContractServices;
import com.tyss.forestrymanagementsystemcollection.services.ContractServicesImpl;
import com.tyss.forestrymanagementsystemcollection.services.LandServices;
import com.tyss.forestrymanagementsystemcollection.services.LandServicesImpl;
import com.tyss.forestrymanagementsystemcollection.services.ProductServices;
import com.tyss.forestrymanagementsystemcollection.services.ProductServicesImpl;
import com.tyss.forestrymanagementsystemcollection.services.UserServices;
import com.tyss.forestrymanagementsystemcollection.services.UserServicesImpl;

public class ForestryManagementSystemFactory 
{
	private ForestryManagementSystemFactory() {
	}

	public static UserDao isntanceOfCustomerDaoImpl() {
		UserDao customerDao = new UserDaoImpl();
		return customerDao;
	}

	public static UserServices instanceOfCustomerServices() {
		UserServices customerServices = new UserServicesImpl();
		return customerServices;
	}

	public static ContractDao isntanceOfContractDaoImpl() {
		ContractDao contractDao = new ContractDaoImpl();
		return contractDao;
	}

	public static ContractServices instanceOfContractServices() {
		ContractServices contractServices = new ContractServicesImpl();
		return contractServices;
	}

	public static ProductDao instanceOfProductDaoImpl() {
		ProductDao productDao = new ProductDaoImpl();
		return productDao;
	}

	public static ProductServices instanceOfProductServies() {
		ProductServices productServices = new ProductServicesImpl();
		return productServices;
	}

	public static LandDao instanceOfLandDaoImpl() {
		return new LandDaoImpl();
	}

	public static LandServices instanceOfLandServices() {
		return new LandServicesImpl();
	}
	
	public static BillingDao instanceOfBillingDaoImpl()
	{
		return new BillingDaoImpl();
	}
	
	public static BillingServices instanceOfBillingServices()
	{
		return new BillingServicesImpl();
	}
}
