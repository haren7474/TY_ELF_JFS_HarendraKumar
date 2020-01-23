package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Movie;

public class ReadDemo 
{
	public static void main(String[] args) 
	{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager em = emf.createEntityManager();
	Movie record = em.find(Movie.class, 101);
	System.out.println(record.getMid() + " " + record.getMname()+ " " + record.getRating() + " " + record.getYear());
	}
}
