package com.tyss.forestrymanagementsystemjpahiber.controller;

import java.util.List;
import java.util.Scanner;

import com.tyss.forestrymanagementsystemjpahiber.dto.BillingBean;
import com.tyss.forestrymanagementsystemjpahiber.dto.ContractBean;
import com.tyss.forestrymanagementsystemjpahiber.factory.ForestryManagementSystemFactory;
import com.tyss.forestrymanagementsystemjpahiber.services.BillingServices;
import com.tyss.forestrymanagementsystemjpahiber.services.ContractServices;
import com.tyss.forestrymanagementsystemjpahiber.services.ProductServices;
import com.tyss.forestrymanagementsystemjpahiber.services.UserServices;

public class BillingIO {
	static Scanner sc = new Scanner(System.in);
	static ProductServices productServices = ForestryManagementSystemFactory.instanceOfProductServies();
	static UserServices userServices = ForestryManagementSystemFactory.instanceOfCustomerServices();
	static BillingServices billingServices = ForestryManagementSystemFactory.instanceOfBillingServices();
	static ContractServices contractServices = ForestryManagementSystemFactory.instanceOfContractServices();
	static BillingBean billingBean = new BillingBean();

	public static void billngHandler(String userType) {
		while (true) {
			switch (billingMenu(userType)) {
			case 1:
				displayAllBills();
				break;

			case 2:
				// Printing reciept
				 printCustomerReciept();
				break;

			case 3:
				if (userType.equalsIgnoreCase("Scheduler")) {
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
					System.out.println("Modification rights are reserved for Scheduler only.");
				}

				break;

			case 4:
				if (userType.equalsIgnoreCase("Scheduler")) {
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
					System.out.println("Modification rights are reserved for Scheduler only.");
				}
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
			ContractBean contractBean = contractServices.getContractById(contractId);
			billingBean.setContractBean(contractBean);
			sc.nextLine();
			System.out.println("Please enter actual paid amount");
			billingBean.setPaidAmount(sc.nextDouble());
			sc.nextLine();
			return billingBean;
		} else {
			return null;
		}
	}

	private static int billingMenu(String userType) {
		if (userType.equalsIgnoreCase("Scheduler")) {
			System.out.println("***********Billing Menu***********");
			System.out.println(
					"1. Display All Bills\n2. Print Billing Reciept\n3. Generate Bill\n4. Modify Bill\n5. Go to Dashboard\n6. Exit");
			System.out.println("*********************************");
			System.out.println("Please enter your choice from Billing Menu");
			int billingChoice = sc.nextInt();
			sc.nextLine();
			return billingChoice;
		} else {
			System.out.println("***********Billing Menu***********");
			System.out.println("1. Display All Bills\n2. Print Billing Reciept\n3. Go to Dashboard\n4. Exit");
			System.out.println("*********************************");
			System.out.println("Please enter your choice from Billing Menu");
			int billingChoice = sc.nextInt();
			sc.nextLine();

			if (billingChoice == 1) {
				billingChoice = 1;
			} else if (billingChoice == 2) {
				billingChoice = 2;
			} else if (billingChoice == 3) {
				billingChoice = 5;
			} else if (billingChoice == 4) {
				billingChoice = 6;
			} else {
				billingChoice = -1;
			}
			return billingChoice;
		}
	}

	public static void displayAllBills() {
		List<BillingBean> list = billingServices.getAllBills();
		if (list.size() > 0) {
			System.out.println("\t\t\t\t<<<<<<Bill Details>>>>>");

			System.out.println("BillId ContractId ProductName\tQuantity\tProductPrice\tBilledAmount"
					+ "\tPaidAmount\tLeft_to_pay\tDeliveryDate\t\tBillTimestamp\tCustomerName\tHaulierName\tOwnerName");

			System.out.println("----------------------------------------------------------------------------------"
					+ "---------------------------------------------------------------------------------"
					+ "-----------------------------------------------------------------");

			for (BillingBean billingBean : list) {

				System.out.print(billingBean);
				ContractBean contractBean = billingBean.getContractBean();
				System.out.print(userServices.getUserById(contractBean.getCustomerId()).getFullName() + "\t");
				System.out.print(userServices.getUserById(contractBean.getHaulierId()).getFullName() + "\t");
				System.out.println(contractBean.getProductBean().getUserBean().getFullName());
			}

		} else {
			System.out.println("No Database for Products, please add new product");
		}
	}

	public static void printCustomerReciept() {
		System.out.println("Please enter Bill Id to Print Bill");
		int billIdToPrint = sc.nextInt();
		BillingBean foundObject = null;
		List<BillingBean> billingList = billingServices.getAllBills();
		if (billingList.size() > 0) {
			for (BillingBean billingBean : billingList) {
				if (billingBean.getBillId() == billIdToPrint) {
					foundObject = billingBean;
					break;
				}
			}
			if (foundObject != null) {
				ContractBean contractBean = foundObject.getContractBean();
				System.out.println("-----------------------------------------------------------------");
				System.out.println("\n\t<<<<<<<<<<<<Bill Reciept>>>>>>>>>>>>>>>");
				System.out.println("\n\tFORESTRY MANAGEMENT SERVICES");
				System.out.println("\t\t\tContact: +91 80 555 4440/ 41/ 42");
				System.out.println("\t\t\tEmail: admin@fms.in, hr@fms.in");

				System.out.println("\nOrder Placed on: " + foundObject.getBillTimestamp());
				System.out.println("Bill Id: " + foundObject.getBillId());
				System.out.println("\n--------------Delivery Details---------------------------------");
				System.out.println("|Expect delivery on:\t\t\t| "
						+ contractBean.getDeliveryDate().toString().substring(0, 10) + "\t\t|");
				System.out.println("|Product Seller:\t\t\t| "
						+ contractBean.getProductBean().getUserBean().getFullName() + "\t\t\t|");
				System.out.println("|Product Delivered by:\t\t\t| "
						+ userServices.getUserById(contractBean.getHaulierId()).getFullName() + "\t\t\t|");
				System.out.println("|Product Delivered to:\t\t\t| "
						+ userServices.getUserById(contractBean.getCustomerId()).getFullName() + "\t\t\t|");

				System.out.println("|\t\t\t\t\t\t\t\t|");
				System.out.println("------------------Product Details------------------------------");
				System.out.println("|Product Name:\t\t\t\t| " + contractBean.getProductBean().getProductName() + "\t\t|");
				
				int productQuantity = contractBean.getQuantity();
				double productPrice = contractBean.getProductBean().getProductPrice();
				double billedAmount = productQuantity * productPrice;
				double totalPaid = foundObject.getPaidAmount();
				
				System.out.println("|Product Quantity:\t\t\t| " + productQuantity + "\t\t\t|");
				System.out.println("|Product Price:\t\t\t\t| " + productPrice + "\t\t\t|");

				System.out.println("|\t\t\t\t\t\t\t\t|");
				System.out.println("---------Charges Details (in Dollers $)------------------------");
				System.out.println("|Total Billed Amount (price*quantity)\t| " + billedAmount + "\t\t\t|");
				System.out.println("|Total Base Amount \t\t\t| " + billedAmount * .95 + "\t\t\t|");
				System.out.println("|GST (5%, included in total Amount)  \t| " + billedAmount * .05 + "\t\t\t|");
				System.out.println("|Total Paid Amount \t\t\t| " + totalPaid + "\t\t\t|");
				System.out.println("|Left to Pay Amount\t\t\t| " + (billedAmount - totalPaid) + "\t\t\t|");
				System.out.println("|\t\t\t\t\t\t\t\t|");

				System.out.println("---------------------------------------------------------------");

				System.out.println("|\t\t\t\t\t\t\t\t|");
				System.out.println("|\t\t\t\t\t\t\t\t|");
				System.out.println("| FMS Stamp\t\t\t\tCustomer Sign\t\t|");
				System.out.println("--------------------------------------------------------------");
				System.out.println("\n\n");

			} else {
				System.out.println("Invalid Bill Id, please check all bills with option 3 and try again.");
			}
		} else {
			System.out.println("No Database for Products, please add new product");
		}
	}

}
