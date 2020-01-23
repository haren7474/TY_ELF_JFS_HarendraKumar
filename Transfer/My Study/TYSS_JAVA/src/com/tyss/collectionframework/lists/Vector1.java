package com.tyss.collectionframework.lists;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) 
	{
			Vector v1= new Vector();
			v1.add(12);
			v1.add(51);
			v1.add("Hi");
			
			System.out.println(v1);
			System.out.println("----------Removing Hi-------------");
			v1.remove("Hi");
			System.out.println(v1);
			
			v1.add(51);
			v1.add(51);
			v1.add(78);
			v1.add(51);
			
			for (int i = 0; i < v1.size(); i++) 
			{
				System.out.print(v1.get(i) + " ");
			}
			
			for(Object o: v1)
			{
				System.out.print(o + " ");
			}
	}
}
