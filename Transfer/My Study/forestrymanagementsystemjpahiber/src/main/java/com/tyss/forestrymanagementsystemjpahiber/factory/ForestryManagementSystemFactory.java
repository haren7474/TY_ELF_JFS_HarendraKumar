package com.tyss.forestrymanagementsystemjpahiber.factory;

import com.tyss.forestrymanagementsystemjpahiber.dao.BillingDao;
import com.tyss.forestrymanagementsystemjpahiber.dao.BillingDaoImpl;
import com.tyss.forestrymanagementsystemjpahiber.dao.ContractDao;
import com.tyss.forestrymanagementsystemjpahiber.dao.ContractDaoImpl;
import com.tyss.forestrymanagementsystemjpahiber.dao.EmailDao;
import com.tyss.forestrymanagementsystemjpahiber.dao.EmailDaoImpl;
import com.tyss.forestrymanagementsystemjpahiber.dao.LandDao;
import com.tyss.forestrymanagementsystemjpahiber.dao.LandDaoImpl;
import com.tyss.forestrymanagementsystemjpahiber.dao.ProductDao;
import com.tyss.forestrymanagementsystemjpahiber.dao.ProductDaoImpl;
import com.tyss.forestrymanagementsystemjpahiber.dao.UserDao;
import com.tyss.forestrymanagementsystemjpahiber.dao.UserDaoImpl;
import com.tyss.forestrymanagementsystemjpahiber.dto.EmailBean;
import com.tyss.forestrymanagementsystemjpahiber.services.BillingServices;
import com.tyss.forestrymanagementsystemjpahiber.services.BillingServicesImpl;
import com.tyss.forestrymanagementsystemjpahiber.services.ContractServices;
import com.tyss.forestrymanagementsystemjpahiber.services.ContractServicesImpl;
import com.tyss.forestrymanagementsystemjpahiber.services.EmailServices;
import com.tyss.forestrymanagementsystemjpahiber.services.EmailServicesImpl;
import com.tyss.forestrymanagementsystemjpahiber.services.LandServices;
import com.tyss.forestrymanagementsystemjpahiber.services.LandServicesImpl;
import com.tyss.forestrymanagementsystemjpahiber.services.ProductServices;
import com.tyss.forestrymanagementsystemjpahiber.services.ProductServicesImpl;
import com.tyss.forestrymanagementsystemjpahiber.services.UserServices;
import com.tyss.forestrymanagementsystemjpahiber.services.UserServicesImpl;

public class ForestryManagementSystemFactory {
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

	public static BillingDao instanceOfBillingDaoImpl() {
		return new BillingDaoImpl();
	}

	public static BillingServices instanceOfBillingServices() {
		return new BillingServicesImpl();
	}

	public static EmailDao instanceOfEmailDaoImpl() {
		return new EmailDaoImpl();
	}

	public static EmailServices instanceOfEmailServices() {
		return new EmailServicesImpl();
	}
}
