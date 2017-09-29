package reg.stu.util;

public final class OracleSqlQueries {
	public static final String SELECT_USER = "SELECT * FROM students where first_name = ?";
	public static final String SAVE_STUDENT = "INSERT INTO students (first_name, last_name, password_p) values(?, ?, ?)";
	public static final String SELECT_COURSES = "SELECT * FROM courses where student_id = ?";
	public static final String SAVE_COURSE = "INSERT INTO courses (course_name, course_credit, instructor_name, student_id) values(?, ?, ?, ?)";

}
