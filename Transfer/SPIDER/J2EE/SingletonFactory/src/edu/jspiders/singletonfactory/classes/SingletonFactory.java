package edu.jspiders.singletonfactory.classes;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SingletonFactory 
{

	private static SessionFactory factory;

	static 
	{
		factory = new Configuration().configure().buildSessionFactory();
	}

	public static SessionFactory getFactory() 
	{
		return factory;
	}

	public static SessionFactory getSessionFactory()
	{		
		return getFactory();	
	}
}
