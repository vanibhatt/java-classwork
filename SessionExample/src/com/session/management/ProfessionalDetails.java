package com.session.management;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProfessionalDetails
 */
@WebServlet("/ProfessionalDetails")
public class ProfessionalDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String user_name = request.getParameter("user_name");
		out.print("<body> <h1> We are in professional Details Servlet </h1>");
		out.print("<form action='RegistrationSuccess' method='get'>");
		out.print("<input type='text' name='college'>");
		out.print("<input type='text' name='degree'>");
		out.print("<input type='hidden' name='first_name' value='"+first_name +"' />");
		out.print("<input type='hidden' name='last_name' value='"+last_name +"' />");
		out.print("<input type='hidden' name='user_name' value='"+user_name +"' />");
		out.print("<input type='submit' name='submit' value='Click Me' />");
		out.print("</form>");
	
	}

}
