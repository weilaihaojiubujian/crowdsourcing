<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/11/26
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>删除不良用户</title>
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
        <th>评价</th>
        <th></th>
    </tr>
    <c:forEach var="p" items="${persons.list}">
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
            <td><c:out value="${p.evaluation}"></c:out></td>
            <td><a href="/administrator/delete/${p.id}"   ><input type="button" name="删除用户" value="删除用户"></a></td>
        </tr><br>
    </c:forEach>
    <tr align="center">
        <td colspan="11">
            <a href="/administrator/auditbyevaluation?pageNum=1">首页</a>  
            <a href="/administrator/auditbyevaluation?pageNum=${persons.pageNum>1 ? (persons.pageNum-1):1 }">上一页</a>  
            <a href="/administrator/auditbyevaluation?pageNum=${persons.pageNum<persons.pages ? (persons.pageNum+1):persons.pages }">下一页</a>  
            <a href="/administrator/auditbyevaluation?pageNum=${persons.pages }">尾页</a>    
            当前${persons.pageNum }/${persons.pages }页，共${persons.total }条
        </td>
    </tr>


</table><br>
</body>
</html>
