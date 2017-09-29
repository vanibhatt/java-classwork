<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page session="true" %>
<%@page errorPage="errorPage.jsp" %>
<%@page import="java.util.Date" %>
<%@page buffer="8kb" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome</title>
</head>
<body>
	<%@include file='header.jsp' %>
	
	<%! String dia =null; %>
	
	<%
	String user = request.getParameter("user");
		if ((user == null) || "".equals(user)) {
			
			throw new Exception("Must provide a user name"); 	
		}
	dia = new Date().toString();
	%>
	
	<%=dia %>
	
	<h1> Welcome <%= user %></h1>
	
	<%@include file='Footer.html' %>
		
	</body>
</html>