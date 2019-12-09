package com.tyss.collectionframework.set;

import java.util.HashSet;

public class StudentHashcode {

	public static void main(String[] args) 
	{
		HashSet<Student> hs= new HashSet<Student>();
		hs.add(new Student(1, "Sweta"));
		hs.add(new Student(1, "Sweta"));
		hs.add(new Student(2, "Haren"));
		
		for (Student s : hs) 
		{
			System.out.println(s);
			System.out.println(hs.hashCode());
		}
		
	}

}
