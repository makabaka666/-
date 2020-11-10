<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/9
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>All</title>
    <link type="text/css" rel="stylesheet" href="/bootstrap/css/bootstrap.min.css"/>
</head>
<body>
<script type="text/javascript" src="static/bootstrap/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="static/bootstrap/js/bootstrap.min.js"></script>
<div >
<table class="table table-hover">
    <tr>
        <th>用户名:</th>
        <th>性别:</th>
        <th>邮箱:</th>
        <th><a href="One.jsp">新增:</a></th>
    </tr>
    <c:forEach items="${list}" var="user">
    <tr>
        <th>${user.u_name}</th>
        <th>${user.u_sex}</th>
        <th>${user.u_email}</th>
        <th><a href="user?action=selectOne&u_id=${user.u_id}">修改</a></th>
        <th><a href="user?action=delete&u_id=${user.u_id}">删除</a></th>
    </tr>
    </c:forEach>
</table>
</div>
</body>
</html>
