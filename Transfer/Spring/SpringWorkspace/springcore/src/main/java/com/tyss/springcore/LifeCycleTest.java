package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.Hello;

public class LifeCycleTest {
	public static void main(String[] args) {
		//ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		Hello hello= context.getBean(Hello.class);
		
		System.out.println(hello.getMessage());
		System.out.println(hello.getCount());
		
		context.close();
	}
}
