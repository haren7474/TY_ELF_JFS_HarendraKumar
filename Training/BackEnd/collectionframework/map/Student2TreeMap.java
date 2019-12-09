package com.tyss.collectionframework.map;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Student2TreeMap {

	public static void main(String[] args) 
	{
		Student1Name sn= new Student1Name();
		ArrayList<Student2> al2= new ArrayList<Student2>();		
		al2.add(new Student2(4, "Rohit"));
		al2.add(new Student2(5, "Mohit"));
		al2.add(new Student2(3, "Johit"));
		al2.add(new Student2(4, "Sohit"));
		
		ArrayList<Student2> al10= new ArrayList<Student2>();		
		al10.add(new Student2(14, "Romit"));
		al10.add(new Student2(15, "Momit"));
		al10.add(new Student2(13, "Jomit"));
		al10.add(new Student2(14, "Somit"));
		
		TreeMap<String, ArrayList<Student2>> t1= new TreeMap<String, ArrayList<Student2>>();
		
		t1.put("2nd Standard", al2);
		t1.put("10th Standard", al10);
		
		
		Set<Entry<String, ArrayList<Student2>>> s1 = t1.entrySet();
		
		for (Entry<String, ArrayList<Student2>> e1 : s1) 
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-------------");
		}
		
		
		System.out.println("-----------Getting 10th Standared List--------------");
		System.out.println(t1.get("10th Standard"));
		
		System.out.println("-----------Getting 10th Standared List--------------");
		System.out.println(t1.get("10th Standard"));
	}

}
