<%--
  Created by IntelliJ IDEA.
  User: maitr
  Date: 12/16/2024
  Time: 3:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>showSpices</title>
</head>
<body>
<form method="post" action="/caculating">
    <input type="number"  name="numOne" placeholder="Nhập số thứ 1: " >
    <select name="mark" id="mark">
        <option name="mark" value="cong"> + </option>
        <option name="mark" value="tru"> - </option>
        <option name="mark" value="nhan"> x </option>
        <option name="mark" value="chia"> : </option>
    </select>
    <input type="number"  name="numTwo" placeholder="Nhập số thứ 2: " >
    <input type="submit" value=" = ">
    <span>${result}</span>

</form>
</body>
</html>



