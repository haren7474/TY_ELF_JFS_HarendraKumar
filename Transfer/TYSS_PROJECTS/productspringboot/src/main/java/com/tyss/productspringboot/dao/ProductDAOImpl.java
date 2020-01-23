package com.tyss.productspringboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.productspringboot.dto.ProductBean;
import com.tyss.productspringboot.exception.ProductException;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@PersistenceUnit
	private EntityManagerFactory emf;

	@Override
	public boolean addProduct(ProductBean bean) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			em.persist(bean);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			System.out.println("Product could not be added, duplicate URL");
			return false;
		}
	}

	@Override
	public boolean deleteProduct(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		ProductBean bean = em.find(ProductBean.class, id);
		if (bean != null) {
			em.remove(bean);
			tx.commit();
			return true;
		} else {
			throw new ProductException("Product id not found, could not delete");
		}
	}

	@Override
	public boolean updateProduct(ProductBean productBean) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		ProductBean bean = em.find(ProductBean.class, productBean.getId());
		if (bean != null) {
			if (bean.getCost() != productBean.getCost() && productBean.getCost() != 0) {
				bean.setCost(productBean.getCost());
			}
			if ((!(bean.getImageUrl().equalsIgnoreCase(productBean.getImageUrl())))
					&& productBean.getImageUrl() != null) {
				bean.setImageUrl(productBean.getImageUrl());
			}
			if ((!(bean.getName().equalsIgnoreCase(productBean.getName())))
					&& productBean.getName() != null) {
				bean.setName(productBean.getName());
			}
			tx.commit();
			return true;
		} else {
			throw new ProductException("Product id not found, could not update");
		}
	}

	@Override
	public ProductBean getProduct(int id) {
		EntityManager em = emf.createEntityManager();

		ProductBean bean = em.find(ProductBean.class, id);
		if (bean != null) {
			return bean;
		} else {
			return null;
		}
	}

	@Override
	public List<ProductBean> getAllProducts() {
		String jpql = " from ProductBean";
		EntityManager em = emf.createEntityManager();
		TypedQuery<ProductBean> query = em.createQuery(jpql, ProductBean.class);
		return query.getResultList();
	}

}
