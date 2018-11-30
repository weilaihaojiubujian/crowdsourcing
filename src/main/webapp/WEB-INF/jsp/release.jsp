<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/11/23
  Time: 15:29
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
    <title>发布订单</title>
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
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/map.css">
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
<div class="container">
    <header role="banner">
        <nav cole="navigation"></nav>
    </header>
    <main role="main">
        <article>
            <section>
                <h2>发布订单</h2>
                <form action="/task/release" method="post" class="form-horizontal">
                    <div class="form-group">
                        <label for="taskName" class="col-sm-2 control-label">任务名</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="taskName" placeholder="给任务取个名吧，不超过10个字符" name = "name">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="taskDetailInformation" class="col-sm-2 control-label">任务具体信息</label>
                        <div class="col-sm-10">
                            <textarea name = "message" id="taskDetailInformation" class="col-sm-12 form-control" placeholder="请具体描述任务信息，以及给跑腿人员的备注等,不超过100个字符"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">任务起始位置</label>
                        <div class="col-sm-10">
                            <button class="col-sm-2 button button-primary button-pill button-small startPosition">选择任务起始位置</button>
                            <input type="text" class="form-control hiddenStartPosition" id="startePostion" name = "startingdetail">
                            <div id="startPostionMap"></div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">任务结束位置</label>
                        <div class="col-sm-10">
                            <button class="col-sm-2 endPosition button button-primary button-pill button-small">选择任务结束位置</button>
                            <input type="text" class="form-control hiddenEndPosition" id="endPosition" name = "purposedetail">
                            <div id="endPostionMap"></div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="taskWeight" class="col-sm-2 control-label">重量</label>
                        <div class="col-sm-10">
                            <input type="number" class="form-control" id="taskWeight" placeholder="请输入重量" min="0" max="10000000" name="weight">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">任务种类</label>
                        <div class="col-sm-10">
                            <select id="tasktype" name="tasktype" class="form-control">
                                <c:forEach var="t" items="${tasktypes}">
                                    <option value="${t.id}">${t.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">计费模式</label>
                        <div class="col-sm-10">
                            <select id="pricingmodel" name="pricingmodel" class="form-control">
                                <c:forEach var="p" items="${pricingmodels}">
                                    <option value="${p.id}">${p.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-default">提交任务</button>
                        </div>
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
<!-- <script src="https://www.google-analytics.com/analytics.js" async defer></script> -->
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=xF2LVjT56BEmuoYDHUtNMkGch0FAVi3F"></script>
<script src="${pageContext.request.contextPath }/js/map.js"></script>


<!-- <script src="js/jquery-ui.js"></script> -->
<!-- 使用velocity动画库 -->
<!-- <script src="https://cdn.jsdelivr.net/npm/velocity-animate@1.5.0/velocity.min.js"></script> -->
<!-- <script src="https://cdn.jsdelivr.net/npm/velocity-animate@1.5.0/velocity.ui.min.js"></script> -->
</body>

</html>


<%--<form action="/task/release" method="post">--%>
    <%--任务名:<input type="text" name = "name" ><p>--%>
    <%--任务信息:<input type="text" name = "message" ><p>--%>
    <%--起始大概位置:<input type="text" name = "startingaddress" ><p>--%>
    <%--起始具体位置:<input type="text" name = "startingdetail" ><p>--%>
    <%--目的大概位置:<input type="text" name = "purposeaddress" ><p>--%>
    <%--目的大概位置:<input type="text" name = "purposedetail" ><p>--%>
    <%--重量<input type="number" name="weight"><p>--%>
    <%--任务种类:  <select id="tasktype" name="tasktype">--%>
    <%--<c:forEach var="t" items="${tasktypes}">--%>
        <%--<option value="${t.id}">${t.name}</option>--%>
    <%--</c:forEach>--%>
<%--</select>--%>
    <%--计费模式:  <select id="pricingmodel" name="pricingmodel">--%>
    <%--<c:forEach var="p" items="${pricingmodels}">--%>
        <%--<option value="${p.id}">${p.name}</option>--%>
    <%--</c:forEach>--%>
<%--</select>--%>

    <%--<input type="submit" value="登录">--%>
<%--</form>--%>