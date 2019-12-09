package com.tyss.collectionframework.lists;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList2 {

	public static void main(String[] args) 
	{
		ArrayList<String> al= new ArrayList<String>();
		
		al.add("Sweta");
		al.add("Geeta");
		al.add("Seeta");
		al.add("Babeeta");
		
		
		System.out.println("---------For-----------");
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("--------For Each------------");
		for(String i: al)
		{
			System.out.println(i);
		}
		
		al.remove(0);
		al.remove(new String("Geeta"));
		
		System.out.println("--------For Each------------");
		for(String i: al)
		{
			System.out.println(i);
		}
		
		al.add(2,"Sweta");
		al.add(2,"Sweta");
		al.add(1,"Geeta");
		
		System.out.println("--------For Each------------");
		for(String i: al)
		{
			System.out.println(i);
		}
		
		System.out.println("--------List Iterator Forward-----------");
		ListIterator<String> itr= al.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--------List Iterator Backward-----------");
		//ListIterator<String> itr1= al.listIterator(al.size());
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		al.set(0, "Harendra");
		System.out.println("--------List Iterator Forward-----------");
		ListIterator<String> itr2= al.listIterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}
}
