package com.servletchaining;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(
		urlPatterns = { "/LoginServlet1" }, 
		initParams = { 
				@WebInitParam(name = "admin", value = "admin")
		})
public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if ("admin".equalsIgnoreCase(username) && "admin".equals(password)) {
			response.sendRedirect("SuccessServlet?user=" + username);
		} else {
			response.sendRedirect("ErrorServlet");
		}	
		}
		
	}

