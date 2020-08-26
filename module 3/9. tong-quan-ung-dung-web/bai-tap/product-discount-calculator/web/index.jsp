<%--
  Created by IntelliJ IDEA.
  User: Thanh Hoang
  Date: 8/26/2020
  Time: 8:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Discount Calculator</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Discount Calculator</h2>
<form action="calculate" method="post">
  <label>Product Description: </label><br/>
  <input type="text" name="productDescription" placeholder="product description"/><br/>
  <label>list Price: </label><br/>
  <input type="text" name="listPrice" placeholder="list price" value="0"/><br/>
  <label>Discount Percent: </label><br/>
  <input type="text" name="discountPercent" placeholder="discount percent" value="0"/><br/>
  <input type = "submit" id = "submit" value = "Calculater"/>
</form>
</body>
</html>

