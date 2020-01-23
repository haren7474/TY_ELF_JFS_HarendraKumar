package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Movie;

public class InsertDemo {
	public static void main(String[] args) 
	{
		Movie movie = new Movie();
		movie.setMid(103);
		movie.setMname("Red");
		movie.setRating("Bad");
		movie.setYear(2006);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try
		{
		transaction.begin();
		entityManager.persist(movie);
		transaction.commit();
		System.out.println("Record inserted");
		} catch(Exception e)
		{
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
	}
}
