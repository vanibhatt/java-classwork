<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	String message = null;
	String user = request.getParameter("user");
	String password = request.getParameter("password");
	
	if ("tom".equals(user) && "jerry".equals(password)) {
		session.setAttribute("user",user);
		response.sendRedirect("success.jsp");
	} else if (request.getParameter("submit")!=null)
	{
		message = "Password and username does not match";
	}
%>

<%
	if (message!= null) {%>
		<p><%=message %></p>
    <%}%>
	<form method="get">
	
		<input type = "text" name = "user">
		<input type = "password" name = "password">
		<input type = "submit" name = "submit">
	
	</form>

</body>
</html>