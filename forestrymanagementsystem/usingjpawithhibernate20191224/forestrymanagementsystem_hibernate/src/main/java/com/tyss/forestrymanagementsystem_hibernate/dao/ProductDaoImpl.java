package com.tyss.forestrymanagementsystem_hibernate.dao;

import java.sql.Connection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.forestrymanagementsystem_hibernate.controller.DBConnection;
import com.tyss.forestrymanagementsystem_hibernate.dto.ProductBean;

public class ProductDaoImpl implements ProductDao {
	private List<ProductBean> productList = null;
	static Connection connection = DBConnection.getConnection();
	ProductBean product = null;
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");

	@Override
	public List<ProductBean> getAllProduct() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String jpql = "from ProductBean";
		Query query = entityManager.createQuery(jpql);
		productList = query.getResultList();
		entityManager.close();
		return productList;
	}

	@Override
	public boolean deleteProduct(int productId) {
		boolean isDeleted = false;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		product = entityManager.find(ProductBean.class, productId);
		if (product != null) {
			entityManager.remove(product);
			isDeleted = true;
		}
		transaction.commit();
		entityManager.close();
		return isDeleted;
	}

	@Override
	public boolean addProduct(ProductBean product) {
		boolean isAdded = false;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(product);
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
	public ProductBean searchProduct(int productId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		product = entityManager.find(ProductBean.class, productId);
		if (product != null) {
			return product;
		}
		entityManager.close();
		return null;
	}

	@Override
	public boolean updateQuantity(int productId, int newQuantity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		boolean isModified = false;
		try {
			transaction.begin();
			product = entityManager.find(ProductBean.class, productId);
			if (product != null) {
				product.setProductQuantity(newQuantity);
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
}
