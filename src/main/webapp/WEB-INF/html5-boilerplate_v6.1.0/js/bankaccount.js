$(function () {
	$('.addBankAccountButton').on('click', function(event) {
		event.preventDefault();
		$('.addBankAccount').fadeIn("slow");
		$('.addBankAccount :input').eq(0).focus();
	});
	// $('.addBankAccount :input').eq(0).on('input', function(event) {	
	// 	if ($('.addBankAccount :input').eq(0).val().length>=12) {
	// 		// alert($('.addBankAccount :input').eq(0).val().length);
	// 		$('.addBankAccount :input').eq(0).val().slice(0,12);
	// 		// event.preventDefault();
	// 	}
	// 	/* Act on the event */
	// });
});