package com.tyss.accessmodifires;

public class TestPrivatePerson {

	public static void main(String[] args) 
	{
		PrivatePerson pp= new PrivatePerson("Harendra");
		
		//System.out.println("Name is "+ pp.name); Variable is private		
		//System.out.println(pp.getName()); Method is private
	}

}
