$(function () {
	 // $( "#datepicker" ).datepicker();
	var $tableItems= $("[name='businessMessage']").children();
	// alert($tableMessage.eq(0).html());
	var $table = $(".showInformation");
	var $form = $(".changeInformation");
	var $modifyMessageButton = $("button[name='modifyMessage']");
	var $showMessageButton = $("button[name='showMessage']");
	$table.hide().slideDown();
	$form.hide();
	$modifyMessageButton.on('click', function(event) {
		event.preventDefault();
		$table.slideUp();
		$form.slideDown();
	});
	$showMessageButton.on('click', function(event) {
		event.preventDefault();
		$("#id").val($tableItems.eq(0).html());
		$("#userName").val($tableItems.eq(1).html());
		// $("#password").val($tableItems.eq(2).html());
		$("#tel").val($tableItems.eq(3).html());
		$("#name").val($tableItems.eq(4).html());
		$("#address").val($tableItems.eq(5).html());
		
		
		$("#headname").val($tableItems.eq(6).html());
		$("#headidcard").val($tableItems.eq(7).html());
		// $("#idNumber").val($tableItems.eq(8).html());

		$form.slideUp();
		$table.slideDown();
	});
});