package com.tyss.myfirstwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookie")
public class ReadCookie extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookie = req.getCookies();

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		RequestDispatcher dispatcher = req.getRequestDispatcher("./ReadCookie.html");
		dispatcher.include(req, resp);

		out.print("<html>");
		out.print("<body>");
		if (cookie != null) {
			for (Cookie cookie2 : cookie) {
				out.print("<h2>Your cookies Name....</h2>" + cookie2.getName());
				out.print("<br><h2>Your cookies Value....</h2>" + cookie2.getValue());
			}
		} else {
			out.print("No Cookiees found");
		}

		out.print("</body>");
		out.print("</html>");
	}
}
