$(function () {
	$('.addBankAccountButton').on('click', function(event) {
		event.preventDefault();
		$('.addBankAccount').fadeIn("slow");
		$('.addBankAccount :input').eq(0).focus();
		// $('.hiddenCardNumber').css({
		// 	visibility: 'hidden'
		// });
	});

	function findFormElementByName(name,form) {
		var i=0;
		var len=form.length;
		for(i=0;i<len;i++){
			if (form.elements[i].name == name) {
				return i;
			}
		}
		return -1;
	}
	var form = document.forms[0];
	var firstInputNumber = findFormElementByName("firstInput",form);
	// form.elements[firstInputNumber].value = "1111";
	//限制只能输入数字
	form.elements[firstInputNumber].addEventListener("keyup", function (e) {
		this.value=this.value.replace(/\D/g,'');
	}, false);
	form.elements[firstInputNumber+1].addEventListener("keyup", function (e) {
		this.value=this.value.replace(/\D/g,'');
	}, false);
	form.elements[firstInputNumber+2].addEventListener("keyup", function (e) {
		this.value=this.value.replace(/\D/g,'');
	}, false);
	form.elements[firstInputNumber+3].addEventListener("keyup", function (e) {
		this.value=this.value.replace(/\D/g,'');
	}, false);
	// 自动转换焦点
	form.elements[firstInputNumber].addEventListener("keyup", function (event) {
		if (form.elements[firstInputNumber].value.length == 4) {
			form.elements[firstInputNumber+1].focus();			
		}		
	},false);
	form.elements[firstInputNumber+1].addEventListener("keyup", function (event) {
		if (form.elements[firstInputNumber+1].value.length == 4) {
			form.elements[firstInputNumber+2].focus();			
		}		
	},false);
	form.elements[firstInputNumber+2].addEventListener("keyup", function (event) {
		if (form.elements[firstInputNumber+2].value.length == 4) {
			form.elements[firstInputNumber+3].focus();			
		}		
	},false);
	// hiddenInput获得数字
	var hiddenCardNumber = document.getElementsByClassName("hiddenCardNumber")[0];
	form.elements[firstInputNumber].addEventListener("change", function (event) {
			hiddenCardNumber.value = form.elements[firstInputNumber].value +""+form.elements[firstInputNumber+1].value +""+form.elements[firstInputNumber+2].value +""+form.elements[firstInputNumber+3].value;
	},false);
		form.elements[firstInputNumber+1].addEventListener("change", function (event) {
			hiddenCardNumber.value = form.elements[firstInputNumber].value +""+form.elements[firstInputNumber+1].value +""+form.elements[firstInputNumber+2].value +""+form.elements[firstInputNumber+3].value;
	},false);
	form.elements[firstInputNumber+2].addEventListener("change", function (event) {
			hiddenCardNumber.value = form.elements[firstInputNumber].value +""+form.elements[firstInputNumber+1].value +""+form.elements[firstInputNumber+2].value +""+form.elements[firstInputNumber+3].value;
	},false);
	form.elements[firstInputNumber+3].addEventListener("change", function (event) {
			hiddenCardNumber.value = form.elements[firstInputNumber].value +""+form.elements[firstInputNumber+1].value +""+form.elements[firstInputNumber+2].value +""+form.elements[firstInputNumber+3].value;
	},false);
	// 验证字符数
	form.addEventListener("submit", function (event) {
		if (form.elements[firstInputNumber].value.length!=4||form.elements[firstInputNumber+1].value.length!=4||form.elements[firstInputNumber+2].value.length!=4||form.elements[firstInputNumber+3].value.length!=4) {
			event.preventDefault();
			$('.help-block').show();
		}
	}, false);
});