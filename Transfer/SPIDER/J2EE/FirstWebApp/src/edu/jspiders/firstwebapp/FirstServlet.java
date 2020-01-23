package edu.jspiders.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Date date = new Date();
		String currentDate= date.toString();
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		
		String html= "<html>"
				+ "<head>First WebApp </head>"
				+ "<body>"
				+ "<h1> This is a Dynamic Resourc</h1>"
				+ "<h2> Current Date-->" + currentDate + "</h2>"
				+ "</body>"
				+ "</html>";
		
		out.print(html);
	}
}
