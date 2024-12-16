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
    <title>Edit Customer</title>
</head>
<body>
<h2>Edit Customer</h2>
<form action="/customers/edit/${customer.id}" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" value="${customer.name}" required><br>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" value="${customer.email}" required><br>
    <label for="address">Address:</label>
    <input type="text" id="address" name="address" value="${customer.address}" required><br>
    <input type="submit" value="Update Customer">
</form>
<a href="/customers">Back to List</a>
</body>
</html>