package com.ServletContext;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private ServletContext context;
	 private String initEmailid = null;
  	
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
	 initEmailid = context.getInitParameter("initemailid");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String emailidForm = request.getParameter("emailidForm");
		context.setAttribute("fromForm", emailidForm);
		
		String Emailidxml = null;
		
		if (context.getAttribute("emailidxml") != null ) {
			context.removeAttribute("emailidxml");
		} else {
			Emailidxml = initEmailid;
		}
		
		context.setAttribute("emailidxml", Emailidxml);
		RequestDispatcher dispatcher = request.getRequestDispatcher("ShareHome");
		dispatcher.forward(request, response);
		
	}
}
