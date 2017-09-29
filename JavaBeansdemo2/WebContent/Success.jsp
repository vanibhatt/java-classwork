<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="usebean" class="com.beans.demo.Employee" scope="request"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String designation = request.getParameter("Designation");
if("1".equals(designation)){
%>
<jsp:include page="managersHeading.jsp"></jsp:include>
<%} %>
<%
if("2".equals(designation)){
%>
<jsp:include page="traineesHeading.jsp"></jsp:include>
<%} %>
<% 
if("3".equals(designation)){
%>
<jsp:include page="developersHeading.jsp"></jsp:include>
<%} %>
<h1>success page is here</h1>
</body>
</html>