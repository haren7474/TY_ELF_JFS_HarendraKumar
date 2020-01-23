package com.tyss.jpawithhibernate.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.onetoone.EmployeePersonal;

public class ManyToManyTest {

	public static void main(String[] args) {
		ArrayList<EmployeePersonal> eList = new ArrayList<EmployeePersonal>();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		EmployeePersonal empPersonal1 = new EmployeePersonal();
		empPersonal1.setAge(26);
		empPersonal1.setEid(511);
		empPersonal1.setEmail("puja@gmail.com");
		empPersonal1.setEname("Puja");
		empPersonal1.setPass("12345");

		EmployeePersonal empPersonal2 = new EmployeePersonal();
		empPersonal2.setAge(26);
		empPersonal2.setEid(512);
		empPersonal2.setEmail("gita@gmail.com");
		empPersonal2.setEname("Gita");
		empPersonal2.setPass("12345");

		eList.add(empPersonal1);
		eList.add(empPersonal2);
		
		TrainingInfo trainingInfo= new TrainingInfo();
		trainingInfo.setTid(1001);
		trainingInfo.setTname("MeanStack");
		trainingInfo.setEmpList(eList);
		em.persist(trainingInfo);
		
		tx.commit();

	}

}
