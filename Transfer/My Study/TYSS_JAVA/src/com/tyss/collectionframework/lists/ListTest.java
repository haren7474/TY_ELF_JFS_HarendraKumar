package com.tyss.collectionframework.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) 
	{
		List l1= new ArrayList();
		
		l1.add(0,12);
		l1.add(1,13);
		l1.add(2,22);
		l1.add(3,32);
		l1.add(4,42);
		l1.add(5,52);
		l1.add(6,62);
		l1.add(7,12);
		System.out.println(l1);
		
		System.out.println(l1.size());
		l1.add(0,12);
		System.out.println(l1.size());		
		
		System.out.println(l1);
		
		l1.remove(2);
		System.out.println(l1);
		
		System.out.println("index of 12: " + l1.indexOf(12));
		System.out.println("Last index of 12: " + l1.lastIndexOf(12));
		
		for (Object o : l1) 
		{
			System.out.print(o + " ");
		}
		
		List l2= new ArrayList();
		
		l2.add(0,12);
		l2.add(1,13);
		l2.add(2,22);
		l2.add(2,23);
		
		
		List l3= new ArrayList();
		
		l3.add(0,12);
		l3.add(1,13);
		l3.add(2,22);
		
		for(int i=0; i<l3.size();i++)
		{
			System.out.print("\n L3: " + l3.get(i));
		}
		
		
		List l4= l2.subList(0, 2);
		System.out.println("\n L4: " + l4);
		
		List l5= new ArrayList();
		
		l5.add(0,12);
		l5.add(1,13);
		l5.add(2,22);
		
		List l6= new ArrayList();
		
		l6.add(0,32);
		l6.add(1,43);
		l6.add(2,52);
		
		l5.addAll(1,l6);
		System.out.println(l5);
		
		l5.set(0, 1);
		System.out.println(l5);
		
	}
}
