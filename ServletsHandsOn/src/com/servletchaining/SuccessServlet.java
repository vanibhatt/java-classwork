package com.servletchaining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SuccessServlet
 */
@WebServlet("/SuccessServlet")
public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Header");
		dispatcher.include(request, response);
		
		String user = request.getParameter("user");
		PrintWriter out = response.getWriter();
		out.print("<body> hello "+user+ "</body>");
		
		RequestDispatcher dispatcher1 = request.getRequestDispatcher("Footer");
		dispatcher1.include(request, response);
		
		
	}
}
