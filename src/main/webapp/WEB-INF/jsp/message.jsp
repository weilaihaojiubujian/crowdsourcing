<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/12/2
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>任务</h1>
<table class="table table-bordered table-hover table-striped">
    <tr>
        <th>序号</th>
        <th>任务名</th>
        <th>任务信息</th>
        <th>任务种类名</th>
        <th>计费方式名</th>
        <th>起始位置</th>
        <th>目的位置</th>
        <th>物品重量</th>
        <th>是否已读</th>
        <th></th>
        <th></th>
        <th></th>
    </tr>
    <c:forEach var="p" items="${taskinformations}">
        <tr>
            <td>${p.id}</td>
            <td><c:out value="${p.name}"></c:out></td>
            <td><c:out value="${p.message}"></c:out></td>
            <td><c:out value="${p.ttname}"></c:out></td>
            <td><c:out value="${p.pmname}"></c:out></td>
            <td><c:out value="${p.startingaddress}"></c:out></td>
            <td><c:out value="${p.purposeaddress}"></c:out></td>
            <td><c:out value="${p.weight}"></c:out></td>
            <td> <c:if test="${ p.state==0}">否</c:if>
                <c:if test="${ p.state==1}">是</c:if></td>
            <td><a href="/message/state/${p.mid}"   ><input type="button" name="已读" value="已读"></a></td>
            <td><a href="/task/accept/${p.id}"   ><input type="button" name="接受任务" value="接受任务"></a></td>
            <td><a href="/message/delete/${p.mid}"   ><input type="button" name="删除" value="删除"></a></td>
        </tr><br>
    </c:forEach>

</table><br>
</body>
</html>
