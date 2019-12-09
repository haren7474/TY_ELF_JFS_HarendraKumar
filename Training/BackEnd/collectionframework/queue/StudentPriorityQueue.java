package com.tyss.collectionframework.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class StudentPriorityQueue {

	public static void main(String[] args) 
	{
		StudentName sn= new StudentName();
		PriorityQueue<Student> p1= new PriorityQueue<Student>();
		
		p1.add(new Student(11, "Jatin"));
		p1.add(new Student(4, "Sweta"));
		p1.add(new Student(1, "Haren"));
		p1.add(new Student(6, "Amit"));
		p1.add(new Student(2, "Sashi"));
		p1.add(new Student(8, "Param"));
		p1.add(new Student(3, "Bablu"));
		
		System.out.println("-------Priority Queue------------");
		for (Student s : p1) 
		{
			System.out.println(s);
		}
		
		ArrayList<Student> a1= new ArrayList<Student>(p1);
		Collections.sort(a1,sn);
		
		System.out.println("------Moved to ArrayList and Sorted(Name) with Comparator-----");
		for (Student std : a1) 
		{
			System.out.println(std);
		}
		
		/*
		System.out.println("---------Moved back to Priority Queue----------");
		PriorityQueue<Student> p2= new PriorityQueue<Student>(a1);
		for (Student s1 : p2) 
		{
			System.out.println(s1);
		}
		*/
	}
}
