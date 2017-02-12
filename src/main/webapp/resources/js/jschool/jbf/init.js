/*
 * this file used to make initialization preLoad init method call dynamic;
 */

jbf.init||(function(e){
    var init = {
    		
		getCombo: function(id, url, param) {
			var data = jbf.ajax.getLoadData(url, param);
			$(id).empty();
			for (var i = 0; i < data.length; i++) {
				$(id).append("<option value=''></option>")
				$(id).append("<option value="+ data[i].classId +">"+data[i].className+"</option>")
			}
		}
    };
    e.init = init;
}(jbf));