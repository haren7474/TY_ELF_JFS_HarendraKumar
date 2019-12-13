package com.tyss.phonesimulator.controller;

import java.util.List;
import java.util.Scanner;

import com.tyss.phonesimulator.dto.Contact;
import com.tyss.phonesimulator.factory.ContactFactory;
import com.tyss.phonesimulator.services.ContactServices;

public class App {
	static ContactServices ser = ContactFactory.instanceOfCustomerServices();
	static Scanner sc = new Scanner(System.in);
	static Contact contact = null;

	public static void main(String[] args) {
		System.out.println("\t\t*******************Welcome to Contact Manager*******************");
		while (true) {
			int dashboardChoice = ContactIO.dashbaord();

			switch (dashboardChoice) {
			case 1:
				List<Contact> contactList = ser.getAllContact();
				if (contactList.size() > 0) {
					System.out.println("\n--------------Here is the complete contact details:-------------");
					System.out.println("ID\tName\tNumber\t\tGroup");
					for (Contact contact : contactList) {
						System.out.println(contact);
					}
				} else {
					System.out.println("Do data present for contact, please add the data first");
				}
				break;

			case 2:
				while (true) {
					int todoChoice = ContactIO.contactMenu();
					switch (todoChoice) {

					case 1:
						if (checkPresence()) {
							System.out.println("calling......");

						} else
							System.out.println("Contact not found");
						break;

					case 2:
						if (checkPresence()) {
							System.out.println("Please enter a message to send");
							String msg = sc.next();
							System.out.println("Sending message......" + msg);

						} else
							System.out.println("Contact not found");

						break;

					case 3:
						main(args);

					case 4:
						System.exit(0);
						break;

					default:
						System.out.println("Inlavid Choice, please try again!!!!");
					}
				}

			case 3:
				while (true) {
					int crudChoice = ContactIO.crudMenu();
					switch (crudChoice) {
					case 1:
						if (ser.addContact(ContactIO.readContact()))
							System.out.println("New contact has been added");
						else
							System.err.println("Coult not add contact!!!");
						break;

					case 2:
						String name = ContactIO.deleteContact();
						if (ser.deleteContact(name))
							System.out.println(name + " has been deleted");
						else
							System.err.println("Coult not be found!!!");

						break;

					case 3:
						System.out.println("Please enter Name");
						String nameToUpdate = sc.nextLine();
						System.out.println("Please enter new group name");
						String groupName = sc.nextLine();
						if (ser.modifyContact(nameToUpdate, groupName))
							System.out.println(nameToUpdate + " has been modified");
						else
							System.err.println("Coult not be found!!!");

						break;

					case 4:
						main(args);

					case 5:
						System.exit(0);
						break;

					default:
						System.out.println("Inlavid Choice, please try again!!!!");
					}
				}

			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("Inlavid Choice, please try again!!!!");
			}
		}

	}

	public static boolean checkPresence() {
		List<Contact> contactList = ser.getAllContact();
		int flag = 0;

		System.out.println("\n----------List of Contacts---------");
		for (Contact contact : contactList) {
			System.out.println(contact.getContactName());
		}
		System.out.println("Please enter a name");
		String callerName = sc.next();

		for (Contact contact : contactList) {
			if (contact.getContactName().equalsIgnoreCase(callerName)) {
				flag++;
				break;
			}
		}

		if (flag > 0)
			return true;
		else
			return false;
	}

}
