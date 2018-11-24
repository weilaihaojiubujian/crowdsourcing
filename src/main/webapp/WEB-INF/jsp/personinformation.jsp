<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/11/24
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>个人信息</title>
</head>
<body>

<h1>个人</h1>
<table class="table table-bordered table-hover table-striped">
    <tr>
        <th>序号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>手机号</th>
        <th>名字</th>
        <th>性别</th>
        <th>所在城市</th>
        <th>生日</th>
        <th>身份证号</th>

    </tr>

        <tr>
            <td>${person.id}</td>
            <td><c:out value="${person.username}"></c:out></td>
            <td><c:out value="${person.password}"></c:out></td>
            <td><c:out value="${person.phonenumber}"></c:out></td>
            <td><c:out value="${person.name}"></c:out></td>
            <td><c:out value="${person.sex}"></c:out></td>
            <td><c:out value="${person.city}"></c:out></td>
            <td><c:out value="${person.birthday}"></c:out></td>
            <td><c:out value="${person.idcard}"></c:out></td>

        </tr><br>


</table><br>

</body>
</html>
