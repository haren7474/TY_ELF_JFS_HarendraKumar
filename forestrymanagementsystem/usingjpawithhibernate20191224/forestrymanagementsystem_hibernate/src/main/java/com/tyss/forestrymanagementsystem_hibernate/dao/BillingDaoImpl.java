package com.tyss.forestrymanagementsystem_hibernate.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.forestrymanagementsystem_hibernate.controller.DBConnection;
import com.tyss.forestrymanagementsystem_hibernate.dto.BillingBean;
import com.tyss.forestrymanagementsystem_hibernate.dto.ResultBillingDto;
import com.tyss.forestrymanagementsystem_hibernate.dto.UserBean;
import com.tyss.forestrymanagementsystem_hibernate.factory.ForestryManagementSystemFactory;
import com.tyss.forestrymanagementsystem_hibernate.services.UserServices;

public class BillingDaoImpl implements BillingDao {
	static UserServices userServices = ForestryManagementSystemFactory.instanceOfCustomerServices();
	static Connection connection = DBConnection.getConnection();
	BillingBean billBean = null;
	boolean ispaid = true;
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");

	@Override
	public List<Object[]> getAllBills() {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "SELECT b.billId, b.contractId,"
				+ "(select fullName from UserBean where userId= c.customerId) as CustomerName, "
				+ "p.productName, c.quantity, p.productPrice, c.quantity * p.productPrice as billedAmount,"
				+ "(select fullName from UserBean where userId =c.haulierId) as HaulierName, "
				+ "(select fullName from UserBean where userId=p.productOwnerId) as ProductOwnerName, "
				+ "b.paidAmount, ((c.quantity * p.productPrice)-b.paidAmount) as left_to_pay ,c.deliveryDate, b.billTimestamp "
				+ "FROM BillingBean b , ContractBean c, ProductBean p WHERE c.productId= p.productId AND b.contractId= c.contractId";

		Query query = entityManager.createQuery(jpql);
		List<ResultBillingDto> dtoList = new ArrayList<ResultBillingDto>();
		List<Object[]> listObject = query.getResultList();

		entityManager.close();
		return listObject;
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
}
