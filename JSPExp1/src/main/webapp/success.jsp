<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Login Successfully</h1>

<%
			String usr = (String) session.getAttribute("info");
			String dt = (String) application.getAttribute("userinfo");
			
			out.println("SESSION OBJECT DATA : " +usr);
			out.println("<br><br>Context Object Data: " +dt);
%>
</body>
</html>