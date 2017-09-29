package com.filter.demo2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SourceServlet
 */
//@WebServlet("/SourceServlet")
public class SourceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out = response.getWriter();
//		out.print("<body>Printed from the Source Servlet</body><br>");
		
		
		PrintWriter out = response.getWriter();
		String message = (String) request.getAttribute("message");
		out.print("<body><h2>" + message + "</h2></body><br>");

	}

}
