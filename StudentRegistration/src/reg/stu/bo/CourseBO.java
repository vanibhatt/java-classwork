package reg.stu.bo;

import java.util.List;

import reg.stu.dao.CourseDAO;
import reg.stu.dao.StudentDAO;
import reg.stu.exception.RegistrationException;
import reg.stu.model.Course;

public class CourseBO {
	public List<Course> getCourse(final int student_id) throws RegistrationException{

		final CourseDAO courseDAO = new CourseDAO();
		List<Course> course = null;
		try
		{	
			course = courseDAO.getCourse(student_id);
		}
		catch(RegistrationException e)
		{
			throw new RegistrationException(e.getMessage());
		}
		return course;
	}
	
	public void registerCourse(final Course course) throws RegistrationException{

		final CourseDAO courseDAO = new CourseDAO();
		try
		{
			courseDAO.saveCourse(course);
			
		}
		catch(RegistrationException e)
		{
			throw new RegistrationException(e.getMessage());
		}
	}
}
