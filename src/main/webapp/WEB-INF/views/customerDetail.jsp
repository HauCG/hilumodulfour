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
  <title>Customer Detail</title>
</head>
<body>
<h2>Customer Detail</h2>
<p>ID: ${customer.id}</p>
<p>Name: ${customer.name}</p>
<p>Email: ${customer.email}</p>
<p>Address: ${customer.address}</p>
<a href="/customers">Back to List</a>
</body>
</html>