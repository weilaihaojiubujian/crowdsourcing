<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/11/22
  Time: 19:32
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
	<title>管理员主页</title>
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
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/responsive-nav.css">

	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/administrator.css">


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
			<a href="#" class="hvr-underline-from-right">
				<div class="navItems">
					登出
					<!-- <span class="caret"></span>           	 -->
				</div>
			</a>
			<a href="/administrator/audituser?pageNum=1" class="hvr-underline-from-center">
				<div class="navItems">
					审核用户
				</div>
			</a>
			<a href="/administrator/auditbusiness?pageNum=1" class="hvr-underline-from-center">
				<div class="navItems">
					审核商家
				</div>
			</a>
			<a href="/administrator/audittask?pageNum=1" class="hvr-underline-from-center">
				<div class="navItems">
					审核任务
				</div>
			</a>
			<a href="/administrator/auditbyevaluation?pageNum=1" class="hvr-underline-from-left">
				<div class="navItems">
					管理不良用户
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
							<div><i class="icon-user"></i></div><div><p>审核用户</p></div><div><i class="icon-angle-right invisible"></i></div>
						</div>
					</li>
					<li>
						<div class="liItems">
							<div><i class="icon-group"></i></div><div><p>审核商家</p></div><div><i class="icon-angle-right invisible"></i></div>
						</div>
					</li>
					<li>
						<div class="liItems">
							<div><i class="icon-list-alt"></i></div><div><p>审核任务</p></div><div><i class="icon-angle-right invisible"></i></div>
						</div>
					</li>
					<li>
						<div class="liItems">
							<div><i class="icon-minus-sign"></i></div><div><p>管理用户</p></div><div><i class="icon-angle-right invisible"></i></div>
						</div>
					</li>
				</ul>
			</div>
		</aside>
		<main role="main" class="col-md-8 col-md-offset-3 col-sm-10 col-sm-offset-1 col-xs-10 col-xs-offset-1">
			<div class="container-fuild">
				<div class="row">
					<div class="col-md-12 topH">
						<h2 class="text-center">平台监控</h2>
					</div>
				</div>
				<div class="row desDiv">
					<div class="col-md-3 col-xs-12 col-sm-3 fakeItem">
						<div class="msgDiv">
							<h4>发布任务总数</h4>
							<p>36</p>
						</div>
						<i class="icon-spinner icon-spin icon-4x"></i>
					</div>
					<div class="col-md-3 col-xs-12 col-sm-3 fakeItem">
						<div class="msgDiv">
							<h4>完成任务总数</h4>
							<p>22</p>
						</div>
						<i class="icon-check icon-4x"></i>
					</div>
					<div class="col-md-3 col-xs-12 col-sm-3 fakeItem">
						<div class="msgDiv">
							<h4>平台使用人数</h4>
							<p>13</p>
						</div>
						<i class="icon-globe icon-4x"></i>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4 imgDiv col-md-offset-1 fakeItem">
						<img src="${pageContext.request.contextPath }/img/adp1.png" alt="平台使用商家个人比重" class="img-responsive adp">
					</div>
					<div class="col-md-5 col-md-offset-1 imgDiv fakeItem">
						<img src="${pageContext.request.contextPath }/img/adp2.png" alt="平台任务发布与完成数量" class="img-responsive adp">
					</div>
				</div>
				<div class="row">
					<ol class="breadcrumb">
						<li><a href="#">管理员主页</a></li>
						<!-- <li><a href="#">Library</a></li> -->
						<li class="active">监控数据</li>
					</ol>
				</div>
				<div class="row">
					<div class="col-md-10 imgDiv col-md-offset-1 fakeItem">
						<img src="${pageContext.request.contextPath }/img/adp3.png" alt="平台各月使用人数" class="img-responsive">
					</div>
				</div>
			</div>
		</main>
	</div>
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
<!-- <script src="https://www.google-analytics.com/analytics.js" async defer></script> -->
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- <script src="js/jquery-ui.js"></script> -->
<!-- 使用velocity动画库 -->
<!-- <script src="https://cdn.jsdelivr.net/npm/velocity-animate@1.5.0/velocity.min.js"></script> -->
<script src="http://cdn.bootcss.com/bootstrap/2.3.1/js/bootstrap-dropdown.js"></script>
<%--<<script src="${pageContext.request.contextPath }/js/responsive-nav.js" type="text/javascript"></script>--%>
<script src="${pageContext.request.contextPath }/js/administrator.js"></script>
</body>

</html>


<!-- <a href="/administrator/audituser?pageNum=1"   ><input type="button" name="审核用户" value="审核用户"></a>
<a href="/administrator/auditbusiness?pageNum=1"   ><input type="button" name="审核商家" value="审核商家"></a>
<a href="/administrator/audittask?pageNum=1"   ><input type="button" name="审核任务" value="审核任务"></a>
<a href="/administrator/auditbyevaluation?pageNum=1"   ><input type="button" name="通过评价审核用户是否为不良用户" value="通过评价审核用户是否为不良用户"></a> -->