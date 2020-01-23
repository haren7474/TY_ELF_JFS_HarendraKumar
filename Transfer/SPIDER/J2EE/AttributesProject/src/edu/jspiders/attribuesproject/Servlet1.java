package edu.jspiders.attribuesproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s1")
public class Servlet1 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		
		PrintWriter out = resp.getWriter();
		
		out.print("<html><head></head><body><h1>This is Servlet1 Response</h1></body></html>");
		
		req.setAttribute("al", al);
		
		RequestDispatcher rd= req.getRequestDispatcher("s2");
		rd.forward(req, resp);
	}
}
