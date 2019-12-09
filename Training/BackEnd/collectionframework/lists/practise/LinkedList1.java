package com.tyss.collectionframework.lists.practise;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 
{
	public static void main(String[] args)
	{
		LinkedList<String> ll= new LinkedList<>();
		
		ll.add("Hello");
		ll.add("Welcome");
		ll.add("JSP");
		ll.add("QSP");
		ll.add("TYSS");
		ll.add("Thank You");
		System.out.println("--------Your List-----\n"+ ll);
		ll.add(2, "To");
		
		System.out.println("--------Your List-----\n"+ ll);
		
		System.out.println("\n-----Your List size-----: "+ ll.size());
		
		System.out.println("\n-----3rd Element in the list is-----: "+ ll.get(2));
		
		System.out.println("\n-----Is my List Empty-----: "+ ll.isEmpty());
		
		LinkedList<String> ll2= new LinkedList<>();
		
		ll2.add("Hello");
		ll2.add("Welcome");
		ll2.add("JSP");
		
		ll.addAll(4,ll2);
		System.out.println("--------Your List-----\n"+ ll);
		
		ll.remove("Hello");
		System.out.println("--------Your List remove(\"Hello\")-----\n"+ ll);
		ll.remove(3);
		System.out.println("--------Your List remove(3)-----\n"+ ll);
		ll.removeFirst();
		System.out.println("--------Your List removeFirst()-----\n"+ ll);
		ll.removeFirstOccurrence("Welcome");
		System.out.println("--------Your List removeFirstOccurrence-----\n"+ ll);
		
		ll.removeLast();
		System.out.println("--------Your List removeLast()-----\n"+ ll);
		ll.removeLastOccurrence("JSP");
		System.out.println("--------Your List removeLastOccurrence-----\n"+ ll);
		
		System.out.println(ll.containsAll(ll2));
		
		Object str[]= ll2.toArray();
		
		for (int i = 0; i < str.length; i++) 
		{
			System.out.print(str[i] + " ");
		}
		
		ll.set(2, "Greetins");
		System.out.println("--------Your List removeLast()-----\n"+ ll);
		
		System.out.println(ll.subList(0, 2));
		
		System.out.println("------------------");
		ListIterator<String> litr= ll.listIterator();
		while(litr.hasNext())
		{
			System.out.print(litr.next() + " ");
		}
		
		System.out.println("\n------------------");
		while(litr.hasPrevious())
		{
			System.out.print(litr.previous() + " ");
		}
		
		ll.addFirst("Deque");
		ll.addLast("Queue");
		
		System.out.println("\n-----------------");
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		System.out.println("--------Your List-----\n"+ ll);
		ll.push("Deque");
		System.out.println("--------Your List-----\n"+ ll);
		ll.pop();
		System.out.println("--------Your List-----\n"+ ll);
		ll.offer("JSP");
		System.out.println("--------Your List-----\n"+ ll);
		
		ll.offerFirst("JSP");
		System.out.println("--------Your List-----\n"+ ll);
		
		ll.offerLast("JSP");
		System.out.println("--------Your List-----\n"+ ll);
		
		System.out.println("-------------Peek------------------");
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		
		System.out.println("-------------Poll------------------");
		System.out.println("--------Your List-----\n"+ ll);
		System.out.println(ll.poll());		
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		System.out.println("--------Your List-----\n"+ ll);
		
	}
}
