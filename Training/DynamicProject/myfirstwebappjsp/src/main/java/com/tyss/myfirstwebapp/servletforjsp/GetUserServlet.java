package com.tyss.myfirstwebapp.servletforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyss.myfirstwebapp.beans.UserBean;
import com.tyss.myfirstwebapp.services.UserServices;
import com.tyss.myfirstwebapp.services.UserServicesImpl;

@WebServlet("/getUser")
public class GetUserServlet extends HttpServlet {
	private UserServices service = new UserServicesImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);

		if (session != null) {
			// Valid Session
			int userId = Integer.parseInt(req.getParameter("uid"));
			UserBean user = service.searchUser(userId);
			if (user != null) {
				req.setAttribute("user", user);
			} else {
				req.setAttribute("msg", "User with Id " + userId + " is not present");
			}
			req.getRequestDispatcher("./SearchUserJsp.jsp").forward(req, resp);
		} else {
			// Invalid Session
			req.setAttribute("msg", "Please login first");
			req.getRequestDispatcher("./loginJsp").forward(req, resp);
		}
	}
}
