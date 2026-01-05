<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*,com.test.*" %>
<html>
<body>
<h2>Employee List</h2>

<table border="1">
<tr>
<th>ID</th><th>Name</th><th>Salary</th><th>Department</th><th>Action</th>
</tr>

<%
    EmployeeDao dao = new EmployeeDaoImpl();
    for(Employee e : dao.getAllEmployee()) {
%>
<tr>
<td><%= e.getId() %></td>
<td><%= e.getName() %></td>
<td><%= e.getSalary() %></td>
<td><%= e.getDepartment() %></td>
<td>
<form action="employee" method="post">
    <input type="hidden" name="action" value="delete">
    <input type="hidden" name="id" value="<%= e.getId() %>">
    <input type="submit" value="Delete">
</form>
</td>
</tr>
<% } %>

</table>
</body>
</html>
