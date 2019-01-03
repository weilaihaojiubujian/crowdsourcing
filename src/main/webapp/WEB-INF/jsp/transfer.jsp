<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/12/9
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
    <title>转账记录</title>
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
    <!-- <link rel="stylesheet" href="css/hover.css"> -->
    <!-- 悬浮效果 -->
    <!-- <link rel="stylesheet" href="css/animate.css"> -->
    <!-- 动画库 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/font-awesome.min.css">

    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/administrator.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/audituser.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/bankaccount.css">
    <style>
        .row{
            background-color: white;
        }
    </style>
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
                        <div><i class="icon-edit"></i></div><div><a href="/user/information">修改密码</a></div><div><i class="icon-angle-righ invisiblet"></i></div>
                    </div>
                </li>
                <li>
                    <div class="liItems">
                        <div><i class="icon-list-alt"></i></div><div><a href="/task/message?pageNum=1">任务消息</a></div><div><i class="icon-angle-right invisible"></i></div>
                    </div>
                </li>
                <li>
                    <div class="liItems">
                        <div><i class="icon-angle-right"></i></div><div><a href="/task/releasebyuser?pageNum=1">查看任务</a></div><div><i class="icon-angle-right invisible"></i></div>
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
                <div class="col-md-12">
                    <ol class="breadcrumb">
                        <li><a href="#">资产信息</a></li>
                        <li class="active">转账信息</li>
                    </ol>
                </div>
            </div>
            <div class="row">
                <section class="col-md-12 userTable">
                    <div class="tableAndNav">
                        <section>
                            <h1>转账记录</h1>
                            <table class="table table-bordered table-hover table-striped">
                                <tr>
                                    <th>序号</th>
                                    <th>支付人名字</th>
                                    <th>收钱人名字</th>
                                    <th>金额</th>
                                    <th>是否支付</th>

                                    <th></th>
                                </tr>
                                <c:forEach var="m" items="${transfers.list}">
                                    <tr>
                                        <td>${m.id}</td>
                                        <td><c:out value="${m.uidonename}"></c:out></td>
                                        <td><c:out value="${m.uidtwoname}"></c:out></td>
                                        <td> <c:if test="${ m.uidtwo==m.uidone}">
                                            <c:if test="${ m.fid==null}">-${m.price}</c:if>
                                            <c:if test="${ m.fid!=null}">+${m.price}</c:if>
                                        </c:if>
                                            <c:if test="${ m.uidtwo!=m.uidone}">
                                                <c:if test="${ sessionScope.user.id==m.uidone}">-${m.price}</c:if>
                                                <c:if test="${ sessionScope.user.id==m.uidtwo}">+${m.price}</c:if>
                                            </c:if>
                                        </td>
                                        <td><c:out value="${m.state}"></c:out></td>

                                        <td> <c:if test="${ m.uidtwo==m.uidone}"></c:if><c:if test="${ sessionScope.user.id==m.uidone}"><c:if test="${ m.state==0}"><a href="/alipay/pay/${m.id}"   ><input type="button" name="支付未付的金额" value="支付未付的金额" class="btn btn-default"></a> </c:if></c:if></td>
                                    </tr><br>
                                </c:forEach>


                            </table>
                            <nav class="changePage" style="position: static;">
                                <ul class="pager">
                                    <li class="previous"><a href="/transfer/view?pageNum=1"><span aria-hidden="true">&larr;</span>首页</a></li>
                                    <li><a href="/transfer/view?pageNum=${transfers.pageNum>1 ? (transfers.pageNum-1):1 }">上一页</a></li>
                                    <li><a href="/transfer/view?pageNum=${transfers.pageNum<transfers.pages ? (transfers.pageNum+1):transfers.pages }">下一页</a></li>
                                    <li class="next"><a href="/transfer/view?pageNum=${transfers.pages }">尾页 <span aria-hidden="true">&rarr;</span></a></li>
                                </ul>
                                <div class="changePageMessage">
                                    <p class="small">
                                        当前${transfers.pageNum }/${transfers.pages }页，共${transfers.total }条
                                    </p>
                                </div>
                            </nav>
                        </section>

                    </div>
                </section>
            </div>

        </div>
        <div class="container-fuild">
            <article>


            </article>
        </div>

    </main>
</div>
<%--<footer role="contentinfo">--%>
    <%--Copyright &copy; 2018.12.4 Design By 同城跑腿--%>
<%--</footer>--%>
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
<script src="${pageContext.request.contextPath }/js/bankaccount.js"></script>
<script src="${pageContext.request.contextPath }/js/administrator.js"></script>
<!-- <script src="js/jquery-ui.js"></script> -->
<!-- 使用velocity动画库 -->
<!-- <script src="https://cdn.jsdelivr.net/npm/velocity-animate@1.5.0/velocity.min.js"></script> -->
<!-- <script src="https://cdn.jsdelivr.net/npm/velocity-animate@1.5.0/velocity.ui.min.js"></script> -->
<!-- <script src="http://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
<!-- bootstrap轮播插件 与bootstrap.js连用 -->
</body>

</html>

<!--
<table class="table table-bordered table-hover table-striped">
<tr>
<th>序号</th>
<th>支付人名字</th>
<th>收钱人名字</th>
<th>金额</th>
<th>是否支付</th>

<th></th>
</tr>
<c:forEach var="m" items="${transfers.list}">
    <tr>
    <td>${m.id}</td>
    <td><c:out value="${m.uidonename}"></c:out></td>
    <td><c:out value="${m.uidtwoname}"></c:out></td>
    <td> <c:if test="${ m.uidtwo==m.uidone}">
    <c:if test="${ m.fid==null}">-${m.price}</c:if>
    <c:if test="${ m.fid!=null}">+${m.price}</c:if>
