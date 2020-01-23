package com.tyss.collectionframework.map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeLinkedHashmap {

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, Empployee> l1= new LinkedHashMap<Integer, Empployee>();
		
		l1.put(34, new Empployee(23000, "Ramesh"));
		l1.put(39, new Empployee(21000, "Mamesh"));
		l1.put(31, new Empployee(33000, "Aamesh"));
		
		Set<Entry<Integer, Empployee>> s1 = l1.entrySet();
		
		for (Entry<Integer, Empployee> e1 : s1) 
		{
			System.out.println(e1.getKey() + " " + e1.getValue());
		}
		
		System.out.println(l1.containsKey(34));
		System.out.println(l1.containsValue(new Empployee(33000, "Aamesh")));
	}

}
