package edu.jspiders.hibernateapp.util;

import java.util.Scanner;

import edu.jspiders.hibernateapp.dao.StudentDAO;
import edu.jspiders.hibernateapp.dto.StudentDTO;

public class CreateUtil
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		StudentDAO dao = new StudentDAO();

		while (true) 
		{
			System.out.println("1. Insert\n2. Read by Id\n3. Update by Id\n"
					+ "4. Delete by Id\n5. Display All\n"
					+ "10. Exit\nPlease enter you choice");
			int choice = sc.nextInt();

			switch (choice) 
			{
			case 1:
				System.out.println("Please enter id, first name, middle name, last name and marks");
				StudentDTO student = new StudentDTO(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextDouble());
				dao.create(student);
				break;

			case 2:
				System.out.println("Please enter id to see data");
				dao.readById(sc.nextInt());
				break;

			case 3:
				System.out.println("Please enter id and marks to update");
				int idUpdate= sc.nextInt();
				dao.updateById(idUpdate, sc.nextDouble());
				dao.readById(idUpdate);
				break;

			case 4:
				System.out.println("Please enter id to delete");
				int idDelete= sc.nextInt();
				dao.deleteById(idDelete);
				dao.readById(idDelete);
				break;

			case 5:
				System.out.println("List of students");
				System.out.println(dao.displayAllRecords());
				break;

			case 10:
				System.exit(0);
			}
		}
	}
}
