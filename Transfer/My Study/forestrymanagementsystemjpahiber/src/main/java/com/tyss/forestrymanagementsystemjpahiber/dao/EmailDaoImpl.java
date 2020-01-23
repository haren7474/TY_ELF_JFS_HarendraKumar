package com.tyss.forestrymanagementsystemjpahiber.dao;

import java.sql.Connection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.forestrymanagementsystemjpahiber.controller.DBConnection;
import com.tyss.forestrymanagementsystemjpahiber.dto.EmailBean;

public class EmailDaoImpl implements EmailDao {
	EmailBean emailBean = null;
	static Connection connection = DBConnection.getConnection();
	List<EmailBean> emailList = null;
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");

	@Override
	public List<EmailBean> getAllEmail() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = " from EmailBean";
		Query query = entityManager.createQuery(jpql);
		emailList = query.getResultList();
		entityManager.close();
		return emailList;
	}

	@Override
	public boolean sendEmail(EmailBean emailBean) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		boolean isAdded = false;
		try {
			transaction.begin();
			entityManager.persist(emailBean);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
		return isAdded;
	}

	@Override
	public EmailBean getEmailById(int landEmailID) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		emailBean = entityManager.find(EmailBean.class, landEmailID);
		return emailBean;
	}

}
