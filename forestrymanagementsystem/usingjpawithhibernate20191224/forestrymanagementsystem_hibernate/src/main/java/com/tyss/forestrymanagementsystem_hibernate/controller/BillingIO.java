package com.tyss.forestrymanagementsystem_hibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.tyss.forestrymanagementsystem_hibernate.dto.BillingBean;
import com.tyss.forestrymanagementsystem_hibernate.dto.ContractBean;
import com.tyss.forestrymanagementsystem_hibernate.factory.ForestryManagementSystemFactory;
import com.tyss.forestrymanagementsystem_hibernate.services.BillingServices;
import com.tyss.forestrymanagementsystem_hibernate.services.ContractServices;
import com.tyss.forestrymanagementsystem_hibernate.services.ProductServices;
import com.tyss.forestrymanagementsystem_hibernate.services.UserServices;

public class BillingIO {
	static Scanner sc = new Scanner(System.in);
	static ProductServices productServices = ForestryManagementSystemFactory.instanceOfProductServies();
	static UserServices userServices = ForestryManagementSystemFactory.instanceOfCustomerServices();
	static BillingServices billingServices = ForestryManagementSystemFactory.instanceOfBillingServices();
	static ContractServices contractServices = ForestryManagementSystemFactory.instanceOfContractServices();
	static BillingBean billingBean = new BillingBean();

	public static void billngHandler(String userType) {
		while (true) {
			switch (billingMenu()) {
			case 1:
				if (userType.equalsIgnoreCase("Admin")) {
					billingBean = readBillingDetails();
					if (billingBean != null) {
						if (billingServices.generateBill(billingBean)) {
							System.out.println("New Bill record has been added");
						} else {
							System.err.println("Something went wrong, please try again");
						}
					} else {
						System.out.println("Invalid Contract ID or Bill has been generated already for this contract.");
					}
				} else {
					System.out.println("Modification rights are reserved for admin only.");
				}

				break;

			case 2:
				if (userType.equalsIgnoreCase("Admin")) {
					displayAllBills();
					System.out.println("Please enter Bill Id from above list to update quantity");
					int billId = sc.nextInt();

					System.out.println("Please enter total paid amount");
					double paidAmount = sc.nextDouble();
					if (billingServices.updateBill(billId, paidAmount))
						System.out.println("Total paid amount has been updated.");
					else {
						System.out.println("Try again with correct Bill Id");
					}
				} else {
					System.out.println("Modification rights are reserved for admin only.");
				}
				break;

			case 3:
				displayAllBills();
				break;

			case 4: // Printing reciept
				printCustomerReciept();

				break;

			case 5:
				return;

			case 6:
				System.exit(0);

			default:
				System.out.println("Invalid Choice");

			}
		}
	}

	private static BillingBean readBillingDetails() {
		billingBean = new BillingBean();
		List<ContractBean> contractList = contractServices.getAllContract();
		int contractId;
		int flag = 0;
		if (contractList.size() > 0) {
			System.out.println("ContId\tCustId\tPId\tHaulId\tQuantity\tDlvry Date\tDay");
			for (ContractBean contract : contractList) {
				System.out.println(contract);
			}
		}
		System.out.println("Please enter Contract Id from above list");
		contractId = sc.nextInt();
		for (ContractBean contractBean : contractList) {
			if (contractBean.getContractId() == contractId) {
				flag++;
				break;
			}
		}

		if ((!billingServices.isContractIdPresent(contractId)) && (flag > 0)) {
			billingBean.setContractId(contractId);
			sc.nextLine();
			System.out.println("Please enter actual paid amount");
			billingBean.setPaidAmount(sc.nextDouble());
			sc.nextLine();
			return billingBean;
		} else {
			return null;
		}
	}

	private static int billingMenu() {
		System.out.println("***********Billing Menu***********");
		System.out.println(
				"1. Generate Bill\n2. Modify Bill\n3. Display All Bills\n4. Print Customer Reciept\n5. Go to Dashboard\n6. Exit");
		System.out.println("*********************************");
		System.out.println("Please enter your choice from Billing Menu");
		int productChoice = sc.nextInt();
		sc.nextLine();
		return productChoice;
	}

