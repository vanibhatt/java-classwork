package reg.stu.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import reg.stu.bo.CourseBO;
import reg.stu.bo.StudentBO;
import reg.stu.model.Course;
import reg.stu.model.Student;
import reg.stu.util.RegStuConstants;

/**
 * Servlet implementation class CourseServlet
 */
@WebServlet("/CourseServlet")
public class CourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String action = request.getParameter("action");
			final HttpSession session = request.getSession();
			if("course".equals(action)){
			if(session.getAttribute("username") != null ) {
				String course_name = request.getParameter("course_name");
				int course_credit = Integer.parseInt(request.getParameter("course_credit"));
				String instructor = request.getParameter("instructor");
			
				Course course = new Course();
				course.setCourse_name(course_name);
				course.setCourse_credit(course_credit);
				course.setInstructor_name(instructor);
				CourseBO courseBO = new CourseBO();
				courseBO.registerCourse(course);
				session.setAttribute("course", course);
				final RequestDispatcher dispatcher = request.getRequestDispatcher(RegStuConstants.STUDENTCOURSES);
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
