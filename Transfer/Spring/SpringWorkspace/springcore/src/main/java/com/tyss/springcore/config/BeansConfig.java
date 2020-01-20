package com.tyss.springcore.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.tyss.springcore.beans.Author;
import com.tyss.springcore.beans.Book;
import com.tyss.springcore.beans.Cat;
import com.tyss.springcore.beans.Dog;
import com.tyss.springcore.beans.Hello;
import com.tyss.springcore.beans.Pet;

@Configuration
public class BeansConfig {
	@Bean("hello")
	@Scope("prototype")
	public Hello getHello()
	{
		Hello hello= new Hello();
		hello.setMessage("I love Siri");
		hello.setCount(1000);
		return hello;
	}
	
	@Bean(name="dog")
	public Dog getDog()
	{
		return new Dog();
	}
	
	@Primary
	@Bean(name="cat")
	public Cat getCat()
	{
		return new Cat();
	}
	
	@Bean(name="pet")
	public Pet getPet()
	{
		Pet pet = new Pet();
		pet.setName("Tuffy");
		//pet.setAnimal(getDog());
		
		return pet;
	}
	
	@Primary
	@Bean(name="author")
	public Author getAuthor()
	{
		return new Author();
	}
	
	@Bean("book")
	@Scope("prototype")
	public Book getBook()
	{
		Book book = new Book();
		book.setBookName("Half Girlfriend");
		//book.setAuthor(getAuthor());
		return book;
	}
}
