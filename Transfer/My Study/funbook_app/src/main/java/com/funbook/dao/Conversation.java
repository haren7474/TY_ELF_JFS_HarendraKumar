package com.funbook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.funbook.dto.ConversationDto;
import com.funbook.dto.UserDto;
import com.funbook.utility.DBConnection;

public class Conversation {

	public static void sendMessage(Integer userId, String recieverName, String inboxMessage_text) {
		Integer rcvr_Id = User.getUserId(recieverName);
		Connection connection = DBConnection.getConnection();
		try {
			connection = DBConnection.getConnection();
			PreparedStatement statement = connection
					.prepareStatement("insert into inbox(sender_Id, reciever_Id, inboxMessage_text) VALUES(?, ?, ?)");
			statement.setInt(1, userId);
			statement.setInt(2, rcvr_Id);
			statement.setString(3, inboxMessage_text);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Paste, try Again! - " + userId);
		}
	}

	public static ArrayList<ConversationDto> checkInbox(Integer userId) {
		ArrayList<ConversationDto> rsList = null;
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(
					"select u.user_name, i.inboxMessage_text from user u join inbox i where i.sender_Id = u.user_id AND i.reciever_Id = ?");

			statement.setInt(1, userId);
			ResultSet rsSet = statement.executeQuery();

			rsList = new ArrayList<>();
			while (rsSet.next()) {
				ConversationDto dto = new ConversationDto();
				UserDto udto = new UserDto();
				udto.setUserName(rsSet.getString("user_name"));
				dto.setUserdto(udto);		    
				dto.setMessageText(rsSet.getString("inboxMessage_text"));
		        rsList.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - " + userId);
		}
		return rsList;

	}

	public static ArrayList<ConversationDto> checkSentMessages(Integer userId) {
		ArrayList<ConversationDto> rsList = null;
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(
					"select u.user_name, i.inboxMessage_text from user u join inbox i where i.reciever_Id = u.user_id AND i.sender_Id = ?");

			statement.setInt(1, userId);
			ResultSet rsSet = statement.executeQuery();

			rsList = new ArrayList<>();
			while (rsSet.next()) {
				ConversationDto dto = new ConversationDto();
				UserDto udto = new UserDto();
				udto.setUserName(rsSet.getString("user_name"));
				dto.setUserdto(udto);			    
				dto.setMessageText(rsSet.getString("inboxMessage_text"));
		        rsList.add(dto);
			}
						
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - " + userId);
		}
		return rsList;

	}

	public static ArrayList<ConversationDto> chatHistory(Integer userId, String userName) {
		ArrayList<ConversationDto> rsList = null;
		try {
			Connection connection = DBConnection.getConnection();
			Integer recieverId = User.getUserId(userName);
			PreparedStatement statement = connection.prepareStatement(
					"select sender_Id, reciever_Id, inboxMessage_text, timestamp from inbox where (sender_Id =? AND reciever_Id= ?) OR (sender_Id =? AND reciever_Id= ?) order BY timestamp desc");

			statement.setInt(1, userId);
			statement.setInt(2, recieverId);
			statement.setInt(3, recieverId);
			statement.setInt(4, userId);
			ResultSet rsSet = statement.executeQuery();

			rsList = new ArrayList<>();
			while (rsSet.next()) {
				ConversationDto dto = new ConversationDto();
				dto.setSenderId(rsSet.getInt("sender_Id"));
				dto.setRecieverId(rsSet.getInt("reciever_Id"));
				dto.setMessageText(rsSet.getString("inboxMessage_text"));
				dto.setTimestamp(rsSet.getTimestamp("timestamp"));
		        rsList.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - " + userId);
		}
		return rsList;

	}
}
