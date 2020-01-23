package hebbal.collections.MiniProjects.LMS_With_Cursor;

import java.util.Scanner;

public class LibraryManagementSystem 
{
	static Scanner sc =new Scanner(System.in);
	static LinkedListLibrary lll= new LinkedListLibrary(sc);
	
	public static void main(String[] args) 
	{
		
		while(true)
		{
		displayMenu();
		
		System.out.println("Please enter choice");
		int choice= sc.nextInt();
		
		switch(choice)
		{

		case 1: 
			lll.addBook();
			break;
			
		case 2:
			lll.searchBook();
			break;
			
		case 3:
			lll.removeBook();
			break;
		
		case 4: lll.sortBook();
			break;
		
		case 5:
			lll.displayBook();
			break;
		
		case 6:
			lll.updateBook();
			break;
			
		case 7: System.exit(0);
			break;
		
			default: System.out.println("Invalid choice");
		}
		
		
		}
	
	}

	
	public static void displayMenu() {
		System.out.println("1. Add\n2. Search\n3. Remove\n4. Sort\n5. Display\n6. Update\n7. Exit");
	}
}