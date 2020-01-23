package hebbal.collections.CflPrograms.Ques19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class WeatherManagement {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
 {
		Map<String, Integer> m = new HashMap<String, Integer>();

		for (int i = 1; i <= 3; i++) 
		{
			System.out.println("Please enter City Name and Temprature for " + i);
			m.put(sc.next(), sc.nextInt());
		}
		while (true) {
			int ch = menu();
			switch (ch) {
			case 1:
				displayCityDetails(m);
				break;

			case 2:
				checkGivenCity(m);
				break;

			case 3:
				deleteGivenCity(m);
				break;

			case 4:
				updateTemp(m);
				break;

			case 5:
				displayOnlyCity(m);
				break;

			case 6:
				displayOnlyTemp(m);
				break;
				
			case 7:
				System.exit(0);

			default:
				System.out.println("Invalid choice");
			}
		}
	}

	public static int menu() {
		System.out.println(
				"1. Display City and Weather\n2. Check City and its weather\n3. Delete City\n4. Update Temp for given City\n5. Display City Names\n6. Display Temprature\n7. Exit");
		System.out.println("Please enter you choice");
		return sc.nextInt();
	}

	public static void displayCityDetails(Map<String, Integer> m) {
		// ------18a-------------
		Set<Entry<String, Integer>> s1 = m.entrySet();
		Iterator<Entry<String, Integer>> itr1 = s1.iterator();
		System.out.println("\nCity\t\tTemprature");
		while (itr1.hasNext()) {
			Entry<String, Integer> e = itr1.next();
			System.out.println(e.getKey() + "\t\t" + e.getValue());
		}
	}

	public static void checkGivenCity(Map<String, Integer> m) {
		// --------18b-----------

		System.out.println("Enter City to check the temprature");
		String city = sc.next();

		Set<Entry<String, Integer>> s2 = m.entrySet();
		Iterator<Entry<String, Integer>> itr2 = s2.iterator();
		int count = 1;
		System.out.println("\n");
		while (itr2.hasNext()) {
			Entry<String, Integer> e = itr2.next();
			if (e.getKey().equalsIgnoreCase(city)) {
				System.out.println(e.getKey() + "\t\t" + e.getValue());
				count = 0;
			}

		}
		if (count > 0) {
			System.out.println("City is not present in Database");
		}
	}

	public static void deleteGivenCity(Map<String, Integer> m) {

		System.out.println("Enter empId to delete if it is present");
		String city = sc.next();

		Set<Entry<String, Integer>> s3 = m.entrySet();
		Iterator<Entry<String, Integer>> itr3 = s3.iterator();
		int count = 1;
		System.out.println("\n");
		while (itr3.hasNext()) {
			Entry<String, Integer> e = itr3.next();
			if (e.getKey().equalsIgnoreCase(city)) 
			{
				itr3.remove();
				System.out.println("Entry has been removed");
				count = 0;
			}

		}
		if (count == 0) {
			displayCityDetails(m);
		} else if (count > 0) {
			System.out.println("Emp Id is not present in Database");
		}
	}

	public static void updateTemp(Map<String, Integer> m) {
		System.out.println("Enter City to update Temp");
		String city = sc.next();

		Set<Entry<String, Integer>> s4 = m.entrySet();
		Iterator<Entry<String, Integer>> itr4 = s4.iterator();
		int count = 1;
		System.out.println("\n");
		while (itr4.hasNext()) {
			Entry<String, Integer> e = itr4.next();
			if (e.getKey().equalsIgnoreCase(city)) {
				System.out.println("Please enter new Temprature");
				int temp = sc.nextInt();

				int oldTemp = m.put(e.getKey(), temp);
				System.out.println("Entry has been updated from " + oldTemp + " to " + temp);
				count = 0;
			}

		}
		if (count == 0) {
			displayCityDetails(m);
		} else if (count > 0) {
			System.out.println("Emp Id is not present in Database");
		}
	}
	
	public static void displayOnlyCity(Map<String, Integer> m) 
	{
		Set<String> city= m.keySet();
		System.out.println("\n"+city);
	}

	public static void displayOnlyTemp(Map<String, Integer> m) {
		Collection<Integer> temp = m.values();
		System.out.println("\nList of emp names " + temp);
	}

}
