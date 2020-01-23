package com.tyss.forestrymanagementsystemcollection.controller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.tyss.forestrymanagementsystemcollection.dto.BillingBean;
import com.tyss.forestrymanagementsystemcollection.dto.ContractBean;
import com.tyss.forestrymanagementsystemcollection.factory.ForestryManagementSystemFactory;
import com.tyss.forestrymanagementsystemcollection.services.BillingServices;
import com.tyss.forestrymanagementsystemcollection.services.ContractServices;
import com.tyss.forestrymanagementsystemcollection.services.ProductServices;
import com.tyss.forestrymanagementsystemcollection.services.UserServices;

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

		System.out.println("Please enter Bill Id");
		billingBean.setBillId(sc.nextInt());
		sc.nextLine();

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
			String timestamp = new Date().toString();
			billingBean.setBillTimestamp(timestamp);
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
		List<BillingBean> billingList = billingServices.getAllBills();
		if (billingList.size() > 0) {
			System.out.println("\t\t\t\t<<<<<<Bill Details>>>>>");
			System.out.println(
					"BillId \t ContractId \tCustomerName\tHaulierName \tOwnerName\tProductName \tQuantity\tPrice "
							+ "\tBilledAmount\tPaidAmount \tUnpaidAmount \tisFullyPaid \tDeliveryDate \tBillTimestamp");

			System.out.println(
					"-------------------------------------------------------------------------------------------------------"
							+ "-----------------------------------------------------------------------------------------------------");
			for (BillingBean bill : billingList) {
				System.out.println(bill);
			}
		} else {
			System.out.println("No Database for Products, please add new product");
		}
	}

	public static void printCustomerReciept() {
		BillingBean bill = null;
		List<BillingBean> billingList = billingServices.getAllBills();
		System.out.println("Please enter Bill Id to Print Bill");
		int billIdToPrint = sc.nextInt();
		billingList = billingServices.getAllBills();
		if (billingList.size() > 0) {
			for (BillingBean billings : billingList) {
				if (billings.getBillId() == billIdToPrint) {
					bill = billings;
					break;
				}
			}
			if (bill != null) {
				System.out.println("-----------------------------------------------------------");
				System.out.println("\n\t<<<<<<<<<<<<Bill Reciept>>>>>>>>>>>>>>>");
				System.out.println("\n\tFORESTRY MANAGEMENT SERVICES");
				System.out.println("\t\t\tContact: +91 80 555 4440/ 41/ 42");
				System.out.println("\t\t\tEmail: admin@fms.in, hr@fms.in");

				System.out.println("\nOrder Placed on: " + bill.getBillTimestamp());
				System.out.println("Bill Id: " + bill.getBillId());
				System.out.println("\n--------------Delivery Details---------------------------");
				System.out.println("|Expect delivery on:\t\t\t| " + bill.getDeliveryDate().toString().substring(0, 10) + "\t|");
				System.out.println("|Product Seller:\t\t\t| " + bill.getOwnerName() + "\t\t|");
				System.out.println("|Product Delivered by:\t\t\t| " + bill.getHaulierName() + "\t\t|");
				System.out.println("|Product Delivered to:\t\t\t| " + bill.getCustomerName() + "\t\t|");

				System.out.println("|\t\t\t\t\t\t\t|");
				System.out.println("------------------Product Details------------------------");
				System.out.println("|Product Name:\t\t\t\t| " + bill.getProductName() + "\t|");
				System.out.println("|Product Quantity:\t\t\t| " + bill.getQuantity() + "\t\t|");
				System.out.println("|Product Price:\t\t\t\t| " + bill.getPrice() + "\t\t|");

				System.out.println("|\t\t\t\t\t\t\t|");
				System.out.println("---------Charges Details (in Dollers $)------------------");
				System.out.println("|Total Billed Amount (price*quantity)\t| " + bill.getBilledAmount() + "\t\t|");
				System.out.println("|Total Base Amount \t\t\t| " + bill.getBilledAmount() * .95 + "\t\t|");
				System.out
						.println("|GST (5%, included in total Amount)  \t| " + bill.getBilledAmount() * .05 + "\t\t|");
				System.out.println("|Total Paid Amount \t\t\t| " + bill.getPaidAmount() + "\t\t|");
				System.out.println("|Left to Pay Amount\t\t\t| " + bill.getLeftToPay() + "\t\t|");
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
