package com.ServletContext;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.ServletContext;


/**
 * Servlet implementation class Sharehome
 */
@WebServlet("/ShareHome")
public class ShareHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out = response.getWriter();
//		String emailid = context.getAttribute("emailid").toString();
//		out.print("<body> new emailid is " + emailid + "</body>");
		
		PrintWriter out = response.getWriter();
		String Emailid = context.getAttribute("fromForm").toString();
		String fromXML = context.getAttribute("emailidxml").toString();
		out.print("<body> new emailid is " + Emailid + "</body>");
		out.print("<body> new emailid is " + fromXML + "</body>");
		
	}

}
