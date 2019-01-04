<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/11/24
  Time: 19:57
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
        <title>商家信息</title>
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
        <!-- <link rel="stylesheet" href="css/jquery-ui.css"> -->
        <!-- 使用button图标 -->
        <!-- <link href="http://cdn.bootcss.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet"> -->
        <link rel="stylesheet" href="${pageContext.request.contextPath }/css/buttons.css">
        <!-- 按钮样式 -->
        <link rel="stylesheet" href="${pageContext.request.contextPath }/css/hover-min.css">
        <!-- 悬浮效果 -->
        <!-- <link rel="stylesheet" href="css/animate.css"> -->
        <!-- 动画库 -->
        <link rel="stylesheet" href="${pageContext.request.contextPath }/css/font-awesome.min.css">
        <!-- <link rel="stylesheet" type="text/css" href="css/responsive-nav.css"> -->

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/administrator.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath }/css/audituser.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath }/css/businessinformation.css">

    </head>

<body>
<!--[if lte IE 9]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
<![endif]-->
<!-- 对于使用低于IE9版本的用户，给出升级提示 -->
<!-- Add your site or application content here -->
<!-- <p>Hello world! This is HTML5 Boilerplate.</p> -->
<div class="container-fuild page">
<header role="banner">
    <nav class="topNav hidden-xs hidden-sm">
        <a href="/user/main" class="hvr-underline-from-right">
            <div class="navItems">
                登出
                <!-- <span class="caret"></span>           	 -->
            </div>
        </a>
        <a href="#" class="hvr-underline-from-center">
            <div class="navItems">
                欢迎您:${sessionScope.user.username}
            </div>
        </a>

        <div class="navItems lastNavItem">
            <img src="${pageContext.request.contextPath }/img/logo.png" alt="logo">
        </div>
    </nav>
    <nav class="smallTopNav hidden-md hidden-lg">
        <div>
            <i class="icon-2x icon-list openSideBar"></i>
        </div>
        <div class="navItems lastNavItem">
            <img src="${pageContext.request.contextPath }/img/logo.png" alt="logo">
        </div>

    </nav>
</header>
<div class="row">
<aside role="complementary" class="asideNav hidden-xs hidden-sm hideAside">
    <div class="sideNav">
        <ul>
            <li>
                <div class="liItems">
                    <div><i class="icon-th-list"></i></div><div><a href="/task/release">发布任务</a></div><div><i class="icon-angle-right invisible"></i></div>
                </div>
            </li>
            <li>
                <div class="liItems personInformation">
                    <div><i class="icon-user"></i></div><div><a>个人信息</a></div><div><i class="icon-angle-down changeI"></i></div>
                </div>
            </li>
            <li>
                <div class="liItems hiddenInformation">
                    <div><i class="icon-share-alt"></i></div><div><a href="/user/information">查看信息</a></div><div><i class="icon-angle-right invisible"></i></div>
                </div>
            </li>
            <li>
                <div class="liItems hiddenInformation">
                    <div><i class="icon-edit"></i></div><div><a href="/user/updatepassword1">修改密码</a></div><div><i class="icon-angle-righ invisiblet"></i></div>
                </div>
            </li>
            <li>
                <div class="liItems">
                    <div><i class="icon-list-alt"></i></div><div><a href="/task/message?pageNum=1">任务消息</a></div><div><i class="icon-angle-right invisible"></i></div>
                </div>
            </li>
            <c:if test="${ sessionScope.user.species.equals('person')}">
                <li>
                    <div class="liItems">
                        <div><i class="icon-list-alt"></i></div><div><a href="/task/already">已接受任务</a></div><div><i class="icon-angle-right invisible"></i></div>
                    </div>
                </li>
            </c:if>
            <li>
                <div class="liItems">
                    <div><i class="icon-angle-right"></i></div><div><a href="/task/releasebyuser?pageNum=1">已发布任务</a></div><div><i class="icon-angle-right invisible"></i></div>
                </div>
            </li>
            <li>
                <div class="liItems moneyInformation">
                    <div><i class="icon-retweet"></i></div><div><a>资金管理</a></div><div><i class="icon-angle-down changei"></i></div>
                </div>
            </li>
            <li>
                <div class="liItems hiddenMoneyInformation">
                    <div><i class="icon-angle-right"></i></div><div><a href="/bankaccount/bankaccount?pageNum=1">查看银行卡</a></div><div><i class="icon-angle-right invisible"></i></div>
                </div>
            </li>
            <li>
                <div class="liItems hiddenMoneyInformation">
                    <div><i class="icon-exchange"></i></div><div><a href="/transfer/view?pageNum=1">查看转账记录</a></div><div><i class="icon-angle-right invisible"></i></div>
                </div>
            </li>
            <li>
                <div class="liItems hiddenMoneyInformation">
                    <div><i class="icon-exchange"></i></div><div><a href="/transfer/recharge1">充值</a></div><div><i class="icon-angle-right invisible"></i></div>
                </div>
            </li>
            <li>
                <div class="liItems hiddenMoneyInformation">
                    <div><i class="icon-exchange"></i></div><div><a href="/transfer/withdrawal1">提现</a></div><div><i class="icon-angle-right invisible"></i></div>
                </div>
            </li>
        </ul>
    </div>
