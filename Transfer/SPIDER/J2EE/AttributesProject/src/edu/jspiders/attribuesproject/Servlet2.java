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

@WebServlet("/s2")
public class Servlet2 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out = resp.getWriter();
		ArrayList<Integer> al= (ArrayList<Integer>) req.getAttribute("al");
		out.print("<html><head></head><body><h1>This is Servlet2 Response</h1>");
		
		for(Integer itr: al)
		{
			out.print("<h2>" +itr+"</h2>");
		}
		
		out.print("</body></html>");
		
		
		req.setAttribute("student", new Student(1, "Harendra", 80));
		
		
		RequestDispatcher rd= req.getRequestDispatcher("s3");
		rd.forward(req, resp);
	}
}
