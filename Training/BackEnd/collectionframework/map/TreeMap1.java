package com.tyss.collectionframework.map;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) 
	{
		TreeMap<Integer, String> t1= new TreeMap<Integer, String>();
		
		t1.put(123, "Divya");
		t1.put(56, "Shree");
		t1.put(78, "Anu");
		
		Set<Entry<Integer, String>> s1 = t1.entrySet();
		
		for (Entry<Integer, String> e1 : s1) 
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("--------------------");
		}
		
		System.out.println(t1.get(78));
		
		System.out.println("Contains 123 :" + t1.containsKey(123));
		
		System.out.println("Contains value 123 :" + t1.containsValue(123));
		
		
	}

}
