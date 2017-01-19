/*
 * in this javascript file declare all common script method
 */
var jbf ={};
jbf.ajax||(function(e){
    var ajax = {
        
		getLoadData : function(url, param){
			var data={};
			$.ajax({
				async	: false,
				type 	: "GET",
				url     : url,
				data    : param,
				success : function(resonse) {
					data = resonse.data;
				},
				error 	: function(e) {
					console.log("ERROR: ", e);
					data = null;
				}
			});
			return data
        },
        post	: function(url, data){
        	var isPost='';
        	$.ajax({
    			type 	 : "POST",
    			url      : url,
    			data 	 : JSON.stringify(data),
    			dataType : 'json',
    			beforeSend: function(xhr) {
    				xhr.setRequestHeader("Accept", "application/json");
    				xhr.setRequestHeader("Content-Type", "application/json");
    				xhr.setRequestHeader(data.header, data.token);
    			},
    			success  : function(resonse) {
    				isPost = true;
    				success(resonse.message);
    			},
    			error 	 : function(e) {
    				isPost = false;
    				console.log("ERROR: ",e);
    				alert("Unable to perform");
    			}
    		});
        	return isPost;
        }
    };
    e.ajax = ajax;
}(jbf));
