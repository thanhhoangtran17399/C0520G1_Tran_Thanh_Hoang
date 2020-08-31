<%--
  Created by IntelliJ IDEA.
  User: Thanh Hoang
  Date: 8/30/2020
  Time: 7:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
<h1 style="text-align: center">Products Mangagement</h1>
<p>
    <a href="/productServlet?action=search" style="color: rgba(0,0,0,0.5)">Search By Name</a>
</p>
<p>
    <a href="/productServlet?action=create" style="color: rgba(0,0,0,0.49)">Create new product</a>
</p>
<p style="color: green">${message}</p>
<table border="2" style="border-collapse: collapse; text-align: center" width=100% >
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Price</th>
        <th>Product Description</th>
        <th>Producer</th>
        <th colspan="2">Action</th>
    </tr>
    <c:forEach var="product" items="${listProduct}">
        <tr>
            <td>${product.id}</td>
            <td><a href="/productServlet?action=detail&id=${product.id}">${product.name}</a></td>
            <td>${product.price}</td>
            <td>${product.productDescription}</td>
            <td>${product.producer}</td>
            <td><a href="/productServlet?action=update&id=${product.id}">Update</a></td>
            <td><a href="/productServlet?action=delete&id=${product.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
