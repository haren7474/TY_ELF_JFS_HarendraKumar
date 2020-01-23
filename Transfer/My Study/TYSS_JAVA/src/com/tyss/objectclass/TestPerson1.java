package com.tyss.objectclass;

public class TestPerson1 extends Person1
{
	public TestPerson1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Throwable 
	{
		System.out.println("Main Started");
		
		Person1 p1= new Person1("Harendra");
		System.out.println(p1.name);
		p1.finalize();
		
		p1=null;
		System.gc();
		System.out.println("Main Ended");
	}
}
