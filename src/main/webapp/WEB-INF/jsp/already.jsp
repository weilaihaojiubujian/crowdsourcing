<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/12/2
  Time: 19:24
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
    <title>已接受的任务</title>
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
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/already.css">


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
                            <div><i class="icon-list-alt"></i></div><div><a href="/task/releasebyuser?pageNum=1">已发布任务</a></div><div><i class="icon-angle-right invisible"></i></div>
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
                <div class="row">
                    <section class="col-md-12 userTable">
                        <h3>当前正在执行任务</h3>
                        <div class="row">
                            <div class="col-md-12">
                                <ol class="breadcrumb">
                                    <li><a href="#">订单详情</a></li>
                                    <li class="active">订单编号：${p.id}</li>
                                </ol>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="progress">
                                    <div class="progress-bar progress-bar-striped active" role="progressbar" aria-valuenow="45" aria-valuemin="0" aria-valuemax="100" style="width: 45%">
                                        <span class="sr-only">45% Complete</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <p class="text-center lead"><c:out value="${p.name}"></c:out></p>
                        </div>
                        <div class="row">
                            <p class="lead col-md-4 text-right col-xs-4">任务信息：</p>
                            <p class="lead col-md-8"><c:out value="${p.message}"></c:out></p>
                        </div>
                        <div class="row">
                            <p class="lead col-md-4 text-right col-xs-4">发布人序号:</p>
                            <p class="lead col-md-8 col-xs-8"><c:out value="${p.uid}"></c:out></p>
                        </div>
                        <div class="row">
                            <p class="lead col-md-4 text-right col-xs-4">任务种类:</p>
                            <p class="lead col-md-8 col-xs-8"><c:out value="${p.ttname}"></c:out></p>
                        </div>
                        <div class="row">
                            <p class="lead col-md-4 text-right col-xs-4">计费方式:</p>
                            <p class="lead col-md-8 col-xs-8"><c:out value="${p.pmname}"></c:out></p>
                        </div>
                        <div class="row">
                            <p class="lead col-md-4 text-right col-xs-4">起始位置:</p>
                            <p class="lead col-md-8 col-xs-8"><c:out value="${p.startingaddress}"></c:out></p>
                        </div>
                        <div class="row">
                            <p class="lead col-md-4 text-right col-xs-4">目的位置:</p>
                            <p class="lead col-md-8 col-xs-8"><c:out value="${p.purposeaddress}"></c:out></p>
                        </div>
                        <div class="row">
                            <p class="lead col-md-4 text-right col-xs-4">物品重量:</p>
                            <p class="lead col-md-8 col-xs-8"><c:out value="${p.weight}"></c:out></p>
                        </div>
                        <div class="row">
                            <p class="lead col-md-4 text-right col-xs-4">价格:</p>
                            <p class="lead col-md-8 col-xs-8"><c:out value="${p.price}"></c:out></p>
                        </div>
                        <div class="row textCenter">
                            <a href="/task/complete" class="button button-action button-rounded">完成任务</a>
                        </div>
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
<<script src="${pageContext.request.contextPath }/js/responsive-nav.js" type="text/javascript"></script>

<script src="${pageContext.request.contextPath }/js/administrator.js"></script>
</body>

</html>
<!-- <div class="tableAndNav">
<table class="table table-bordered table-hover table-striped">
<tr>
<th>序号</th>
<th>任务名</th>
<th>任务信息</th>
<th>发布人序号</th>
<th>任务种类名</th>
<th>计费方式名</th>
<th>起始位置</th>
<th>目的位置</th>
<th>物品重量</th>
<th>价格</th>
<th></th>

</tr>

<tr>
<td>${p.id}</td>
<td><c:out value="${p.name}"></c:out></td>
<td><c:out value="${p.message}"></c:out></td>
<td><c:out value="${p.uid}"></c:out></td>
<td><c:out value="${p.ttname}"></c:out></td>
<td><c:out value="${p.pmname}"></c:out></td>
<td><c:out value="${p.startingaddress}"></c:out></td>
<td><c:out value="${p.purposeaddress}"></c:out></td>
<td><c:out value="${p.weight}"></c:out></td>
<td><c:out value="${p.price}"></c:out></td>
<td><a href="/task/complete"   ><input type="button" name="完成任务" value="完成任务"></a></td>

</tr>
</table>

</div> -->


<!-- <table class="table table-bordered table-hover table-striped">
    <tr>
        <th>序号</th>
        <th>任务名</th>
        <th>任务信息</th>
        <th>发布人序号</th>
        <th>任务种类名</th>
        <th>计费方式名</th>
        <th>起始位置</th>
        <th>目的位置</th>
        <th>物品重量</th>
        <th>价格</th>
        <th></th>

    </tr>

        <tr>
            <td>${p.id}</td>
            <td><c:out value="${p.name}"></c:out></td>
            <td><c:out value="${p.message}"></c:out></td>
            <td><c:out value="${p.uid}"></c:out></td>
            <td><c:out value="${p.ttname}"></c:out></td>
            <td><c:out value="${p.pmname}"></c:out></td>
            <td><c:out value="${p.startingaddress}"></c:out></td>
            <td><c:out value="${p.purposeaddress}"></c:out></td>
            <td><c:out value="${p.weight}"></c:out></td>
            <td><c:out value="${p.price}"></c:out></td>
            <td><a href="/task/complete"   ><input type="button" name="完成任务" value="完成任务"></a></td>

        </tr><br>


</table> -->