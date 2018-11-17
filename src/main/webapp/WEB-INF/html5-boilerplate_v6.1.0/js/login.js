window.onload = function (event) {
	var personLoginButton = document.getElementsByClassName("personLoginButton")[0];
	var companyLoginButton = document.getElementsByClassName("companyLoginButton")[0];
	var administratorLoginButton = document.getElementsByClassName("administratorLoginButton")[0];

	var personLogin = document.getElementsByClassName("personLogin")[0];
	var companyLogin = document.getElementsByClassName("companyLogin")[0];
	var administratorLogin = document.getElementsByClassName("administratorLogin")[0];

	var $personLoginButton = $(".personLoginButton");
	var $companyLoginButton = $(".companyLoginButton");
	var $administratorLoginButton = $(".administratorLoginButton");
	personLoginButton.addEventListener("click", function (event) {
		personLoginButton.style.borderBottom = "0.25em solid green";
		// $companyLoginButton.velocity({borderBottom :"none"},{duration:200,easing:"swing"});
		companyLoginButton.style.borderBottom = "none";

		// $administratorLoginButton.velocity({borderBottom : "none"},{duration:200,easing:"swing"});
		administratorLoginButton.style.borderBottom = "none";
		

		personLogin.style.display = "block";
		companyLogin.style.display = "none";
		administratorLogin.style.display = "none";
	}, false);
	companyLoginButton.addEventListener("click", function (event) {
		personLoginButton.style.borderBottom = "none";
		companyLoginButton.style.borderBottom = "0.25em solid green";
		administratorLoginButton.style.borderBottom = "none";

		companyLogin.style.display = "block";
		personLogin.style.display = "none";
		administratorLogin.style.display = "none";
	}, false);
	administratorLoginButton.addEventListener("click", function (event) {
		personLoginButton.style.borderBottom = "none";
		companyLoginButton.style.borderBottom = "none";
		administratorLoginButton.style.borderBottom = "0.25em solid green";

		administratorLogin.style.display = "block";
		companyLogin.style.display = "none";
		personLogin.style.display = "none";
	}, false);
};