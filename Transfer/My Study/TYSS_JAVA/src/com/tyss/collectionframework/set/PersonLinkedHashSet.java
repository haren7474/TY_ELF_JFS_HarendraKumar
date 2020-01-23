package com.tyss.collectionframework.set;

import java.util.LinkedHashSet;

public class PersonLinkedHashSet 
{

	public static void main(String[] args) {

		LinkedHashSet<Employee> p= new LinkedHashSet<Employee>();
		
		p.add(new Employee(1, "Haren"));
		p.add(new Employee(1, "Haren"));
		p.add(new Employee(2, "Sweta"));
		
		for (Employee e : p) {
			System.out.println(e);
		}
	}

}
