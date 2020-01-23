package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Movie;

public class Reattaching {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			Movie m = em.find(Movie.class, 101);
			System.out.println("is current object existing " + em.contains(m));
			System.out.println("Object detached");
			em.detach(m);
			System.out.println("is current object existing " + em.contains(m));
			m.setRating("Fine");
			Movie m1= em.merge(m);
			System.out.println("is current object existing " + em.contains(m1));
			m1.setRating("Fineee");
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		em.close();

	}
}
