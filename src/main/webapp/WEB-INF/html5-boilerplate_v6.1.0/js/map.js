
$(function () {
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
			$("#startePostion").val(baiduLongitude+","+baiduLatitude);

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

	map.addEventListener("click", function (e) {
		$("#startePostion").val(e.point.lng+","+e.point.lat);
		$('#startPostionMap').slideUp("slow");
	}, false);

	$('.startPosition').on('click', function(event) {
		event.preventDefault();
		$('#startPostionMap').slideDown("slow");
	});



	endMap.addEventListener("click", function (e) {
		$("#endPosition").val(e.point.lng+","+e.point.lat);
		$('#endPostionMap').slideUp("slow");
	}, false);

	$('.endPosition').on('click', function(event) {
		event.preventDefault();
		$('#endPostionMap').slideDown("slow");
	});

});