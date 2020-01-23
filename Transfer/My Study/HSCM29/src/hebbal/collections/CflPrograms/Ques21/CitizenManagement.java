package hebbal.collections.CflPrograms.Ques21;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class CitizenManagement 
{
	static Scanner sc = new Scanner(System.in);
	static int sortingOn;
	static CitizenHashMap chmp = new CitizenHashMap();

	public static void main(String[] args) 
	{
		Map<String, Citizen> m = new HashMap<String, Citizen>();

		while (true) {
			int choice = menu();
			switch (choice) 
			{
			case 1:
				addCitizens(m);
				break;

			case 2:
				if (m.size() == 0)
					System.out.println("Empty Database");
				else
					removeGivenCitizen(m);
				break;

			case 3:
				if (m.size() == 0)
					System.out.println("Empty Database");
				else
					displayCitizenDetails(m);
				break;

			case 4:
				if (m.size() == 0)
					System.out.println("Empty Database");
				else
					displayCitizenInGivenAgeRange(m);
				break;

			case 5:
				if (m.size() == 0)
					System.out.println("Empty Database");
				else
					displayCitizensWithA(m);
				break;

			case 6:
				if (m.size() == 0)
					System.out.println("Empty Database");
				else
					sortCitizen(m);
				break;

			case 7:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice");
			}
		}
	}

	public static int menu() {
		System.out.println("1. Add Citizens\n2. Remove Citizens based on Voter Id\n"
				+ "3. Display All Citizens\n4. Display Citizen within age 25-35\n5. Display Citizen name starts with A\n6. Sort Citizen\n7. Exit");
		return sc.nextInt();
	}

	public static void addCitizens(Map<String, Citizen> m) 
	{
		for (int i = 1; i <= 2; i++)
		{
			m.put(chmp.readKey(), chmp.readValues());
		}
		System.out.println("Citizens are added, Use Display Options to check");

	}

	public static void displayCitizenDetails(Map<String, Citizen> m) 
	{
		Set<Entry<String, Citizen>> s1 = m.entrySet();

		Iterator<Entry<String, Citizen>> itr1 = s1.iterator();

		System.out.println("\nVoterId\t\tName\t\tAge");
		while (itr1.hasNext()) {
			Entry<String, Citizen> e = itr1.next();
			System.out.println(e.getKey() + "\t\t" + e.getValue().getName() + "\t\t" + e.getValue().getAge());
		}
	}

	public static void removeGivenCitizen(Map<String, Citizen> m) 
	{
		System.out.println("Enter VoterId to delete");
		String voterId = sc.next();

		Set<Entry<String, Citizen>> s3 = m.entrySet();
		Iterator<Entry<String, Citizen>> itr3 = s3.iterator();
		int count = 1;

		while (itr3.hasNext()) 
		{
			Entry<String, Citizen> e = itr3.next();
			if (e.getKey().equalsIgnoreCase(voterId)) {
				itr3.remove();
				System.out.println("Entry has been removed");
				count = 0;
			}

		}
		if (count == 0) {
			displayCitizenDetails(m);
		} else if (count > 0) {
			System.out.println("Voter Id is not present in Database");
		}
	}

	public static void displayCitizenInGivenAgeRange(Map<String, Citizen> m) {
		Set<Entry<String, Citizen>> s3 = m.entrySet();
		Iterator<Entry<String, Citizen>> itr3 = s3.iterator();
		int count = 1;

		while (itr3.hasNext()) {
			Entry<String, Citizen> e = itr3.next();

			if (e.getValue().getAge() > 25 && e.getValue().getAge() < 35) {
				if (count == 1)
					System.out.println("\nVoterId\t\tName\t\tAge");
				System.out.println(e.getKey() + "\t\t" + e.getValue().getName() + "\t\t" + e.getValue().getAge());
				count = 0;
			}
		}

		if (count > 0) {
			System.out.println("No Such Voter found for given age range");
		}
	}

	public static void displayCitizensWithA(Map<String, Citizen> m) {
		Set<Entry<String, Citizen>> s3 = m.entrySet();
		Iterator<Entry<String, Citizen>> itr3 = s3.iterator();
		int count = 1;

		while (itr3.hasNext()) {
			Entry<String, Citizen> e = itr3.next();
			if (e.getValue().getName().startsWith("A")) {
				if (count == 1)
					System.out.println("\nVoterId\t\tName\t\tAge");
				System.out.println(e.getKey() + "\t\t" + e.getValue().getName() + "\t\t" + e.getValue().getAge());
				count = 0;
			}
		}

		if (count > 0) {
			System.out.println("No Such Voter found for given Names");
		}
	}

	public static int sortWithColumn() {
		System.out.println("\n1. Sort with Voter Id\n2. Sort with Name\n3. Sort with Age");
		System.out.println("Please enter sorting choice:");
		return sc.nextInt();
	}

	public static int sortingOrder() {
		System.out.println("\n1. Acsending Order\n2. Descending order\n\nPlease enter your choice:");
		return sc.nextInt();
	}

	public static void sortCitizen(Map<String, Citizen> m) 
	{
		int choice = sortingOrder();
		sortingOn = sortWithColumn();
		List<Map.Entry<String, Citizen>> l=new LinkedList<Map.Entry<String, Citizen>>(m.entrySet());
		HashMap<String, Citizen> temp= new LinkedHashMap<String, Citizen>();
		
		if (choice == 1) 
		{
			Collections.sort(l, new Comparator<Map.Entry<String, Citizen>>() 
			{
				public int compare(Map.Entry<String, Citizen> c1, Map.Entry<String, Citizen> c2)
				{
					int ret=0;
					Integer i1= c1.getValue().getAge();
					Integer i2= c2.getValue().getAge();
					if(sortingOn==1) ret = c1.getKey().compareTo(c2.getKey());
					else if (sortingOn ==2) ret= c1.getValue().getName().compareTo(c2.getValue().getName());
					else if (sortingOn==3) ret= i1.compareTo(i2);
					return ret;
				}
			});
			
			for (Entry<String, Citizen> entry : l) 
			{
				temp.put(entry.getKey(),entry.getValue());	
			}
				displayCitizenDetails(temp);
		}

		else if (choice == 2) 
		{
			Collections.sort(l, new Comparator<Map.Entry<String, Citizen>>() 
			{
				public int compare(Map.Entry<String, Citizen> c1, Map.Entry<String, Citizen> c2)
				{
					int ret=0;
					Integer i1= c1.getValue().getAge();
					Integer i2= c2.getValue().getAge();
					if(sortingOn==1) ret = c2.getKey().compareTo(c1.getKey());
					else if (sortingOn ==2) ret= c2.getValue().getName().compareTo(c1.getValue().getName());
					else if (sortingOn==3) ret= i2.compareTo(i1);
					return ret;
				}
			});
			
			
			for (Entry<String, Citizen> entry : l) 
			{
				temp.put(entry.getKey(),entry.getValue());	
			}
				displayCitizenDetails(temp);
		}

		else {
			System.out.println("\nInvalid choice");
		}

	}

}
