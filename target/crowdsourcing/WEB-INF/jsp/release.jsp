<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/11/23
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>发布任务</title>
</head>
<body>

<form action="/task/release" method="post">
    任务名:<input type="text" name = "name" ><p>
    任务信息:<input type="text" name = "message" ><p>
    起始大概位置:<input type="text" name = "startingaddress" ><p>
    起始具体位置:<input type="text" name = "startingdetail" ><p>
    目的大概位置:<input type="text" name = "purposeaddress" ><p>
    目的大概位置:<input type="text" name = "purposedetail" ><p>
    重量<input type="number" name="weight"><p>
    任务种类:  <select id="tasktype" name="tasktype">
    <c:forEach var="t" items="${tasktypes}">
        <option value="${t.id}">${t.name}</option>
    </c:forEach>
</select>
    计费模式:  <select id="pricingmodel" name="pricingmodel">
    <c:forEach var="p" items="${pricingmodels}">
        <option value="${p.id}">${p.name}</option>
    </c:forEach>
</select>

    <input type="submit" value="登录">
</form>

</body>
</html>
