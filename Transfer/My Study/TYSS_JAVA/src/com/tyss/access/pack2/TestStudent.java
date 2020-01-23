package com.tyss.access.pack2;

import com.tyss.access.pack1.Student;

public class TestStudent extends Student
{
	protected TestStudent(String stdName) 
	{
		super(stdName);
	}

	void studentName()
	{
		System.out.println("Child Student name is: "+ stdName);
	}
	public static void main(String[] args) 
	{
		TestStudent ts= new TestStudent("Haren");
		ts.studentName();
		ts.studName();
	}
}
