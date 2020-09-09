<%--
  Created by IntelliJ IDEA.
  User: Thanh Hoang
  Date: 9/7/2020
  Time: 1:47 PM
  To change this template use File | Settings | File Templates.
--%>
%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.min.css"/>
</head>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Contract</h1>
<h2>
    <a href="/HomePage?action=createContract">Add New Contract</a>
</h2>
<button><a href="/HomePage?action=listContractDetail">ContractDetail</a></button>
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <table id="table" class="table table-striped table-bordered" style="width:100%">
                <thead>
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
                </thead>
                <tbody>
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
