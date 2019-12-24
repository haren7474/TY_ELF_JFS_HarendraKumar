package com.tyss.forestrymanagementsystem_hibernate.factory;

import com.tyss.forestrymanagementsystem_hibernate.dao.BillingDao;
import com.tyss.forestrymanagementsystem_hibernate.dao.BillingDaoImpl;
import com.tyss.forestrymanagementsystem_hibernate.dao.ContractDao;
import com.tyss.forestrymanagementsystem_hibernate.dao.ContractDaoImpl;
import com.tyss.forestrymanagementsystem_hibernate.dao.LandDao;
import com.tyss.forestrymanagementsystem_hibernate.dao.LandDaoImpl;
import com.tyss.forestrymanagementsystem_hibernate.dao.ProductDao;
import com.tyss.forestrymanagementsystem_hibernate.dao.ProductDaoImpl;
import com.tyss.forestrymanagementsystem_hibernate.dao.UserDao;
import com.tyss.forestrymanagementsystem_hibernate.dao.UserDaoImpl;
import com.tyss.forestrymanagementsystem_hibernate.services.BillingServices;
import com.tyss.forestrymanagementsystem_hibernate.services.BillingServicesImpl;
import com.tyss.forestrymanagementsystem_hibernate.services.ContractServices;
import com.tyss.forestrymanagementsystem_hibernate.services.ContractServicesImpl;
import com.tyss.forestrymanagementsystem_hibernate.services.LandServices;
import com.tyss.forestrymanagementsystem_hibernate.services.LandServicesImpl;
import com.tyss.forestrymanagementsystem_hibernate.services.ProductServices;
import com.tyss.forestrymanagementsystem_hibernate.services.ProductServicesImpl;
import com.tyss.forestrymanagementsystem_hibernate.services.UserServices;
import com.tyss.forestrymanagementsystem_hibernate.services.UserServicesImpl;

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
