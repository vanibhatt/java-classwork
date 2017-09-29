package com.ServeletContextHandsOn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sharehome
 */
@WebServlet("/Sharehome")
public class Sharehome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String emailid = context.getAttribute("emailid").toString();
		System.out.println(emailid);
		out.print("<body> new emailid is " + emailid + "</body>");
		
	}

}
