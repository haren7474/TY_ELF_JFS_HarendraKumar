package com.flexirent.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.flexirent.dto.UserDto;
import com.flexirent.utility.DBConnection;

public class User 
{

	static PreparedStatement statement = null;
	static Connection connection = DBConnection.getConnection();
	
	public static void signUp(UserDto readSignUpDetails)
	{
		try 
		{
			statement = connection.prepareStatement(
					"insert into user(firstName, userType, emailId, userName, password) VALUES(?, ?, ?, ?, ?)");
			statement.setString(1, readSignUpDetails.getFirstName());
			statement.setInt(2, readSignUpDetails.getType());
			statement.setString(3, readSignUpDetails.getEmailId());
			statement.setString(4, readSignUpDetails.getUsername());
			statement.setString(5, readSignUpDetails.getPassword());
			statement.executeUpdate();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			System.out.println("Signup Failed ! - " + readSignUpDetails.getFirstName() + readSignUpDetails.getEmailId());
		}
	}
	
	public static Integer signIn(UserDto readSignInDetails) 
	{
		Integer userId = null;
		ResultSet pass = null;
		try {
			statement = connection.prepareStatement("SELECT userId  from user where userName=? and password=?");
			statement.setString(1, readSignInDetails.getUsername());
			statement.setString(2, readSignInDetails.getPassword());
			pass = statement.executeQuery();

			while (pass.next()) {
				userId = pass.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SignIn Failed ! - ");
		}
		return userId;
	}

	
}
