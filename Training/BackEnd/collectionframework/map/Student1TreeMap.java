package com.tyss.collectionframework.map;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Student1TreeMap {

	public static void main(String[] args) 
	{
		Student1Age s1a= new Student1Age();
		Student1Name s1n= new Student1Name();
		TreeMap<Student1, String> t1= new TreeMap<Student1, String>(s1n);
		
		t1.put(new Student1(7, "Ramesh"), "1st Standard");
		t1.put(new Student1(3, "Suresh"), "LKG Standard");
		t1.put(new Student1(19, "Jitesh"), "12th Standard");
		t1.put(new Student1(19, "Mahesh"), "11th Standard");
		t1.put(new Student1(1, "Dinesh"), "0 Standard");
		
		Set<Entry<Student1, String>> s1 = t1.entrySet();
		
		for (Entry<Student1, String> e1 : s1) 
		{
			System.out.println(e1.getKey() + " " + e1.getValue());
		}
	}

}
