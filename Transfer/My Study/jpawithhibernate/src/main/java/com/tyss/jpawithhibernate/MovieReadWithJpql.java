package com.tyss.jpawithhibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.jpawithhibernate.dto.Movie;

public class MovieReadWithJpql {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		String jpql = " from Movie";
		Query query = em.createQuery(jpql);
		List<Movie> list = query.getResultList();
		System.out.println("\nMovie Details:");
		for (Movie movie : list) {
			System.out
					.println(movie.getMid() + " " + movie.getMname() + " " + movie.getRating() + " " + movie.getYear());
		}

		String jpql2 = "select mname from Movie";
		Query query2 = em.createQuery(jpql2);
		List<String> list2 = query2.getResultList();
		System.out.println("\nMovie name list:");
		for (String m : list2) {
			System.out.println(m + " ");
		}
		
		String jpql3 = " from Movie where mid=102";
		Query query3 = em.createQuery(jpql3);
		List<Movie> list3 = query3.getResultList();
		System.out.println("\nMovie with id 102:");
		for (Movie movie : list3) {
			System.out
			.println(movie.getMid() + " " + movie.getMname() + " " + movie.getRating() + " " + movie.getYear());
		}

		em.close();
	}
}
