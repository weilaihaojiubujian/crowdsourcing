$(function () {
    var bm = new BMap.Map("allmap");
    var naturalLongitude;
    var naturalLatitude;
    bm.centerAndZoom(new BMap.Point(116.404, 39.915), 15);
    var ggPoint;
    var baiduLongitude,baiduLatitude;
    function getCurrentPistion() {
        if (Modernizr.geolocation) {
            navigator.geolocation.getCurrentPosition(success,fail);
        }

        function success(position) {
            naturalLatitude = position.coords.latitude;
            naturalLongitude = position.coords.longitude;
            // alert(naturalLongitude);
            ggPoint = new BMap.Point(naturalLongitude,naturalLatitude);
            bm.centerAndZoom(ggPoint, 15);

        }
        function fail(msg) {
            console.log(msg);
        }
        bm.addControl(new BMap.NavigationControl());
        translateCallback = function (data){
            if(data.status === 0) {
                var marker = new BMap.Marker(data.points[0]);
                bm.addOverlay(marker);
                bm.setCenter(data.points[0],15);
                baiduLongitude = data.points[0].lng;
                baiduLatitude = data.points[0].lat;
                // alert(baiduLatitude==undefined);
                // alert(baiduLongitude+" "+baiduLatitude);
                // doAlert();
                updateMessage(baiduLongitude,baiduLatitude);

            }
        };
        setTimeout(function(){
            var convertor = new BMap.Convertor();
            var pointArr = [];
            pointArr.push(ggPoint);
            convertor.translate(pointArr, 1, 5, translateCallback);
        }, 1000);

    }
    getCurrentPistion();
    function updateMessage(baiduLongitude,baiduLatitude) {
        // var position = {
        // 	"lng":baiduLongitude,
        // 	"lat":baiduLatitude
        // };	// alert(position.lng);
        $.ajax({
            url: '/path/to/file',
            type: 'POST',
            data: {
                lng: baiduLongitude,
                lat:baiduLatitude
            },
        })
            .done(function() {
                console.log("success");
            })
            .fail(function() {
                console.log("error");
            })
            .always(function() {
                console.log("complete");
            });

    }

    var interval = setInterval(function () {
        getCurrentPistion();
    }, 60000);

});