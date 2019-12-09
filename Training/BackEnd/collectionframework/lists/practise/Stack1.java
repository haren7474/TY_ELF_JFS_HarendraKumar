package com.tyss.collectionframework.lists.practise;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) 
	{
		Stack<Double> s1 = new Stack();
		s1.add(2.5);
		s1.add(70.11);
		s1.add(2.58);
		s1.add(27.58);
		s1.add(5.58);
		System.out.println(s1.search(2.58));

		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		s1.push(70.11);
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1);
		
	}

}
