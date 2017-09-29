package reg.stu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import reg.stu.exception.RegistrationException;
import reg.stu.model.Course;
import reg.stu.model.Student;
import reg.stu.util.OracleSqlQueries;
import reg.stu.util.RegStuConstants;


public class CourseDAO {
	public List<Course> getCourse(final int student_id) throws RegistrationException
	{
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet resultSet = null;
		Course course = null;
		List<Course> courseList;
		try
		{
			final AbstractDAOFactory daoFactory = AbstractDAOFactory.getDaoFactory(RegStuConstants.ORACLE);
			conn = daoFactory.getConnection();
			stmt = conn.prepareStatement(OracleSqlQueries.SELECT_COURSES);
			stmt.setInt(1, student_id);
			resultSet = stmt.executeQuery();
//			CourseBO courseBO = new Course();
			course = new Course();
			courseList = new ArrayList<Course>();
			while(resultSet.next()){
				course.setCourse_id(resultSet.getInt(1));
				course.setCourse_name(resultSet.getString(2));
				course.setCourse_credit(resultSet.getInt(3));
				course.setInstructor_name(resultSet.getString(4));
				course.setStudent_id(resultSet.getInt(5));
				courseList.add(course);
			}
			stmt.close();
		}
		catch (SQLException e)
		{
			throw new RegistrationException(e.getMessage());
		}
		catch(Exception e)
		{
			throw new RegistrationException(e.getMessage());
		} 
		finally
		{
			try
			{
				resultSet.close();
				stmt.close();
				conn.close();
			}
			catch (SQLException e)
			{
			}
		}
		return courseList;
	}
	
	public void saveCourse(final Course course) throws RegistrationException
	{
		Connection conn = null;
		PreparedStatement stmt = null;
		try
		{
			final AbstractDAOFactory daoFactory = AbstractDAOFactory.getDaoFactory(RegStuConstants.ORACLE);
			conn = daoFactory.getConnection();
			stmt = conn.prepareStatement(OracleSqlQueries.SAVE_COURSE);
			stmt.setString(1, course.getCourse_name());
			stmt.setInt(2, course.getCourse_credit());
			stmt.setString(3, course.getInstructor_name());
			stmt.setInt(4, course.getStudent_id());
			stmt.executeUpdate();
			stmt.close();
		}
		catch (SQLException e)
		{
			throw new RegistrationException(e.getMessage());
		}
		catch(Exception e)
		{
			throw new RegistrationException(e.getMessage());
		} 
		finally
		{
			try
			{
				stmt.close();
				conn.close();
			}
			catch (SQLException e)
			{
				
			}
		}
	}
	
	public static void main(String[] agrs) throws RegistrationException {
		CourseDAO c = new CourseDAO();
		
		List<Course> l = c.getCourse(1);
	}
}
