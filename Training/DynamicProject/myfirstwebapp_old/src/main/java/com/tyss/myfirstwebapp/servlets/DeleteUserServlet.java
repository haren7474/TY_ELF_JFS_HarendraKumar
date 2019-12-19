package com.tyss.myfirstwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyss.myfirstwebapp.services.UserServices;
import com.tyss.myfirstwebapp.services.UserServicesImpl;

@WebServlet("/deleteUser")
public class DeleteUserServlet extends HttpServlet {
	private UserServices service = new UserServicesImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");

		if (session != null) {
			// Valid Session
			int userId = Integer.parseInt(req.getParameter("uid"));
			boolean res = service.deleteUser(userId);
			if (res == true) {
				out.println("<h3> User having id : " + userId + " deleted...............</h3>");

			} else {
				out.println("<h3> User having id : " + userId + " not in database.........</h3>");
			}

			req.getRequestDispatcher("./deleteUser.html").include(req, resp);

		} else {
			// Invalid Session
			out.println("Please login first.. Redirecting to Login page");
			req.getRequestDispatcher("./login.html").include(req, resp);
		}

		out.println("</body>");
		out.println("</html>");
	}
}
