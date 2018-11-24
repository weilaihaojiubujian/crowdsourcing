<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/11/24
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商家信息注册</title>
</head>
<body>
<form method="post" action="/user/registbusinessinformation" >
    商家名称:<input type="text"  name="name" id="name" ><br>

    地址:<input type="text"  name="address" id="address" ><br>
    负责人姓名：<input type="text"  name="headname" id="headname" ><br>
    负责人身份证号:<input type="text"  name="headidcard" id="headidcard" ><br>


    <input type="submit" id="submit" value="提交" name="submit" />


</form>

</body>
</html>
