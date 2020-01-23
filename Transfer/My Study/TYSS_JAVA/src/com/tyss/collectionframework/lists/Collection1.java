package com.tyss.collectionframework.lists;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 
{
	public static void main(String[] args) {
		Collection c1= new ArrayList();
		c1.add(12);
		c1.add(12);
		c1.add(12);
		System.out.println("Your List:\n" + c1 + "\n-------------\n");
		
		System.out.println("Your List size is :" + c1.size() + "\n-------------\n");
		
		c1.remove(12);
		System.out.println("Your List:\n" + c1 + "\n-------------\n");
		
		System.out.println("Is my list empty: " + c1.isEmpty());
		
		c1.add(13);
		System.out.println("\nDoes my list contains 14: " + c1.contains(14)); 
		
		c1.add("Sweta");
		System.out.println("\nYour List:\n" + c1 + "\n-------------\n");
		
		Collection c2= new ArrayList();
		c2.add(12);
		c2.add("Singh");
		
		c1.addAll(c2);
		System.out.println("\nYour List after adding collection:\n" + c1 + "\n-------------\n");
		
		c1.removeAll(c2);
		System.out.println("\nYour List after removing collection:\n" + c1 + "\n-------------\n");
		
		Collection c4= new ArrayList();
		c4.add(25);
		c4.add(23);
		c4.add(86);
		c4.add(98);
		
		Collection c5= new ArrayList();
		c5.add(25);
		c5.add(23);
		c5.add(12);
		c5.add(13);
		
		System.out.println("c4: "+ c4);
		System.out.println("c5: "+ c5);
		
		c4.retainAll(c5);
		System.out.println("c4: "+ c4);		
		
		System.out.println(c4.containsAll(c5));
		
		System.out.println("Size of c4: "+ c4.size());
		c4.clear();
		System.out.println("Size of c4: "+ c4.size());
		
		
		Collection c6= new ArrayList<>();
		c6.add(12);
		c6.add(36);
		
		//toArray()
		Object o1 []= c6.toArray();
		for (int i = 0; i < o1.length; i++) 
		{
			System.out.print(o1[i] + " ");
		}
		
	}
}
