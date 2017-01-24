/*
 * this file used to make initialization preLoad init method call dynamic;
 */

jbf.init||(function(e){
    var init = {
    		
		getCombo: function(id, url, param) {
			var selectId= id != null ? id: ".select2";
			if (url) {
				if (param) {
					$(selectId).select2({
						data	: jbf.ajax.getLoadData(url, param),
						delay	: 100
					});
				}else {
					$(selectId).select2({
						data	: jbf.ajax.getLoadData(url, ''),
						delay	: 100
					});
				}
			}else {
				$(selectId).select2();
			}
		}
    };
    e.init = init;
}(jbf));

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
	
	
	/*======================= Notification Functions =========================*/
	
	