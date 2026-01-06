<%@ page import="com.test.*" %>
<!DOCTYPE html>
<html>
<body>

<h2 align="center">Add Employee</h2>

<%
    String msg = request.getParameter("msg");
    if ("added".equals(msg)) {
%>
<p align="center" style="color:green;">Employee added successfully!</p>
<% } %>

<form action="employee" method="post" align="center">
    <input type="hidden" name="action" value="add">
    <table>
        <tr><td>Employee ID</td><td><input type="text" name="id"></td></tr>
        <tr><td>Name</td><td><input type="text" name="name"></td></tr>
        <tr><td>Salary</td><td><input type="text" name="salary"></td></tr>
        <tr><td>Department</td><td><input type="text" name="department"></td></tr>
        <tr><td colspan="2" align="center"><input type="submit" value="Add Employee"></td></tr>
    </table>
</form>

<div align="center">
    <br><a href="index.jsp">Back to Home</a>
</div>

</body>
</html>
