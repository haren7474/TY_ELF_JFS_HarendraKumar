package com.tyss.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tyss.fms.controller.DBConnection;
import com.tyss.fms.dto.ContractBean;

public class ContractDaoImpl implements ContractDao {
	private List<ContractBean> contractList = new ArrayList<ContractBean>();
	static PreparedStatement pstmt = null;
	static Statement stmt = null;
	static Connection connection = DBConnection.getConnection();
	ContractBean contract = null;

	@Override
	public boolean deleteContract(int contractId) {
		try {
			pstmt = connection.prepareStatement("delete from contract WHERE contract_Id=?");
			pstmt.setInt(1, contractId);
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
	public boolean addContract(ContractBean contract) {
		try {
			pstmt = connection.prepareStatement(
					"insert into contract(customer_Id, product_Id, haulier_Id, quantity, delivery_Date, day) VALUES(?, ?, ?, ?, ?, ?)");
			pstmt.setInt(1, contract.getCustomerId());
			pstmt.setInt(2, contract.getProductId());
			pstmt.setInt(3, contract.getHaulierId());
			pstmt.setInt(4, contract.getQuantity());
			pstmt.setString(5, contract.getDeliveryDate());
			pstmt.setString(6, contract.getDay());
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<ContractBean> getAllContract() {
		try {
			contractList = new ArrayList<ContractBean>();
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(
					"select contract_Id, customer_Id, product_Id, haulier_Id, quantity, delivery_Date, day from contract");
			while (rs.next()) {
				contract = new ContractBean();
				contract.setContractId(rs.getInt(1));
				contract.setCustomerId(rs.getInt(2));
				contract.setProductId(rs.getInt(3));
				contract.setHaulierId(rs.getInt(4));
				contract.setQuantity(rs.getInt(5));
				contract.setDeliveryDate(rs.getString(6));
				contract.setDay(rs.getString(7));
				contractList.add(contract);
			}
			return contractList;

		} catch (Exception e) {
			System.out.println("Could not load data, exception occured");
			e.printStackTrace();
			return null;
		}
	}
}
