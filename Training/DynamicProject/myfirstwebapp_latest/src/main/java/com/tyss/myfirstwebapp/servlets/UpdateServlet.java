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

@WebServlet("/updateUser")
public class UpdateServlet extends HttpServlet {
	private UserServices service = new UserServicesImpl();
	UserBean user = null;

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
			String email = req.getParameter("email");
			if (email != null) {
				user.setEmail(email);
			}

			String password = req.getParameter("password");
			if (password != null) {
				user.setPassword(password);
			}

			String username = req.getParameter("username");
			if (username != null) {
				user.setUsername(username);
			}

			user.setUserid(Integer.parseInt(req.getParameter("uid")));

			boolean res = service.updateUser(user);
			if (res == true) {
				out.println("<h3>" + user.getUserid() + " has been updated</h3>");

			} else {
				out.print("<h3>user could not be added</h3>");
			}

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
