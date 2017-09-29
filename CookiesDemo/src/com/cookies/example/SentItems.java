package com.cookies.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SentItems
 */
@WebServlet("/SentItems")
public class SentItems extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookieList = request.getCookies();
		String username = null;
		for (Cookie x : cookieList) {
			if (x.getName().equals("username")) {
				username = x.getValue();
			}			
		}
		PrintWriter out = response.getWriter();
		out.print("<body><h4>" + username + "</h4>");
		out.print("<a href='inbox'>inbox</a>");
		out.print("</body>");
	}

}
