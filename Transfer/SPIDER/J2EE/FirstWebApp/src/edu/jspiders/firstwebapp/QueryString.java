package edu.jspiders.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QueryString extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String fname= req.getParameter("fname");
		String lname= req.getParameter("lname");
		
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		
		String html= "<html>"
				+ "<head>First WebApp </head>"
				+ "<body> <p>"
				+ "<h1> This is a Dynamic Resourc</h1>"
				+ "<h2> First Name-->" + fname 
				+ "Last Name--> "+ lname+ "</h2>"
				+ "</p></body>"
				+ "</html>";
		
		out.print(html);
	}
}
