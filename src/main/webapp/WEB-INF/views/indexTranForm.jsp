<%--
  Created by IntelliJ IDEA.
  User: maitr
  Date: 12/16/2024
  Time: 10:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>


<!DOCTYPE html>
<html>
<head>
    <title>Ứng dụng Từ điển</title>
</head>
<body>
<h1>Tra cứu từ điển Anh - Việt</h1>
<form action="/translate" method="get">
    <input type="text" name="word" placeholder="Nhập từ cần tra cứu" />
    <button type="submit">Tìm kiếm</button>
</form>
<p>${message}</p>
</body>
</html>

