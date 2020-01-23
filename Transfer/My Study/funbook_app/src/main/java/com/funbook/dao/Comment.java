package com.funbook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.funbook.dto.PostDto;
import com.funbook.utility.DBConnection;

public class Comment {
	public static void addCommentOnPost(Integer userPostId, Integer userId, String comment) {
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection
					.prepareStatement("INSERT INTO usercomment (user_post_id, comment_by_user_id, comment) VALUES (?, ?, ?)");
			statement.setInt(1, userPostId);
			statement.setInt(2, userId);
			statement.setString(3, comment);
			statement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - " + userId);
		}
	}

	public static ArrayList<PostDto> viewCommentOnPost(Integer userPostId) {
		ArrayList<PostDto> rsList = null;
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection
					.prepareStatement("select comment_by_user_id, comment, timestamp from usercomment where user_post_id = ? order by timestamp asc");
			
			statement.setInt(1, userPostId);
			ResultSet rsSet = statement.executeQuery();
			
			rsList = new ArrayList<>();
			while (rsSet.next()) {
				PostDto dto = new PostDto();				
				dto.setUserId(rsSet.getInt("comment_by_user_id"));
				dto.setText(rsSet.getString("comment"));
				dto.setTimestamp(rsSet.getTimestamp("timestamp"));
				rsList.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Could Not Fetch your query, try Again! - " );
		}
		return rsList;
	}
	

}
