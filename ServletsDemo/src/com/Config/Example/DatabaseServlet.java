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
 * Servlet implementation class DatabaseServlet
 */
@WebServlet(
		urlPatterns = { "/DatabaseServlet" }, 
		initParams = { 
				@WebInitParam(name = "Database URL", value = "jdbc:mysql://locahost/mydb", description = "database url"), 
				@WebInitParam(name = "Database User Name", value = "root", description = "usrename"), 
				@WebInitParam(name = "Password", value = "root", description = "password"), 
				@WebInitParam(name = "Master Table", value = "Student_Master", description = "Mastertablename")
		})
public class DatabaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String Databaseurl, UserName, Password, MasterTable;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		Databaseurl = config.getInitParameter("Database URL");
		UserName    = config.getInitParameter("Database User Name");
		Password    = config.getInitParameter("Password");
		MasterTable = config.getInitParameter("Master Table");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><table> <tr>Database URL "  + Databaseurl + "</tr><br>");
		out.println("<tr> Database User Name "  + UserName + "</tr><br>");
		out.println("<tr>Password "+ Password + "</tr><br>");
		out.println("<tr>Master Table " + MasterTable + "</tr></table></html>");
	}

}
