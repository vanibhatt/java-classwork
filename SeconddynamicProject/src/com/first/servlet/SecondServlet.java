package com.first.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int count = 0;
    
	public void init(ServletConfig config) {	
		System.out.println("Servlet Initiliazed ...value of count is :" +count);	
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet method is invoked " +count);
		count++;
	}

	@Override
	public void destroy(){
		
		System.out.println("Servlet removed from service" +count);
	}


}
