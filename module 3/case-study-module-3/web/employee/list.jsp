<%--
  Created by IntelliJ IDEA.
  User: Thanh Hoang
  Date: 9/6/2020
  Time: 7:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<h1>List Employee</h1>
<form action="/HomePage?action=searchEmployee">
    <h3>Search by id</h3><br>
    <input type="hidden" name="action" value="search">
    <input type="submit" value="search">
    <input type="text" name="employeeId">
</form>
<h2>
    <a href="/HomePage?action=createEmployee">Add New Employee</a>
</h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List Of Employee</h2></caption>
        <tr>
            <th>Employee Id</th>
            <th>Employee Name</th>
            <th>Employee Birthday</th>
            <th>Employee Id Card</th>
            <th>Employee Salary</th>
            <th>Employee Phone</th>
            <th>Employee Email</th>
            <th>Employee Address</th>
            <th>Position Id</th>
            <th>Education Degree Id</th>
            <th>Division Id</th>
            <th>Username</th>

        </tr>
        <c:forEach var="employee" items="${employeeList}">
            <tr>
                <td><c:out value="${employee.employeeId}"/></td>
                <td><c:out value="${employee.employeeName}"/></td>
                <td><c:out value="${employee.employeeBirthday}"/></td>
                <td><c:out value="${employee.employeeIdCard}"/></td>
                <td><c:out value="${employee.employeeSalary}"/></td>
                <td><c:out value="${employee.employeePhone}"/></td>
                <td><c:out value="${employee.employeeEmail}"/></td>
                <td><c:out value="${employee.employeeAddress}"/></td>
                <td><c:out value="${employee.positionId}"/></td>
                <td><c:out value="${employee.educationDegreeId}"/></td>
                <td><c:out value="${employee.divisionId}"/></td>
                <td><c:out value="${employee.username}"/></td>
                <td>
                    <a href="/HomePage?action=updateEmployee&employeeId=${employee.employeeId}">Update</a>
                    <a href="/HomePage?action=deleteEmployee&employeeId=${employee.employeeId}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
</body>
</html>
