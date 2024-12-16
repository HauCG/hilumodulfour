<%--
  Created by IntelliJ IDEA.
  User: maitr
  Date: 12/16/2024
  Time: 2:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Customer</title>
</head>
<body>
<h2>Add New Customer</h2>
<form action="/customers/add" method="post">
    <input type="hidden" id="id" name="id" value="0">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required><br>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required><br>
    <label for="address">Address:</label>
    <input type="text" id="address" name="address" required><br>
    <input type="submit" value="Add Customer">
</form>
<a href="/customers">Back to List</a>
</body>
</html>