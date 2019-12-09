package com.tyss.collectionframework.map;

import java.util.Comparator;

public class Student1Name implements Comparator<Student1>
{

	@Override
	public int compare(Student1 s1, Student1 s2) 
	{
		return s2.name.compareToIgnoreCase(s1.name);
	}
	
}
