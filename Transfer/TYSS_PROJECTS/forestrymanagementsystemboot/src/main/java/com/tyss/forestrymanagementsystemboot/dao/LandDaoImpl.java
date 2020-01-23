package com.tyss.forestrymanagementsystemboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.tyss.forestrymanagementsystemboot.dto.LandBean;

@Repository
public class LandDaoImpl implements LandDao {
	@PersistenceUnit
	EntityManagerFactory entityManagerFactory;

	LandBean land = null;
	List<LandBean> landList = null;

	@Override
	public boolean addLandRecord(LandBean land) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		boolean isAdded = false;
		try {
			transaction.begin();
			entityManager.persist(land);
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
	public List<LandBean> getAllLandRecords() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = " from LandBean";
		Query query = entityManager.createQuery(jpql);
		landList = query.getResultList();
		entityManager.close();
		return landList;
	}

	@Override
	public boolean updateLandRecord(int landId, double newLandTax) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		boolean isModified = false;
		try {
			transaction.begin();
			land = entityManager.find(LandBean.class, landId);
			if (land != null) {
				land.setLandTax(newLandTax);
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
	public LandBean getLandById(int landId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		LandBean landBean = entityManager.find(LandBean.class, landId);
		return landBean;
	}
}
