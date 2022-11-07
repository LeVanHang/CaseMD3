<%--
  Created by IntelliJ IDEA.
  User: sangpk
  Date: 31/10/2022
  Time: 8:59:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        .container mt-3 {
            margin: 0 auto;
        }
        .table table-dark th td{
            text-align: center;
        }
        .table table-dark td{
            padding-bottom: 5px;
        }
    </style>
</head>
<body>
<div class="container mt-3">
    <h2>Danh Sách Sản Phẩm</h2>
    <a type="button" href="/createProduct.jsp"> create</a>
    <table class="table table-dark">
        <thead>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>img</th>
            <th>price</th>
            <th>edit</th>
            <th>delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${sanphams}" var="sp">
            <tr>
                <td>${sp.id}</td>
                <td>${sp.name}</td>
                <td><img src="${sp.img}" height="200" width="250"></td>
                <td>${sp.price}</td>
                <td><a type="button" class="btn btn-danger" href="/edit?id=${sp.id}">Edit</a></td>
                <td><a type="button" class="btn btn-success" href="/delete?name=${sp.name}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
