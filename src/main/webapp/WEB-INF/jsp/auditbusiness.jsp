<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/12/5
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>审核商家</title>
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
        <th></th>
    </tr>
    <c:forEach var="m" items="${businesss.list}">
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
    <tr align="center">
        <td colspan="9">
            <a href="/administrator/auditbusiness?pageNum=1">首页</a>  
            <a href="/administrator/auditbusiness?pageNum=${businesss.pageNum>1 ? (businesss.pageNum-1):1 }">上一页</a>  
            <a href="/administrator/auditbusiness?pageNum=${businesss.pageNum<businesss.pages ? (businesss.pageNum+1):businesss.pages }">下一页</a>  
            <a href="/administrator/auditbusiness?pageNum=${businesss.pages }">尾页</a>    
            当前${businesss.pageNum }/${businesss.pages }页，共${businesss.total }条

        </td>
    </tr>
</table>
</body>
</html>
