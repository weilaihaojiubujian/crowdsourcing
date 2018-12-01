
$(function () {

// -----------------------------百度地图api start-------------------------------------
  // 百度地图API功能
  var map = new BMap.Map("startPostionMap");    // 创建Map实例
  map.centerAndZoom(new BMap.Point(116.404, 39.915), 15);  // 初始化地图,设置中心点坐标和地图级别
  //添加地图类型控件
  map.addControl(new BMap.MapTypeControl({
    mapTypes:[
      BMAP_NORMAL_MAP,
      BMAP_HYBRID_MAP
    ]}));
  map.setCurrentCity("北京");          // 设置地图显示的城市 此项是必须设置的
  map.enableScrollWheelZoom(true);
  var ggPoint  = new BMap.Point(116.32715863448607,39.990912172420714);

  // 百度地图API功能
  var endMap = new BMap.Map("endPostionMap");    // 创建Map实例
  endMap.centerAndZoom(new BMap.Point(116.404, 39.915), 15);  // 初始化地图,设置中心点坐标和地图级别
  //添加地图类型控件
  endMap.addControl(new BMap.MapTypeControl({
    mapTypes:[
      BMAP_NORMAL_MAP,
      BMAP_HYBRID_MAP
    ]}));
  endMap.setCurrentCity("北京");          // 设置地图显示的城市 此项是必须设置的
  endMap.enableScrollWheelZoom(true);
  var ppPoint  = new BMap.Point(116.32715863448607,39.990912172420714);

  var endNaturalLongitude;
  var endNaturalLatitude;
  var endBaiduLongitude;
  var endBaiduLatitude;


  var naturalLongitude;
  var naturalLatitude;
  var baiduLongitude;
  var baiduLatitude;

  var geoc = new BMap.Geocoder();
  // 转换定位
  function success(position) {
    naturalLatitude = position.coords.latitude;
    naturalLongitude = position.coords.longitude;
    ggPoint = new BMap.Point(naturalLongitude,naturalLatitude);

    endNaturalLatitude = position.coords.latitude;
    endNaturalLongitude = position.coords.longitude;
    ppPoint = new BMap.Point(endNaturalLongitude,endNaturalLatitude);
    // alert(naturalLongitude);
  }
  function fail(msg) {
    console.log(msg);
  }

  if (Modernizr.geolocation) {
    navigator.geolocation.getCurrentPosition(success,fail);
  }

  endMap.addControl(new BMap.NavigationControl());
  map.addControl(new BMap.NavigationControl());
  translateCallback = function (data) {
    if (data.status ===0) {
      var marker = new BMap.Marker(data.points[0]);
      map.addOverlay(marker);
      endMap.addOverlay(marker);
      // var label = new BMap.Label("您的位置：",{offset:new BMap.Size(20,-10)});
      map.setCenter(data.points[0]);
      baiduLongitude = data.points[0].lng;
      baiduLatitude = data.points[0].lat;
      // alert(baiduLongitude);
      $("#startPostion").val(baiduLongitude+","+baiduLatitude);

      endMap.setCenter(data.points[0]);
      endBaiduLongitude = data.points[0].lng;
      endBaiduLatitude = data.points[0].lat;
      // alert(baiduLongitude);
      $("#endPosition").val(endBaiduLongitude+","+endBaiduLatitude);
    }
  };
  setTimeout(function(){
    var convertor = new BMap.Convertor();
    var pointArr = [];
    pointArr.push(ggPoint);
    convertor.translate(pointArr, 1, 5, translateCallback);
  }, 1000);


  // 点击地图获取坐标
  map.addEventListener("click", function (e) {
    $("#startPostion").val(e.point.lng+","+e.point.lat);
    geoc.getLocation(e.point, function(rs){
      var addComp = rs.addressComponents;
      $(".startPositionSpan").text(addComp.province + " " + addComp.city + " " + addComp.district + " " + addComp.street + " " + addComp.streetNumber);
      var msg1 = $('#startPostion').val();
      $("#startPostion").val(msg1+","+addComp.province + " " + addComp.city + " " + addComp.district + " " + addComp.street + " " + addComp.streetNumber);
    });
    $('.searchStartPosition').val("");
    $('.startMapContainer').slideUp("slow");
  }, false);

  $('.startPosition').on('click', function(event) {
    event.preventDefault();
    $('.startMapContainer').slideDown("slow");
  });



  endMap.addEventListener("click", function (e) {
    $("#endPosition").val(e.point.lng+","+e.point.lat);
    geoc.getLocation(e.point, function(rs){
      var addComp = rs.addressComponents;
      $(".endPositionSpan").text(addComp.province + " " + addComp.city + " " + addComp.district + " " + addComp.street + " " + addComp.streetNumber);
      var msg1 = $('#endPostion').val();
      $("#endPostion").val(msg1+","+addComp.province + " " + addComp.city + " " + addComp.district + " " + addComp.street + " " + addComp.streetNumber);
    });
    $('.searchEndPosition').val("");
    $('.endMapContainer').slideUp("slow");
  }, false);

  $('.endPosition').on('click', function(event) {
    event.preventDefault();
    $('.endMapContainer').slideDown("slow");
  });



  // 关键字输入提示  startMap
  function G(id) {
    return document.getElementById(id);
  }
  var ac = new BMap.Autocomplete(    //建立一个自动完成的对象
    {"input" : "suggestId",
      "location" : map
    });
  ac.addEventListener("onhighlight", function(e) {  //鼠标放在下拉列表上的事件
    var str = "";
    var _value = e.fromitem.value;
    var value = "";
    if (e.fromitem.index > -1) {
      value = _value.province +  _value.city +  _value.district +  _value.street +  _value.business;
    }
    str = "FromItem<br />index = " + e.fromitem.index + "<br />value = " + value;

    value = "";
    if (e.toitem.index > -1) {
      _value = e.toitem.value;
      value = _value.province +  _value.city +  _value.district +  _value.street +  _value.business;
    }
    str += "<br />ToItem<br />index = " + e.toitem.index + "<br />value = " + value;
    G("searchResultPanel").innerHTML = str;
  });

  var myValue;
  ac.addEventListener("onconfirm", function(e) {    //鼠标点击下拉列表后的事件
    var _value = e.item.value;
    myValue = _value.province +  _value.city +  _value.district +  _value.street +  _value.business;
    G("searchResultPanel").innerHTML ="onconfirm<br />index = " + e.item.index + "<br />myValue = " + myValue;

    setPlace();
  });

  function setPlace(){
    map.clearOverlays();    //清除地图上所有覆盖物
    function myFun(){
      var pp = local.getResults().getPoi(0).point;    //获取第一个智能搜索的结果
      map.centerAndZoom(pp, 18);
      map.addOverlay(new BMap.Marker(pp));    //添加标注
      $('.hiddenStartPosition').val(pp.lng+","+pp.lat);
    }
    var local = new BMap.LocalSearch(map, { //智能搜索
      onSearchComplete: myFun
    });
    local.search(myValue);
  }

  $(".startMapButton").on('click', function(event) {
    event.preventDefault();
    $('.startPositionSpan').text($('.searchStartPosition').val());
    var msg1 = $('#startPostion').val();
    $("#startPostion").val(msg1+","+$('.searchStartPosition').val());
    $('.startMapContainer').slideUp("slow");
  });

  // 关键字输入提示  endMap

  var ab = new BMap.Autocomplete(    //建立一个自动完成的对象
    {"input" : "suggestEndId",
      "location" : endMap
    });
  ab.addEventListener("onhighlight", function(e) {  //鼠标放在下拉列表上的事件
    var str = "";
    var _value = e.fromitem.value;
    var value = "";
    if (e.fromitem.index > -1) {
      value = _value.province +  _value.city +  _value.district +  _value.street +  _value.business;
    }
    str = "FromItem<br />index = " + e.fromitem.index + "<br />value = " + value;

    value = "";
    if (e.toitem.index > -1) {
      _value = e.toitem.value;
      value = _value.province +  _value.city +  _value.district +  _value.street +  _value.business;
    }
    str += "<br />ToItem<br />index = " + e.toitem.index + "<br />value = " + value;
    G("searchEndResultPanel").innerHTML = str;
  });

  var myEndValue;
  ab.addEventListener("onconfirm", function(e) {    //鼠标点击下拉列表后的事件
    var _value = e.item.value;
    myEndValue = _value.province +  _value.city +  _value.district +  _value.street +  _value.business;
    G("searchEndResultPanel").innerHTML ="onconfirm<br />index = " + e.item.index + "<br />myValue = " + myEndValue;

    setEndPlace();
  });

  function setEndPlace(){
    endMap.clearOverlays();    //清除地图上所有覆盖物
    function myFun(){
      var pp = local.getResults().getPoi(0).point;    //获取第一个智能搜索的结果
      endMap.centerAndZoom(pp, 18);
      endMap.addOverlay(new BMap.Marker(pp));    //添加标注
      $('.hiddenEndPosition').val(pp.lng+","+pp.lat);
    }
    var local = new BMap.LocalSearch(endMap, { //智能搜索
      onSearchComplete: myFun
    });
    local.search(myEndValue);
  }

  $(".endMapButton").on('click', function(event) {
    event.preventDefault();
    $('.endPositionSpan').text($('.searchEndPosition').val());
    var msg1 = $('#endPosition').val();
    $("#endPosition").val(msg1+","+$('.searchEndPosition').val());
    $('.endMapContainer').slideUp("slow");
  });

// -----------------------------百度地图api end-------------------------------------

});
