package com.tyss.collectionframework.lists;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args) 
	{
		LinkedList ll= new LinkedList<>();
		
		ll.add(2);
		ll.add(null);
		ll.add(45);
		ll.add("Hello");
		ll.add(2);
		
		System.out.println("Your List");
		ListIterator ltr= ll.listIterator();
		while(ltr.hasNext())
		{
			System.out.print(ltr.next() + " ");
		}
		
		ll.remove(null);
		System.out.println("\n" + ll);
		
		ll.remove(new Integer(2));
		System.out.println("\n" + ll);
		
		System.out.println("-------For Each Loop-------------");
		for(Object o: ll)
		{
			System.out.println(o);
		}
		
		System.out.println("-------For Loop-------------");
		for (int i = 0; i < ll.size(); i++) 
		{	
			System.out.println(ll.get(i));
		}
		
		LinkedList l1= new LinkedList<>();
		l1.addFirst(250);
		l1.add(23);
		l1.add(45);
		l1.add("Hello");
		l1.add(2);
		l1.addLast(2);
		l1.add(45);
		System.out.println(l1);
		
		System.out.println("Remove, First and Last");
		l1.remove(new Integer(2));
		System.out.println(l1);
		l1.removeFirst();
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
		l1.removeFirst();
		System.out.println(l1);
		
		System.out.println("Updated List");
		l1.add(23);
		l1.add(45);
		l1.add("Hello");
		l1.add(2);
		l1.addLast(2);
		l1.add(45);
		System.out.println(l1);
		
		System.out.println("-----------Remove First and Last Occurence-----------");
		l1.removeFirstOccurrence(new Integer(2));
		System.out.println(l1);
		l1.removeLastOccurrence(new Integer(45));
		System.out.println(l1);
		
		System.out.println("------------Add and AddLast-----------");
		l1.addLast(13.2);
		System.out.println(l1);
		l1.add(3, 13.1);
		System.out.println(l1);
		
		
		System.out.println("\n-------------New List L2---------------------");
		LinkedList l2= new LinkedList<>();
		l2.add(23);
		l2.add(45);
		l2.add("Hello");
		l2.add(2);
		l2.addLast(2);
		l2.add(45);
		System.out.println(l2);
		
		System.out.println("----------Offer, OfferFirst, OfferLast------------");
		l2.offer(25);
		System.out.println(l2);
		l2.offerLast(35);
		System.out.println(l2);
		l2.offerFirst(45);
		System.out.println(l2);
		
		System.out.println("----------poll, pollFirst, pollLast------------");
		l2.poll();
		System.out.println(l2);
		l2.pollFirst();
		System.out.println(l2);
		l2.pollLast();
		System.out.println(l2);
		
		System.out.println("----------Peek, PeekFirst, PeekLast------------");
		System.out.println(l2.peek());
		System.out.println(l2.peekFirst());
		System.out.println(l2.peekLast());
		System.out.println(l2);
	}
}
