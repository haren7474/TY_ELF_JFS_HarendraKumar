package com.tyss.forestrymanagementsystemboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tyss.forestrymanagementsystemboot.dto.ContractBean;
import com.tyss.forestrymanagementsystemboot.dto.ProductBean;
import com.tyss.forestrymanagementsystemboot.dto.UserBean;
import com.tyss.forestrymanagementsystemboot.services.ProductServices;

@Repository
public class ContractDaoImpl implements ContractDao {
	@PersistenceUnit
	EntityManagerFactory entityManagerFactory;

	private List<ContractBean> contractList = null;
	ContractBean contract = null;

	@Autowired
	private ProductServices productServices;

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
		boolean isAdded = false;

		try {
			transaction.begin();
			// TO update stock quantity i.e. ExistingStockQuantity - contractQuantity
			ProductBean product = entityManager.find(ProductBean.class, contract.getProductBean().getProductId());
			entityManager.persist(contract);
			product.setProductQuantity(product.getProductQuantity() - contract.getQuantity());
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
	public boolean modifyContract(ContractBean contractBean) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		boolean isModified = false;
		try {
			transaction.begin();
			contract = entityManager.find(ContractBean.class, contractBean.getContractId());
			if (contract != null) {

				int newQuantity = contractBean.getQuantity();
				int oldQuantity = contract.getQuantity();
				int stockOldQuantity = contract.getProductBean().getProductQuantity();
				int stockUpdatedQuantity = stockOldQuantity - (newQuantity - oldQuantity);

				if ((newQuantity - oldQuantity) <= stockOldQuantity && contractBean.getQuantity() > 0) {

					ProductBean productBean = productServices.getProductById(contract.getProductBean().getProductId());
					productBean.setProductQuantity(stockUpdatedQuantity);
					productServices.modifyProduct(productBean);
					contract.setQuantity(newQuantity);
				} else {
					return false;
				}

				if ((!(contract.getHaulierId() == contractBean.getHaulierId())) && contractBean.getHaulierId() != 0) {
					contract.setHaulierId(contractBean.getHaulierId());
				} else {
					return false;
				}

				if ((!(contract.getCustomerId() == contractBean.getCustomerId()))
						&& contractBean.getCustomerId() != 0) {
					contract.setCustomerId(contractBean.getCustomerId());
				}

				if (contractBean.getDeliveryDate() != null
						&& (!(contract.getDeliveryDate().getTime() - contractBean.getDeliveryDate().getTime() == 0))) {
					contract.setDeliveryDate(contractBean.getDeliveryDate());
					contract.setDay(contractBean.getDay());
				}

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
	public ContractBean getContractById(int contractId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		contract = entityManager.find(ContractBean.class, contractId);
		return contract;
	}
}
