package com.funbook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.funbook.dto.PostDto;
import com.funbook.utility.DBConnection;

public class Timeline {

	public static ArrayList<PostDto> myTimeline(Integer userId) {
		ArrayList<PostDto> rsList = null;
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(
					"select DISTINCT p.userpost_id , u.user_name , p.text, p.timestamp from userpost p join friend f join user u\r\n"
							+ "where \r\n" + "(u.user_id = p.user_id) AND \r\n" + "((p.user_id = ?) or\r\n"
							+ "(p.user_id IN (select f.user_id from friend f where f.userF_id = ? AND f.request_log = 1)) or \r\n"
							+ "(p.user_id IN (select f.userF_id from friend f where user_id = ?  AND f.request_log = 1)))\r\n"
							+ "order by timestamp desc");

			statement.setInt(1, userId);
			statement.setInt(2, userId);
			statement.setInt(3, userId);
			ResultSet rsSet = statement.executeQuery();
			rsList = new ArrayList<>();
			while (rsSet.next()) {
				PostDto dto = new PostDto();
				dto.setUserPostId(rsSet.getInt("userpost_id"));
				dto.setUserName(rsSet.getString("user_name"));
				dto.setText(rsSet.getString("text"));
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
