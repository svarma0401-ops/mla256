<!DOCTYPE html>
<html>
<body>

<h2 align="center">Delete Employee</h2>

<%
    String msg = request.getParameter("msg");
    if ("deleted".equals(msg)) {
%>
<p align="center" style="color:green;">Employee deleted successfully!</p>
<% } %>

<form action="employee" method="post" align="center">
    <input type="hidden" name="action" value="delete">
    <table>
        <tr><td>Employee ID</td><td><input type="text" name="id" required></td></tr>
        <tr><td colspan="2" align="center"><input type="submit" value="Delete Employee"></td></tr>
    </table>
</form>

<div align="center">
    <br><a href="index.jsp">Back to Home</a>
</div>

</body>
</html>
