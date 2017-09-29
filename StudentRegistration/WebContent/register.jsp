<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="StudentServlet?action=register" method="post">
		<label>First Name</label>
		<input type="text" name="f_name"/>
		<label>Last Name</label>
		<input type="text" name="l_name"/>
		<label>Password</label>
		<input type="password" name="password"/>
		<input type="submit" name="submit" value="submit"/>
	</form>
	<a href="login.jsp">Login</a>
</body>
</html>