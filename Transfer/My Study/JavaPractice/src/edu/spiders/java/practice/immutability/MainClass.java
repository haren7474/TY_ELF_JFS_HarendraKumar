package edu.spiders.java.practice.immutability;

public class MainClass 
{
	public static void main(String[] args) 
	{
		MyImmutableClass mic= new MyImmutableClass(10);
		System.out.println(mic.x);
		mic.modify(150);
		System.out.println(mic.x);
		

		MyImmutableClass mic1= mic.modify(10);
		MyImmutableClass mic2= mic.modify(100);
		
		System.out.print("mic==mic1, it does not have a change" +" ");
		System.out.println(mic==mic1);
		
		
		System.out.print("mi1==mic2, it has a change" +" ");
		System.out.println(mic1==mic2);
	}
	
	
}
