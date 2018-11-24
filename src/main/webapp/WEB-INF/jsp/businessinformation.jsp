<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/11/24
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>商家信息</title>
</head>
<body>
<h1>商家</h1>
<table class="table table-bordered table-hover table-striped">
    <tr>
        <th>序号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>手机号</th>
        <th>名字</th>
        <th>地址</th>
        <th>负责人姓名</th>
        <th>负责人身份证号</th>

    </tr>

        <tr>
            <td>${business.id}</td>
            <td><c:out value="${business.username}"></c:out></td>
            <td><c:out value="${business.password}"></c:out></td>
            <td><c:out value="${business.phonenumber}"></c:out></td>
            <td><c:out value="${business.name}"></c:out></td>
            <td><c:out value="${business.address}"></c:out></td>
            <td><c:out value="${business.headname}"></c:out></td>
            <td><c:out value="${business.headidcard}"></c:out></td>

        </tr><br>


</table>
</body>
</html>
