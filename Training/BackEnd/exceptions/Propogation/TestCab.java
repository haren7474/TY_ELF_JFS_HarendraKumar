package com.tyss.exceptions.Propogation;

public class TestCab {

	public static void main(String[] args) 
	{
		System.out.println("MMS");
		GoogleMap g1= new GoogleMap();
		Ola o= new Ola(g1);
		o.find(null);
		System.out.println("MME");
	}

}
