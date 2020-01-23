package com.tyss.collectionframework.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Collection2 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		Collection<String> c1= new ArrayList<String>();
		
		for(int i=0; i<3; i++)
		{
		System.out.println("Please enter the string for position :"+ i);
		c1.add(sc.next());
		}
		
		System.out.println("Your List:\n" + c1 + "\n-------------\n");
		
	}
}
