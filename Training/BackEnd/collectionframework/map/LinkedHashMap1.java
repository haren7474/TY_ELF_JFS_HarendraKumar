package com.tyss.collectionframework.map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap1 {

	public static void main(String[] args) 
	{
		LinkedHashMap<String, Integer> l1= new LinkedHashMap<String, Integer>();
		
		l1.put("BTM", 560072);
		l1.put("RajaNagar", 560091);
		l1.put("BTR", 560012);
		l1.put("Hebbal", 560045);
		l1.put("null", null);
		l1.put("Hennur", null);
		
		Set<Entry<String, Integer>> s1= l1.entrySet();
		
		for (Entry<String, Integer> e1 : s1) 
		{
			System.out.println(e1.getKey() + " " + e1.getValue());
		}
		
		System.out.println(l1.containsKey("BTM"));
	}

}
