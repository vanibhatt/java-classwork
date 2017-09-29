<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
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
	
	<%
		java.util.Calendar calendar = new java.util.GregorianCalendar();
		java.util.Date date = calendar.getTime();
		java.text.SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		String dateval=format.format(date);
		String WelcomeMessage;
		String spaces = "                                                    ";
		int hour = calendar.get(calendar.HOUR_OF_DAY);
		if ( hour < 12) {
			WelcomeMessage = "Good Morning ";
		}
		
		else 
			{
			WelcomeMessage = "Good Evening ";
			};
		
		
	%>
	
	<h1> Z Bank - Your Perfect Bank  </h1>
	
	<h2><%=WelcomeMessage%><%=dateval%></h2>
	
	<h2>Thanks for your great support </h2>
	
	<h2>You are our valuable visitor number : <%=Counter() %> </h2>
	
	
	
</body>
</html>