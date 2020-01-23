package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.Animal;
import com.tyss.springcore.beans.Hello;
import com.tyss.springcore.beans.Pet;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Hello hello = context.getBean(Hello.class);
		Hello hello2 = context.getBean(Hello.class);
		System.out.println(hello.getMessage());
		System.out.println(hello.getCount());

		// It will give true if we remove scope from bean in bean.xml
		System.out.println(hello == hello2);

		System.out.println(hello);
		System.out.println(hello2);
		
		System.out.println("\n\n******Dependency Injection*********");
		Animal animal= context.getBean(Animal.class);
		animal.makeSound();
		
		
		System.out.println("\n\n**********Wiring(Connecting Dog Object to Ref of Animal)**************");
		Pet pet= context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
	}
}
