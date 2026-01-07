<%@ page import="com.test.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<body>

<h2 align="center">Employee List</h2>

<%
    EmployeeDao dao = new EmployeeDaoImpl();
    List<Employee> employees = dao.getAllEmployee();

    String msg = request.getParameter("msg");
    if (msg != null) {
        if ("deleted".equals(msg)) {
%>
<p align="center" style="color:green;">Employee deleted successfully</p>
<%
        } else if ("updated".equals(msg)) {
%>
<p align="center" style="color:green;">Employee updated successfully</p>
<%
        } else if ("added".equals(msg)) {
%>
<p align="center" style="color:green;">Employee added successfully</p>
<%
        }
    }
%>

<table border="1" cellpadding="5" cellspacing="0" align="center">
    <tr>
        <th>Employee ID</th>
        <th>Name</th>
        <th>Salary</th>
        <th>Department</th>
    </tr>

<% for (Employee e : employees) { %>
    <tr>
        <td><%= e.getId() %></td>
        <td><%= e.getName() %></td>
        <td><%= e.getSalary() %></td>
        <td><%= e.getDepartment() %></td>
    </tr>
<% } %>

</table>

<br>
<div align="center">
    <a href="index.jsp">Back to Home</a> | 
    <a href="addEmployee.jsp">Add New Employee</a>
</div>

</body>
</html>
