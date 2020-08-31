<%--
  Created by IntelliJ IDEA.
  User: Thanh Hoang
  Date: 8/30/2020
  Time: 11:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<form action="/productServlet" method="post">
    <input type="hidden" name="action" value="update">
    <input type="hidden" name="id" value="${product.id}">
    <label>Name: </label>
    <input type="text" name="name" value="${product.name}"><br>
    <label>Price: </label>
    <input type="text" name="price" value="${product.price}"><br>
    <label>Product Description: </label>
    <input type="text" name="productDescription" value="${product.productDescription}"><br>
    <label>Producer: </label>
    <input type="text" name="producer" value="${product.producer}"><br>
    <input type="submit" value="Update">
</form>
</body>
</html>
