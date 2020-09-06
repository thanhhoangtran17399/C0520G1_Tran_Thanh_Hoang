<%--
  Created by IntelliJ IDEA.
  User: Thanh Hoang
  Date: 9/4/2020
  Time: 11:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Customer Management</h1>

<form action="/HomePage?action=search">
    <h3>Search by country</h3><br>
    <input type="hidden" name="action" value="search">
    <input type="submit" value="search">
    <input type="text" name="customerId">
</form>

<h2>
    <a href="/HomePage?action=createCustomer">Add New Customer</a>
</h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List Of Customer</h2></caption>
        <tr>
            <th>Customer Id</th>
            <th>Customer Type Id</th>
            <th>Customer Name</th>
            <th>Customer Birthday</th>
            <th>Customer Gender</th>
            <th>Customer Id Card</th>
            <th>Customer Phone</th>
            <th>Customer Email</th>
            <th>Customer Address</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="customer" items="${customerList}">
            <tr>
                <td><c:out value="${customer.customerId}"/></td>
                <td><c:out value="${customer.customerTypeId}"/></td>
                <td><c:out value="${customer.customerName}"/></td>
                <td><c:out value="${customer.customerBirthday}"/></td>
                <td><c:out value="${customer.customerGender}"/></td>
                <td><c:out value="${customer.customerIdCard}"/></td>
                <td><c:out value="${customer.customerPhone}"/></td>
                <td><c:out value="${customer.customerEmail}"/></td>
                <td><c:out value="${customer.customerAddress}"/></td>
                <td>
                    <a href="/HomePage?action=update&customerId=${customer.customerId}">Update</a>
                    <a href="/HomePage?action=delete&customerId=${customer.customerId}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
