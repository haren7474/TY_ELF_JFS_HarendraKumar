package com.tyss.collectionframework.lists;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) 
	{
		Stack s1 = new Stack();
		s1.add(25);
		s1.add(76);
		s1.add(58);
		s1.add(58);
		s1.add(58);
		System.out.println(s1.search(76));

		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		s1.push(45);
		System.out.println(s1);
		System.out.println(s1.peek());
		
	}

}
