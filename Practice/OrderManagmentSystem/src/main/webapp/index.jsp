<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="com.test.OrderMain" %>

<html>
<head>
    <title>Order Management</title>
</head>
<body>

<h2>Order Management Application</h2>

<!-- Add Order Form -->
<h3>Add Order</h3>
<form action="order" method="post">
    Product Name: <input type="text" name="productName" /><br><br>
    Quantity: <input type="number" name="quantity" /><br><br>
    Price: <input type="text" name="price" /><br><br>
    <input type="submit" value="Add Order" />
</form>

<hr>

<!-- Order List -->
<h3>Order List</h3>

<table border="1" cellpadding="5">
    <tr>
        <th>ID</th>
        <th>Product</th>
        <th>Quantity</th>
        <th>Price</th>
        <th>Action</th>
    </tr>

<%
    List<OrderMain> orders = (List<OrderMain>) request.getAttribute("orders");
    if (orders != null) {
        for (OrderMain o : orders) {
%>
    <tr>
        <td><%= o.getId() %></td>
        <td><%= o.getProductName() %></td>
        <td><%= o.getQuantity() %></td>
        <td><%= o.getPrice() %></td>
        <td>
            <a href="order?action=delete&id=<%= o.getId() %>">Delete</a>
        </td>
    </tr>
<%
        }
    }
%>

</table>

</body>
</html>
