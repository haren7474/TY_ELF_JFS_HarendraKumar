package com.funbook.utility;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {

	private static Connection connection = null;

	public static Connection getConnection() {
		try (InputStream inputStream = DBConnection.class.getClassLoader().getResourceAsStream("config.properties");) {
			Properties properties = new Properties();
			properties.load(inputStream);
			
			
			String DBHOST = properties.getProperty("DBHOST");
			String DBPORT = properties.getProperty("DBPORT");
			String DBNAME = properties.getProperty("DBNAME");
			String DBUSER = properties.getProperty("DBUSER");
			String DBPASSWORD = properties.getProperty("DBPASSWORD");
			String url = String.format("jdbc:mysql://%s:%s/%s", DBHOST, DBPORT, DBNAME);
			System.out.println(" " + DBUSER + " " + DBPASSWORD);

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
