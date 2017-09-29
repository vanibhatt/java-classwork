package reg.stu.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import reg.stu.util.OracleSqlQueries;
import reg.stu.util.RegStuConstants;
import reg.stu.bo.CourseBO;
import reg.stu.dao.AbstractDAOFactory;
import reg.stu.exception.RegistrationException;
import reg.stu.model.Course;
import reg.stu.model.Student;;

public class StudentDAO {
	public Student getUser(final String userName) throws RegistrationException
	{
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet resultSet = null;
		Student student = null;

		try
		{
			final AbstractDAOFactory daoFactory = AbstractDAOFactory.getDaoFactory(RegStuConstants.ORACLE);
			conn = daoFactory.getConnection();
			stmt = conn.prepareStatement(OracleSqlQueries.SELECT_USER);
			stmt.setString(1, userName);
			resultSet = stmt.executeQuery();
			if (resultSet.next()) {
				student = new Student();
				student.setStudent_id(resultSet.getInt(1));
				student.setF_name(resultSet.getString(2));
				student.setL_name(resultSet.getString(3));
				student.setPassword(resultSet.getString(4));
			}
			stmt.close();
			CourseBO courseBO = new CourseBO();
			student.setCourses(courseBO.getCourse(student.getStudent_id()));
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
		return student;
	}
	
	public void saveStudent(final Student user) throws RegistrationException
	{
		Connection conn = null;
		PreparedStatement stmt = null;
		try
		{
			final AbstractDAOFactory daoFactory = AbstractDAOFactory.getDaoFactory(RegStuConstants.ORACLE);
			conn = daoFactory.getConnection();
			stmt = conn.prepareStatement(OracleSqlQueries.SAVE_STUDENT);
			stmt.setString(1, user.getF_name());
			stmt.setString(2, user.getL_name());
			stmt.setString(3, user.getPassword());
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
}
