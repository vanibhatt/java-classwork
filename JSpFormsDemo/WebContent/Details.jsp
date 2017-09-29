<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String message = null;
	String first_name = request.getParameter("firstname");
	String last_name  = request.getParameter("lastname");
	String password   = request.getParameter("password");
	String username   = request.getParameter("username");
	String gender     = request.getParameter("gender");
	String[] hobbies  = request.getParameterValues("Hobbies");
	String country    = request.getParameter("country");
	
	if (request.getParameter("Register")!=null) {
		if (first_name == null || "".equals(first_name) ||  
		   last_name   == null || "".equals(last_name) ||
		   password    == null || "".equals(password) ||
		   gender      == null || "".equals(gender)) {
		   session.setAttribute("message", "Mandatory fields cannot be null");
		   response.sendRedirect("Registration.jsp");
		}
	}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<td>First Name </td>
			<td><%=first_name %></td>
		</tr>
		<tr>
			<td>Last Name </td>
			<td><%=last_name %></td>
		</tr>
		<tr>
			<td>User Name </td>
			<td><%=username %></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><%=gender %></td>
		</tr>
		<tr>
			<td>Hobbies</td>
			<td>
				<%for(String x:hobbies){ %>
				<%=x.toString()%>
				<%} %>
			</td>
		</tr>
		<tr>
			<td>country</td>
			<td><%=gender %></td>
		</tr>
	</table>

</body>
</html>