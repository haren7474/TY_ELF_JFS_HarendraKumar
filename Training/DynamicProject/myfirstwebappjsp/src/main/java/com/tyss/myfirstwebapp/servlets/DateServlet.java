package com.tyss.myfirstwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Date date = new Date();
		//Config param
		ServletConfig config = getServletConfig();
		String configParam1= config.getInitParameter("myConfigParam");
		
		
		
		resp.setContentType("text/html");
		resp.setHeader("refresh", "1");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<h2>Current time is " + date + "</h2>");
		out.print("Config param is: "+ configParam1 );
		out.print("</html>");
	}
}
