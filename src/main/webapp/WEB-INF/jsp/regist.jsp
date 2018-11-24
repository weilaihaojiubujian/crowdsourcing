<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/11/19
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <script src="jquery-3.3.1.min.js"></script>
    <style type="text/css">
        div{
            position:absolute; right: 0px; top: 0px;
        }

    </style>

    <script>

        function yanzhenlength(){

            var length=document.getElementById('username').value.length;
            var use=document.getElementById('username');
            if(length>10){
                use.focus();
                document.getElementById('lab1').innerHTML=("名字不能超过10个字符");
            }
            else if(length==0){

                document.getElementById('lab1').innerHTML=("名字不能为空");
                use.focus();
            }
            else
            {
                document.getElementById('lab1').innerHTML=("ok");
            }

        }
        function yanzhenpassword(){


            var length=document.getElementById('password').value.length;
            var use=document.getElementById('password');
            if(length>10){
                use.focus();
                document.getElementById('lab').innerHTML=("密码不能超过10个字符");
            }
            else if(length==0){

                document.getElementById('lab').innerHTML=("密码不能为空");
                use.focus();
            }
            else
            {
                document.getElementById('lab').innerHTML=("ok");
            }

        }




        function yanzhenshuzi(){
            var phone=document.getElementById('phonenumber');
            var phonenumber=document.getElementById('phonenumber').value;
            var length=document.getElementById('phonenumber').value.length;
            var str=phonenumber.substr(0,3);
            var s=phonenumber.substr(0,1);
            var p = /[0-9]/;
            if(phonenumber === "" || phonenumber ==null){
                document.getElementById('lab2').innerHTML=("错误,不能为空");
            }
            else if(isNaN(phonenumber) || length!=11 || !p.test(s)){
                phone.focus();
                document.getElementById('lab2').innerHTML=("错误，前三位数字是"+str);
            }
            else
            {
                document.getElementById('lab2').innerHTML=("号码可用");
            }

        }





    </script>
</head>
<body >

<form method="post" action="/user/regist" >
    姓名:<input type="text"  name="username" id="username" onblur="yanzhenlength()"><label id="lab1"></label><br>
    密码：<input type="password" name="password" id="password" onblur="yanzhenpassword()"><label id="lab"></label><br>






    联系电话: <input type="text"  name="phonenumber" id="phonenumber" onblur="yanzhenshuzi()"><label id="lab2"></label><br>

    用户类别: <select name="species" id="species">
    <option value="person">个人</option>
    <option value="business">商家</option>
</select><br>


    <input type="submit" id="submit" value="提交" name="submit" />


</form>


</body>
</html>
