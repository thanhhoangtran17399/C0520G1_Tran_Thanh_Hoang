<%--
  Created by IntelliJ IDEA.
  User: Thanh Hoang
  Date: 9/8/2020
  Time: 11:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.min.css"/>
</head>
<body>

<h1>Customer using service</h1>

<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <table id="table" class="table table-striped table-bordered" style="width:100%">
                <thead>
                <tr>
                    <th>Customer Id</th>
                    <th>Customer Name</th>
                    <th>Service Id</th>
                    <th>Service Name</th>
                    <th>Contract Id</th>
                    <th>Attach Service Name</th>
                    <th>Update Service</th>
                    <th>Delete Service</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="customerUsingService" items="${customerUsingServiceList}">
                    <tr>
                        <td><c:out value="${customerUsingService.customerId}"/></td>
                        <td><c:out value="${customerUsingService.customerName}"/></td>
                        <td><c:out value="${customerUsingService.serviceId}"/></td>
                        <td><c:out value="${customerUsingService.serviceName}"/></td>
                        <td><c:out value="${customerUsingService.contractId}"/></td>
                        <td><c:out value="${customerUsingService.attachServiceName}"/></td>
                        <td>
                            <a href="">Update</a>
                        </td>
                        <td>
                            <a href="">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../datatables/js/jquery.dataTables.min.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#table').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>
</body>
</html>

