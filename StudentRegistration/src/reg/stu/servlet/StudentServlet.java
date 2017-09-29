package reg.stu.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import reg.stu.bo.StudentBO;
import reg.stu.model.Student;
import reg.stu.util.RegStuConstants;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String action = request.getParameter("action");
			final HttpSession session = request.getSession();
			if("register".equals(action)){
			if(session.getAttribute("username") == null ) {
				String f_name = request.getParameter("f_name");
				String l_name = request.getParameter("l_name");
				String password = request.getParameter("password");
				session.setAttribute("username", f_name);
				
				Student student = new Student();
				student.setF_name(f_name);
				student.setL_name(l_name);
				student.setPassword(password);
				StudentBO studentBO = new StudentBO();
				studentBO.registerStudent(student);
				session.setAttribute("student", student);
				final RequestDispatcher dispatcher = request.getRequestDispatcher(RegStuConstants.LOGIN);
				dispatcher.forward(request, response);
			}
			}
			else if ("login".equals(action)){
				String f_name = request.getParameter("f_name");
				String l_name = request.getParameter("l_name");
				String password = request.getParameter("password");
				StudentBO studentBO = new StudentBO();
				Student student = studentBO.getStudent(f_name);
				
				if(student != null && password.equals(student.getPassword())){
					session.setAttribute("username", f_name);
					session.setAttribute("student", student);
					final RequestDispatcher dispatcher = request.getRequestDispatcher(RegStuConstants.RegisterToCourse);
					dispatcher.forward(request, response);
				}
				
			}
			
			}
			catch (Exception e) {
				
				request.setAttribute("message", e.getMessage());
				final RequestDispatcher dispatcher = request.getRequestDispatcher(RegStuConstants.ERROR);
				dispatcher.forward(request, response);
			}
	}

}
