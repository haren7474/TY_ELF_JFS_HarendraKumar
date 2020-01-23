package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.Animal;
import com.tyss.springcore.beans.Pet;

public class XMLComponentScanTest
{
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
		Animal animal = context.getBean(Animal.class);
		animal.makeSound();
		
		Pet pet = context.getBean(Pet.class);
		pet.getAnimal().makeSound();
	}
}
