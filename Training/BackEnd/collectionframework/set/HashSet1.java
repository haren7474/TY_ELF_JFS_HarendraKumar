package com.tyss.collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) 
	{
		HashSet hs= new HashSet();
		hs.add(null);
		hs.add(null);
		hs.add(null);
		hs.add(null);
		hs.add(23);
		hs.add(36);
		hs.add("Hello");
		
		System.out.println("------------For Each-------------");
		for(Object o: hs)
		{
			System.out.println(o);
			//System.out.println(o.hashCode());
		}
		
		System.out.println("------------Iterator-------------");
		Iterator itr= hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		HashSet<String> hs2= new HashSet<String>();
		hs2.add("Hello");
		hs2.add("JSP");
		hs2.add("QSP");
		hs2.add("TYSS");
		
		System.out.println("------------For Each-------------");
		for(String s: hs2)
		{
			System.out.println(s);
		}
	}

}
