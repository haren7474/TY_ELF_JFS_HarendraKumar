package com.tyss.collectionframework.lists;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedList3 
{
	public static void main(String[] args) {
		LinkedList l1= new LinkedList<>();
		
		l1.add(12);
		l1.pop();
		l1.push(53);
		l1.push(89);
		System.out.println(l1);
		
		System.out.println(l1.element());
		System.out.println(l1);
		
		System.out.println(l1);
		Collection c= new LinkedList<>();
		c.clear();
	}
}