</c:if>
    <c:if test="${ m.uidtwo!=m.uidone}">
        <c:if test="${ sessionScope.user.id==m.uidone}">-${m.price}</c:if>
        <c:if test="${ sessionScope.user.id==m.uidtwo}">+${m.price}</c:if>
    </c:if>
    </td>
    <td><c:out value="${m.state}"></c:out></td>

    <td> <c:if test="${ m.uidtwo==m.uidone}"></c:if><c:if test="${ sessionScope.user.id==m.uidone}"><c:if test="${ m.state==0}"><a href="/alipay/pay/${m.id}"   ><input type="button" name="支付未付的金额" value="支付未付的金额"></a> </c:if></c:if></td>
    </tr><br>
</c:forEach>
<tr align="center">
<td colspan="9">
<a href="/transfer/view?pageNum=1">首页</a>  
<a href="/transfer/view?pageNum=${transfers.pageNum>1 ? (transfers.pageNum-1):1 }">上一页</a>  
<a href="/transfer/view?pageNum=${transfers.pageNum<transfers.pages ? (transfers.pageNum+1):transfers.pages }">下一页</a>  
<a href="/transfer/view?pageNum=${transfers.pages }">尾页</a>    
当前${transfers.pageNum }/${transfers.pages }页，共${transfers.total }条

</td>
</tr>
</table> -->

<!-- 
<table class="table table-bordered table-hover table-striped">
    <tr>
        <th>序号</th>
        <th>支付人名字</th>
        <th>收钱人名字</th>
        <th>金额</th>
        <th>是否支付</th>

        <th></th>
    </tr>
    <c:forEach var="m" items="${transfers.list}">
        <tr>
            <td>${m.id}</td>
            <td><c:out value="${m.uidonename}"></c:out></td>
            <td><c:out value="${m.uidtwoname}"></c:out></td>
            <td> <c:if test="${ m.uidtwo==m.uidone}">
                <c:if test="${ m.fid==null}">-${m.price}</c:if>
                <c:if test="${ m.fid!=null}">+${m.price}</c:if>
            </c:if>
            <c:if test="${ m.uidtwo!=m.uidone}">
                <c:if test="${ sessionScope.user.id==m.uidone}">-${m.price}</c:if>
                <c:if test="${ sessionScope.user.id==m.uidtwo}">+${m.price}</c:if>
            </c:if>
            </td>
            <td><c:out value="${m.state}"></c:out></td>

            <td> <c:if test="${ m.uidtwo==m.uidone}"></c:if><c:if test="${ sessionScope.user.id==m.uidone}"><c:if test="${ m.state==0}"><a href="/alipay/pay/${m.id}"   ><input type="button" name="支付未付的金额" value="支付未付的金额"></a> </c:if></c:if></td>
        </tr><br>
    </c:forEach>
    <tr align="center">
        <td colspan="9">
            <a href="/transfer/view?pageNum=1">首页</a>  
            <a href="/transfer/view?pageNum=${transfers.pageNum>1 ? (transfers.pageNum-1):1 }">上一页</a>  
            <a href="/transfer/view?pageNum=${transfers.pageNum<transfers.pages ? (transfers.pageNum+1):transfers.pages }">下一页</a>  
            <a href="/transfer/view?pageNum=${transfers.pages }">尾页</a>    
            当前${transfers.pageNum }/${transfers.pages }页，共${transfers.total }条

        </td>
    </tr>
</table> -->
<!-- 
<table class="table table-bordered table-hover table-striped">
    <tr>
        <th>序号</th>
        <th>支付人名字</th>
        <th>收钱人名字</th>
        <th>金额</th>
        <th>是否支付</th>

        <th></th>
    </tr>
    <c:forEach var="m" items="${transfers.list}">
        <tr>
            <td>${m.id}</td>
            <td><c:out value="${m.uidonename}"></c:out></td>
            <td><c:out value="${m.uidtwoname}"></c:out></td>
            <td> <c:if test="${ m.uidtwo==m.uidone}">
                <c:if test="${ m.fid==null}">-${m.price}</c:if>
                <c:if test="${ m.fid!=null}">+${m.price}</c:if>
            </c:if>
            <c:if test="${ m.uidtwo!=m.uidone}">
                <c:if test="${ sessionScope.user.id==m.uidone}">-${m.price}</c:if>
                <c:if test="${ sessionScope.user.id==m.uidtwo}">+${m.price}</c:if>
            </c:if>
            </td>
            <td><c:out value="${m.state}"></c:out></td>

            <td> <c:if test="${ m.uidtwo==m.uidone}"></c:if><c:if test="${ sessionScope.user.id==m.uidone}"><c:if test="${ m.state==0}"><a href="/alipay/pay/${m.id}"   ><input type="button" name="支付未付的金额" value="支付未付的金额"></a> </c:if></c:if></td>
        </tr><br>
    </c:forEach>
    <tr align="center">
        <td colspan="9">
            <a href="/transfer/view?pageNum=1">首页</a>  
            <a href="/transfer/view?pageNum=${transfers.pageNum>1 ? (transfers.pageNum-1):1 }">上一页</a>  
            <a href="/transfer/view?pageNum=${transfers.pageNum<transfers.pages ? (transfers.pageNum+1):transfers.pages }">下一页</a>  
            <a href="/transfer/view?pageNum=${transfers.pages }">尾页</a>    
            当前${transfers.pageNum }/${transfers.pages }页，共${transfers.total }条

        </td>
    </tr>
</table> -->
