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

@WebServlet("/s3")
public class Servlet3 extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		Student s = (Student) req.getAttribute("student");
		ArrayList<Integer> al = (ArrayList<Integer>) req.getAttribute("al");

		out.print("<html><head></head><body><h1>This is Servlet3 Response</h1>");

		for (Integer itr : al) {
			out.print("<h2>" + itr + "</h2>");
		}

		out.print("<h2>" + s + "</h2");
		out.print("</body></html>");
	}
}
