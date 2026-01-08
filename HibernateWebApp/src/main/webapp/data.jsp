<%@page import="com.test.Customer"%>
<%@page import="com.test.CustomerDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String i = request.getParameter("id");
    	System.out.println("Your ID : " +i);
    	
    	if(i.equals("")){
    		out.println("The Given Id is null/ You Didnt Enter ID");
    	}
    	
    	int id = Integer.parseInt(i);
    	Customer cst = Customer.fetchCustomerById(id);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CUSTOMER</title>
</head>
<body>
		<table border = "1" align = "center">
		<thead>
			<tr>
			<th>Id</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Location</th>
	         </tr>	
		</thead>
		<tbody>
		<tr> 
		   <td><%= cst.getId() %></td>
		   <td><%= cst.getFirstName() %></td>
		   <td><%= cst.getLastName() %></td>
		   <td><%= cst.getLocation() %></td>
		</tr>
		</tbody>
		</table>
</body>
</html>