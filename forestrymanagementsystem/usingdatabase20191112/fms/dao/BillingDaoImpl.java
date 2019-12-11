package com.tyss.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tyss.fms.controller.DBConnection;
import com.tyss.fms.dto.BillingBean;
import com.tyss.fms.factory.ForestryManagementSystemFactory;
import com.tyss.fms.services.UserServices;

public class BillingDaoImpl implements BillingDao {
	private static List<BillingBean> billingList = new ArrayList<BillingBean>();
	static UserServices userServices = ForestryManagementSystemFactory.instanceOfCustomerServices();
	static PreparedStatement pstmt = null;
	static Statement stmt = null;
	static Connection connection = DBConnection.getConnection();
	BillingBean bill = null;
	boolean ispaid;

	@Override
	public List<BillingBean> getAllBills() {
		try {
			billingList = new ArrayList<BillingBean>();
			stmt = connection.createStatement();
			ResultSet rs = stmt
					.executeQuery("SELECT b.bill_Id, b.contract_Id, p.product_Id, c.customer_Id, p.product_Name, "
							+ "c.quantity, p.product_Price, c.quantity * p.product_Price as billedAmount, c.haulier_Id, p.productOwnerId, "
							+ "b.paid_Amount, ((c.quantity * p.product_Price)-b.paid_Amount) as left_to_pay ,c.delivery_Date, b.bill_Timestamp "
							+ "FROM `billing` b , contract c, product p "
							+ "WHERE c.product_Id= p.product_Id AND b.contract_Id= c.contract_Id;");
			while (rs.next()) {
				bill = new BillingBean();
				ispaid = true;

				bill.setBillId(rs.getInt(1));
				bill.setContractId(rs.getInt(2));
				bill.setCustomerName(userServices.getUserName(rs.getInt(4)));
				bill.setProductName(rs.getString(5));
				bill.setQuantity(rs.getInt(6));
				bill.setPrice(rs.getDouble(7));
				bill.setHaulierName(userServices.getUserName(rs.getInt(9)));
				bill.setOwnerName(userServices.getUserName(rs.getInt(10)));
				bill.setBilledAmount(rs.getDouble(8));
				bill.setPaidAmount(rs.getDouble(11));
				double leftToPay = rs.getDouble(12);
				bill.setLeftToPay(leftToPay);
				if (leftToPay > 0)
					ispaid = false;
				bill.setFullyPaid(ispaid);
				bill.setDeliveryDate(rs.getString(13));
				bill.setBillTimestamp(rs.getString(14));

				billingList.add(bill);
			}
			return billingList;

		} catch (Exception e) {
			System.out.println("Could not load data, exception occured");
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean updateBill(int billId, double paidAmount) {
		try {
			pstmt = connection.prepareStatement("UPDATE billing SET paid_Amount =? WHERE bill_Id=?");
			pstmt.setDouble(1, paidAmount);
			pstmt.setInt(2, billId);
			int count = pstmt.executeUpdate();
			if (count > 0)
				return true;
			else
				return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean generateBill(BillingBean bill) {
		try {
			pstmt = connection.prepareStatement("insert into billing(contract_Id, paid_Amount) VALUES(?, ?)");
			pstmt.setInt(1, bill.getContractId());
			pstmt.setDouble(2, bill.getPaidAmount());
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean isContractIdPresent(int contractId)
	{
		try {
			pstmt = connection.prepareStatement("select bill_Id from billing WHERE contract_Id=?");
			pstmt.setInt(1, contractId);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
				return true;
			else
				return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
