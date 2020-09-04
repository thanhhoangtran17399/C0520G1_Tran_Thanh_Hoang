<%--
  Created by IntelliJ IDEA.
  User: Thanh Hoang
  Date: 9/2/2020
  Time: 8:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
    <div class="container-fluid">
        <div class="row" style="background: #c9d6df">
            <div class="col-lg-3">
                <img src="../../case-study-module-3/logo.png" height="60" width="50" style="margin-left: 20px"/>
            </div>
            <div class="col-lg-9">
                <h5 style="margin-left: 600px">Tran Thanh Hoang</h5>
            </div>
        </div>
    </div>


    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <nav class="navbar navbar-expand-lg navbar-light bg-light">

                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav mr-auto">
                            <li class="nav-item active">
                                <a class="nav-link" href="#">Home<span class="sr-only">(current)</span></a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" href="#">Employee</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" href="/HomePage?action=listCustomer">Customer</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" href="#">Service</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" href="#">Contract</a>
                            </li>
                        </ul>
                        <form class="form-inline my-2 my-lg-0">
                            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                        </form>
                    </div>
                </nav>
            </div>
        </div>
    </div>

    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-3" style="background: #6c757d">
                <p>list</p>
            </div>
            <div class="col-lg-9">
                <div class="image">
                    <img src="../../case-study-module-3/furama-resort.jpg" height="600" width="840"/></div>
            </div>
        </div>
    </div>

    <div class="container-fluid">
        <div class="row" style="background: #4e555b">
            <div class="col-lg-12">
                <p style="text-align: center">footer</p>
            </div>
        </div>
    </div>
</body>
</html>
