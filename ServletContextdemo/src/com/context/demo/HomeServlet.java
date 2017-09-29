package com.context.demo;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ServletContext context;
    private String initCount;
 
	
	public void init(ServletConfig config) throws ServletException {
	
		context = config.getServletContext();
		initCount = context.getInitParameter("count");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String CountValue = null;
		
		if (context.getAttribute("count") != null ) {
			
			CountValue = context.getAttribute("count").toString();
			
		} else {
			
			CountValue = initCount;
		}
		
		int count = Integer.parseInt(CountValue);
		count++;
		context.setAttribute("count", count);
		
	}

	

}
