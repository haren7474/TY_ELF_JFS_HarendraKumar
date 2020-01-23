package hebbal.javaGrooming.collection.studentsubject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

public class DataHashMap 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		HashMap<String, Subject> shm = new HashMap<>();
		long subCount = 0;		
		long semCount = 0;
		
		System.out.println("Enter Number of Students for data to be updated");
		int count= sc.nextInt();
		
		for (int i = 0; i < count; i++) 
		{
			if (subCount < 2) 
			{
				if (semCount < 3)
				{
					Subject s = ReadData.getData();
					shm.put(ReadData.conKey(s), s);
					subCount = checkSubjectCount(shm);
					semCount = checkSemCount(shm);
					System.out.println("subCount " + subCount );
					System.out.println("semCount " + semCount );
				} 
				else
				{
					System.out.println("Maximum Semester limit has exceeded");
					break;
				}
			} 
			else 
			{
				System.out.println("Maximum Subject limit has exceeded");
				break;
			}
		}
		
		/*
		do
		{
		Subject s = ReadData.getData();
		shm.put(ReadData.conKey(s), s);
		subCount = checkSubjectCount(shm);
		semCount = checkSemCount(shm);
		System.out.println("subCount " + subCount );
		System.out.println("semCount " + semCount );
		} while(subCount<=2 && semCount<=3); */

		displayData(shm);
		updateMarks(shm);
		System.out.println("Updated List");
		displayData(shm);
	}

	public static void displayData(Map<String, Subject> shm) {
		Set<Entry<String, Subject>> s1 = shm.entrySet();

		Iterator<Entry<String, Subject>> itr1 = s1.iterator();

		System.out.println("\nKey\t\t\tStudId\t\tStudName\tSem\t\tSubId\t\tSubName\t\tSubMarks\tGrade");
		while (itr1.hasNext()) {
			Entry<String, Subject> e = itr1.next();
			System.out.println(e.getKey() + "\t\t" + e.getValue());
		}
	}

	private static long checkSemCount(HashMap<String, Subject> shm)
	{
		Set<Entry<String, Subject>> s1 = shm.entrySet();
		Iterator<Entry<String, Subject>> itr1 = s1.iterator();

		List<Integer> al = new ArrayList<Integer>();

		while (itr1.hasNext()) {
			Entry<String, Subject> e1 = itr1.next();
			al.add(e1.getValue().getSem());
		}
		return al.stream().distinct().count();
	}

	public static long checkSubjectCount(Map<String, Subject> shm) 
	{
		Set<Entry<String, Subject>> s1 = shm.entrySet();
		Iterator<Entry<String, Subject>> itr1 = s1.iterator();

		List<Integer> al = new ArrayList<Integer>();

		while (itr1.hasNext()) {
			Entry<String, Subject> e1 = itr1.next();
			al.add(e1.getValue().getSubId());
		}

		return al.stream().distinct().count();
	}

	public static void updateMarks(Map<String, Subject> shm) {
		// displayData(shm);
		System.out.println("Please Enter Student Key to Update Marks ");
		String keyToUpdate = sc.next();
		System.out.println("Please Updated Marks");
		int marks = sc.nextInt();

		char newStatus = ReadData.getGrade(marks);
		Set<Entry<String, Subject>> s1 = shm.entrySet();
		Iterator<Entry<String, Subject>> itr1 = s1.iterator();

		while (itr1.hasNext()) 
		{
			Entry<String, Subject> e1 = itr1.next();
			if(e1.getKey().equalsIgnoreCase(keyToUpdate))
			{
				e1.getValue().setSubMarks(marks);
				e1.getValue().setStatus(newStatus);
			}
		}

	}

	/*
	 * Collection<Subject> values= shm.values(); List<Subject> l= new
	 * ArrayList<Subject>(values);
	 * 
	 * l.stream().distinct().count();
	 */

	
	/*
	 * shm.put("Haren_Hindi_1", new Subject(101, "Hindi", 75, 1, "Haren", 1));
	 * shm.put("Haren_Hindi_2", new Subject(101, "Hindi", 35, 1, "Haren", 2));
	 * shm.put("Haren_Hindi_3", new Subject(101, "Hindi", 45, 1, "Haren", 3));
	 * 
	 * shm.put("Haren_Math_1", new Subject(302, "Math", 76, 1, "Haren", 1));
	 * shm.put("Haren_Math_2", new Subject(302, "Math", 45, 1, "Haren", 2));
	 * shm.put("Haren_Math_3", new Subject(302, "Math", 89, 1, "Haren", 3));
	 * 
	 * shm.put("Sakshi_Hindi_1", new Subject(101, "Hindi", 75, 3, "Sakshi", 1));
	 * shm.put("Sakshi_Hindi_2", new Subject(101, "Hindi", 35, 3, "Sakshi", 2));
	 * shm.put("Sakshi_Hindi_3", new Subject(101, "Hindi", 45, 3, "Sakshi", 3));
	 * 
	 * shm.put("Sakshi_Math_1", new Subject(302, "Math", 76, 3, "Sakshi", 1));
	 * shm.put("Sakshi_Math_2", new Subject(302, "Math", 45, 3, "Sakshi", 2));
	 * shm.put("Sakshi_Math_3", new Subject(302, "Math", 89, 3, "Sakshi", 3));
	 */
}
