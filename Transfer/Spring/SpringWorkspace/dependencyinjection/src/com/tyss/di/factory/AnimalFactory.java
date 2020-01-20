package com.tyss.di.factory;

import com.tyss.di.dao.Animal;
import com.tyss.di.dao.Dog;

public class AnimalFactory {
	
	private AnimalFactory() {}
	
	public static Animal getAnimal()
	{
		return new Dog();
	}
}
