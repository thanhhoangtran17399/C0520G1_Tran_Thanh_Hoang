<%--
  Created by IntelliJ IDEA.
  User: Thanh Hoang
  Date: 9/6/2020
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Service</h1>
<h2>
    <a href="/HomePage?action=createService">Add New Service</a>
</h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List Of Customer</h2></caption>
        <tr>
            <th>Service Id</th>
            <th>Service Name</th>
            <th>Service Area</th>
            <th>Service Code</th>
            <th>Service Max People</th>
            <th>Rent Type Id</th>
            <th>Service Type Id</th>
            <th>Standard Room</th>
            <th>Description Other Convenionce</th>
            <th>Pool Area</th>
            <th>Number Of Floors</th>

        </tr>
        <c:forEach var="service" items="${serviceList}">
            <tr>
                <td><c:out value="${service.serviceId}"/></td>
                <td><c:out value="${service.serviceName}"/></td>
                <td><c:out value="${service.serviceArea}"/></td>
                <td><c:out value="${service.serviceCode}"/></td>
                <td><c:out value="${service.serviceMaxPeople}"/></td>
                <td><c:out value="${service.rentTypeId}"/></td>
                <td><c:out value="${service.serviceTypeId}"/></td>
                <td><c:out value="${service.standardRoom}"/></td>
                <td><c:out value="${service.descriptionOtherConvenionce}"/></td>
                <td><c:out value="${service.poolArea}"/></td>
                <td><c:out value="${service.numberOfFloors}"/></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>

