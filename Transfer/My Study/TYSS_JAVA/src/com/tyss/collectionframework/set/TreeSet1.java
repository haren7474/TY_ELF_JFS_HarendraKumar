package com.tyss.collectionframework.set;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) 
	{
		TreeSet t1= new TreeSet();
		
		t1.add(12);
		t1.add(12);
		t1.add(75);
		t1.add(05);
		
		
		for (Object o : t1) 
		{
			System.out.println(o);
		}
	}
}
