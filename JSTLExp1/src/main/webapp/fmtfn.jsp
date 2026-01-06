<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri = "jakarta.tags.core" prefix = "c" %>
    <%@ taglib uri = "jakarta.tags.functions" prefix = "fn" %>
    <%@ taglib uri = "jakarta.tags.fmt" prefix = "fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Format and Function Tags</h1>
 
	<c:set var="balance" value="34234.3232"></c:set>
	
	<fmt:parseNumber var="parseNum" type="number" value="${balance}"></fmt:parseNumber>
	<c:out value="${parseNum}"></c:out><br><br>
	
	<c:set var="today" value="<%= new Date() %>"></c:set>
	<c:out value="${today}"></c:out><br><br>
	
	<strong>
		<fmt:formatDate var="date" type="date" pattern="dd-mm-yyyy" value="${today}"/><br>
		<fmt:formatDate var="time" type="time" value="${today}"/>
		<c:out value="${date}"></c:out><br>
		<c:out value="${time}"></c:out><br>
		<fmt:formatDate type="both" value="${today}"/>
		<c:out value="${date}"></c:out><br><br>
	</strong>
	
	<c:set var="data" value="This is a simple JSTL, JSP, Servlets data functions example"></c:set>
	
	<c:if test="${fn:contains(data, 'JSP')}">
		<c:out value="${data}"></c:out>
		<p>The above data contains the JSP word</p>
	</c:if>
	
	<c:out value="${fn.toUpperCase(data)}"></c:out>
	
</body>
</html>