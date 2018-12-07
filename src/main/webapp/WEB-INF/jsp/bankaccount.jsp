<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/12/6
  Time: 11:44
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
    <title>银行卡</title>
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
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/bankaccount.css">
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
                <h1>商家</h1>
                <table class="table table-bordered table-hover table-striped">
                    <tr>
                        <th>序号</th>
                        <th>银行卡号</th>

                        <th></th>
                    </tr>
                    <c:forEach var="m" items="${bankAccounts.list}">
                        <tr>
                            <td>${m.id}</td>
                            <td><c:out value="${m.account}"></c:out></td>

                            <td><a href="/bankaccount/delete/${m.id}"   ><input type="button" name="删除" value="删除"></a></td>
                        </tr><br>
                    </c:forEach>
                    <tr align="center">
                        <td colspan="9">
                            <a href="/bankaccount/bankaccount?pageNum=1">首页</a>  
                            <a href="/bankaccount/bankaccount?pageNum=${bankAccounts.pageNum>1 ? (bankAccounts.pageNum-1):1 }">上一页</a>  
                            <a href="/bankaccount/bankaccount?pageNum=${bankAccounts.pageNum<bankAccounts.pages ? (bankAccounts.pageNum+1):bankAccounts.pages }">下一页</a>  
                            <a href="/bankaccount/bankaccount?pageNum=${bankAccounts.pages }">尾页</a>    
                            当前${bankAccounts.pageNum }/${bankAccounts.pages }页，共${bankAccounts.total }条

                        </td>
                    </tr>
                </table>
            </section>
            <section>
                <h2>添加银行卡</h2>
                <input type="button" name="添加银行卡" value="添加银行卡" class="addBankAccountButton button button-action button-rounded">
                <form action="/bankaccount/add" class="addBankAccount form-inline
		  			">
                    <h4>请在下方输入您需要添加的银行卡号</h4>
                    <div class="form-group">
                        <label for="num">卡号：</label>
                        <input type="number" class="form-control" id="num" oninput="if(value.length>12)value=value.slice(0,12)">
                    </div>
                    <button type="submit" class="button button-action button-rounded">添加银行卡</button>
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
<script src="${pageContext.request.contextPath }/js/bankaccount.js"></script>
<!-- <script src="js/jquery-ui.js"></script> -->
<!-- 使用velocity动画库 -->
<!-- <script src="https://cdn.jsdelivr.net/npm/velocity-animate@1.5.0/velocity.min.js"></script> -->
<!-- <script src="https://cdn.jsdelivr.net/npm/velocity-animate@1.5.0/velocity.ui.min.js"></script> -->
<!-- <script src="http://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
<!-- bootstrap轮播插件 与bootstrap.js连用 -->
</body>

</html>

