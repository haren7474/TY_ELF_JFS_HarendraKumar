package com.tyss.collectionframework.queue;

public class Student implements Comparable<Student>
{
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString()
	{
		return this.getId() + "\t\t" + this.getName();
	}

	@Override
	public boolean equals(Object o) 
	{
		Student s= (Student) o;
		return this.getId()==s.getId() && this.getName() == s.getName();
	}

	@Override
	public int hashCode() {
		return this.getId();
	}

	@Override
	public int compareTo(Student arg0) 
	{
		return this.name.compareTo(arg0.name);
	}
	
}
