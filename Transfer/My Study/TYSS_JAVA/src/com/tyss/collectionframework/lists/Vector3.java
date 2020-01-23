package com.tyss.collectionframework.lists;

import java.util.Vector;

public class Vector3 {

	public static void main(String[] args) 
	{
			Vector v1= new Vector();
			
			v1.add(23);
			v1.add(56);
			v1.add(78);
			v1.add(100);
			v1.add("Hello");
			
			System.out.println(v1);
			
			v1.addElement(102);
			
			System.out.println(v1);
			
			v1.removeElement(23);
			System.out.println(v1);
			
			Object o1 []= new Object[v1.size()];
			
			v1.copyInto(o1);
			
			for (int i = 0; i < o1.length; i++) 
			{
			System.out.print(o1[i] + " ");	
			}
			
	}
}
