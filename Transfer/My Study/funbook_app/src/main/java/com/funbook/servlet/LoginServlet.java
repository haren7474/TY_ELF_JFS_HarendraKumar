package com.funbook.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.funbook.dao.User;
import com.funbook.dto.UserDto;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Listing of Funbook Users		
		Iterator<UserDto> userItr = null;
		ArrayList<UserDto> userAl = null;
		System.out.println("*******This is the list of Funbook Users*****");
		userAl = User.viewFunbookUsers(11);
		userItr = userAl.iterator();

		while (userItr.hasNext()) {
			UserDto dto = userItr.next();
			System.out.println(dto.getUserName());
			response.getWriter().append("<h1>" + dto.getUserName() + "</h1>"+ "\n");
		}

		response.getWriter().append("Served at: ").append(request.getContextPath());
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
