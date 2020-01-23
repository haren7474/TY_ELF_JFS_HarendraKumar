package com.tyss.collectionframework.lists.practise;

import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student>
{
	private int id;
	private String name;
	private double marks;
	
	public Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Student() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return getId() + "\t\t" + getName() + "\t\t" + getMarks();
	}

	@Override
	public int compareTo(Student s) 
	{
		
		return this.getId()- s.getId();
	}

	@Override
	public int compare(Student s1, Student s2) 
	{
		return s2.getName().compareTo(s1.getName());
	}
}
