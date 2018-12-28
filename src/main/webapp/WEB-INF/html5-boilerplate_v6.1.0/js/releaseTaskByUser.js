$(function () {
	$('.evaluationContainer').hide();
	$('.evaluationButton').on('click', function(event) {
		event.preventDefault();
		$('.evaluationContainer').fadeIn("slow");
	});
});