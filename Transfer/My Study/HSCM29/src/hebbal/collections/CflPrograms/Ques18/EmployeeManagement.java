package hebbal.collections.CflPrograms.Ques18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class EmployeeManagement {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		Map<Integer, String> m = new HashMap<Integer, String>();

		for (int i = 1; i <= 3; i++)
		{
			System.out.println("Please enter empId and empName for Employess " + i);
			m.put(sc.nextInt(), sc.next());
		}
		while(true)
		{
		int ch = menu();
		switch (ch)
		{
		case 1:
			displayEmpDetails(m);
			break;

		case 2:
			checkGivenId(m);
			break;

		case 3:
			deleteGivenId(m);
			break;

		case 4:
			displayOnlyEmpName(m);
			break;

		case 5: 
			displayOnlyEmpId(m);
			break;

		case 6:
			System.exit(0);

		default:
			System.out.println("Invalid choice");
		}
	}
	}

	public static int menu() {
		System.out.println(
				"1. Display Emp Id and name\n2. Check Emp Id\n3. Delete Emp ID\n4. Display Emp Names\n5. Display Emp Ids\n6. Exit");
		System.out.println("Please enter you choice");
		return sc.nextInt();
	}

	public static void displayEmpDetails(Map<Integer, String> m) {
		// ------18a-------------
		Set<Entry<Integer, String>> s1 = m.entrySet();
		Iterator<Entry<Integer, String>> itr1 = s1.iterator();
		System.out.println("\nKey\t\tValues");
		while (itr1.hasNext()) {
			Entry<Integer, String> e = itr1.next();
			System.out.println(e.getKey() + "\t\t" + e.getValue());
		}
	}

	public static void checkGivenId(Map<Integer, String> m) {
		// --------18b-----------

		System.out.println("Enter empId to check if it is present");
		int empId = sc.nextInt();

		Set<Entry<Integer, String>> s2 = m.entrySet();
		Iterator<Entry<Integer, String>> itr2 = s2.iterator();
		int count = 1;
		System.out.println("\nQ18 B\n");
		while (itr2.hasNext()) {
			Entry<Integer, String> e = itr2.next();
			if (e.getKey() == empId) {
				System.out.println(e.getKey() + "\t\t" + e.getValue());
				count = 0;
			}

		}
		if (count > 0) {
			System.out.println("Emp Id is not present in Database");
		}
	}

	public static void deleteGivenId(Map<Integer, String> m) {
		// --------18C-----------
		System.out.println("Enter empId to delete if it is present");
		int empId = sc.nextInt();

		Set<Entry<Integer, String>> s3 = m.entrySet();
		Iterator<Entry<Integer, String>> itr3 = s3.iterator();
		int count = 1;
		System.out.println("\nQ18 C\n");
		while (itr3.hasNext()) 
		{
			Entry<Integer, String> e = itr3.next();
			if (e.getKey() == empId) {
				m.remove(e.getKey());
				System.out.println("Entry has been removed");
				count = 0;
			}

		}
		if (count == 0) {
			displayEmpDetails(m);
		} else if (count > 0) {
			System.out.println("Emp Id is not present in Database");
		}
	}

	public static void displayOnlyEmpName(Map<Integer, String> m) {
		// ------18d-------------
		Collection<String> names = m.values();
		System.out.println("\nList of emp names " + names);
	}
	
	public static void displayOnlyEmpId(Map<Integer, String> m) {
		// ------18d-------------
		Set<Integer> id= m.keySet();
		System.out.println("\n"+id);
	}
}
