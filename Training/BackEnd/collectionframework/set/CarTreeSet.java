package com.tyss.collectionframework.set;

import java.util.Iterator;
import java.util.TreeSet;

public class CarTreeSet {

	public static void main(String[] args) 
	{
		TreeSet<Car> t1= new TreeSet<Car>();
		
		t1.add(new Car("Audi", 5000000));
		t1.add(new Car("Audi", 5000000));
		t1.add(new Car("RR", 9900000));
		t1.add(new Car("Dzire", 100000));
		
		
		Iterator<Car> itr= t1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
