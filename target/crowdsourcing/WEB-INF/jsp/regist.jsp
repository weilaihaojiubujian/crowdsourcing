<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/11/19
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html class="no-js" lang="">
<!-- no-js类检查浏览器是否启用JavaScript 与modernizr连用 使用modernizr时会将no-js更改为js -->
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <!-- 兼容模式的元标签 -->
    <title>用户注册</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- 移动端不对网页进行缩放 -->
    <link rel="manifest" href="site.webmanifest">
    <!-- 设置应用程序缓存 -->
    <link rel="apple-touch-icon" href="icon.png">
    <!-- Place favicon.ico in the root directory -->

    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/normalize.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/main.css">
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/personRegister.css">
    <!-- <link rel="stylesheet" href="css/jquery-ui.css"> -->
    <!-- 使用button图标 -->
    <!-- <link href="http://cdn.bootcss.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet"> -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/buttons.css">
    <!-- 按钮样式 -->
    <!-- <link rel="stylesheet" href="css/hover.css"> -->
    <!-- 悬浮效果 -->
    <!-- <link rel="stylesheet" href="css/animate.css"> -->
    <!-- 动画库 -->

</head>

<body>
<!--[if lte IE 9]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
<![endif]-->
<!-- 对于使用低于IE9版本的用户，给出升级提示 -->
<!-- Add your site or application content here -->
<!-- <p>Hello world! This is HTML5 Boilerplate.</p> -->
<div class="container-fuild">
    <header role="banner">
        <nav class="topNav">
            <div class="leftLogo">
                <img src="img/logo.png" alt="logo">
                <div>同城跑腿，您的贴心做事帮手</div>
            </div>
            <div>
                <a href="main.html">主页</a>
            </div>
            <div>
                <a href="login.html">登陆</a>
            </div>
            <div>
                <a href="personRegister.html">注册</a>
            </div>
        </nav>
    </header>
    <main role="main">
        <article class="logoContainer">
            <div class="logoImg"></div>
        </article>
        <article class="registerContainer">
            <div class="ReisterText">
                <div class="loginLogo">
                    <!-- <h3>登录</h3> -->
                    <div class="img">

                    </div>
                    <h3>用户注册</h3>
                </div>
                <div class="personRegister">
                    <!-- person -->
                    <form method="post" action="/user/regist">
                        <div>
                            <div>
                                <label for="name">用户名:</label>
                            </div>

                            <div>
                                <input type="text" id="name" placeholder="请输入6-12个字符" autofocus   name="username">
                            </div>

                        </div>
                        <div>
                            <div>
                                <label for="password">密码:</label>
                            </div>
                            <div>
                                <input type="password" id="password" placeholder="请输入6-12个字符"  name="password">
                            </div>
                        </div>
                        <div>
                            <div>
                                <label for="password">确认密码:</label>
                            </div>
                            <div>
                                <input type="password" id="checkpassword" placeholder="请确认密码">
                            </div>
                        </div>
                        <div>
                            <div>
                                <label for="password">手机号码:</label>
                            </div>
                            <div>
                                <input type="tel" id="tel" placeholder="请输入11位手机号码" maxlength="11" name="phonenumber">
                            </div>
                        </div>
                        <div>
                            <div>
                                <label>用户类别: </label>
                            </div>
                            <div>
                                <select name="species" id="species">
                                    <option value="person">个人</option>
                                    <option value="business">商家</option>
                                </select>
                            </div>
                        </div>
                        <div class="submit">
                            <input type="submit" value="立即注册" class="button button-glow button-border button-rounded button-primary">
                        </div>
                        <small><a href="/user/login3">已有账号，点击登录</a></small>

                    </form>
                </div>
            </div>
        </article>
    </main>
    <aside role="complementary"></aside>
    <footer role="contentinfo">
        Copyright &copy; 2018.12.4 Design By 同城跑腿
    </footer>
</div>









<script src="${pageContext.request.contextPath }/js/modernizr.custom.93262.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="${pageContext.request.contextPath }/js/vendor/jquery-3.3.1.min.js"><\/script>')</script>
<!-- 通过上文的CDN使用jQuery 若引用失败 则使用本地jQuery -->
<script src="${pageContext.request.contextPath }/js/plugins.js"></script>
<script src="${pageContext.request.contextPath }/js/main.js"></script>

<!-- Google Analytics: change UA-XXXXX-Y to be your site's ID. -->
<script>
    window.ga = function () { ga.q.push(arguments) }; ga.q = []; ga.l = +new Date;
    ga('create', 'UA-XXXXX-Y', 'auto'); ga('send', 'pageview')
</script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://www.google-analytics.com/analytics.js" async defer></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- <script src="js/jquery-ui.js"></script> -->
<!-- 使用velocity动画库 -->
<script src="https://cdn.jsdelivr.net/npm/velocity-animate@1.5.0/velocity.min.js"></script>
<!-- <script src="https://cdn.jsdelivr.net/npm/velocity-animate@1.5.0/velocity.ui.min.js"></script> -->
<script src="${pageContext.request.contextPath }/js/login.js"></script>
</body>

</html>
<%--<form method="post" action="/user/regist">--%>
    <%--<div>--%>
        <%--<div>--%>
            <%--<label for="name">用户名:</label>--%>
        <%--</div>--%>

        <%--<div>--%>
            <%--<input type="text" id="name" placeholder="请输入6-12个字符" autofocus   name="username">--%>
        <%--</div>--%>

    <%--</div>--%>
    <%--<div>--%>
        <%--<div>--%>
            <%--<label for="password">密码:</label>--%>
        <%--</div>--%>
        <%--<div>--%>
            <%--<input type="password" id="password" placeholder="请输入6-12个字符"  name="password">--%>
        <%--</div>--%>
    <%--</div>--%>
    <%--<div>--%>
        <%--<div>--%>
            <%--<label for="password">确认密码:</label>--%>
        <%--</div>--%>
        <%--<div>--%>
            <%--<input type="password" id="checkpassword" placeholder="请确认密码">--%>
        <%--</div>--%>
    <%--</div>--%>
    <%--<div>--%>
        <%--<div>--%>
            <%--<label for="password">手机号码:</label>--%>
        <%--</div>--%>
        <%--<div>--%>
            <%--<input type="tel" id="tel" placeholder="请输入11位手机号码" maxlength="11" name="phonenumber">--%>
        <%--</div>--%>
    <%--</div>--%>
    <%--<div>--%>
        <%--<div>--%>
            <%--<label>用户类别: </label>--%>
        <%--</div>--%>
        <%--<div>--%>
            <%--<select name="species" id="species">--%>
                <%--<option value="person">个人</option>--%>
                <%--<option value="business">商家</option>--%>
            <%--</select>--%>
        <%--</div>--%>
    <%--</div>--%>
    <%--<div class="submit">--%>
        <%--<input type="submit" value="立即注册" class="button button-glow button-border button-rounded button-primary">--%>
    <%--</div>--%>
    <%--<small><a href="/user/login3">已有账号，点击登录</a></small>--%>

<%--</form>--%>