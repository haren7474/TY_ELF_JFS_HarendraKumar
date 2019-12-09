package com.tyss.collectionframework.lists.practise;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) 
	{
			Vector<Integer> v1= new Vector();
			
			v1.add(76);
			v1.add(23);
			v1.add(56);
			v1.add(78);
			v1.add(100);
			v1.add(50);
			
			System.out.println(v1);
			
			v1.addElement(506);
			
			System.out.println(v1);
			
			v1.removeElement(56);
			System.out.println(v1);
			
			Integer o1 []= new Integer[v1.size()];
			
			v1.copyInto(o1);
			
			for (int i = 0; i < o1.length; i++) 
			{
			System.out.print(o1[i] + ",");	
			}
			
			System.out.println("\n---------------------------");
			
			System.out.println(v1.size());
			System.out.println(v1.capacity());
			
			v1.trimToSize();
			System.out.println(v1.size());
			System.out.println(v1.capacity());
			
			v1.add(12);
			System.out.println(v1.size());
			System.out.println(v1.capacity());
			
		
			
			v1.setSize(10);
			System.out.println(v1);
			System.out.println(v1.elementAt(0));
			
			
	}
}
