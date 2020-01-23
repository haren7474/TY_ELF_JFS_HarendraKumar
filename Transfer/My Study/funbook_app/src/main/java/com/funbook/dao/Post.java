package com.funbook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.funbook.dto.PostDto;
import com.funbook.utility.DBConnection;

public class Post {

	public static void addPost(Integer userId, String post) {
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection
					.prepareStatement("insert into userpost(user_id, text) VALUES(?, ?)");
			statement.setInt(1, userId);
			statement.setString(2, post);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - " + userId);
		}
	}

	public static ArrayList<PostDto> viewPost(Integer userId) {
		ArrayList<PostDto> rsList = null;
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection
					.prepareStatement("SELECT userpost_id , text FROM userpost WHERE user_id = ?");
			statement.setInt(1, userId);
			ResultSet rsSet = statement.executeQuery();

			rsList = new ArrayList<>();
			while (rsSet.next()) {
				PostDto dto = new PostDto();
				dto.setUserPostId(rsSet.getInt("userpost_id"));
				dto.setText(rsSet.getString("text"));
				rsList.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - " + userId);
		}
		return rsList;
	}

	public static ArrayList<PostDto> viewFreindPost(Integer userId, String userName) {
		Integer friendId = User.getUserId(userName);
		ArrayList<PostDto> rsList = null;
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection
					.prepareStatement("SELECT timestamp, text FROM userpost WHERE user_id = ?");
			statement.setInt(1, friendId);
			ResultSet rsSet = statement.executeQuery();
			rsList = new ArrayList<>();
			while (rsSet.next()) {
				PostDto dto = new PostDto();
				dto.setTimestamp(rsSet.getTimestamp("timestamp"));
				dto.setText(rsSet.getString("text"));
				rsList.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - " + userId);
		}
		return rsList;
	}

	public static void deletePost(Integer userId, Integer postId) {
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection
					.prepareStatement("DELETE FROM userpost WHERE userpost_id = ? and user_id = ?");
			statement.setInt(1, postId);
			statement.setInt(2, userId);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("You are not the owner of this post " + postId);
		}
	}

}
