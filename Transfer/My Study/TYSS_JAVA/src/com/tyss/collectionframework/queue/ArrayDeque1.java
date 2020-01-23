package com.tyss.collectionframework.queue;

import java.util.ArrayDeque;

public class ArrayDeque1 
{

	public static void main(String[] args) 
	{
		ArrayDeque<String> a= new ArrayDeque<String>();
		a.add("Hello");
		a.add("JSP");
		a.add("TYSS");
		
		for (String s : a) 
		{
			System.out.println(s);
		}
	}
}
