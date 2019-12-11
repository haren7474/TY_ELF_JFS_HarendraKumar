package com.tyss.fms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import com.tyss.fms.dto.ContractBean;
import com.tyss.fms.factory.ForestryManagementSystemFactory;
import com.tyss.fms.services.ContractServices;
import com.tyss.fms.services.ProductServices;
import com.tyss.fms.services.UserServices;

public class ContractIO {
	static ContractServices contractServices = ForestryManagementSystemFactory.instanceOfContractServices();
	static UserServices userServices = ForestryManagementSystemFactory.instanceOfCustomerServices();
	static ProductServices productServices = ForestryManagementSystemFactory.instanceOfProductServies();
	static List<ContractBean> contractList = null;
	static ContractBean contract = null;
	static Scanner sc = new Scanner(System.in);

	public static void contractHandler(int activeUserId) {
		while (true) {
			String userType = userServices.getUserType(activeUserId);
			switch (contractMenu()) {
			case 1:
				if (userType.equalsIgnoreCase("Admin")) {
					if (contractServices.addContract(readContractDetails(contract))) {
						System.out.println("New Contract has been added");
					} else {
						System.err.println("Duplicate Contract Id can not be added");
					}
				} else {
					System.out.println("Modification rights are reserved for admin only.");
				}
				break;

			case 2:
				if (userType.equalsIgnoreCase("Admin")) {
					System.out.println("Please enter Contract Id to be deleted");
					int contractId = sc.nextInt();
					if (contractServices.deleteContract(contractId)) {
						System.out.println("Contract with ID: " + contractId + " has been deleted");
					} else {
						System.out.println("Contract with ID: " + contractId + " is not present in database");
					}
				} else {
					System.out.println("Modification rights are reserved for admin only.");
				}

				break;

			case 3:
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

			case 4:
				return;

			case 5:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Choice");
			}
		}

	}

	public static ContractBean readContractDetails(ContractBean contract) {
		contract = new ContractBean();
		ProductIO.displayAllProducts();
		int productId;
		do {
			System.out.println("Please enter Product Id from above list");
			productId = sc.nextInt();
		} while (!productServices.searchProduct(productId));

		contract.setProductId(productId);
		contract.setCustomerId(displayAllUsersGetIdInput("Customer"));
		contract.setHaulierId(displayAllUsersGetIdInput("Haulier"));
		System.out.println("Please enter Delivery Date in format YYYY-MM-DD");
		contract.setDeliveryDate(sc.next());
		System.out.println("Please enter Day of Delivery");
		contract.setDay(sc.next());
		System.out.println("Please enter Quantity ");
		contract.setQuantity(sc.nextInt());
		return contract;
	}

	public static int contractMenu() {
		System.out.println("***********Contract Menu***********");
		System.out.println(
				"1. Add Contract\n2. Delete Contract\n3. Display All Contract\n4. Go to Dashboard\n5. Exit");
		System.out.println("*********************************");
		System.out.println("Please enter your choice from Contract Menu");
		int contractChoice = sc.nextInt();
		sc.nextLine();
		return contractChoice;
	}

	public static int displayAllUsersGetIdInput(String userType) {
		HashMap<Integer, String> ownerMap = userServices.getUserIdWithGivenUserType(userType);
		Set<Entry<Integer, String>> set = ownerMap.entrySet();
		System.out.println("List of all " + userType + ":\n-------------------");
		System.out.println("Id\t" + userType);

		for (Entry<Integer, String> entry : set) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}

		int ownerId;
		do {
			System.out.println("Please choose " + userType + " from given list");
			ownerId = sc.nextInt();
		} while (!ownerMap.containsKey(ownerId));
		return ownerId;
	}
}
