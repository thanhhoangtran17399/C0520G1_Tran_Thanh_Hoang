<%--
  Created by IntelliJ IDEA.
  User: Thanh Hoang
  Date: 8/27/2020
  Time: 2:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>c:catch example</title>
</head>
<body>
<h2>c:catch example</h2>
<c:catch var ="ex">
  <%
    int a = 100/0;
  %>
</c:catch>
<c:if test = "${ex != null}">
  Exception : ${ex}
  <br />
  Message: ${ex.message}
</c:if>
</body>
</html> 