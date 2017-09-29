<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.beans.demo.User"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	if(request.getParameter("login") != null) {
		User user = new User();
		user.setUserName(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		if ("tom".equals(user.getUserName()) && "jerry".equals(user.getPassword())) {
			RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
		} else if (request.getParameter("submit")!=null)
		{
			out.print("Password and username does not match");
		}
		
	}
%>



	<form method="get">
	<table>
		<tr>
			<td>User Name: </td>
			<td><input type="text" name="username" /></td>
		</tr>
		
		<tr>
			<td>Password</td>
			<td><input type="text" name="password" /></td>
		</tr>
		
		<tr>
			<td><input type="submit" name="login" id="Register" value="login"/></td>		
		</tr>
	</table>
	</form>
</body>
</html>