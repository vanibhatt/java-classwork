<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="reg.stu.util.RegStuConstants" %>
<%@ page import="reg.stu.model.Course" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

if(session.getAttribute("username") == null){
	final RequestDispatcher dispatcher = request.getRequestDispatcher(RegStuConstants.LOGIN);
	dispatcher.forward(request, response);
}
Course course = (Course)session.getAttribute("course");
%>

<h1><%=session.getAttribute("username") %></h1>
<h2>Course Name: <%=course.getCourse_name() %></h2>
<h2>Instructor: <%=course.getInstructor_name() %></h2>
<h2>Course Credit: <%=course.getCourse_credit() %></h2>

</body>
</html>