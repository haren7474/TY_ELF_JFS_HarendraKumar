package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Movie;

public class ReadWithGetRef {

	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		Movie movie=em.getReference(Movie.class, 101);
		System.out.println(movie.getMname() + movie.getRating() + movie.getYear());
		em.close();
	}
}
