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
<h1>List Contract</h1>
<h2>
    <a href="/HomePage?action=createContract">Add New Contract</a>
</h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List Of Contract</h2></caption>
        <tr>
            <th>contract id</th>
            <th>contract start date</th>
            <th>contract end date</th>
            <th>contract deposit</th>
            <th>contract total money</th>
            <th>employee id</th>
            <th>customer id</th>
            <th>service id</th>

        </tr>
        <c:forEach var="contractDetail" items="${contractList}">
            <tr>
                <td><c:out value="${contractDetail.contractId}"/></td>
                <td><c:out value="${contractDetail.contractStartDate}"/></td>
                <td><c:out value="${contractDetail.contractEndDate}"/></td>
                <td><c:out value="${contractDetail.contractDeposit}"/></td>
                <td><c:out value="${contractDetail.contractTotalMoney}"/></td>
                <td><c:out value="${contractDetail.employeeId}"/></td>
                <td><c:out value="${contractDetail.customerId}"/></td>
                <td><c:out value="${contractDetail.serviceId}"/></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
</body>
</html>
