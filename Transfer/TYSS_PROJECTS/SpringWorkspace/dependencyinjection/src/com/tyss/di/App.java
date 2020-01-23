package com.tyss.di;

import com.tyss.di.dao.Animal;
import com.tyss.di.factory.AnimalFactory;

public class App {
	public static void main(String[] args) {
		Animal animal = AnimalFactory.getAnimal();
		animal.makeSound();
	}

}
