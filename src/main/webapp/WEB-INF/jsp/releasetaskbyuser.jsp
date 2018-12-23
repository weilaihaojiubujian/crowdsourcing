<%--
  Created by IntelliJ IDEA.
  User: 汪宏斌
  Date: 2018/12/2
  Time: 20:14
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
    <title>已发布任务</title>
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
            <!-- <span class="caret"></span>             -->
            </div>
          </a> 
              <a href="/administrator/audituser?pageNum=1" class="hvr-underline-from-center">
                <div class="navItems">
                  管理银行卡
                </div>
              </a>
              <a href="/administrator/auditbusiness?pageNum=1" class="hvr-underline-from-center">
                <div class="navItems">
                  管理信息
                </div>
              </a>
              <a href="/administrator/audittask?pageNum=1" class="hvr-underline-from-center">
                <div class="navItems">
                  发布任务              
                </div>
              </a>
              <a href="/administrator/auditbyevaluation?pageNum=1" class="hvr-underline-from-left">
                <div class="navItems">
                  资金管理
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
                        <div><i class="icon-user"></i></div><div><a href="/task/release">发布任务</a></div>
                      </div>
                    </li>
                    <li>
                    <div class="liItems">
                        <div><i class="icon-group"></i></div><div><a href="/user/information">个人信息</a></div>
                      </div>
                    </li>
                    <li>
                    <div class="liItems">
                        <div><i class="icon-list-alt"></i></div><div><a href="/task/message?pageNum=1">任务消息</a></div>
                      </div>
                    </li>
                    <li>
                    <div class="liItems">
                        <div><i class="icon-angle-right"></i></div><div><a href="/task/releasebyuser?pageNum=1">查看任务</a></div>
                      </div>
                    </li>
                    <li>
                    <div class="liItems">
                        <div><i class="icon-angle-right"></i></div><div><a href="/bankaccount/bankaccount?pageNum=1">查看银行卡</a></div>
                      </div>
                    </li>
                    <li>
                    <div class="liItems">
                        <div><i class="icon-exchange"></i></div><div><a href="/transfer/view?pageNum=1">查看转账记录</a></div>
                      </div>
                    </li>
                    <li>
                    <div class="liItems">
                        <div><i class="icon-exchange"></i></div><div><a href="/transfer/recharge1">充值</a></div>
                      </div>
                    </li>
                    <li>
                    <div class="liItems">
                        <div><i class="icon-exchange"></i></div><div><a href="/transfer/withdrawal1">提现</a></div>
                      </div>
                    </li>
                  </ul>
                </div>
          </aside>
          <main role="main" class="col-md-8 col-md-offset-3 col-sm-10 col-sm-offset-1 col-xs-10 col-xs-offset-1">
              <div class="container-fuild">
                <div class="row">
                  <section class="col-md-12 userTable">                             
                <div class="tableAndNav">
                    <section>
                        <h1>已发布任务</h1>
                        <table class="table table-bordered table-hover table-striped">
                            <tr>
                                  <th>序号</th>
                                  <th>任务名</th>
                                  <th>任务信息</th>
                                  <th>任务种类名</th>
                                  <th>计费方式名</th>
                                  <th>起始位置</th>
                                  <th>目的位置</th>
                                  <th>物品重量</th>
                                  <th>价格</th>
                                  <th>接受任务人序号</th>
                                  <th></th>
                                  <th></th>
                              </tr>
                              <c:forEach var="p" items="${taskinformations.list}">
                                  <tr>
                                      <td>${p.id}</td>
                                      <td><c:out value="${p.name}"></c:out></td>
                                      <td><c:out value="${p.message}"></c:out></td>
                                      <td><c:out value="${p.ttname}"></c:out></td>
                                      <td><c:out value="${p.pmname}"></c:out></td>
                                      <td><c:out value="${p.startingaddress}"></c:out></td>
                                      <td><c:out value="${p.purposeaddress}"></c:out></td>
                                      <td><c:out value="${p.weight}"></c:out></td>
                                      <td><c:out value="${p.price}"></c:out></td>
                                      <td><c:out value="${p.uid}"></c:out></td>
                                      <td><c:if test="${ p.uid==0}"><a href="/task/delete/${p.id}"   ><input type="button" name="取消任务" value="取消任务"></a></c:if></td>
                                      <td><c:if test="${ p.uid!=0}"><input type="button" name="评价" value="评价" class="evaluationButton"></c:if></td>

                                  </tr>

                              <tr class="evaluationContainer">
                                  <td colspan="12">
                                      <form action="/task/evaluation/${p.tid}" method="get">
                                          <textarea name="evaluation" class="evaluation" id="evaluation" placeholder="请在此输入评价"></textarea>
                                          <input type="submit" value="提交评价">
                                      </form>
                                  </td>
                              </tr>
                              </c:forEach>
                              
                        </table>
                        <nav class="changePage" style="position: static;">
                    <ul class="pager">
                      <li class="previous"><a href="/task/releasebyuser?pageNum=1"><span aria-hidden="true">&larr;</span>首页</a></li>
                      <li><a href="/task/releasebyuser?pageNum=${taskinformations.pageNum>1 ? (taskinformations.pageNum-1):1 }">上一页</a></li>
                      <li><a href="/task/releasebyuser?pageNum=${taskinformations.pageNum<taskinformations.pages ? (taskinformations.pageNum+1):taskinformations.pages }">下一页</a></li>
                      <li class="next"><a href="/task/releasebyuser?pageNum=${taskinformations.pages }">尾页 <span aria-hidden="true">&rarr;</span></a></li>
                    </ul>
                    <div class="changePageMessage">
                      <p class="small">
                          当前${taskinformations.pageNum }/${taskinformations.pages }页，共${taskinformations.total }条
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
              
            </div>
          </main>
      </div>
      <footer role="contentinfo">
        Copyright &copy; 2018.12.4 Design By 同城跑腿
      </footer>
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
    <script src="${pageContext.request.contextPath }/js/bankaccount.js"></script>
    <!-- <script src="js/jquery-ui.js"></script> -->
    <!-- 使用velocity动画库 -->
    <!-- <script src="https://cdn.jsdelivr.net/npm/velocity-animate@1.5.0/velocity.min.js"></script> -->
    <!-- <script src="https://cdn.jsdelivr.net/npm/velocity-animate@1.5.0/velocity.ui.min.js"></script> -->
    <!-- <script src="http://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
    <!-- bootstrap轮播插件 与bootstrap.js连用 -->
  </body>

