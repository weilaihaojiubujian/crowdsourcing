<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/11/24
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<!doctype html>
<html class="no-js" lang="">
<!-- no-js类检查浏览器是否启用JavaScript 与modernizr连用 使用modernizr时会将no-js更改为js -->
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <!-- 兼容模式的元标签 -->
    <title></title>
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
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/jquery-ui.css">
    <!-- 使用button图标 -->
    <!-- <link href="http://cdn.bootcss.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet"> -->
    <!-- <link rel="stylesheet" href="css/buttons.css"> -->
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
<div class="container">
    <header role="banner">
        <nav cole="navigation"></nav>
    </header>
    <main role="main">
        <article>
            <section class="showInformation">
                <h2>用户个人信息</h2>
                <table class="table table-bordered table-hover table-striped">
                    <tr>
                        <td>序号</td>
                        <td>用户名</td>
                        <td>密码</td>
                        <td>手机号</td>
                        <td>姓名</td>
                        <td>性别</td>
                        <td>所在城市</td>
                        <td>生日</td>
                        <td>身份证号</td>
                    </tr>
                    <tr name="personMessage">
                        <td name="id">${person.id}</td>
                        <td name="userName"><c:out value="${person.username}"></c:out></td>
                        <td name="password"><c:out value="${person.password}"></c:out></td>
                        <td name="tel"><c:out value="${person.phonenumber}"></c:out></td>
                        <td name="name"><c:out value="${person.name}"></c:out></td>
                        <td name="sex"><c:out value="${person.sex}"></c:out></td>
                        <td name="city"><c:out value="${person.city}"></c:out></td>
                        <td name="birthday"><c:out value="${person.birthday}"></c:out></td>
                        <td name="idNumber"><c:out value="${person.idcard}"></c:out></td>
                    </tr>
                    <tr>
                        <td colspan="9"><button name="modifyMessage">修改信息</button></td>
                    </tr>
                </table>
            </section>
            <section class="changeInformation">
                <h2>修改用户信息</h2>
                <form action="#">
                    <div>
                        <label for="id">序号</label>
                        <input type="text" id="id" disabled>
                    </div>
                    <div>
                        <label for="userName">用户名</label>
                        <input type="text" id="userName">
                    </div>
                    <div>
                        <label for="password">密码</label>
                        <input type="password" id="password">
                    </div>
                    <div>
                        <label for="tel">手机号码:</label>
                        <input type="tel" id="tel">
                    </div>
                    <div>
                        <label for="name">姓名</label>
                        <input type="text" id="name">
                    </div>
                    <div>
                        <label>性别</label>
                        <input type="radio" name="sex" id="male">男
                        <input type="radio" name="sex" id="female">女
                    </div>
                    <div>
                        <label for="city">所在城市</label>
                        <input type="text" id="city">
                    </div>
                    <div>
                        <label for="datepicker">生日</label>
                        <input type="text" id="datepicker">
                    </div>
                    <div>
                        <label for="idNumber">身份证号</label>
                        <input type="text" id="idNumber">
                    </div>
                    <div>
                        <input type="submit" value="提交">
                        <button name="showMessage">查看信息</button>
                    </div>
                </form>
            </section>
        </article>
    </main>
    <aside role="complementary"></aside>
    <footer role="contentinfo">
        <address></address>
        <small></small>
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
<script src="${pageContext.request.contextPath }/js/personinformation.js"></script>
<script src="${pageContext.request.contextPath }/js/jquery-ui.js"></script>
<!-- 使用velocity动画库 -->
<!-- <script src="https://cdn.jsdelivr.net/npm/velocity-animate@1.5.0/velocity.min.js"></script> -->
<!-- <script src="https://cdn.jsdelivr.net/npm/velocity-animate@1.5.0/velocity.ui.min.js"></script> -->
</body>

</html>

