package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.beans.Animal;
import com.tyss.springcore.beans.Book;
import com.tyss.springcore.beans.Hello;
import com.tyss.springcore.beans.Pet;
import com.tyss.springcore.config.BeansConfig;

public class AnnotationConfigApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMessage());
		System.out.println(hello.getCount());

		System.out.println("*****Dependency Injection**********");
		Animal animal = context.getBean(Animal.class);
		animal.makeSound();
		Hello hello2 = context.getBean(Hello.class);
		System.out.println(hello);
		System.out.println(hello2);
		System.out.println(hello==hello2);
		
		System.out.println("***************Wiring*************");
		Pet pet= context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
		System.out.println("*******Book and Author Autowiring");
		Book book= context.getBean(Book.class);
		System.out.println(book.getBookName());
		System.out.println(book.getAuthor().getAuthorName());
	}

}
