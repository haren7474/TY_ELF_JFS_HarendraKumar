package com.tyss.collectionframework.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(2);
		al.add(58);
		
		al.remove(0);
		
		System.out.println("---------For-----------");
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("--------For Each------------");
		for(Integer i: al)
		{
			System.out.println(i);
		}
		
		System.out.println("---------Iterator-----------");
		Iterator<Integer> itr= al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("---------List Iterator-----------");
		ListIterator<Integer> itr1= al.listIterator(al.size());
		while(itr1.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
		
		
		
	}

}
