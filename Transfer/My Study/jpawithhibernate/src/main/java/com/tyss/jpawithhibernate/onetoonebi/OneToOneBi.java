package com.tyss.jpawithhibernate.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOneBi {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		EmployeePersonalBi epObj = em.find(EmployeePersonalBi.class, 501);
		System.out.println(epObj.getAge() + " " + epObj.getEname()  + " " + epObj.getEmail());
		System.out.println(epObj.getEmpPro());
		tx.commit();
		em.close();
	}
}
