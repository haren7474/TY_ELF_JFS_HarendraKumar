package com.tyss.jpawithhibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOne {
	public static void main(String[] args) {

		EmployeePersonal empPersonal = new EmployeePersonal();
		empPersonal.setEid(501);
		empPersonal.setAge(26);
		empPersonal.setEmail("prakhar@gmail.com");
		empPersonal.setEname("Prakhar");
		empPersonal.setPass("12345");

		EmployeeProfessional ef = new EmployeeProfessional();
		ef.setCompany("DTDC");
		ef.setPan("CKFHD1634R");
		ef.setPid(104);
		ef.setSalary(400);
		ef.setEmployeePersonal(empPersonal);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		em.persist(ef);
		System.out.println("Record added");
		tx.commit();
		em.close();
	}
}
