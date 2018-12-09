<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/12/9
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>转账记录</title>
</head>
<body>
<h1>转账记录</h1>
<table class="table table-bordered table-hover table-striped">
    <tr>
        <th>序号</th>
        <th>支付人序号</th>
        <th>收钱人序号</th>
        <th>金额</th>
        <th>是否支付</th>

        <th></th>
    </tr>
    <c:forEach var="m" items="${transfers.list}">
        <tr>
            <td>${m.id}</td>
            <td><c:out value="${m.uid_one}"></c:out></td>
            <td><c:out value="${m.uid_two}"></c:out></td>
            <td> <c:if test="${ sessionScope.user.id==m.uid_one}">-${m.price}</c:if>
                <c:if test="${ sessionScope.user.id==m.uid_two}">+${m.price}</c:if></td>
            <td><c:out value="${m.state}"></c:out></td>

            <td> <c:if test="${ sessionScope.user.id==m.uid_one}"><c:if test="${ m.state==0}"><a href=""   ><input type="button" name="支付未付的金额" value="支付未付的金额"></a> </c:if></c:if></td>
        </tr><br>
    </c:forEach>
    <tr align="center">
        <td colspan="9">
            <a href="/transfer/view?pageNum=1">首页</a>  
            <a href="/transfer/view?pageNum=${transfers.pageNum>1 ? (transfers.pageNum-1):1 }">上一页</a>  
            <a href="/transfer/view?pageNum=${transfers.pageNum<transfers.pages ? (transfers.pageNum+1):transfers.pages }">下一页</a>  
            <a href="/transfer/view?pageNum=${transfers.pages }">尾页</a>    
            当前${transfers.pageNum }/${transfers.pages }页，共${transfers.total }条

        </td>
    </tr>
</table>
</body>
</html>
