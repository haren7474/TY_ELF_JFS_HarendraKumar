package edu.spiders.java.practice.immutability;

public class MainClassInt {

	public static void main(String[] args) 
	{
		
	ImmutableInteger im1= new ImmutableInteger(10);
	ImmutableInteger im2= im1.modifyObject(10);
	ImmutableInteger im3= im2.modifyObject(20);
	
	System.out.println(im1==im2);
	System.out.println(im1==im3);
	
	}
}
