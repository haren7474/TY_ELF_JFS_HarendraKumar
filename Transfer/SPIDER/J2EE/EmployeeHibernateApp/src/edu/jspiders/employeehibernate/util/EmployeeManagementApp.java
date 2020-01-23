package edu.jspiders.employeehibernate.util;

import java.util.Scanner;

import edu.jspiders.employeehibernate.dao.EmployeeDAO;
import edu.jspiders.employeehibernate.dto.EmployeeDTO;

public class EmployeeManagementApp 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		EmployeeDAO dao = new EmployeeDAO();	
		System.out.println("----Welcome to Employee Management System----");
		while (true) 
		{
			int choice = displayMenu();
			switch (choice) 
			{
			case 1:
				dao.create(readEmpDetails());
				break;

			case 2:
				System.out.println("Please enter id to see employee data");
				dao.readById(sc.nextInt());
				break;

			case 3:
				System.out.println("Please enter employee id");
				int empId = sc.nextInt();
				
				while (true) 
				{
					updateMenu();
					int ch= sc.nextInt();
					switch (ch) 
					{
					case 1:
						System.out.println("Please enter employee name to be updated");
						Object empName = sc.next();
						dao.updateById(empName, ch, empId);
						break;

					case 2:
						System.out.println("Please enter employee salary to be updated");
						Object empSalary = sc.nextDouble();
						dao.updateById(empSalary, ch, empId);
						break;
						
					case 3:
						System.out.println("Please enter employee department to be updated");
						Object empDepartment = sc.next();
						dao.updateById(empDepartment, ch, empId);
						break;

					case 4: 
						return;
					
					case 5: System.out.println("Thanks for using the app");
						System.exit(0);
						
					default: System.out.println("Invalid choice");
						break;

					}
				}

			case 4:
				System.out.println("Please enter id to delete");
				int idDelete = sc.nextInt();
				dao.deleteById(idDelete);
				dao.readById(idDelete);
				break;

			case 5:
				System.out.println("List of Employees");
				System.out.println(dao.displayAllRecords());
				break;

			case 10:
				System.exit(0);
			}
		}
	}

	public static EmployeeDTO readEmpDetails() 
	{
		System.out.println("Please enter employee id");
		int empId = sc.nextInt();

		System.out.println("Please enter employee name");
		String empName = sc.next();

		System.out.println("Please enter employee salary");
		double empSalary = sc.nextDouble();

		System.out.println("Please enter employee department");
		String empDepartment = sc.next();

		return new EmployeeDTO(empId, empName, empSalary, empDepartment);
	}

	public static int displayMenu() 
	{
		System.out.println("------------------------\n1. Insert new Employee\n2. Read by Emp Id\n3. Update Fields with Emp ID\n"
				+ "4. Delete by Emp Id\n5. Display All Employees\n" + "10. Exit\n-------------------\nPlease enter you choice");

		return sc.nextInt();
	}

	public static void updateMenu() 
	{
		System.out
				.println("1. Update Name\n2. Update Salary\n3. Update Department\n4. Main Menu\n5. Exit\n\nPlease enter your choice");
	}
}
