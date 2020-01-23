package com.funbook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.funbook.dto.GroupDto;
import com.funbook.utility.DBConnection;

public class Group {
	static PreparedStatement statement = null;
	static Connection connection = DBConnection.getConnection();

	public static void createGroup(Integer userId, String groupName, String groupDesc, Integer type) {
		try {
			statement = connection.prepareStatement(
					"insert into groups(admin_id, group_name, group_description, group_type) VALUES(?, ?, ?, ?)");
			statement.setInt(1, userId);
			statement.setString(2, groupName);
			statement.setString(3, groupDesc);
			statement.setInt(4, type);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Group not created");
		}
	}

	public static ArrayList<GroupDto> viewYourGroup(Integer userId) {
		ArrayList<GroupDto> rsList = null;
		try {
			statement = connection.prepareStatement("select group_id, group_name from groups where admin_id = ?");

			statement.setInt(1, userId);
			ResultSet rsSet = statement.executeQuery();

			rsList = new ArrayList<>();
			while (rsSet.next()) {
				GroupDto dto = new GroupDto();
				dto.setGroupId(rsSet.getInt("group_id"));
				dto.setGroupName(rsSet.getString("group_name"));
		        rsList.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - " + userId);
		}
		return rsList;

	}

	// To list all public groups of FunBook
	public static ArrayList<GroupDto> viewFunbookGroups(Integer userId) {
		ArrayList<GroupDto> rsList = null;
		try {
			statement = connection.prepareStatement(
					"SELECT group_id, admin_id, group_name, group_description FROM groups where group_type = '0' ");
			ResultSet rsSet = statement.executeQuery();
			
			rsList = new ArrayList<>();
			while (rsSet.next()) {
				GroupDto dto = new GroupDto();
				dto.setGroupId(rsSet.getInt("group_id"));
				dto.setAdminId(rsSet.getInt("admin_id"));				
				dto.setGroupName(rsSet.getString("group_name"));
				dto.setGroupDescription(rsSet.getString("group_description"));
		        rsList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - " + userId);
		}
		return rsList;

	}

	public static boolean checkAdmin(Integer UserId, Integer groupId) {

		try {
			statement = connection.prepareStatement("SELECT admin_id FROM groups where group_id = ? and admin_id = ?");
			statement.setInt(1, groupId);
			statement.setInt(2, UserId);
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

	public static ArrayList<GroupDto> veiwMemberOfYourGroup(Integer groupId) {

		ArrayList<GroupDto> rsList = null;
		try {
			statement = connection.prepareStatement(
					"Select user_name from user where user_id in (SELECT user_id FROM usergroup where group_id = ? and requestlog = '1')");
			statement.setInt(1, groupId);
			ResultSet rsSet = statement.executeQuery();
			
			rsList = new ArrayList<>();
			while (rsSet.next()) {
				GroupDto dto = new GroupDto();
				dto.setUserName(rsSet.getString("user_name"));
		        rsList.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - ");
		}
		return rsList;
	}

	public static void addMember(Integer userId, String memberName, Integer groupId) {
		try {
			Integer memberId = User.getUserId(memberName);
			statement = connection.prepareStatement("insert into usergroup(user_id, group_id, requestlog) VALUES(?, ?, '1')");
			statement.setInt(1, memberId);
			statement.setInt(2, groupId);
			statement.executeUpdate();
			
		} catch (

		SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - " + userId);
		}
	}

	public static void removeMember(Integer userId, Integer groupId, String memberName) {
		try {
			Integer memberId = User.getUserId(memberName);

			// Inserting friend's userid w.r.t the user in friend table
			statement = connection.prepareStatement("delete from usergroup where group_id = ? and user_id = ? ");
			statement.setInt(1, groupId);
			statement.setInt(2, memberId);
			statement.executeUpdate();

		} catch (

		SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - " + userId);
		}
	}

	public static void updateGroupName(Integer userId, String groupName, Integer groupId) {
		try {

			statement = connection
					.prepareStatement("UPDATE groups SET group_name = ? WHERE admin_id = ? AND group_id = ?");
			statement.setString(1, groupName);
			statement.setInt(2, userId);
			statement.setInt(3, groupId);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not process, try Again! - " + userId);
		}
	}

	public static void updateGroupDesc(Integer userId, String groupDesc, Integer groupId) {
		try {
			statement = connection
					.prepareStatement("UPDATE groups SET group_description = ? WHERE admin_id = ? AND group_id = ?");
			statement.setString(1, groupDesc);
			statement.setInt(2, userId);
			statement.setInt(3, groupId);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not process, try Again! - " + userId);
		}
	}

	public static void updateGrouptype(Integer userId, Integer type, Integer groupId) {
		try {
			statement = connection
					.prepareStatement("UPDATE groups SET group_type = ? WHERE admin_id = ? AND group_id = ?");
			statement.setInt(1, type);
			statement.setInt(2, userId);
			statement.setInt(3, groupId);
			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not process, try Again! - " + userId);
		}
	}
	
	public static void sendRequestForGroup(Integer userId, Integer groupId) {
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection
					.prepareStatement("INSERT INTO usergroup (user_id, group_id, requestlog) VALUES (?, ?, '0')");
			statement.setInt(1, userId);
			statement.setInt(2, groupId);
			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Paste, try Again! - " + userId);
		}

	}
	
	public static ArrayList<GroupDto> checkPendingRequestForGroup(Integer userId) {
		ArrayList<GroupDto> pendingList = null;
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(
					"SELECT distinct ug.user_id, g.group_id, g.group_name FROM usergroup ug join groups g where ug.group_id = g.group_id AND requestlog = '0' AND g.admin_id = ? ORDER BY ug.group_id");
			statement.setInt(1, userId);
			ResultSet pendingSet = statement.executeQuery();

			pendingList = new ArrayList<>();
			while (pendingSet.next()) {
				GroupDto dto = new GroupDto();
				dto.setUserId(pendingSet.getInt("user_id"));
				dto.setGroupId(pendingSet.getInt("group_id"));
				dto.setGroupName(pendingSet.getString("group_name"));
				pendingList.add(dto);

			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Request could not be processed, try Again! - " + userId);
		}
		return pendingList;

	}
	
	public static void acceptRequestForGroup(Integer userId, Integer groupId) {

		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection
					.prepareStatement("UPDATE usergroup SET requestlog = '1' WHERE user_id = ? and group_id = ?");
			statement.setInt(1, userId);
			statement.setInt(2, groupId);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Request could not be processed, try Again! - " + userId);
		}

	}

}