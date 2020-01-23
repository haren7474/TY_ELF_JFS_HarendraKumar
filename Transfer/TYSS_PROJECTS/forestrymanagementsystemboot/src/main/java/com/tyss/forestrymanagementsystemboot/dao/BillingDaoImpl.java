package com.tyss.forestrymanagementsystemboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.tyss.forestrymanagementsystemboot.dto.BillingBean;

@Repository
public class BillingDaoImpl implements BillingDao {

	@PersistenceUnit
	EntityManagerFactory entityManagerFactory;

	BillingBean billBean = null;
	boolean ispaid = true;
	private List<BillingBean> billingList = null;

	@Override
	public List<BillingBean> getAllBills() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = " from BillingBean";
		Query query = entityManager.createQuery(jpql);
		billingList = query.getResultList();
		entityManager.close();
		return billingList;
	}

	@Override
	public boolean updateBill(int billId, double paidAmount) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		boolean isModified = false;
		try {
			transaction.begin();
			billBean = entityManager.find(BillingBean.class, billId);
			if (billBean != null) {
				billBean.setPaidAmount(paidAmount);
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
	public boolean generateBill(BillingBean bill) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		boolean isAdded = false;
		try {
			transaction.begin();
			entityManager.persist(bill);
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
	public boolean isContractIdPresent(int contractId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		boolean isPresent = false;
		String jpql = "from BillingBean where contractId=:cid";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("cid", contractId);
		BillingBean bean = null;
		try {
			bean = (BillingBean) query.getSingleResult();
			if (bean != null) {
				isPresent = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		return isPresent;
	}

	@Override
	public BillingBean getBillById(int billId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		billBean = entityManager.find(BillingBean.class, billId);
		return billBean;
	}

}
