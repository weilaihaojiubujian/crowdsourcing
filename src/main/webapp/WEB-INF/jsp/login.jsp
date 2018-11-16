<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/11/16
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
<form action="/user/login" method="post">
    用户名:<input type="text" name = "username" ><p>
    密码:<input type="password" name = "password" ><p>
    <input type="submit" value="登录">
</form>
</body>
</html>
