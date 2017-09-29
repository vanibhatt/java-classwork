<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.beans.demo.Employee" %>
<jsp:useBean id="useBean" class="com.beans.demo.Employee" scope="request" />
<jsp:setProperty property="*" name="useBean"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<% if(request.getParameter("Register")!= null){
%>
	<jsp:forward page="Success.jsp">
	<jsp:param value="Registration Success" name="message" /></jsp:forward>
<% } %>

<body>
     
    <form method="get">
        <label for="firstName">First Name</label>
        <input name="firstName" id="First" type="text"><br>
        <label for="lastName">Last Name</label>
        <input name="lastName" id="Last" type="text"><br>
        <label for="password">Password</label>
        <input name="password" id="pass" type="password"><br>
        <label for="userName">User Name</label>
        <input name="userName" id="user" type="text"><br>
        
        <label>Gender</label>
        <input name="Gender" type="radio" value="Male"><span>Male</span>
        <input name="Gender" type="radio" value="Female" style="margin-left: 10px;" ><span>Female</span><br>
        
        <label>Hobbies</label>
        <input name="hobbies" type="checkbox" value="Baseball"><span>Baseball</span>
        <input name="hobbies" type="checkbox" value="Ps4" style="margin-left: 10px;" ><span>PS4</span>
        <input name="hobbies" type="checkbox" value="Coding" style="margin-left: 10px;"><span>Coding</span>
        <input name="hobbies" type="checkbox" value="Watching Shark Tank" style="margin-left: 10px;" ><span>Watching Shark Tank</span>
        <br>
        <label>Designation</label>
        <select name="Designation">
            <option value="1">Manager</option>
            <option value="2">Trainee</option>
            <option value="3">Developer</option>
        </select>
        <br>
        <input name="Register" type="submit" value="Register">
    </form>
</body>
</html>
