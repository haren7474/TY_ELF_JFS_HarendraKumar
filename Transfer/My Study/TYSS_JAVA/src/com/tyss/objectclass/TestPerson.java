package com.tyss.objectclass;

public class TestPerson 
{

	public static void main(String[] args) 
	{
		Person p1= new Person(1, "Harendra");
		Person p2= new Person(2, "Prakhar");
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1);
		System.out.println(p2);
		
		Object o1= new Object();
		System.out.println(o1.hashCode());
		System.out.println(o1.toString());
		
		String s1= "Shree";
		String s2= new String("Shree");
		String s3= "Shree";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
	}
}