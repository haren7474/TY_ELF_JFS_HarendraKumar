package com.flexirent.utility;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {

	private static Connection connection = null;

	public static Connection getConnection() {
		try (FileReader reader = new FileReader("config.properties")) {
			Properties properties = new Properties();
			properties.load(reader);
			
			String DBHOST = properties.getProperty("DBHOST");
			String DBPORT = properties.getProperty("DBPORT");
			String DBNAME = properties.getProperty("DBNAME");
			String DBUSER = properties.getProperty("DBUSER");
			String DBPASSWORD = properties.getProperty("DBPASSWORD");
			String url = String.format("jdbc:mysql://%s:%s/%s", DBHOST, DBPORT, DBNAME);
			//System.out.println(" " + DBUSER + " " + DBPASSWORD);

			if (connection != null && connection.isValid(0)) {
				return connection;
			}
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, DBUSER, DBPASSWORD);
		
		} catch (Exception e) {
			System.out.println(e);

		}
		return connection;
	}

	public static void main(String[] args) throws IOException {

		getConnection();
	}
}
