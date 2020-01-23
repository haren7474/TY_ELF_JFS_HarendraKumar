package edu.servlet.politicianinfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Politician extends HttpServlet 
{
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int id = Integer.parseInt(req.getParameter("id"));
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/jdbcconnect?user=root&password=";
			con = DriverManager.getConnection(dbUrl);

			String query = "select * from politicians where id>?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			
			PrintWriter out= resp.getWriter();
			resp.setContentType("text/html");
			
			String html= "<html>"
					+ " <head>"					
						+ " <style>"
							+"h1"
								+ "{"
										+"color: #ff0066;"
										+"background-color: #66cc66;"
								+ "}"
						+ "</style>"
					+ "</head>"
					+ "	 <body bgcolor='#ff99ff'>"
					
					+"<h1>Politician Report Card</h1>"
						+ "<table border =2 align= 'Left' bgcolor= 'Green' height= 400 width= 400>"
					
								+ "<tr>" 
									+"<td><b>ID</b></td>"
									+"<td><b>First Name</b></td>" 
									+"<td><b>Middle Name</b></td>"
									+"<td><b>Last Name</b></td>" 
									+"<td><b>Marks</b></td>"
								+"</tr>";
			String rows = "";
						while(rs.next())
						{
								rows +="<tr>" 
									+"<td>"+ rs.getInt(1)+ "</td>"
									+"<td>"+ rs.getString(2)+ "</td>" 
									+"<td>"+ rs.getString(3)+ "</td>"
									+"<td>"+ rs.getString(4)+ "</td>" 
									+"<td>"+ rs.getDouble(5)+ "</td>"
								+"</tr>";
						}
						
			String end = "</table> </body> </html>";
			
			out.print(html+rows+end);
		}

		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e1) 
		{
			e1.printStackTrace();
		}
	}
}