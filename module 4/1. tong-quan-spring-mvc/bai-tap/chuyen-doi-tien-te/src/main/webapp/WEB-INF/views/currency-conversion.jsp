<%--
  Created by IntelliJ IDEA.
  User: Thanh Hoang
  Date: 9/16/2020
  Time: 3:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/Converter">
    <label>Rate: </label>
    <input type="text" name="rate" placeholder="Rate" value="22000"><br>
    <label>USD: </label>
    <input type="text" name="usd" placeholder="USD" value="0"><br>
    <p>Result : ${result}</p>
    <input type="submit" id="submit" value="Converter">
</form>
</body>
</html>
