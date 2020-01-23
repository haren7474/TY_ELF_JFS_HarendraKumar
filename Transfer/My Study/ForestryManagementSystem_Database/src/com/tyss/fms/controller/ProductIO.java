package com.tyss.fms.controller;

import java.util.List;
import java.util.Scanner;

import com.tyss.fms.dto.ProductBean;
import com.tyss.fms.factory.ForestryManagementSystemFactory;
import com.tyss.fms.services.ProductServices;
import com.tyss.fms.services.UserServices;

public class ProductIO {
	static Scanner sc = new Scanner(System.in);
	static ProductBean product = null;
	static List<ProductBean> productList = null;
	static ProductServices productServices = ForestryManagementSystemFactory.instanceOfProductServies();
	static UserServices userServices = ForestryManagementSystemFactory.instanceOfCustomerServices();

	public static void productHandler(int activeUserId) {
		while (true) {
			String userType = userServices.getUserType(activeUserId);
			int productId;
			switch (productMenu()) {
			case 1:
				if (userType.equalsIgnoreCase("Admin")) {
					if (productServices.addProduct(readProductDetails())) {
						System.out.println("New Product has been added");
					} else {
						System.err.println("Incorrect Input, please try again.");
					}
				} else {
					System.out.println("Modification rights are reserved for admin only.");
				}

				break;

			case 2:
				if (userType.equalsIgnoreCase("Admin")) {
					System.out.println("Please enter Product Id to be deleted");
					productId = sc.nextInt();
					if (productServices.deleteProduct(productId)) {
						System.out.println("Product with ID: " + productId + " has been deleted");
					} else {
						System.out.println("Product with ID: " + productId + " is not present in database");
					}
				} else {
					System.out.println("Modification rights are reserved for admin only.");
				}
				break;

			case 3:
				displayAllProducts();
				break;

			case 4:
				System.out.println("Please enter Product Id to be searched");
				productId = sc.nextInt();
				if (productServices.searchProduct(productId)) {
					System.out.println("Product Id: " + productId + " is present in database.");
				} else {
					System.out.println("Product Id: " + productId + " is not present in database.");
				}
				break;

			case 5:
				if (userType.equalsIgnoreCase("Admin")) {
					displayAllProducts();
					System.out.println("Please enter Product Id from above list to update quantity");
					productId = sc.nextInt();
					if (productServices.searchProduct(productId)) {
						System.out.println("Please enter new Quantity");
						int newQuantity = sc.nextInt();
						productServices.updateQuantity(productId, newQuantity);
						System.out.println("Product quantity has been updated.");
					} else {
						System.out.println("Product Id: " + productId + " is not present in database.");
					}
				} else {
					System.out.println("Modification rights are reserved for admin only.");
				}
				break;

			case 6:
				return;

			case 7:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Choice");
			}
		}

	}

	public static int productMenu() {
		System.out.println("***********Product Menu***********");
		System.out.println(
				"1. Add Product\n2. Delete Product\n3. Display All Product\n4. Search Product\n5. Update Product Quantity\n6. Go to Dashboard\n7. Exit");
		System.out.println("*********************************");
		System.out.println("Please enter your choice from Product Menu");
		int productChoice = sc.nextInt();
		sc.nextLine();
		return productChoice;
	}

	public static ProductBean readProductDetails() {
		product = new ProductBean();
		System.out.println("Please enter Product Name");
		product.setProductName(sc.nextLine());
		System.out.println("Please enter Product Quantity");
		product.setProductQuantity(sc.nextInt());
		sc.nextLine();
		System.out.println("Please enter Product Price");
		product.setProductPrice(sc.nextDouble());
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
