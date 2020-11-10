<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/9
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="user" method="post">
    <input type="hidden" name="action" value="update">
    <input type="hidden" name="id" value="${user.u_id}">
    姓名:<input type="text" id="u_name" name="u_name" value="${user.u_name}"><br>
    性别:<input type="text" id="u_sex"  name="u_sex" value="${user.u_sex}"><br>
    邮箱:<input type="text" id="u_email" name="u_email" value="${user.u_email}"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
