package com.tyss.jpawithhibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MovieUpdateWithJpql {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		System.out.println("Please enter movie id");
		int id = sc.nextInt();

		System.out.println("Please enter rating to update");
		String rating = sc.next();

		String jpql = "update Movie set rating= :rt where mid=:id ";

		Query query = em.createQuery(jpql);
		query.setParameter("id", id);
		query.setParameter("rt", rating);
		int count = query.executeUpdate();
		if (count > 0) {
			System.out.println("Update successfull " + count);
			tx.commit();
		} else {
			System.out.println("Given Id not present");
		}
	}

}
