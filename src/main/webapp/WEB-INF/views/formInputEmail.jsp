<%--
  Created by IntelliJ IDEA.
  User: maitr
  Date: 12/16/2024
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>formInputEmail</title>
</head>
<body>
<form method="post">
    <label for="email">Email:</label>
    <input type="text" name="email" id="email" placeholder="Your email here to check!">
    <input type="submit" value="Check">
</form>

<p>${mgs}</p>
</body>
</html>

