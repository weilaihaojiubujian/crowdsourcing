$(function () {

	var $tableItems= $("[name='personMessage']").children();
	// alert($tableMessage.eq(0).html());
	var $table = $(".showInformation");
	var $form = $(".changeInformation");
	var $modifyMessageButton = $("button[name='modifyMessage']");
	var $showMessageButton = $("button[name='showMessage']");
	$table.hide().slideDown();
	$form.hide();
	$("#id").val($tableItems.eq(0).html());
	$("#userName").val($tableItems.eq(1).html());
	// $("#password").val($tableItems.eq(2).html());
	$("#tel").val($tableItems.eq(3).html());
	$("#name").val($tableItems.eq(4).html());
	if ($tableItems.eq(5).html()=="女") {
		$("#female").attr("checked",true);
	}
	else {
		$("#male").attr("checked",true);
	}
	$("#city").val($tableItems.eq(6).html());

	var time = $tableItems.eq(7).html().toString();
	$('#datepicker').datepicker({
        defaultDate: "+1w",
        dateFormat: 'yy-mm-dd',
        minDate: '+0',
    }); 

	$( "#datepicker" ).datepicker('setDate',new Date(time));

	// $("#datepicker").val();
	$("#idNumber").val($tableItems.eq(8).html());
	$modifyMessageButton.on('click', function(event) {
		event.preventDefault();
		$table.slideUp();
		$form.slideDown();
	});
	$showMessageButton.on('click', function(event) {
		event.preventDefault();
		

		$form.slideUp();
		$table.slideDown();
	});
});