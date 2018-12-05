<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/12/1
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>审核任务</title>
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

        <th></th>
    </tr>
    <c:forEach var="p" items="${taskinformations.list}">
        <tr>
            <td>${p.id}</td>
            <td><c:out value="${p.name}"></c:out></td>
            <td><c:out value="${p.message}"></c:out></td>
            <td><c:out value="${p.ttname}"></c:out></td>
            <td><c:out value="${p.pmname}"></c:out></td>
            <td><c:out value="${p.startingaddress}"></c:out></td>
            <td><c:out value="${p.purposeaddress}"></c:out></td>
            <td><c:out value="${p.weight}"></c:out></td>
            <td><a href="/administrator/audit1/${p.id}"   ><input type="button" name="审核通过" value="审核通过"></a></td>
        </tr><br>
    </c:forEach>
    <tr align="center">
        <td colspan="9">
            <a href="/administrator/audittask?pageNum=1">首页</a>  
            <a href="/administrator/audittask?pageNum=${taskinformations.pageNum>1 ? (taskinformations.pageNum-1):1 }">上一页</a>  
            <a href="/administrator/audittask?pageNum=${taskinformations.pageNum<taskinformations.pages ? (taskinformations.pageNum+1):taskinformations.pages }">下一页</a>  
            <a href="/administrator/audittask?pageNum=${taskinformations.pages }">尾页</a>    
            当前${taskinformations.pageNum }/${taskinformations.pages }页，共${taskinformations.total }条

        </td>
    </tr>
</table><br>
</body>
</html>
