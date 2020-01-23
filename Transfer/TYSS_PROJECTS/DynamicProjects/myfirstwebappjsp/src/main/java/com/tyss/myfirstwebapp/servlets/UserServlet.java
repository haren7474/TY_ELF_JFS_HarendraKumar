package com.tyss.myfirstwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.myfirstwebapp.beans.UserBean;
import com.tyss.myfirstwebapp.services.UserServices;
import com.tyss.myfirstwebapp.services.UserServicesImpl;

public class UserServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Pritnng Context Param which is avaliable for all Servlets through wex,.xml

		ServletContext context = getServletContext();
		String contextParam = context.getInitParameter("myContextParam");

		UserServices userv = new UserServicesImpl();
		UserBean ubean = userv.searchUser(2019001);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<h2>User Details are:\n " + ubean.getUserid() + " " + ubean.getUsername() + " " + ubean.getEmail()
				+ " " + ubean.getPassword() + " " + "</h2>");
		out.print("Context Param is: " + contextParam);
		out.print("</html>");
	}
}