</html>


<!-- <table class="table table-bordered table-hover table-striped">
    <tr>
        <th>序号</th>
        <th>任务名</th>
        <th>任务信息</th>
        <th>任务种类名</th>
        <th>计费方式名</th>
        <th>起始位置</th>
        <th>目的位置</th>
        <th>物品重量</th>
        <th>价格</th>
        <th>接受任务人序号</th>
        <th></th>
        <th></th>
    </tr>
    <c:forEach var="p" items="${taskinformations.list}">
        <tr>
            <td>${p.id}</td>
            <td><c:out value="${p.name}"></c:out></td>
            <td><c:out value="${p.message}"></c:out></td>
            <td><c:out value="${p.ttname}"></c:out></td>
            <td><c:out value="${p.pmname}"></c:out></td>
            <td><c:out value="${p.startingaddress}"></c:out></td>
            <td><c:out value="${p.purposeaddress}"></c:out></td>
            <td><c:out value="${p.weight}"></c:out></td>
            <td><c:out value="${p.price}"></c:out></td>
            <td><c:out value="${p.uid}"></c:out></td>
            <td><c:if test="${ p.uid==0}"><a href="/task/delete/${p.id}"   ><input type="button" name="取消任务" value="取消任务"></a></c:if></td>
            <td><c:if test="${ p.uid!=0}"><input type="button" name="评价" value="评价" class="evaluationButton"></c:if></td>

        </tr>

    <tr class="evaluationContainer">
        <td colspan="12">
            <form action="/task/evaluation/${p.tid}" method="get">
                <textarea name="evaluation" class="evaluation" id="evaluation" placeholder="请在此输入评价"></textarea>
                <input type="submit" value="提交评价">
            </form>
        </td>
    </tr>
    </c:forEach>
    <tr align="center">
        <td colspan="11">
            <a href="/task/releasebyuser?pageNum=1">首页</a>  
            <a href="/task/releasebyuser?pageNum=${taskinformations.pageNum>1 ? (taskinformations.pageNum-1):1 }">上一页</a>  
            <a href="/task/releasebyuser?pageNum=${taskinformations.pageNum<taskinformations.pages ? (taskinformations.pageNum+1):taskinformations.pages }">下一页</a>  
            <a href="/task/releasebyuser?pageNum=${taskinformations.pages }">尾页</a>    
            当前${taskinformations.pageNum }/${taskinformations.pages }页，共${taskinformations.total }条

        </td>
    </tr>
</table> -->


<!-- <table class="table table-bordered table-hover table-striped">
    <tr>
        <th>序号</th>
        <th>任务名</th>
        <th>任务信息</th>
        <th>任务种类名</th>
        <th>计费方式名</th>
        <th>起始位置</th>
        <th>目的位置</th>
        <th>物品重量</th>
        <th>价格</th>
        <th>接受任务人序号</th>
        <th></th>
        <th></th>
    </tr>
    <c:forEach var="p" items="${taskinformations.list}">
        <tr>
            <td>${p.id}</td>
            <td><c:out value="${p.name}"></c:out></td>
            <td><c:out value="${p.message}"></c:out></td>
            <td><c:out value="${p.ttname}"></c:out></td>
            <td><c:out value="${p.pmname}"></c:out></td>
            <td><c:out value="${p.startingaddress}"></c:out></td>
            <td><c:out value="${p.purposeaddress}"></c:out></td>
            <td><c:out value="${p.weight}"></c:out></td>
            <td><c:out value="${p.price}"></c:out></td>
            <td><c:out value="${p.uid}"></c:out></td>
            <td><c:if test="${ p.uid==0}"><a href="/task/delete/${p.id}"   ><input type="button" name="取消任务" value="取消任务"></a></c:if></td>
            <td><c:if test="${ p.uid!=0}"><input type="button" name="评价" value="评价" class="evaluationButton"></c:if></td>

        </tr>

    <tr class="evaluationContainer">
        <td colspan="12">
            <form action="/task/evaluation/${p.tid}" method="get">
                <textarea name="evaluation" class="evaluation" id="evaluation" placeholder="请在此输入评价"></textarea>
                <input type="submit" value="提交评价">
            </form>
        </td>
    </tr>
    </c:forEach>
    <tr align="center">
        <td colspan="11">
            <a href="/task/releasebyuser?pageNum=1">首页</a>  
            <a href="/task/releasebyuser?pageNum=${taskinformations.pageNum>1 ? (taskinformations.pageNum-1):1 }">上一页</a>  
            <a href="/task/releasebyuser?pageNum=${taskinformations.pageNum<taskinformations.pages ? (taskinformations.pageNum+1):taskinformations.pages }">下一页</a>  
            <a href="/task/releasebyuser?pageNum=${taskinformations.pages }">尾页</a>    
            当前${taskinformations.pageNum }/${taskinformations.pages }页，共${taskinformations.total }条

        </td>
    </tr>
</table> -->

