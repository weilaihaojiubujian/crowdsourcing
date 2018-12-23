$(function () {	
	function showSideBar() {		
				if ($('aside').hasClass('hideAside')) {
					// alert("10");
					// $('main').addClass('col-xs-5 col-sm-5').removeClass('col-sm-10 col-sm-offset-1 col-xs-10 col-xs-offset-1');
					// $('.asideNav').addClass('col-xs-7 col-sm-7').removeClass('hidden-xs hidden-sm');
					$('aside').removeClass('hidden-xs hidden-sm hideAside').addClass('showAside');
					
				}
				else if ($('aside').hasClass('showAside')) {
					$('aside').removeClass('showAside').addClass('hideAside hidden-xs hidden-sm');
					// alert("5");
					// $('.asideNav').addClass('hidden-xs hidden-sm').removeClass('col-xs-7 col-sm-7');
					// $('main').addClass('col-sm-10 col-sm-offset-1 col-xs-10 col-xs-offset-1').removeClass('col-xs-5 col-sm-5');		
				}			
	}
	$('.openSideBar').on('click', function(event) {
		showSideBar();
	});	
	$('main').on('click', function(event) {
		// alert("focus");
		event.preventDefault();
		if($('aside').hasClass('showAside')){
			$('aside').removeClass('showAside').addClass('hideAside hidden-xs hidden-sm');
		}
	});
});