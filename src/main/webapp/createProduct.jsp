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
  <form action="/create">
    <table>
      <tr>
        <td>nhập ID</td>
        <td><input type="text" name="id" placeholder="nhập id"></td>
      </tr>
      <tr>
        <td>nhập name</td>
        <td><input type="text" name="name" placeholder="nhập tên sản phẩm"></td>
      </tr>
      <tr>
        <td>nhập ảnh</td>
        <td><input type="text" name="img" placeholder="nhập hình ảnh"></td>
      </tr>
      <tr>
        <td>nhập Price</td>
        <td><input type="text" name="price" placeholder="nhập giá"></td>
      </tr>

    </table>
    <button type="submit"> Submit</button>
  </form>
</div>
</body>
</html>
