<%--
  Created by IntelliJ IDEA.
  User: Thanh Hoang
  Date: 9/27/2020
  Time: 11:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculator">
    <input type="text" name="num1" placeholder="num1">
    <input type="text" name="num2" placeholder="num2">
    <input type="text" name="operator" placeholder="operator">
    <input type="submit" value="Calculator">
</form>
<p>${result}</p>
</body>
</html>
