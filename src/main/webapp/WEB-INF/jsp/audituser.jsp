<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/11/23
  Time: 19:22
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
    <title>管理员管理用户注册</title>
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
    <%--<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/responsive-nav.css">--%>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/administrator.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/audituser.css">


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
                    欢迎您 管理员
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
                            <div><i class="icon-user"></i></div><div><p>	<a href="/administrator/audituser?pageNum=1" >审核用户</a></p></div><div><i class="icon-angle-right invisible"></i></div>
                        </div>
                    </li>
                    <li>
                        <div class="liItems">
                            <div><i class="icon-group"></i></div><div><p><a href="/administrator/auditbusiness?pageNum=1" >审核商家</a></p></div><div><i class="icon-angle-right invisible"></i></div>
                        </div>
                    </li>
                    <li>
                        <div class="liItems">
                            <div><i class="icon-list-alt"></i></div><div><p>	<a href="/administrator/audittask?pageNum=1" >审核任务</a></p></div><div><i class="icon-angle-right invisible"></i></div>
                        </div>
                    </li>
                    <li>
                        <div class="liItems">
                            <div><i class="icon-minus-sign"></i></div><div><p>	<a href="/administrator/auditbyevaluation?pageNum=1" >管理用户</a></p></div><div><i class="icon-angle-right invisible"></i></div>
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
                            <li><a href="#">管理用户</a></li>
                            <li class="active">审核注册</li>
                        </ol>
                    </div>
                </div>
                <div class="row">
                    <section class="col-md-12 userTable">
                        <div class="tableAndNav">
                            <table class="table table-bordered table-hover table-striped">
                                <caption>审核用户注册</caption>
                                <tr>
                                    <th>序号</th>
                                    <th>用户名</th>
                                    <th>密码</th>
                                    <th>手机号</th>
                                    <th>名字</th>
                                    <th>性别</th>
                                    <th>所在城市</th>
                                    <th>生日</th>
                                    <th>身份证号</th>
                                    <th>是否通过</th>
                                </tr>
                                <c:forEach var="p" items="${persons.list}">
                                    <tr>
                                        <td>${p.id}</td>
                                        <td><c:out value="${p.username}"></c:out></td>
                                        <td><c:out value="${p.password}"></c:out></td>
                                        <td><c:out value="${p.phonenumber}"></c:out></td>
                                        <td><c:out value="${p.name}"></c:out></td>
                                        <td><c:out value="${p.sex}"></c:out></td>
                                        <td><c:out value="${p.city}"></c:out></td>
                                        <td><c:out value="${p.birthday}"></c:out></td>
                                        <td><c:out value="${p.idcard}"></c:out></td>
                                        <td><a href="/administrator/audit/${p.id}"><i class="icon-ok"></i></a></td>
                                    </tr><br>
                                </c:forEach>
                            </table>
                            <nav class="changePage">
                                <ul class="pager">
                                    <li class="previous"><a href="/administrator/audituser?pageNum=1"><span aria-hidden="true">&larr;</span>首页</a></li>
                                    <li><a href="/administrator/audituser?pageNum=${persons.pageNum>1 ? (persons.pageNum-1):1 }">上一页</a></li>
                                    <li><a href="/administrator/audituser?pageNum=${persons.pageNum<persons.pages ? (persons.pageNum+1):persons.pages }">下一页</a></li>
                                    <li class="next"><a href="/administrator/audituser?pageNum=${persons.pages }">尾页 <span aria-hidden="true">&rarr;</span></a></li>
                                </ul>
                                <div class="changePageMessage">
                                    <p class="small">
                                        当前${persons.pageNum }/${persons.pages }页，共${persons.total }条
                                    </p>
                                </div>
                            </nav>
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
<script>window.jQuery || document.write('<script src="js/vendor/jquery-3.3.1.min.js"><\/script>')</script>
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


<!-- <table class="table table-bordered table-hover table-striped">
    <tr>
        <th>序号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>手机号</th>
        <th>名字</th>
        <th>性别</th>
        <th>所在城市</th>
        <th>生日</th>
        <th>身份证号</th>

    </tr>
    <c:forEach var="p" items="${persons.list}">
        <tr>
            <td>${p.id}</td>
            <td><c:out value="${p.username}"></c:out></td>
            <td><c:out value="${p.password}"></c:out></td>
            <td><c:out value="${p.phonenumber}"></c:out></td>
            <td><c:out value="${p.name}"></c:out></td>
            <td><c:out value="${p.sex}"></c:out></td>
            <td><c:out value="${p.city}"></c:out></td>
            <td><c:out value="${p.birthday}"></c:out></td>
            <td><c:out value="${p.idcard}"></c:out></td>
            <td><a href="/administrator/audit/${p.id}"   ><input type="button" name="审核通过" value="审核通过"></a></td>
        </tr><br>
    </c:forEach>
    <tr align="center">
        <td colspan="10">
            <a href="/administrator/audituser?pageNum=1">首页</a>  
            <a href="/administrator/audituser?pageNum=${persons.pageNum>1 ? (persons.pageNum-1):1 }">上一页</a>  
            <a href="/administrator/audituser?pageNum=${persons.pageNum<persons.pages ? (persons.pageNum+1):persons.pages }">下一页</a>  
            <a href="/administrator/audituser?pageNum=${persons.pages }">尾页</a>    
            当前${persons.pageNum }/${persons.pages }页，共${persons.total }条
        </td>
    </tr>
</table> -->