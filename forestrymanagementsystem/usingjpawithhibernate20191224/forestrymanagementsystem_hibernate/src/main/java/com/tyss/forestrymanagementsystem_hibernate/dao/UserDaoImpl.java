package com.tyss.forestrymanagementsystem_hibernate.dao;

import java.sql.Connection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.forestrymanagementsystem_hibernate.controller.DBConnection;
import com.tyss.forestrymanagementsystem_hibernate.dto.UserBean;

public class UserDaoImpl implements UserDao {
	private List<UserBean> userList = null;
	UserBean user = null;
	static Connection connection = DBConnection.getConnection();

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");

	@Override
	public List<UserBean> getAllUser() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = " from UserBean";
		Query query = entityManager.createQuery(jpql);
		userList = query.getResultList();
		entityManager.close();
		return userList;
	}

	@Override
	public boolean modifyUser(int userId, String email) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		boolean isModified = false;
		try {
			transaction.begin();
			user = entityManager.find(UserBean.class, userId);
			if (user != null) {
				user.setEmail(email);
				transaction.commit();
				isModified = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
		return isModified;
	}

	@Override
	public boolean deleteUser(int userId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		boolean isDeleted = false;
		try {
			transaction.begin();
			user = entityManager.find(UserBean.class, userId);
			if (user != null) {
				entityManager.remove(user);
				transaction.commit();
				isDeleted = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
		return isDeleted;
	}

	@Override
	public boolean addUser(UserBean user) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		boolean isAdded = false;
		try {
			transaction.begin();
			entityManager.persist(user);
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
	public UserBean signIn(int userId, String password) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "from UserBean where userId=:uid and password=:pass";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("uid", userId);
		query.setParameter("pass", password);
		UserBean bean = null;
		try {
			bean = (UserBean) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		return bean;
	}

	// public String getUserType(int id) {
	// EntityManager entityManager = entityManagerFactory.createEntityManager();
	// String type = null;
	// ResultSet pass = null;
	// try {
	// pstmt = connection.prepareStatement("SELECT user_Type from user where
	// user_Id=?");
	// pstmt.setInt(1, id);
	// pass = pstmt.executeQuery();
	//
	// while (pass.next()) {
	// type = pass.getString(1);
	// }
	//
	// } catch (SQLException e) {
	// e.printStackTrace();
	// System.out.println("Could not load data, exception occured ");
	// }
	// return type;
	// }

	public String getUserName(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		UserBean user = entityManager.find(UserBean.class, id);
		entityManager.close();
		return user.getFullName();
	}

	public List<UserBean> getUserWithGivenType(String userType) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = " from UserBean where userType=:uType";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("uType", userType);
		userList = query.getResultList();
		entityManager.close();
		return userList;
	}
}
