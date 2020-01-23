package com.tyss.collectionframework.map;

public class Student1 implements Comparable<Student1>
{
	int age;
	String name;
	
	
	public Student1(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student1 [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student1 s) 
	{
		return this.age- s.age;
	}
}
