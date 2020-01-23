package com.tyss.jpawithhibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Movie;

public class deleteDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try
		{
		tx.begin();
		System.out.println("Please enter movie id to be deleted");
		int idDelete = sc.nextInt();
		Movie movie = em.find(Movie.class, idDelete);
		if (movie != null) {
			System.out.println(movie.getMname() + " has been removed");
			em.remove(movie);
		} else {
			System.out.println("Id not found");
		}
		tx.commit();
		} catch(Exception e)
		{
			e.printStackTrace();
			tx.rollback();
		}
		em.close();
	}
}
