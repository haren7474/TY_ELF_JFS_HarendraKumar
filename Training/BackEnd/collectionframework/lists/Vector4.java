package com.tyss.collectionframework.lists;

import java.util.Vector;

public class Vector4 {

	public static void main(String[] args) 
	{
			Vector v1= new Vector();
			
			System.out.println(v1.size());
			System.out.println(v1.capacity());
			
			v1.add(23);
			v1.add(56);
			
			System.out.println(v1.size());
			System.out.println(v1.capacity());
			
			System.out.println("--------------Trim to size------------");
			v1.trimToSize();
			System.out.println(v1.size());
			System.out.println(v1.capacity());
			
			System.out.println("--------------Ensure Capacity------------");
			v1.ensureCapacity(6);
			
			System.out.println(v1.size());
			System.out.println(v1.capacity());
			
			System.out.println("------------------Set Size------------");
			v1.setSize(8);
			System.out.println(v1);
			System.out.println(v1.size());
			System.out.println(v1.capacity());
			System.out.println(v1);
			
			
	}
}
