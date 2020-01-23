package com.tyss.streamapi.predicate;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestA {

	public static void main(String[] args) 
	{
		System.out.println("---------Predicate----------");
		Predicate<Integer> p= i-> i%2==0;
		System.out.println("Is 12 even: " + p.test(new Integer(12)));
		System.out.println("Is 45 even: " + p.test(45));
		
		
		System.out.println("\n-----------Function----------");
		Function<Integer, Integer> f1= i-> i*100;
		
		Integer a= f1.apply(86);
		System.out.println("Multiplication result is: " + a);
		
		Function<Integer, String> f2= i-> i + "hello";
		System.out.println(f2.apply(13));
		
		System.out.println("\n-----------Supplier----------");
		Supplier<Person> s1= ()-> new Person(26, "Harendra");
		System.out.println(s1.get().getName() + "\t" + s1.get().getAge());
		
		System.out.println("\n-----------Consumer----------");
		Consumer<Person> c1= j-> {
			System.out.println("Age is: " + j.getAge());
			System.out.println("Name is :  " + j.getName());
		};
		
		Person p2= new Person(26, "Harendra");
		c1.accept(p2);
	}

}
