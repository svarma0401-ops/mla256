<%@ page import="com.test.*" %>
<!DOCTYPE html>
<html>
<body>

<h2 align="center">Update Employee</h2>

<%
    String msg = request.getParameter("msg");
    if ("updated".equals(msg)) {
%>
<p align="center" style="color:green;">Employee updated successfully!</p>
<% } %>

<!-- STEP 1: SEARCH BY ID -->
<form method="get" action="editEmployee.jsp" align="center">
    <table>
        <tr>
            <td>Employee ID</td>
            <td><input type="text" name="id" required></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="Search"></td>
        </tr>
    </table>
</form>

<br>

<%
    Employee emp = null;
    String idParam = request.getParameter("id");
    if (idParam != null && !idParam.isEmpty()) {
        int id = Integer.parseInt(idParam);
        EmployeeDao dao = new EmployeeDaoImpl();
        for (Employee e : dao.getAllEmployee()) {
            if (e.getId() == id) {
                emp = e;
                break;
            }
        }
        if (emp == null) {
%>
<p align="center" style="color:red;">Employee not found!</p>
<%
        }
    }
%>

<% if (emp != null) { %>
<!-- STEP 2: SHOW UPDATE FORM -->
<form action="employee" method="post" align="center">
    <input type="hidden" name="action" value="update">
    <table>
        <tr><td>Employee ID</td><td><input type="text" name="id" value="<%= emp.getId() %>" readonly></td></tr>
        <tr><td>Name</td><td><input type="text" name="name" value="<%= emp.getName() %>"></td></tr>
        <tr><td>Salary</td><td><input type="text" name="salary" value="<%= emp.getSalary() %>"></td></tr>
        <tr><td>Department</td><td><input type="text" name="department" value="<%= emp.getDepartment() %>"></td></tr>
        <tr><td colspan="2" align="center"><input type="submit" value="Update Employee"></td></tr>
    </table>
</form>
<% } %>

<div align="center">
    <br><a href="index.jsp">Back to Home</a>
</div>

</body>
</html>
