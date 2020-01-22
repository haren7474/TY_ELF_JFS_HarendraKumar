package com.tyss.myfirstwebapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.myfirstwebapp.beans.UserBean;

public class UserDaoImpl implements UserDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");

	@Override
	public UserBean searchUser(int userId) {
		EntityManager em = emf.createEntityManager();
		UserBean ubean = em.find(UserBean.class, userId);
		em.close();
		return ubean;
	}

	@Override
	public UserBean authenticate(int userId, String password) {
		EntityManager em = emf.createEntityManager();

		String jpql = "from UserBean where userid=:uid and password=:pass";
		Query query = em.createQuery(jpql);
		query.setParameter("uid", userId);
		query.setParameter("pass", password);
		UserBean bean = null;
		try {
			bean = (UserBean) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return bean;
	}

	@Override
	public boolean addUser(UserBean user) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		boolean isAdded = false;
		try {
			tx.begin();
			em.persist(user);
			tx.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return isAdded;
	}

	@Override
	public boolean deleteUser(int userId) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		boolean b = false;
		tx.begin();
		UserBean ubean = em.find(UserBean.class, userId);
		if (ubean != null) {
			em.remove(ubean);
			tx.commit();
			b = true;
		}
		em.close();
		return b;
	}

	@Override
	public boolean updateUser(UserBean user) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		boolean b = false;
		tx.begin();
		UserBean ubean = em.find(UserBean.class, user.getUserid());
		if (ubean != null) {
			// ----------Updating object

			if (user.getEmail() != null && !user.getEmail().isEmpty()) {
				ubean.setEmail(user.getEmail());
			}
			if (user.getPassword() != null && !user.getPassword().isEmpty()) {
				ubean.setPassword(user.getPassword());
			}
			if (user.getUsername() != null && !user.getUsername().isEmpty()) {
				ubean.setUsername(user.getUsername());
			}

			tx.commit();
			b = true;
		}
		em.close();
		return b;
	}

	@Override
	public List<UserBean> getAllUsers() {
		EntityManager em = emf.createEntityManager();
		String jpql = "from UserBean";
		Query query = em.createQuery(jpql);
		List<UserBean> list = query.getResultList();
		em.close();
		return list;
	}
}