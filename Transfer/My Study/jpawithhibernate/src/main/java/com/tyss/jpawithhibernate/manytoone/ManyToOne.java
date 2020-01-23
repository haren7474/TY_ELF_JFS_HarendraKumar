package com.tyss.jpawithhibernate.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.onetoone.EmployeePersonal;

public class ManyToOne {

	public static void main(String[] args) 
	{
		EmployeePersonal empPersonal1 = new EmployeePersonal();
		empPersonal1.setAge(24);
		empPersonal1.setEid(515);
		empPersonal1.setEmail("ramesh@gmail.com");
		empPersonal1.setEname("Ramesh");
		empPersonal1.setPass("12345");
		
		EmployeeExperience ee= new EmployeeExperience();
		ee.setCompany("Infy");
		ee.setExpId(6001);
		ee.setNumberOfYears(5);
		ee.setEmployeePersonal(empPersonal1);
		
		EmployeeExperience ee2= new EmployeeExperience();
		ee2.setCompany("TCS");
		ee2.setExpId(6002);
		ee2.setNumberOfYears(2);
		ee2.setEmployeePersonal(empPersonal1);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		em.persist(ee);
		em.persist(ee2);
		tx.commit();
	}

}
