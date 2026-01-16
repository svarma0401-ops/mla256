<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	
	 <h1>Welcome to Admin page</h1>
	
	 <c:url value="/logout" var="logoutUrl"></c:url>
	
	 <form id="logout" action="${logoutUrl}" method="post">
	 	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
	 </form>
	
	<c:if test = "${pageContext.request.userPrincipal.name !=null }">
	 <a href="javascript:document.getElementById('logout').submit()">logout</a>
	 </c:if>
</body>
</html>