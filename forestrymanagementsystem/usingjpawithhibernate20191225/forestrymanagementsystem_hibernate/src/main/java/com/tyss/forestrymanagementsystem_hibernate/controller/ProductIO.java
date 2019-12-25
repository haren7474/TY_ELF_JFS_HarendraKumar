package com.tyss.forestrymanagementsystem_hibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.tyss.forestrymanagementsystem_hibernate.dto.ProductBean;
import com.tyss.forestrymanagementsystem_hibernate.factory.ForestryManagementSystemFactory;
import com.tyss.forestrymanagementsystem_hibernate.services.ProductServices;

public class ProductIO {
	static Scanner sc = new Scanner(System.in);
	static ProductBean product = null;
	static List<ProductBean> productList = null;
	static ProductServices productServices = ForestryManagementSystemFactory.instanceOfProductServies();

	public static void productHandler(String userType) {
		while (true) {
			int productId;
			switch (productMenu(userType)) {
			case 1:
				displayAllProducts();
				break;

			case 2:
				System.out.println("Please enter Product Id to be searched");
				productId = sc.nextInt();
				product = productServices.searchProduct(productId);
				if (product != null) {
					System.out.println("Product Id: " + productId + " is present in database.");
					System.out.println("Product Name: " + product.getProductName());
					System.out.println("Product Quantity: " + product.getProductQuantity());
					System.out.println("Product Price: " + product.getProductPrice());
				} else {
					System.out.println("Product Id: " + productId + " is not present in database.");
				}
				break;

			case 3:
				displayProductDemand();
				break;

			case 4:
				if (userType.equalsIgnoreCase("Owner")) {
					if (productServices.addProduct(readProductDetails())) {
						System.out.println("New Product has been added");
					} else {
						System.err.println("Incorrect Input, please try again.");
					}
				} else {
					System.out.println("Modification rights are reserved for Owner  only.");
				}

				break;

			case 5:
				if (userType.equalsIgnoreCase("Owner")) {
					System.out.println("Please enter Product Id to be deleted");
					productId = sc.nextInt();
					if (productServices.deleteProduct(productId)) {
						System.out.println("Product with ID: " + productId + " has been deleted");
					} else {
						System.out.println("Product with ID: " + productId + " is not present in database");
					}
				} else {
					System.out.println("Modification rights are reserved for Owner only.");
				}
				break;

			case 6:
				if (userType.equalsIgnoreCase("Owner")) {
					displayAllProducts();
					System.out.println("Please enter Product Id from above list to update quantity");
					productId = sc.nextInt();
					if (productServices.searchProduct(productId) != null) {
						System.out.println("Please enter new Quantity");
						int newQuantity = sc.nextInt();
						productServices.updateQuantity(productId, newQuantity);
						System.out.println("Product quantity has been updated.");
					} else {
						System.out.println("Product Id: " + productId + " is not present in database.");
					}
				} else {
					System.out.println("Modification rights are reserved for Owner only.");
				}
				break;

			case 7:
				return;

			case 8:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Choice");
			}
		}

	}

	private static void displayProductDemand() {
		productList = productServices.getAllProduct();
		if (productList.size() > 0) {
			System.out.println("\t\t<<<<<<Product Details>>>>>");
			System.out.println("PId\tOwnId\tQuantity\tPrice($)\tName\t\tComments");
			System.out.println("---------------------------------------------------------------------");
			int countOfProductsInDemand = 0;
			for (ProductBean product : productList) {
				if (product.getProductQuantity() < 20) {
					countOfProductsInDemand++;
					System.out.println(product);
				}
			}
			if (countOfProductsInDemand == 0) {
				System.out.println("All product have enough stock as per current demand!!!!");
			} else {
				System.out.println(countOfProductsInDemand
						+ " products which are listed above are in demand, need to be imported");
			}
		} else {
			System.out.println("No Database for Products, please add new product");
		}
	}

	public static int productMenu(String userType) {
		if (userType.equalsIgnoreCase("Owner")) {
			System.out.println("***********Product Menu***********");
			System.out.println(
					"1. Display All Product\n2. Search Product\n3. Check Product Demand\n4. Add Product\n5. Delete Product\n6. Update Product Quantity\n7. Go to Dashboard\n8. Exit");
			System.out.println("*********************************");
			System.out.println("Please enter your choice from Product Menu");
			int productChoice = sc.nextInt();
			sc.nextLine();
			return productChoice;
		} else {
			System.out.println("***********Product Menu***********");
			System.out.println(
					"1. Display All Product\n2. Search Product\n3. Check Product Demand\n4. Go to Dashboard\n5. Exit");
			System.out.println("*********************************");
			System.out.println("Please enter your choice from Product Menu");
			int productChoice = sc.nextInt();
			sc.nextLine();
			if (productChoice == 1) {
				productChoice = 1;
			} else if (productChoice == 2) {
				productChoice = 2;
			} else if (productChoice == 3) {
				productChoice = 3;
			} else if (productChoice == 4) {
				productChoice = 7;
			} else if (productChoice == 5) {
				productChoice = 8;
			} else {

				productChoice = -1;
			}
			return productChoice;
		}

	}

	public static ProductBean readProductDetails() {
		product = new ProductBean();

		String productName;
		do {
			System.out.println("Please enter Product Name");
			productName = sc.nextLine();
			productName = productName.trim();
		} while (!Validation.checkValidName(productName));
		product.setProductName(productName);

		int productQuantity;
		do {
			System.out.println("Please enter Product Quantity");
			productQuantity = sc.nextInt();
		} while (!Validation.checkValidQuantity(productQuantity));
		product.setProductQuantity(productQuantity);
		sc.nextLine();

		double productPrice;
		do {
			System.out.println("Please enter Product Price per unit");
			productPrice = sc.nextDouble();
		} while (!Validation.checkValidPrice(productPrice));
		product.setProductPrice(productPrice);
		sc.nextLine();

		System.out.println("Please enter Product Comments");
		product.setProductComments(sc.nextLine());
		product.setProductOwnerId(ContractIO.displayAllUsersGetIdInput("Owner"));
		return product;
	}

	public static void displayAllProducts() {
		productList = productServices.getAllProduct();
		if (productList.size() > 0) {
			System.out.println("\t\t<<<<<<Product Details>>>>>");
			System.out.println("PId\tOwnId\tQuantity\tPrice($)\tName\t\tComments");
			System.out.println("---------------------------------------------------------------------");
			for (ProductBean product : productList) {
				System.out.println(product);
			}
		} else {
			System.out.println("No Database for Products, please add new product");
		}
	}
}
