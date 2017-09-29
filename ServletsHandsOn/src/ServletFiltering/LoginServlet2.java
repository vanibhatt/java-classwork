package ServletFiltering;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet2
 */

public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if ("jack".equalsIgnoreCase(username) && "rose".equals(password)) {
			response.sendRedirect("HomeServlet?user=" + username);
		} else {
			PrintWriter out = response.getWriter();
			response.sendRedirect("Login2.html");
			out.print("<body><h3>Invalid credentials</h3>");
			out.print("</body>");
	
		}	
		}
		
	}

