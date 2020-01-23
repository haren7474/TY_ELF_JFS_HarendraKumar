package com.tyss.typecasting.pack1;

public class Typecasting 
{
	byte b= 4;
	short s= b;
	int i= b;
	
	void getValues()
	{
		System.out.println("Byte Value is: "+ b);
		System.out.println("Short Value is: "+ s);
		System.out.println("Int Value is: "+ i);
	}
	
	double pi= 3.14;
	int n= (int) pi;
	
	void getDetails()
	{
		System.out.println("Double value is: "+ pi);
		System.out.println("Integer value is: "+ n);
	}
}
