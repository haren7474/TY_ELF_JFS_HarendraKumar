package com.tyss.jpawithhibernate.manytomanybi;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ManyToManyTestBi2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		EmployeePersonalBi2 epObj = em.find(EmployeePersonalBi2.class, 511);
		System.out.println(epObj.getAge() + " " + epObj.getEname()  + " " + epObj.getEmail());
		System.out.println(epObj.getTrainingInfo());
		tx.commit();
		em.close();
	}
}
