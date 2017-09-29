<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="reg.stu.model.Student" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Student student = (Student)session.getAttribute("student");
int id =  student.getStudent_id();
%>
	<form action="CourseServlet?action=login" method="post">
		<input type="hidden" name="student_id" value="<%= id %>"/>
		<label>Course Name</label>
		<select name="course_name">
		  <option value="Math 1">Math 1</option>
		  <option value="Java 1">Java 1</option>
		  <option value="Spanish 1">Spanish 1</option>
		  <option value="Science 1">Science 1</option>
		</select>
		<label>Course Credit</label>
		<input type="text" name="course_credit" disabled/>
		<label>Instructor</label>
		<input type="text" name="instructor" disabled/>
		<input type="submit" name="submit" value="submit"/>
	</form>
</body>
</html>