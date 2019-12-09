package com.tyss.collectionframework.queue;

import java.util.Comparator;

public class StudentName implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) 
	{
		return s2.getName().compareTo(s1.getName());
	}
}
