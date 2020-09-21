<jsp:useBean id="condiment" scope="request" type="java.util.List"/>
<%--
  Created by IntelliJ IDEA.
  User: Thanh Hoang
  Date: 9/21/2020
  Time: 8:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Your choice with sandwich</h3>
    <p>${condiment[0]}</p>
    <p>${condiment[1]}</p>
    <p>${condiment[2]}</p>
    <p>${condiment[3]}</p>
</body>
</html>
