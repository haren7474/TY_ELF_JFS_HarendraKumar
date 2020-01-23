package com.tyss.stringclass;

public class Demo1 
{
	public static void main(String[] args) 
	{
		String s1="John";		
		System.out.println("s1 hashcode value: "+ s1.hashCode());
		
		String s2="Michael";
		s1="Pinky";
		String s3="John";
		String s4="John";
		
		System.out.println("s1:"+ s1.hashCode());
		System.out.println("s2:"+ s2.hashCode());
		System.out.println("s3:"+ s3.hashCode());	
		
		System.out.println("\ns1==s3: "+ s1.equals(s3));
		System.out.println("s1==s2: "+s1.equals(s2));
		System.out.println("s1==s2: "+s3.equals(s4));
		
		
		String s11= new String("John");
		System.out.println("s11 org hascode: "+ s11.hashCode());
		
		String s12= new String("Michael");
		String s13= new String("John");
		s11 = new String("Divya");
		
		System.out.println("s11.hashCode(): "+s11.hashCode());
		System.out.println("s12.hashCode(): "+s12.hashCode());
		System.out.println("s13.hashCode(): "+s13.hashCode());
	}
}
