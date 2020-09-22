<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Thanh Hoang
  Date: 9/22/2020
  Time: 7:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email Configuration</title>
</head>
<body>
<h1>Settings</h1>
<form:form modelAttribute="emailConfiguration" method="post" action="/emailConfig/result">
    <table>
        <tr>
            <td><form:label path="language">Languages</form:label></td>
            <td>
                <form:select path="language" >
                    <form:options items="${languageList}"/>
                </form:select>
            </td>
        </tr>
        <tr>
            <td><form:label path="pageSize">Page Size</form:label></td>
            <td>
                <span>Show</span>
                <span>
                <form:select path="pageSize">
                    <form:options  items="${pageSizeList}" />
                </form:select>
                </span>
                <span>emails per page</span>
            </td>
        </tr>
        <tr>
            <td><form:label path="spamFilter">Spams Filter</form:label></td>
            <td><form:checkbox path="spamFilter" value="Enable Spams Filter"/></td>
        </tr>
        <tr>
            <td><form:label path="signature">Signature</form:label></td>
            <td><form:textarea path="signature"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Update"></td>
            <td><a href="/emailConfig/showEmailConfig">Cancel</a></td>
        </tr>
    </table>
</form:form>
</body>
</html>
