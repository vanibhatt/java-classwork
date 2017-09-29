package reg.stu.bo;

import reg.stu.dao.StudentDAO;
import reg.stu.exception.RegistrationException;
import reg.stu.model.Student;

public class StudentBO {
	public Student getStudent(final String userName) throws RegistrationException{

		final StudentDAO loginDAO = new StudentDAO();
		Student student = null;
		try
		{	
			student = loginDAO.getUser(userName);
		}
		catch(RegistrationException e)
		{
			throw new RegistrationException(e.getMessage());
		}
		return student;
	}
	
	public void registerStudent(final Student student) throws RegistrationException{

		final StudentDAO studentDAO = new StudentDAO();
		try
		{
			studentDAO.saveStudent(student);
			
		}
		catch(RegistrationException e)
		{
			throw new RegistrationException(e.getMessage());
		}
	}	
}
