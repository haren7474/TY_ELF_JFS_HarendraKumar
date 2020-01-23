package com.tyss.forestrymanagementsystem_hibernate.dao;

import java.sql.Connection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.forestrymanagementsystem_hibernate.controller.DBConnection;
import com.tyss.forestrymanagementsystem_hibernate.dto.ContractBean;
import com.tyss.forestrymanagementsystem_hibernate.dto.ProductBean;
import com.tyss.forestrymanagementsystem_hibernate.factory.ForestryManagementSystemFactory;
import com.tyss.forestrymanagementsystem_hibernate.services.ProductServices;

public class ContractDaoImpl implements ContractDao {
	private List<ContractBean> contractList = null;
	static Connection connection = DBConnection.getConnection();
	ContractBean contract = null;
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	static ProductServices productServices = ForestryManagementSystemFactory.instanceOfProductServies();

	@Override
	public boolean deleteContract(int contractId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		boolean isDeleted = false;
		try {
			transaction.begin();
			contract = entityManager.find(ContractBean.class, contractId);
			if (contract != null) {
				entityManager.remove(contract);
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
	public boolean addContract(ContractBean contract) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		// TO update stock quantity i.e. ExistingStockQuantity - contractQuantity
		int contractProductQuantity = contract.getQuantity();
		int productId = contract.getProductId();
		ProductBean product = productServices.searchProduct(productId);
		int stockUpdatedQuantity = product.getProductQuantity() - contractProductQuantity;
		boolean isAdded = false;
		try {
			transaction.begin();
			entityManager.persist(contract);
			productServices.updateQuantity(productId, stockUpdatedQuantity);
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
	public List<ContractBean> getAllContract() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = " from ContractBean";
		Query query = entityManager.createQuery(jpql);
		contractList = query.getResultList();
		entityManager.close();
		return contractList;
	}

	@Override
	public boolean modifyContract(int contractId, int contractNewQuantity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		boolean isModified = false;

		try {
			transaction.begin();
			contract = entityManager.find(ContractBean.class, contractId);
			if (contract != null) {

				// TO update stock quantity i.e. ExistingStockQuantity - (contractNewQuantity - contractExistingQuantity)
				int productId = contract.getProductId();
				ProductBean product = productServices.searchProduct(productId);
				int stockUpdatedQuantity = product.getProductQuantity() - (contractNewQuantity - contract.getQuantity());
				productServices.updateQuantity(productId, stockUpdatedQuantity);

				contract.setQuantity(contractNewQuantity);
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
