package com.tyss.collectionframework.map;

public class Student2 implements Comparable<Student2>
{
	int age;
	String name;
	
	
	public Student2(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student1 [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student2 s) 
	{
		return this.age- s.age;
	}
}
