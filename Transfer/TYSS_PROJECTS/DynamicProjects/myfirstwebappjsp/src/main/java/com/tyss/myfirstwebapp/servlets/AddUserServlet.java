package com.tyss.myfirstwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyss.myfirstwebapp.beans.UserBean;
import com.tyss.myfirstwebapp.services.UserServices;
import com.tyss.myfirstwebapp.services.UserServicesImpl;

@WebServlet("/addUserServlet")
public class AddUserServlet extends HttpServlet {
	private UserServices service = new UserServicesImpl();
	private UserBean user = null;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");

		if (session != null) {
			// Valid Session
			user = new UserBean();
			user.setEmail(req.getParameter("email"));
			user.setPassword(req.getParameter("password"));
			user.setUserid(Integer.parseInt(req.getParameter("uid")));
			user.setUsername(req.getParameter("username"));

			boolean res = service.addUser(user);
			if (res == true) {
				out.println("<h3> User has been added with name: " + user.getUsername() + "</h3>");

			} else {
				out.print("<h3>user could not be added</h3>");
			}
			req.getRequestDispatcher("./updateUser.html").include(req, resp);
		} else {
			// Invalid Session
			out.println("Please login first.. Redirecting to Login page");
			req.getRequestDispatcher("./login.html").include(req, resp);
			;
		}

		out.println("</body>");
		out.println("</html>");
	}
}
