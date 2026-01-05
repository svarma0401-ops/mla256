<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> JSP Tags Example </h1>

<!--  Declaration tag -->

			<%!
			int x =30;
			int y = 50;
			public int add(){
				return x+y;
			}
			
			String str = "java";
			%>
			
			<!--  Expression tag -->
			<p>Sum of x and y: <%= add() %> </p>
			
			<!-- scriplet tag -->
			
			<% 
			out.println("Current Date : " +new Date());
			%>
			<br>
			<%
			out.println("Test");
			%>
			
</body>
</html>