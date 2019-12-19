package com.tyss.myfirstwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextParamServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext context= getServletContext();
		//or we can get context by req.getServletContext();
		
		String contextParam = context.getInitParameter("myContextParam");
		
		resp.setContentType("text/html");
		resp.setHeader("refresh", "1");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<h2>Your Context Param value= " + contextParam + "</h2>");
		out.print("</html>");
	}
}
