<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri = "jakarta.tags.core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<c:set var = "age" value="${19}"></c:set>
		<c:out value = "${age}"> </c:out>
		
		<c:if test="${age == 18 }">
			<c:out value="eligible"></c:out>
		</c:if>
		
		<c:choose>
			<c:when test="${age == 18}">
				<c:out value="eligible"></c:out>
			</c:when>
			<c:otherwise>
				<c:out value="not eligible"></c:out>
			</c:otherwise>
		</c:choose>
		
		<c:out value = "${age}"> </c:out>
		<c:remove var="age"/>
		<c:out value = "${age}"> </c:out>
		<br><br>
		
		<c:forEach var="i" begin="1" end="10">
			<c:out value="${i}"></c:out><br>
		</c:forEach>
		<br><br>
		
		<c:forTokens items="Rohit, Kohli, Sky, Arshdeep, Axar" delims="," var="team">
			<c:out value="${team}"></c:out><br>
		</c:forTokens>
		
		
</body>
</html>
 