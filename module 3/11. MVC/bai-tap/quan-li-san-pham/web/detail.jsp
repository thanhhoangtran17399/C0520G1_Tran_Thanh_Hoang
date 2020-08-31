<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail</title>
</head>
<body>
    <label>Id: </label>
    <c:out value="${product.id}"></c:out><br>
    <label>Name: </label>
    <c:out value="${product.name}"></c:out><br>
    <label>Price: </label>
    <c:out value="${product.price}"></c:out><br>
    <label>Product Description: </label>
    <c:out value="${product.productDescription}"></c:out><br>
    <label>Producer: </label>
    <c:out value="${product.producer}"></c:out><br>
</body>
</html>
