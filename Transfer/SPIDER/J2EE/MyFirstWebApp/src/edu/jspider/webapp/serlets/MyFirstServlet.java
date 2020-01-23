package edu.jspider.webapp.serlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Date date= new Date();
		String currentDate= date.toString();
		
		PrintWriter out= resp.getWriter();
		resp.setContentType("<html>");
		
		String html= "\r\n" + 
				"<html>\r\n" + 
				"<head></Head>\r\n" + 
				"<body>\r\n" + 
				"<h1>This is a dunamic recourse</h1>\r\n" + 
				"<h2>Current Date: "+ currentDate +"</h2>\r\n" + 
				"</body>\r\n" + 
				"</html>";
		
		out.print(html);
		
	}
}
