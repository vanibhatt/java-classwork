package com.session.object;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SentItems
 */
@WebServlet("/SentItems")
public class SentItems extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String username = null;
		PrintWriter out = response.getWriter();
		
		if (session.getAttribute("user") != null ) {
			username = (String) session.getAttribute("user");
			out.print("<body><h4>" + username + "</h4>");
			out.print("<a href='inbox'>inbox</a><br>");
			out.print("<a href='Logout'>LogOut</a>");
			out.print("</body>");	
		} else {
			out.print("<body><p>Invalid user and password</p>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
			dispatcher.forward(request, response);		
			out.print("</body>");
		}
		
	}
}
