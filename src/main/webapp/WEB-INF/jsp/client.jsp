<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/11/16
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>主界面</title>
</head>
<body>
<div>欢迎【${sessionScope.user.username}】
    【 <c:if test="${ sessionScope.user.species.equals('person')}">用户</c:if>
    <c:if test="${ sessionScope.user.species.equals('business')}">商家</c:if>】使用系统</div>
<td>主界面</td>

<a href="/task/release">发布任务</a>
<a href="/user/information">信息</a>
</body>
</html>
