package edu.jspider.cookiesprogram;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createcookie")
public class CreateCookie extends HttpServlet
{
	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Cookie c1= new Cookie("Cookie1", "100");
		Cookie c2= new Cookie("Cookie2", "200");
		Cookie c3= new Cookie("Cookie3", "300");
		Cookie c4= new Cookie("Cookie4", "400");
		Cookie c5= new Cookie("Cookie5", "500");
		
		//c1 maxage is not set so it remains non persistent
		c2.setMaxAge(60*60);
		c3.setMaxAge(0); //instantly get destroyed just after creation
		c4.setMaxAge(-500); //it is non persistent
		c5.setMaxAge(60*60*24);
		
		PrintWriter out= resp.getWriter();
		out.print("<h1> Cookies got created successfully </h1>");
	}
}
