package com.tyss.fms.factory;

import com.tyss.fms.dao.ContractDao;
import com.tyss.fms.dao.ContractDaoImpl;
import com.tyss.fms.dao.CustomerDao;
import com.tyss.fms.dao.CustomerDaoImpl;
import com.tyss.fms.dao.LandDao;
import com.tyss.fms.dao.LandDaoImpl;
import com.tyss.fms.dao.ProductDao;
import com.tyss.fms.dao.ProductDaoImpl;
import com.tyss.fms.services.ContractServices;
import com.tyss.fms.services.ContractServicesImpl;
import com.tyss.fms.services.CustomerServices;
import com.tyss.fms.services.CustomerServicesImpl;
import com.tyss.fms.services.LandServices;
import com.tyss.fms.services.LandServicesImpl;
import com.tyss.fms.services.ProductServices;
import com.tyss.fms.services.ProductServicesImpl;

public class ForestryManagementSystemFactory {
	private ForestryManagementSystemFactory() {
	}

	public static CustomerDao isntanceOfCustomerDaoImpl() {
		CustomerDao customerDao = new CustomerDaoImpl();
		return customerDao;
	}

	public static CustomerServices instanceOfCustomerServices() {
		CustomerServices customerServices = new CustomerServicesImpl();
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
}
