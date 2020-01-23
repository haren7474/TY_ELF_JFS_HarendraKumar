package com.funbook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.funbook.dto.UserDto;
import com.funbook.utility.DBConnection;

public class User {

	static PreparedStatement statement = null;
	static Connection connection = DBConnection.getConnection();

	public static void signUp(String firstName, String lastName, String mobileNumber, String emailId, String userName,
			String password, String dob, Integer type) {
		try {
			statement = connection.prepareStatement(
					"insert into user(firstname, lastname, mobilenumber, emailid, user_name, password, dob, user_type) VALUES(?, ?, ?, ?, ?, ?, ? ,?)");
			statement.setString(1, firstName);
			statement.setString(2, lastName);
			statement.setString(3, mobileNumber);
			statement.setString(4, emailId);
			statement.setString(5, userName);
			statement.setString(6, password);
			statement.setString(7, dob);
			statement.setInt(8, type);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Signup Failed ! - " + userName + emailId);
		}
	}

	public static Integer signIn(String userName, String password) {
		Integer user_id = null;
		ResultSet pass = null;
		try {
			statement = connection.prepareStatement("SELECT user_id  from user where user_name=? and password=?");
			statement.setString(1, userName);
			statement.setString(2, password);
			pass = statement.executeQuery();

			while (pass.next()) {
				user_id = pass.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SignIn Failed ! - ");
		}
		return user_id;
	}

	// To Fetch User Id when provided user Name
	public static Integer getUserId(String userName) {
		Integer user_Id = null;
		try {
			statement = connection.prepareStatement("SELECT user_id FROM user WHERE user_name = ?");
			statement.setString(1, userName);
			ResultSet userId = statement.executeQuery();
			while (userId.next()) {
				user_Id = userId.getInt("user_id");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Paste, try Again! - " + user_Id);
		}
		return user_Id;
	}

	// To get User Name when provided user Id
	public static String fetchUserName(Integer userId) {
		String userName = null;
		try {
			statement = connection.prepareStatement("SELECT user_name FROM user WHERE user_id = ?");
			statement.setInt(1, userId);
			ResultSet Name = statement.executeQuery();
			while (Name.next()) {
				userName = Name.getString("user_name");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Paste, try Again! - " + userName);
		}
		return userName;
	}

	// To check if username already exists
	public static boolean checkUserName(String userName) {
		try {
			statement = connection.prepareStatement("SELECT user_name FROM user where user_name = ?");
			statement.setString(1, userName);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				System.out.println("UserName already exists, Try again!");
				return false;
			}
			rs.previous();
			while (!rs.next()) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - ");
		}
		return false;
	}

	// To list all public users of FunBook
	public static ArrayList<UserDto> viewFunbookUsers(Integer userId) {
		ArrayList<UserDto> userList = null;
		try {
			// Showing all user list of Funbook
			statement = connection
					.prepareStatement("SELECT user_name FROM user where user_type = '0' AND user_id != ?");
			statement.setInt(1, userId);
			ResultSet userSet = statement.executeQuery();

			userList = new ArrayList<>();
			while (userSet.next()) {
				UserDto dto = new UserDto();
				dto.setUserName(userSet.getString("user_name"));
				userList.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - " + userId);
		}
		return userList;

	}

	public static void updateProfileFirstName(Integer userId, String firstName) {
		try {
			statement = connection.prepareStatement("UPDATE user SET firstname = ? WHERE user_id = ?");
			statement.setString(1, firstName);
			statement.setInt(2, userId);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not process, try Again! - " + userId);
		}
	}

	public static void updateProfileLastName(Integer userId, String lastName) {
		try {
			statement = connection.prepareStatement("UPDATE user SET lastname = ? WHERE user_id = ?");
			statement.setString(1, lastName);
			statement.setInt(2, userId);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not process, try Again! - " + userId);
		}
	}

	public static void updateProfileMobile(Integer userId, String mobileNumber) {
		try {
			statement = connection.prepareStatement("UPDATE user SET mobilenumber = ? WHERE user_id = ?");
			statement.setString(1, mobileNumber);
			statement.setInt(2, userId);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not process, try Again! - " + userId);
		}
	}

	public static void updateProfilePassword(Integer userId, String password) {
		try {
			statement = connection.prepareStatement("UPDATE user SET password = ? WHERE user_id = ?");
			statement.setString(1, password);
			statement.setInt(2, userId);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not process, try Again! - " + userId);
		}
	}

	public static void updateProfileDOB(Integer userId, String dob) {
		try {
			statement = connection.prepareStatement("UPDATE user SET dob = ? WHERE user_id = ?");
			statement.setString(1, dob);
			statement.setInt(2, userId);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not process, try Again! - " + userId);
		}
	}

	public static void updateProfileAccountType(Integer userId, Integer type) {
		try {
			statement = connection.prepareStatement("UPDATE user SET user_type = ? WHERE user_id = ?");
			statement.setInt(1, type);
			statement.setInt(2, userId);
			statement.executeUpdate();
			System.out.println("Account Type has been updated as - " + type);

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not process, try Again! - " + userId);
		}
	}
}
