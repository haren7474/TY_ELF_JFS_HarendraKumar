package edu.jspiders.attribuesproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletSecurityElement;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s4")
public class Servlet4 extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		ServletContext context= getServletContext();
		ArrayList<Character> contextAl= new ArrayList<>();
		
		contextAl.add('A');
		contextAl.add('A');
		contextAl.add('A');
		contextAl.add('A');
		contextAl.add('A');
		
		PrintWriter out = resp.getWriter();
	
		out.print("<html><head></head><body><h1>This is Servlet4 Response</h1>");
		out.print("</body></html>");
		
		context.setAttribute("contextAl", contextAl);
	}
}
