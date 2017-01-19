/*
 * this file used to make initialization preLoad data method call dynamic;
 */
jbf.init||(function(e){
    var init = {
    		
//        	buildingInfo initialized data
        getBildingInfo	: function(id,value){
        	var url  = "building/load",
        	    data = jbf.ajax.getLoadData(url, '');
			$(id).empty();
			for (var i = 0; i < data.length; i++) {
				$(id).append('<option value=' + data[i].buildingId + '>' + data[i].buildName + '</option>');
			}
        },
        
//        	roomUsed initialized data
       getRoomUsedData	: function(id,value){
    	   var url  = "roomUsed/load",
   	    	   data = jbf.ajax.getLoadData(url, '');
    	   $(id).empty();
			for (var i = 0; i < data.length; i++) {
				$(id).append('<option value=' + data[i].roomUsedId + '>' + data[i].usedName + '</option>');
			}
       }	
		
        
    };
    e.init = init;
}(jbf));

	
//	get all insShift data
	function getInsShiftData(){
		$.ajax({
			type 	 : "GET",
			url      : "insShift/load",
			success  : function(resonse) {
				var data = resonse.data;
				$('#insShiftId').empty();
				for (var i = 0; i < data.length; i++) {
					$('#insShiftId').append('<option value=' + data[i].insShiftId + '>' + data[i].shiftName + '</option>');
				}
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
			}
		});
	};
	
//	get all insShift data
	function getInsClassData(){
		$.ajax({
			type 	 : "GET",
			url      : "insClass/load",
			success  : function(resonse) {
				var data = resonse.data;
				$('#classId').empty();
				for (var i = 0; i < data.length; i++) {
					$('#classId').append('<option value=' + data[i].classId + '>' + data[i].className + '</option>');
				}
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
			}
		});
	};
	
//	class initialized data
	function getClass(){
		$.ajax({
			type 	 : "GET",
			url      : "class",
			success  : function(resonse) {
				var data = resonse.data;
				$('#classId').empty();
				for (var i = 0; i < data.length; i++) {
					$('#classId').append('<option value=' + data[i].classId + '>' + data[i].className + '</option>');
				}
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
			}
		});
	};
	
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