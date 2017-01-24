/*
 * this file used to make initialization preLoad data method call dynamic;
 */

$(document).ready(function($) {
		//For All Select Menu Call
	jbf.init.getCombo();
		
		
});

/*======================= Notification Functions =========================*/

function success(message) {
	$.notify(message, "success");
}
function info(message) {
	$.notify(message, "info");
}
function warn(message) {
	$.notify(message, "warn");
}
function error(message) {
	$.notify(message, "error");
}
/*======================= Notification Functions =========================*/