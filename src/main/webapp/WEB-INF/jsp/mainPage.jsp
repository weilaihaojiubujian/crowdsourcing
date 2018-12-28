<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/12/5
  Time: 19:34
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
    <title>主页</title>
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
    <!-- icon -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/buttons.css">
    <!-- 按钮样式 -->
    <!-- <link rel="stylesheet" href="css/hover.css"> -->
    <!-- 悬浮效果 -->
    <!-- <link rel="stylesheet" href="css/animate.css"> -->
    <!-- 动画库 -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/mainPage.css">

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
                <img src="${pageContext.request.contextPath }/img/logo.png" alt="logo">
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
        <article>
            <div id="myCarousel" class="carousel slide">
                <!-- 轮播（Carousel）指标 -->
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                </ol>
                <!-- 轮播（Carousel）项目 -->
                <div class="carousel-inner">
                    <div class="item active">
                        <img src="${pageContext.request.contextPath }/img/bk5.png" alt="First slide">
                    </div>
                    <div class="item">
                        <img src="${pageContext.request.contextPath }/img/bk2.png" alt="Second slide">
                    </div>
                    <div class="item">
                        <img src="${pageContext.request.contextPath }/img/bk3.png" alt="Third slide">
                    </div>
                </div>
                <!-- 轮播（Carousel）导航 -->
                <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </article>
        <article>
            <div class="introduce-1">
                <div class="introduce-top">
                    <div>
                        <i  class="icon-suitcase icon-3x"></i>
                        <div>
                            <h3>更方便</h3>
                            <p>一对一专人服务/同城跑腿人就在你身边</p>
                        </div>
                    </div>
                    <div>
                        <i  class="icon-group icon-3x"></i>
                        <div>
                            <h3>更便捷</h3>
                            <p>随时随地/风雨无阻，为您跑腿做事</p>
                        </div>
                    </div>
                    <div>
                        <i  class="icon-road icon-3x"></i>
                        <div>
                            <h3>更快速</h3>
                            <p>平均10秒响应/全网最快为您服务</p>
                        </div>
                    </div>
                </div>
                <div>
                    <h1>一呼百应，全城跑腿为您提供安全专业的即时同城跑腿服务</h1>
                    <p class="lead">全城跑腿服务人员实名认证，全城送取59分钟内完成</p>
                </div>
            </div>
        </article>
        <article class="introduce-2">
            <section>
                <div class="img1"></div>
                <div class="right-text">
                    <h3>天气太冷，不想出门？</h3>

                </div>
            </section>
            <section>
                <div class="img2"></div>

                <div class="right-text">
                    <h3> 一时心急，忘带东西？</h3>

                </div>
            </section>
            <section>
                <div class="img3"></div>
                <div class="right-text">
                    <h3>工作繁忙，没空排队？</h3>

                </div>
            </section>
            <section>
                <div class="img4"></div>

                <div class="right-text">
                    <h3>同城跑腿，包君满意。</h3>

                </div>
            </section>
        </article>
    </main>
    <aside role="complementary"></aside>
    <footer role="contentinfo">
        <div class="contact">
            <section class="contactItem1">
                <h2>Contact</h2>
                <ul>
                    <li><i class="icon-envelope"></i>Email:123456789@example.com</li>
                    <li><i class="icon-phone"></i>Tel:12345678901</li>
                    <li><i class="icon-map-marker"></i>Address:浙江省 杭州市 浙江科技学院</li>
                </ul>
            </section>
            <section class="contactItem2">
                <h2>Special Thanks</h2>
                <p>
                    本项目由 浙江科技学院软工 161 汪宏斌 <br>
                    浙江科技学院 软工161 张钰恺<br>
                    浙江科技学院 软工162 单家颖<br>
                    合作完成
                </p>
            </section>

        </div>
        <div>
            Copyright &copy; 2018.12.4 Design By 同城跑腿
        </div>
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
<!-- <script src="js/login.js"></script> -->
</body>

</html>


