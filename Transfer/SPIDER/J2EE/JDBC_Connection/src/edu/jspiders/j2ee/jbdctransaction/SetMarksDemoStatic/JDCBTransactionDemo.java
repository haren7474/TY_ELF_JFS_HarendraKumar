package edu.jspiders.j2ee.jbdctransaction.SetMarksDemoStatic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDCBTransactionDemo 
{
	public static void main(String[] args)
	{
		Statement stmt= null;
		Connection con = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/jdbcconnect?user=root&password=";
			con = DriverManager.getConnection(dbUrl);
			
			//Setting Auto commit as false.
			con.setAutoCommit(false);
			

			String query1="update politicians set marks =68.6 where id=4 ";
			String query2="update politicians set marks =68.6 where id=3 ";
			stmt= con.createStatement();
			
			stmt.executeUpdate(query1);
			stmt.executeUpdate(query2);
			
			System.out.println("JDBC Transaction is successfull");
			//Setting it to commit
			con.commit();
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			try 
			{
				System.out.println("JDBC Transaction is unsuccessfull");
				con.rollback();
			} 
			catch (SQLException e1) 
			{
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}