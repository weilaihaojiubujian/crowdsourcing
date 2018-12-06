<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/12/6
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>银行卡</title>
</head>
<body>
<h1>商家</h1>
<table class="table table-bordered table-hover table-striped">
    <tr>
        <th>序号</th>
        <th>银行卡号</th>

        <th></th>
    </tr>
    <c:forEach var="m" items="${bankAccounts.list}">
        <tr>
            <td>${m.id}</td>
            <td><c:out value="${m.account}"></c:out></td>

            <td><a href="/bankaccount/delete/${m.id}"   ><input type="button" name="删除" value="删除"></a></td>
        </tr><br>
    </c:forEach>
    <tr align="center">
        <td colspan="9">
            <a href="/bankaccount/bankaccount?pageNum=1">首页</a>  
            <a href="/bankaccount/bankaccount?pageNum=${bankAccounts.pageNum>1 ? (bankAccounts.pageNum-1):1 }">上一页</a>  
            <a href="/bankaccount/bankaccount?pageNum=${bankAccounts.pageNum<bankAccounts.pages ? (bankAccounts.pageNum+1):bankAccounts.pages }">下一页</a>  
            <a href="/bankaccount/bankaccount?pageNum=${bankAccounts.pages }">尾页</a>    
            当前${bankAccounts.pageNum }/${bankAccounts.pages }页，共${bankAccounts.total }条

        </td>
    </tr>
</table>
<a href="/bankaccount/add"   ><input type="button" name="添加银行卡" value="添加银行卡"></a>
</body>
</html>
