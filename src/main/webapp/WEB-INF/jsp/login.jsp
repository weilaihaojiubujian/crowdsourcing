<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/11/16
  Time: 15:08
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
    <title>登录</title>
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
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/login.css">
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
        <nav cole="navigation">导航 导航 等等再说</nav>
    </header>
    <main role="main">
        <article class="logoContainer">
            <div class="logoImg"></div>
        </article>
        <article class="loginContainer">
            <div class="loginText">
                <div class="loginLogo">
                    <!-- <h3>登录</h3> -->
                    <div class="img"></div>
                    <div class="buttonContainer">
                        <div class="personLoginButton">
                            用户登录
                        </div>
                        <div class="companyLoginButton">
                            企业登录
                        </div>
                        <div class="administratorLoginButton">
                            管理员登录
                        </div>
                    </div>
                </div>
                <div class="administratorLogin">
                    <!-- administrator -->
                    <form action="#"   method="post">
                        <div>
                            <div>
                                <label for="name">用户名: </label>
                            </div>

                            <div>
                                <input type="text" id="name" name="username">
                            </div>

                        </div>
                        <div>
                            <div>
                                <label for="password">密码:</label>
                            </div>
                            <div>
                                <input type="password" id="password" name="password">
                            </div>
                        </div>
                        <div class="submit">
                            <input type="submit" value="登录" class="button button-glow button-border button-rounded button-primary">
                        </div>
                        <small>管理员登录专用</small>
                    </form>
                </div>
                <div class="companyLogin">
                    <!-- company -->
                    <form action="#"   method="post">
                        <div>
                            <div>
                                <label for="name">用户名:</label>
                            </div>

                            <div>
                                <input type="text" id="companyName" name = "username" >
                            </div>

                        </div>
                        <div>
                            <div>
                                <label for="password">密码:</label>
                            </div>
                            <div>
                                <input type="password"  name = "password" >
                            </div>
                        </div>
                        <div class="submit">
                            <input type="submit" value="登录" class="button button-glow button-border button-rounded button-primary">
                        </div>
                        <small><a href="/user/regist">没有商家账号？点击注册申请</a></small>
                    </form>
                </div>
                <div class="personLogin">
                    <!-- person -->
                    <form action="/user/login"  method="post">
                        <div>
                            <div>
                                <label for="name">用户名:</label>
                            </div>

                            <div>
                                <input type="text" id="userName"  name = "username">
                            </div>

                        </div>
                        <div>
                            <div>
                                <label for="password">密码:</label>
                            </div>
                            <div>
                                <input type="password" id="userPassword" name = "password">
                            </div>
                        </div>
                        <div class="submit">
                            <input type="submit" value="登录" class="button button-glow button-border button-rounded button-primary">
                        </div>
                        <small><a href="/user/regist">没有账号？点击注册</a></small>
                    </form>
                </div>
            </div>
        </article>
    </main>
    <aside role="complementary"></aside>
    <footer role="contentinfo">
        <address></address>
        <small>这个footer写个什么 编不出来</small>
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

