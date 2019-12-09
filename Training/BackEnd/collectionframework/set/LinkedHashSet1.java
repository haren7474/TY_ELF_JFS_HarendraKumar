package com.tyss.collectionframework.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 
{
	public static void main(String[] args) {
		LinkedHashSet<Integer> l1= new LinkedHashSet<>();
		l1.add(12);
		l1.add(44);
		l1.add(32);
		l1.add(12);
		l1.add(89);
		l1.add(-10);
		
		for (Integer i : l1) 
		{
			System.out.println(i);
		}
		
		
		Iterator<Integer> itr= l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
