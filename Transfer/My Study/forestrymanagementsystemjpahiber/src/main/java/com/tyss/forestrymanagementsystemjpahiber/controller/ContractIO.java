package com.tyss.forestrymanagementsystemjpahiber.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.tyss.forestrymanagementsystemjpahiber.dto.ContractBean;
import com.tyss.forestrymanagementsystemjpahiber.dto.ProductBean;
import com.tyss.forestrymanagementsystemjpahiber.dto.UserBean;
import com.tyss.forestrymanagementsystemjpahiber.exception.DateFromPastException;
import com.tyss.forestrymanagementsystemjpahiber.exception.QuantityMoreThanStockException;
import com.tyss.forestrymanagementsystemjpahiber.factory.ForestryManagementSystemFactory;
import com.tyss.forestrymanagementsystemjpahiber.services.ContractServices;
import com.tyss.forestrymanagementsystemjpahiber.services.ProductServices;
import com.tyss.forestrymanagementsystemjpahiber.services.UserServices;

public class ContractIO {
	static ContractServices contractServices = ForestryManagementSystemFactory.instanceOfContractServices();
	static UserServices userServices = ForestryManagementSystemFactory.instanceOfCustomerServices();
	static ProductServices productServices = ForestryManagementSystemFactory.instanceOfProductServies();
	static List<ContractBean> contractList = null;
	static ContractBean contract = null;
	static Scanner sc = new Scanner(System.in);

	public static void contractHandler(String userType) {
		while (true) {
			switch (contractMenu(userType)) {
			case 1:
				contractList = contractServices.getAllContract();
				if (contractList.size() > 0) {
					System.out.println("ContId\tCustId\tPId\tHaulId\tQuantity\tDlvry Date\tDay");
					for (ContractBean contract : contractList) {
						System.out.println(contract);
					}
				} else {
					System.out.println("No Database for contracts, please add new contract");
				}
				break;

			case 2:
				if (userType.equalsIgnoreCase("Scheduler") || userType.equalsIgnoreCase("Customer")) {
					contract = readContractDetails();
					if (contract.getDeliveryDate() != null && contract.getQuantity() >=0) {
						if (contractServices.addContract(contract)) {
							System.out.println("New Contract has been added");
						}
					} else {
						System.out.println(
								"Contract Could not be added, as above mentioned exception occured, try ahain");
					}
				}
				break;

			case 3:
				if (userType.equalsIgnoreCase("Scheduler") || userType.equalsIgnoreCase("Customer")) {
					System.out.println("Please enter Contract Id to be deleted");
					int contractId = sc.nextInt();
					if (contractServices.deleteContract(contractId)) {
						System.out.println("Contract with ID: " + contractId + " has been deleted");
					} else {
						System.out.println("Contract with ID: " + contractId + " is not present in database");
					}
				} else {
					System.out.println("Modification rights are reserved for Scheduler/ Customer only.");
				}
				break;

			case 4:
				if (userType.equalsIgnoreCase("Customer")) {
					System.out.println("Please enter Contract Id to be modified");
					int contractId = sc.nextInt();
					System.out.println("Please enter new quantity for product");
					int productQuantity = sc.nextInt();
					if (contractServices.modifyContract(contractId, productQuantity)) {
						System.out.println("Contract with ID: " + contractId + " has been modified");
					} else {
						System.out.println("Contract with ID: " + contractId + " is not present in database");
					}
				} else {
					System.out.println("Modification rights are reserved for Customer only.");
				}
				break;

			case 5:
				return;

			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Choice");
			}
		}

	}

	public static ContractBean readContractDetails() {
		contract = new ContractBean();
		ProductIO.displayAllProducts();
		int productId;
		ProductBean product;
		do {
			System.out.println("Please enter Product Id from above list");
			productId = sc.nextInt();
			product = productServices.searchProduct(productId);
		} while (product == null);

		product = productServices.getProductById(productId);
		contract.setProductBean(product);
		contract.setCustomerId(displayAllUsersGetIdInput("Customer"));
		contract.setHaulierId(displayAllUsersGetIdInput("Haulier"));

		Date formattedDate = null;
		do {
			System.out.println("Please enter Delivery Date in format YYYY-MM-DD");
			String date = sc.next();
			formattedDate = Validation.convertStringToDate(date);
		} while (formattedDate == null);

		Date currentDate = new Date();
		if (formattedDate.getTime() - currentDate.getTime() < 0) {
			try {
				contract.setDeliveryDate(null);
				throw new DateFromPastException("Delivery date can't be from past");
			} catch (DateFromPastException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		} else {
			SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
			String day = simpleDateformat.format(formattedDate);
			contract.setDay(day);
			contract.setDeliveryDate(formattedDate);
		}

		int stockProductQuantity = product.getProductQuantity();
		int contractProductQuantity;
	
		System.out.println("Please enter Quantity (Must be <= Stock quantity )");
		contractProductQuantity = sc.nextInt();
		if (stockProductQuantity >= contractProductQuantity && contractProductQuantity > 0) {
			contract.setQuantity(contractProductQuantity);
		} else {
			try {
				contract.setQuantity(-1);
				throw new QuantityMoreThanStockException("Quantity must be >0 and <= Stock Quantity");
			} catch (QuantityMoreThanStockException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

		return contract;
	}

	public static int contractMenu(String userType) {
		if (userType.equalsIgnoreCase("Scheduler") || userType.equalsIgnoreCase("Customer")) {
			System.out.println("***********Contract Menu***********");
			System.out.println(
					"1. Display All Contract\n2. Add Contract\n3. Delete Contract\n4. Modify Contract\n5. Go to Dashboard\n6. Exit");
			System.out.println("*********************************");
			System.out.println("Please enter your choice from Contract Menu");
			int contractChoice = sc.nextInt();
			sc.nextLine();
			return contractChoice;
		} else

		{
			System.out.println("***********Contract Menu***********");
			System.out.println("1. Display All Contract\n2. Go to Dashboard\n3. Exit");
			System.out.println("*********************************");
			System.out.println("Please enter your choice from Contract Menu");
			int contractChoice = sc.nextInt();
			sc.nextLine();
			if (contractChoice == 1) {
				contractChoice = 1;
			} else if (contractChoice == 2) {
				contractChoice = 5;
			} else if (contractChoice == 3) {
				contractChoice = 6;
			} else {

				contractChoice = -1;
			}
			return contractChoice;
		}
	}

	public static int displayAllUsersGetIdInput(String userType) {
		List<UserBean> userList = userServices.getUserWithGivenType(userType);
		System.out.println("List of all " + userType + ":\n-------------------");
		System.out.println("Id\t" + userType);
		Map<Integer, String> userMap = new HashMap<Integer, String>();
		for (UserBean userBean : userList) {
			System.out.println(userBean.getUserId() + "\t" + userBean.getFullName());
			userMap.put(userBean.getUserId(), userBean.getFullName());
		}

		int userId;
		do {
			System.out.println("Please choose " + userType + " from given list");
			userId = sc.nextInt();
		} while (!userMap.containsKey(userId));
		return userId;
	}
}
