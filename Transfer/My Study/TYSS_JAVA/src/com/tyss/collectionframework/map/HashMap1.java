package com.tyss.collectionframework.map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> h1= new HashMap<Integer, String>();
		
		h1.put(6, "Mahesh");
		h1.put(1, "Mahesh");
		h1.put(20, "Ramesh");
		h1.put(4, "Suresh");
		h1.put(8, "Dinesh");
		
		Set<Entry<Integer, String>> s1 =h1.entrySet();
		
		System.out.println("Key\tValue");
		for (Entry<Integer, String> e1 : s1) 
		{
			System.out.println(e1.getKey() + "\t" + e1.getValue());
		}

		System.out.println("\n----------------------\n");
		
		System.out.println("*Keys*");
		Set<Integer> ks =h1.keySet();
		for (Integer i1 : ks) 
		{
			System.out.println(i1);
		}

		System.out.println("\n----------------------\n");
		
		System.out.println("\n*Values*");
		Collection<String> c1= h1.values();
		for (String str : c1) 
		{
			System.out.println(str);
		}
	}

}
