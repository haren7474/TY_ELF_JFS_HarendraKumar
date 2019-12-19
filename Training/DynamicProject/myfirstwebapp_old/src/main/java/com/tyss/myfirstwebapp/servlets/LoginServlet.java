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

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	UserServices services = new UserServicesImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get form data
		String uidValue = req.getParameter("uid");
		String pass = req.getParameter("pass");

		int uid = Integer.parseInt(uidValue);

		UserBean user = services.authenticate(uid, pass);

		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		if (user != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("user", user);
			out.print("<h3 style='color': blue>Welcome "+ user.getUsername() + "</h3><br>");
			out.print("<br><a href='./addUser.html'>Add User</a>");
			out.print("<br><a href='./updateUser.html'>Update User</a>");
			out.print("<br><a href='./searchUser.html'>Search Empployee</a>");
			out.print("<br><a href='./deleteUser.html'>Delete Empployee</a>");
			out.print("<br><a href='#'>View All Empployee</a>");
			out.print("<br><a href='./logout'>Logout</a>");
		} else {
			out.print("<h3 style='color': red> Invalid Credentials></h3>");
			req.getRequestDispatcher("./login.html").include(req, resp);
		}
		out.print("</body>");
		out.print("</html>");
	}
}
