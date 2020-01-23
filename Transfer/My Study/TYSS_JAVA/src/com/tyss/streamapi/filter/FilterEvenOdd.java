package com.tyss.streamapi.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterEvenOdd {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		al.add(12);
		al.add(-23);
		al.add(-10);
		al.add(55);
		al.add(78);
		al.add(99);
		al.add(0);
		
		
		List<Integer> l1= al.stream().filter(i->i%2==0).collect(Collectors.toList());
		List<Integer> l2= al.stream().filter(i->i%2!=0).collect(Collectors.toList());

		System.out.println("Even: "+ l1);
		System.out.println("Odd: "+ l2);
		
		List<Integer> l3= al.stream().map(i->i*100).collect(Collectors.toList());
		System.out.println(l3);
		
		Optional<Integer> i1= al.stream().max((i,j)->i.compareTo(j));
		System.out.println(i1);
		
		long count= al.stream().count();
		System.out.println(count);
		
	}
}
