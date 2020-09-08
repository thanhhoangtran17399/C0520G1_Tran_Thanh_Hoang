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
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.min.css"/>
</head>
<body>
<h1>Customer Management</h1>

<form action="/HomePage?action=search">
    <h3>Search by id</h3><br>
    <input type="hidden" name="action" value="search">
    <input type="submit" value="search">
    <input type="text" name="customerId">
</form>

<h2>
    <a href="/HomePage?action=createCustomer">Add New Customer</a>
</h2>
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <table id="tableCustomer" class="table table-striped table-bordered" style="width:100%">
                <thead>
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
                    <th>Update</th>
                    <th>Delete</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="customerUsingService" items="${customerList}">
                    <tr>
                        <td><c:out value="${customerUsingService.customerId}"/></td>
                        <td><c:out value="${customerUsingService.customerTypeId}"/></td>
                        <td><c:out value="${customerUsingService.customerName}"/></td>
                        <td><c:out value="${customerUsingService.customerBirthday}"/></td>
                        <td><c:out value="${customerUsingService.customerGender}"/></td>
                        <td><c:out value="${customerUsingService.customerIdCard}"/></td>
                        <td><c:out value="${customerUsingService.customerPhone}"/></td>
                        <td><c:out value="${customerUsingService.customerEmail}"/></td>
                        <td><c:out value="${customerUsingService.customerAddress}"/></td>
                        <td>
                            <a href="/HomePage?action=update&customerId=${customerUsingService.customerId}">Update</a>
                        </td>
                        <td>
                            <a href="/HomePage?action=delete&customerId=${customerUsingService.customerId}">Delete</a>
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
        $('#tableCustomer').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>
</body>
</html>
