package com.funbook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.funbook.dto.UserDto;
import com.funbook.utility.DBConnection;

public class Friend {

	public static ArrayList<UserDto> viewFriend(Integer userId) {
		ArrayList<UserDto> friendList = null;
		try {
			Connection connection = DBConnection.getConnection();

			// Fetching Freinds'Ids from friend table, associated with the user
			PreparedStatement statement = connection.prepareStatement(
					"select DISTINCT user_id, user_name from user where user_id IN (select DISTINCT user_id from friend where userF_id =? AND request_log= 1) or user_id In (select DISTINCT userF_id from friend where user_id =? AND request_log= 1)");

			statement.setInt(1, userId);
			statement.setInt(2, userId);
			ResultSet friendSet = statement.executeQuery();

			friendList = new ArrayList<>();
			while (friendSet.next()) {
				UserDto dto = new UserDto();
				dto.setUserId(friendSet.getInt("user_id"));
				dto.setUserName(friendSet.getString("user_name"));
				friendList.add(dto);

			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - " + userId);
		}
		return friendList;

	}

	public static boolean checkFriendExists(Integer userId, Integer userF_id) {
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(
					"select friend_id from friend where (userF_id = ? AND user_id = ?) or (userF_id = ? AND user_id = ?)");
			statement.setInt(1, userF_id);
			statement.setInt(2, userId);
			statement.setInt(3, userId);
			statement.setInt(4, userF_id);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				return true;
			}
			rs.previous();
			while (!rs.next()) {
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - ");
		}
		return false;
	}

	public static void removeFriend(Integer userId, Integer userFriendId) {
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement1 = connection.prepareStatement(
					"delete from friend where (user_id = ? and userF_id = ? and request_log= '1') OR (user_id = ? and userF_id = ? and request_log= '1')");
			statement1.setInt(1, userId);
			statement1.setInt(2, userFriendId);
			statement1.setInt(3, userFriendId);
			statement1.setInt(4, userId);
			statement1.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - " + userId);
		}
	}

	public static void sendRequest(Integer userId, Integer userF_id) {
		try {
			// String userName = info.readStringInput();
			String userName = User.fetchUserName(userF_id);
			Boolean requestLog = false;
			Integer resuestUsedId = User.getUserId(userName);
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection
					.prepareStatement("insert into friend(user_id, userF_id, request_log) VALUES(?, ?, ?)");
			statement.setInt(1, userId);
			statement.setInt(2, resuestUsedId);
			statement.setBoolean(3, requestLog);
			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Paste, try Again! - " + userId);
		}

	}

	public static ArrayList<UserDto> checkPendingRequest(Integer userId) {
		ArrayList<UserDto> pendingList = null;
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(
					"SELECT user_id, user_name from user where user_id IN (SELECT user_id FROM friend where request_log = '0' AND userF_id = ?)");
			statement.setInt(1, userId);
			ResultSet pendingSet = statement.executeQuery();

			pendingList = new ArrayList<>();
			while (pendingSet.next()) {
				UserDto dto = new UserDto();
				dto.setUserId(pendingSet.getInt("user_id"));
				dto.setUserName(pendingSet.getString("user_name"));
				pendingList.add(dto);

			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Request could not be processed, try Again! - " + userId);
		}
		return pendingList;

	}

	public static void acceptRequest(Integer userId, Integer userF_Id) {

		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection
					.prepareStatement("UPDATE friend SET request_log = '1' WHERE user_id = ? and userF_id = ?");
			statement.setInt(1, userF_Id);
			statement.setInt(2, userId);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Request could not be processed, try Again! - " + userId);
		}

	}

	public static void rejectRequest(Integer userId, Integer userF_Id) {

		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection
					.prepareStatement("DELETE FROM friend WHERE user_id = ? AND userF_id = ? AND request_log = '0'");
			statement.setInt(1, userF_Id);
			statement.setInt(2, userId);
			statement.executeUpdate();

		} catch (

		SQLException e) {
			e.printStackTrace();
			System.out.println("Request could not be processed, try Again! - " + userId);
		}

	}

}
