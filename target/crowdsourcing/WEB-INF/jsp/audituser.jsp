<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/11/23
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>管理员审核用户</title>
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
        <th></th>
    </tr>
    <c:forEach var="p" items="${peoples}">
        <tr>
            <td>${p.id}</td>
            <td><c:out value="${p.username}"></c:out></td>
            <td><c:out value="${p.password}"></c:out></td>
            <td><c:out value="${p.phonenumber}"></c:out></td>
            <td><c:out value="${p.name}"></c:out></td>
            <td><c:out value="${p.sex}"></c:out></td>
            <td><c:out value="${p.city}"></c:out></td>
            <td><c:out value="${p.birthday}"></c:out></td>
            <td><c:out value="${p.idcard}"></c:out></td>
            <td><a href="/administrator/audit/${p.id}"   ><input type="button" name="审核通过" value="审核通过"></a></td>
        </tr><br>
    </c:forEach>

</table><br>
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
        <th></th>
    </tr>
    <c:forEach var="m" items="${merchantss}">
        <tr>
            <td>${m.id}</td>
            <td><c:out value="${m.username}"></c:out></td>
            <td><c:out value="${m.password}"></c:out></td>
            <td><c:out value="${m.phonenumber}"></c:out></td>
            <td><c:out value="${m.name}"></c:out></td>
            <td><c:out value="${m.address}"></c:out></td>
            <td><c:out value="${m.headname}"></c:out></td>
            <td><c:out value="${m.headidcard}"></c:out></td>
            <td><a href="/administrator/audit/${m.id}"   ><input type="button" name="审核通过" value="审核通过"></a></td>
        </tr><br>
    </c:forEach>

</table>
</body>
</html>
