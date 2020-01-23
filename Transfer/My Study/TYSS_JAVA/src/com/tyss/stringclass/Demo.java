package com.tyss.stringclass;

public class Demo {

	public static void main(String[] args) 
	{
		String s1= "  Harendra Kumar  ";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		String s2= s1.trim();
		System.out.println(s2);
		
		System.out.println(s2.substring(4));
		System.out.println(s2.substring(4,8));
		
		System.out.println(s2.isEmpty());
		
		String s6="ShreeShree";
		System.out.println(s6.charAt(2));
		
		System.out.println(s6.indexOf('r'));
		System.out.println(s6.indexOf("re"));
		
		System.out.println(s6.indexOf('r',4));
		System.out.println(s6.indexOf("re",4));
	}

}
