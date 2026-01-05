<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="com.test.*" %>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    EmployeeDao dao = new EmployeeDaoImpl();
    Employee emp = null;

    for (Employee e : dao.getAllEmployee()) {
        if (e.getId() == id) {
            emp = e;
            break;
        }
    }
%>

<html>
<body>
<h2>Edit Employee</h2>

<form action="employee" method="post">
    <input type="hidden" name="action" value="update">

    ID:
    <input type="text" name="id" value="<%= emp.getId() %>" readonly><br><br>

    Name:
    <input type="text" name="name" value="<%= emp.getName() %>"><br><br>

    Salary:
    <input type="text" name="salary" value="<%= emp.getSalary() %>"><br><br>

    Department:
    <input type="text" name="department" value="<%= emp.getDepartment() %>"><br><br>

    <input type="submit" value="Update Employee">
</form>

<br>
<a href="viewEmployees.jsp">Back to Employee List</a>
</body>
</html>
