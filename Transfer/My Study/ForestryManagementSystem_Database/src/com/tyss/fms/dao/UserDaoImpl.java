package com.tyss.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.tyss.fms.controller.DBConnection;
import com.tyss.fms.dto.UserBean;

public class UserDaoImpl implements UserDao {
	private List<UserBean> userList = null;
	HashMap<Integer, String> ownerMap = null;
	static PreparedStatement pstmt = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	UserBean user = null;
	static Connection connection = DBConnection.getConnection();

	@Override
	public List<UserBean> getAllUser() {
		try {
			userList = new ArrayList<UserBean>();
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(
					"select user_Id, user_Type, full_Name, street_Add1, street_Add2, town, postal_Code, email, mobile_Number from user");
			while (rs.next()) {
				user = new UserBean();
				user.setUserId(rs.getInt(1));
				user.setUserType(rs.getString(2));
				user.setFullName(rs.getString(3));
				user.setStreetAdd1(rs.getString(4));
				user.setStreetAdd2(rs.getString(5));
				user.setTown(rs.getString(6));
				user.setPostalCode(rs.getInt(7));
				user.setEmail(rs.getString(8));
				user.setMobileNumber(rs.getString(9));
				userList.add(user);
			}
			return userList;

		} catch (Exception e) {
			System.out.println("Could not load data, exception occured");
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean modifyUser(int userId, String email) {
		try {
			pstmt = connection.prepareStatement("UPDATE user SET email =? WHERE user_Id=?");
			pstmt.setString(1, email);
			pstmt.setInt(2, userId);
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
	public boolean deleteUser(int userId) {
		try {
			pstmt = connection.prepareStatement("delete user WHERE user_Id=?");
			pstmt.setInt(1, userId);
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
	public boolean addUser(UserBean user) {
		try {
			pstmt = connection.prepareStatement(
					"insert into user(user_Type, full_Name, street_Add1, street_Add2, town, postal_Code, email,	"
							+ "mobile_Number, password) VALUES(?, ?, ?, ?, ?, ?, ?, ?,?)");

			pstmt.setString(1, user.getUserType());
			pstmt.setString(2, user.getFullName());
			pstmt.setString(3, user.getStreetAdd1());
			pstmt.setString(4, user.getStreetAdd2());
			pstmt.setString(5, user.getTown());
			pstmt.setInt(6, user.getPostalCode());
			pstmt.setString(7, user.getEmail());
			pstmt.setString(8, user.getMobileNumber());
			pstmt.setString(9, user.getPassword());
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public String signIn(int id, String password) {
		String userPwd = null;
		ResultSet pass = null;
		try {
			pstmt = connection.prepareStatement("SELECT password from user where user_Id=? and password=?");
			pstmt.setInt(1, id);
			pstmt.setString(2, password);
			pass = pstmt.executeQuery();

			while (pass.next()) {
				userPwd = pass.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SignIn Failed ! - ");
		}
		return userPwd;
	}

	public String getUserType(int id) {
		String type = null;
		ResultSet pass = null;
		try {
			pstmt = connection.prepareStatement("SELECT user_Type from user where user_Id=?");
			pstmt.setInt(1, id);
			pass = pstmt.executeQuery();

			while (pass.next()) {
				type = pass.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could not load data, exception occured ");
		}
		return type;
	}

	
	public String getUserName(int id) {
		String uname = null;
		ResultSet pass = null;
		try {
			pstmt = connection.prepareStatement("SELECT full_Name from user where user_Id=?");
			pstmt.setInt(1, id);
			pass = pstmt.executeQuery();

			while (pass.next()) {
				uname = pass.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could not load data, exception occured ");
		}
		return uname;
	}
	public HashMap<Integer, String> getUserIdWithGivenUserType(String userType) {
		ownerMap = new HashMap<Integer, String>();
		int ownerId;
		String ownerName;
		ResultSet rs = null;
		try {
			pstmt = connection.prepareStatement("SELECT user_Id, full_Name from user where user_Type=?");
			pstmt.setString(1, userType);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				ownerId = rs.getInt(1);
				ownerName = rs.getString(2);
				ownerMap.put(ownerId, ownerName);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could not load data, exception occured");
		}
		return ownerMap;
	}
}
