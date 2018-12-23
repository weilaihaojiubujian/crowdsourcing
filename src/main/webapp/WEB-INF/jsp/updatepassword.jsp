<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/12/23
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>修改密码</title>
</head>
<body>
原密码：<td>${sessionScope.user.password}</td>
<form method="post" action="/user/updatepassword" >
    密码：<input type="password" name="password" id="password" ><br>
    确认密码:<input type="password" name="password1" id="password1" ><br>
    <input type="submit" id="submit" value="提交" name="submit" />


</form>

</body>
</html>