</aside>
<main role="main" class="col-md-8 col-md-offset-3 col-sm-10 col-sm-offset-1 col-xs-10 col-xs-offset-1">
<div class="container-fuild">
<h3>商家信息</h3>
<div class="row">
    <div class="col-md-12">
        <ol class="breadcrumb">
            <li><a href="#">商家信息</a></li>
            <li class="active businessInformation">${business.id}</li>
        </ol>
    </div>
</div>
<div class="row">
<section class="col-md-12 userTable">
<article>
<section class="showInformation">
<!-- <h2>查看商家信息</h2> -->
<div class="row personHeader">
    <div class="personImg">
        <img src="${pageContext.request.contextPath }/img/女1.jpeg" class="img-circle img-responsive" alt="头像">
    </div>
    <div>
        <p class="text-center lead businessInformation"><c:out value="${business.name}"></c:out></p>
    </div>
</div>
<div class="row">
<p class="lead col-md-6 text-right col-xs-6">用户名:</p>
    <p class="lead col-md-6 col-xs-6 businessInformation"><c:out value="${business.username}"></c:out></p>
    </div>

    <div class="row">
    <p class="lead col-md-6 text-right col-xs-6">手机号:</p>
    <p class="lead col-md-6 col-xs-6 businessInformation"><c:out value="${business.phonenumber}"></c:out></p>
    </div>
    <div class="row">
    <p class="lead col-md-6 text-right col-xs-6">地址:</p>
    <p class="lead col-md-6 col-xs-6 businessInformation"><c:out value="${business.address}"></c:out></p>
    </div>
    <div class="row">
    <p class="lead col-md-6 text-right col-xs-6">负责人姓名:</p>
    <p class="lead col-md-6 col-xs-6 businessInformation"><c:out value="${business.headname}"></c:out></p>
    </div>
    <div class="row">
    <p class="lead col-md-6 text-right col-xs-6">负责人身份证号:</p>
    <p class="lead col-md-6 col-xs-6 businessInformation"><c:out value="${business.headidcard}"></c:out></p>
    </div>
    <div class="row buttonDiv">
    <button name="modifyMessage" class="btn btn-default">修改信息</button>
    <a href="/user/updatepassword1" class="btn btn-default">修改密码</a>
    </div>
    </section>
    <section class="changeInformation" >
    <h2>修改商家信息</h2>
    <form class="form-horizontal" action="/user/businessinformation1" method="post">
    <div class="form-group">
    <label for="id" class="col-sm-2 control-label">序号</label>
    <div class="col-sm-10">
    <input type="text" class="form-control" id="id" disabled>
    </div>
    </div>
    <div class="form-group">
    <label for="userName" class="col-sm-2 control-label">用户名</label>
    <div class="col-sm-10">
    <input type="text" id="userName" name="username" class="form-control">
    </div>
    </div>
    <div class="form-group">
    <label for="tel" class="col-sm-2 control-label">手机号码</label>
    <div class="col-sm-10">
    <input type="tel" id="tel" name="phonenumber" class="form-control">
    </div>
    </div>
    <div class="form-group">
    <label for="name" class="col-sm-2 control-label">商家名</label>
    <div class="col-sm-10">
    <input type="text" id="name" name="name" class="form-control">
    </div>
    </div>
    <div class="form-group">
    <label for="address" class="col-sm-2 control-label">地址</label>
    <div class="col-sm-10">
    <input type="text" id="address" name="address" class="form-control">
    </div>
    </div>
    <div class="form-group">
    <label for="headname" class="col-sm-2 control-label">负责人姓名</label>
    <div class="col-sm-10">
    <input type="text" id="headname" name="headname" class="form-control">
    </div>
    </div>
    <div class="form-group">
    <label for="headidcard" class="col-sm-2 control-label">身份证号</label>
    <div class="col-sm-10">
    <input type="text" id="headidcard" name="headidcard" class="form-control">
    </div>
    </div>
    <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
    <input type="submit" class="btn btn-default" value="提交">
    <button name="showMessage" class="btn btn-default">查看信息</button>
    </div>
    </div>
    </form>
    </section>
    </article>
    </section>
    </div>

    </div>
    </main>
    </div>
    <!-- <footer role="contentinfo">
    Copyright &copy; 2018.12.4 Design By 同城跑腿
    </footer> -->
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
    <!-- <script src="https://www.google-analytics.com/analytics.js" async defer></script> -->
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!-- <script src="js/jquery-ui.js"></script> -->
    <!-- 使用velocity动画库 -->
    <!-- <script src="https://cdn.jsdelivr.net/npm/velocity-animate@1.5.0/velocity.min.js"></script> -->
    <script src="http://cdn.bootcss.com/bootstrap/2.3.1/js/bootstrap-dropdown.js"></script>
    <!-- <script src="js/responsive-nav.js" type="text/javascript"></script> -->

    <script src="${pageContext.request.contextPath }/js/businessinformation.js"></script>
    <script src="${pageContext.request.contextPath }/js/administrator.js"></script>
    </body>
</html>