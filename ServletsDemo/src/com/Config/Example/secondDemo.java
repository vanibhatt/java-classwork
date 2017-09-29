package com.Config.Example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class secondDemo
 */
@WebServlet(
		urlPatterns = { "/secondDemo" }, 
		initParams = { 
				@WebInitParam(name = "FirstName", value = "Vani"), 
				@WebInitParam(name = "LastName", value = "Bhattacharjee")
		})
public class secondDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String FirstName, LastName;
       
   
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		FirstName = config.getInitParameter("FirstName");
		LastName = config.getInitParameter("LastName");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<body> Hello user the admin of this appplication is " + FirstName +" " + LastName + "</body>");
	}

}
