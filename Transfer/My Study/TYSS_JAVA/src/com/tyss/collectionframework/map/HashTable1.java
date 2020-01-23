package com.tyss.collectionframework.map;

import java.util.Hashtable;
import java.util.Set;
import java.util.Map.Entry;

public class HashTable1 {

	public static void main(String[] args) 
	{
		Hashtable<Integer, Student2> h1= new Hashtable<Integer, Student2>();
		
		h1.put(1, new Student2(21, "Jatin"));
		h1.put(6, new Student2(27, "Mohit"));
		h1.put(2, new Student2(15, "Sumit"));
		h1.put(3, new Student2(45, "Nitin"));
		h1.put(8, new Student2(32, "Satin"));
		
		Set<Entry<Integer, Student2>> s1 = h1.entrySet();
		
		for (Entry<Integer, Student2> e1 : s1) 
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-------------");
		}
	}

}
