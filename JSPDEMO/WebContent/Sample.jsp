<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
	int count = 0;
	int Counter(){
		count++;
		return count;
	}
	%>
	<h1>Sample Page</h1>
	
	<h2>This page is viewed <%=Counter() %> times</h2>
	
	<%
	int localVar = 20;
	    localVar++;
	%>
	
	<p> The variable value is <%=localVar %> times</h2>
	
</body>
</html>