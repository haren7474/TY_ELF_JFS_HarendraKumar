package com.tyss.collectionframework.set;

import java.util.TreeSet;

public class PenTreeSet {

	public static void main(String[] args) 
	{
		
		PenName pn= new PenName();
		PenAge pa= new PenAge();
		PenSalary ps= new PenSalary();
		
		TreeSet<Pen> p= new TreeSet<Pen>(ps);
		
		p.add(new Pen("Ram", 26, 32000));
		p.add(new Pen("Amit", 28, 15000));
		p.add(new Pen("Sumit", 21, 45000));
		p.add(new Pen("Mohan", 26, 32000));
		p.add(new Pen("Zohan", 26, 32000));
		p.add(new Pen("Ram", 3, 32000));
		p.add(new Pen("Ram", 89, 32000));
		
		for (Pen pen : p) 
		{
			System.out.println(pen);
		}
	}	
}
