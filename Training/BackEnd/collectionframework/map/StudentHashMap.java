package com.tyss.collectionframework.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class StudentHashMap 
{

	public static void main(String[] args) {
		HashMap<Integer, Student> h1= new HashMap<Integer, Student>();
		
		h1.put(23, new Student(1, "Divya"));
		h1.put(24, new Student(2, "Ramesh"));
		h1.put(25, new Student(3, "Suresh"));
		h1.put(null, null);
		h1.put(null, null);
		
		System.out.println("*Keys*");
		Set<Integer> ks =h1.keySet();
		for (Integer i1 : ks) 
		{
			System.out.println(i1);
		}
		
		System.out.println("--------------");
		Collection<Student> s1= h1.values();
		
		for (Student std : s1) 
		{
			System.out.println(std);
		}
		
		System.out.println(h1.containsKey(24));
		System.out.println(h1.containsValue(new Student(2, "Ramesh")));
		
		System.out.println("Empty: "+h1.isEmpty());
		System.out.println("Size: "+h1.size());
		
		h1.remove(23);
		Set<Entry<Integer, Student>> s3 =h1.entrySet();
		System.out.println("Key\tValue");
		for (Entry<Integer, Student> e1 : s3) 
		{
			System.out.println(e1.getKey() + "\t" + e1.getValue());
		}
		
		h1.put(23, new Student(1, "Divya"));
		Set<Entry<Integer, Student>> s2 =h1.entrySet();
		System.out.println("Key\tValue");
		for (Entry<Integer, Student> e1 : s2) 
		{
			System.out.println(e1.getKey() + "\t" + e1.getValue());
		}
		
		h1.remove(23, new Student(1, "Divya"));
		Set<Entry<Integer, Student>> s4 =h1.entrySet();
		System.out.println("Key\tValue");
		for (Entry<Integer, Student> e1 : s4) 
		{
			System.out.println(e1.getKey() + "\t" + e1.getValue());
		}
		
		
		
	}

}