	public static void displayAllBills() {
		List<Object[]> list = billingServices.getAllBills();
		if (list.size() > 0) {
			System.out.println("\t\t\t\t<<<<<<Bill Details>>>>>");

			System.out.println("BillId\t\tContractId\tCustomerName\tProductName\tQuantity\tProductPrice\tBilledAmount"
					+ "\tHaulierName\tOwnerName\tPaidAmount\tLeft_to_pay\tDeliveryDate\t\tBillTimestamp\t\tIsFullyPaid");

			System.out.println("----------------------------------------------------------------------------------"
					+ "---------------------------------------------------------------------------------"
					+ "-----------------------------------------------------------------");
			int i = 0;
			for (Object[] objects : list) {
				i = 0;
				for (Object object : objects) {
					objects[11] = objects[11].toString().substring(0, 10);
					System.out.print(object + "\t\t");
				}
				double leftToPay = (double) objects[10];
				if (leftToPay > 0) {
					System.out.println("No");
				} else {
					System.out.println("Yes");
				}
			}

		} else {
			System.out.println("No Database for Products, please add new product");
		}
	}

	public static void printCustomerReciept() {
		System.out.println("Please enter Bill Id to Print Bill");
		int billIdToPrint = sc.nextInt();
		Object[] foundObject = null;
		List<Object[]> billingList = billingServices.getAllBills();
		if (billingList.size() > 0) {
			for (Object[] objects : billingList) {
				int billId = (int) objects[0];
				if (billId == billIdToPrint) {
					foundObject = objects;
					break;
				}
			}
			if (foundObject != null) {
				System.out.println("-----------------------------------------------------------");
				System.out.println("\n\t<<<<<<<<<<<<Bill Reciept>>>>>>>>>>>>>>>");
				System.out.println("\n\tFORESTRY MANAGEMENT SERVICES");
				System.out.println("\t\t\tContact: +91 80 555 4440/ 41/ 42");
				System.out.println("\t\t\tEmail: admin@fms.in, hr@fms.in");

				System.out.println("\nOrder Placed on: " + foundObject[12]);
				System.out.println("Bill Id: " + foundObject[0]);
				System.out.println("\n--------------Delivery Details---------------------------");
				System.out
						.println("|Expect delivery on:\t\t\t| " + foundObject[11].toString().substring(0, 10) + "\t|");
				System.out.println("|Product Seller:\t\t\t| " + foundObject[8] + "\t\t|");
				System.out.println("|Product Delivered by:\t\t\t| " + foundObject[7] + "\t\t|");
				System.out.println("|Product Delivered to:\t\t\t| " + foundObject[2] + "\t\t|");

				System.out.println("|\t\t\t\t\t\t\t|");
				System.out.println("------------------Product Details------------------------");
				System.out.println("|Product Name:\t\t\t\t| " + foundObject[3] + "\t|");
				System.out.println("|Product Quantity:\t\t\t| " + foundObject[4] + "\t\t|");
				System.out.println("|Product Price:\t\t\t\t| " + foundObject[5] + "\t\t|");

				System.out.println("|\t\t\t\t\t\t\t|");
				System.out.println("---------Charges Details (in Dollers $)------------------");
				System.out.println("|Total Billed Amount (price*quantity)\t| " + foundObject[6] + "\t\t|");
				System.out.println("|Total Base Amount \t\t\t| " + (double) foundObject[6] * .95 + "\t\t|");
				System.out
						.println("|GST (5%, included in total Amount)  \t| " + (double) foundObject[6] * .05 + "\t\t|");
				System.out.println("|Total Paid Amount \t\t\t| " + foundObject[9] + "\t\t|");
				System.out.println("|Left to Pay Amount\t\t\t| " + foundObject[10] + "\t\t|");
				System.out.println("|\t\t\t\t\t\t\t|");

				System.out.println("---------------------------------------------------------");

				System.out.println("|\t\t\t\t\t\t\t|");
				System.out.println("|\t\t\t\t\t\t\t|");
				System.out.println("| FMS Stamp\t\t\t\tCustomer Sign\t|");
				System.out.println("--------------------------------------------------------");
				System.out.println("\n\n");

			} else {
				System.out.println("Invalid Bill Id, please check all bills with option 3 and try again.");
			}
		} else {
			System.out.println("No Database for Products, please add new product");
		}
	}
}
