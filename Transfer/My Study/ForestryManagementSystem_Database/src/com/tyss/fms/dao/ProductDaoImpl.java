package com.tyss.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tyss.fms.controller.DBConnection;
import com.tyss.fms.dto.ProductBean;

public class ProductDaoImpl implements ProductDao {
	private List<ProductBean> productList = new ArrayList<ProductBean>();
	static PreparedStatement pstmt = null;
	static Statement stmt = null;
	static Connection connection = DBConnection.getConnection();
	ProductBean product = null;

	@Override
	public List<ProductBean> getAllProduct() {
		try {
			productList = new ArrayList<ProductBean>();
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(
					"select product_Id, productOwnerId, product_Quantity, product_Price, product_Name, productComments from product");
			while (rs.next()) {
				product = new ProductBean();
				product.setProductId(rs.getInt(1));
				product.setProductOwnerId(rs.getInt(2));
				product.setProductQuantity(rs.getInt(3));
				product.setProductPrice(rs.getDouble(4));
				product.setProductName(rs.getString(5));
				product.setProductComments(rs.getString(6));
				productList.add(product);
			}
			return productList;

		} catch (Exception e) {
			System.out.println("Could not load data, exception occured");
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteProduct(int productId) {
		try {
			pstmt = connection.prepareStatement("delete from product WHERE product_Id=?");
			pstmt.setInt(1, productId);
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
	public boolean addProduct(ProductBean product) {
		try {
			pstmt = connection.prepareStatement(
					"insert into product(product_Name, product_Quantity, product_Price, productComments, productOwnerId) VALUES(?, ?, ?, ?, ?)");

			pstmt.setString(1, product.getProductName());
			pstmt.setInt(2, product.getProductQuantity());
			pstmt.setDouble(3, product.getProductPrice());
			pstmt.setString(4, product.getProductComments());
			pstmt.setInt(5, product.getProductOwnerId());
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean searchProduct(int productId) {
		try {
			pstmt = connection.prepareStatement("select product_Name from product WHERE product_Id=?");
			pstmt.setInt(1, productId);
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

	@Override
	public boolean updateQuantity(int productId, int newQuantity) {
		try {
			pstmt = connection.prepareStatement("UPDATE product SET product_Quantity =? WHERE product_Id=?");
			pstmt.setInt(1, newQuantity);
			pstmt.setInt(2, productId);
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
}
