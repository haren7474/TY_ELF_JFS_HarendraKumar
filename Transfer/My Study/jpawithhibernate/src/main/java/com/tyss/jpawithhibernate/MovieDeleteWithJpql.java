package com.tyss.jpawithhibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MovieDeleteWithJpql {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		System.out.println("Please enter movie id to delete");
		int id = sc.nextInt();

		String jpql = "delete Movie where mid=:id ";
		Query query = em.createQuery(jpql);
		query.setParameter("id", id);

		int count = query.executeUpdate();
		if (count > 0) {
			System.out.println("Delete successfull " + count);
			tx.commit();
		} else {
			System.out.println("Given Id not present");
		}
	}
}
