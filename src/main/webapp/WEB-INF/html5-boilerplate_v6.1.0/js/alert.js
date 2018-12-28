$(function () {
	$('.alert').animate({
		right : 0},
		'slow', function() {
		$('.alert strong').text('okokok');
	});
})