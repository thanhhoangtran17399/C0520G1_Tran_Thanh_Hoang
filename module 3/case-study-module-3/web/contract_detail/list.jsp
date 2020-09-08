<%--
  Created by IntelliJ IDEA.
  User: Thanh Hoang
  Date: 9/7/2020
  Time: 1:47 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Contract Detail</h1>
<h2>
    <a href="/HomePage?action=createContractDetail">Add New Contract Detail</a>
</h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List Of Contract Detail</h2></caption>
        <tr>
            <th>contract detail id</th>
            <th>contract id</th>
            <th>attach service id</th>
            <th>quanlity</th>

        </tr>
        <c:forEach var="contractDetail" items="${contractDetailList}">
            <tr>
                <td><c:out value="${contractDetail.contractDetailId}"/></td>
                <td><c:out value="${contractDetail.contractId}"/></td>
                <td><c:out value="${contractDetail.attachServiceId}"/></td>
                <td><c:out value="${contractDetail.quanlity}"/></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
</body>
</html>

