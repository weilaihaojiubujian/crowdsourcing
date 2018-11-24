<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/11/24
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息注册</title>
</head>
<body>

<form method="post" action="/user/registpersoninformation" >
    姓名:<input type="text"  name="name" id="name" ><br>
    性别: <select name="sex" id="sex">
    <option value="男">男</option>
    <option value="女">女</option>
</select><br>
    城市:<input type="text"  name="city" id="city" ><br>
    出生日期：<input type="date" name="birthday" id="birthday"><br>
    身份证号:<input type="text"  name="idcard" id="idcard" ><br>


    <input type="submit" id="submit" value="提交" name="submit" />


</form>

</body>
</html>
