<%--
  Created by IntelliJ IDEA.
  User: sangpk
  Date: 31/10/2022
  Time: 10:11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <form action="/edit" method="post">
        <table>
            <tr>
                <td>nhập ID</td>
                <td><input type="text" name="id" value="${p.id}" readonly ></td>
            </tr>
            <tr>
                <td>nhập name</td>
                <td><input type="text" name="name" value="${p.name}"  ></td>
            </tr>
            <tr>
                <td>nhập ảnh</td>
                <td><input type="text" name="img" value="${p.img}" ></td>
            </tr>
            <tr>
                <td>nhập Price</td>
                <td><input type="text" name="price" value="${p.price}" ></td>
            </tr>
        </table>
        <button type="submit"> Submit</button>
    </form>
</div>
</body>
</html>
