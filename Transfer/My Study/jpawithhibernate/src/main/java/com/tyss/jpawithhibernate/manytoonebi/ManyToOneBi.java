package com.tyss.jpawithhibernate.manytoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class ManyToOneBi {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		EmployeePersonalBi1 epObj = em.find(EmployeePersonalBi1.class, 515);
		System.out.println(epObj.getAge() + " " + epObj.getEname()  + " " + epObj.getEmail());
		System.out.println(epObj.getEmployeeExperienceBi());
		tx.commit();
		em.close();
	}

}
