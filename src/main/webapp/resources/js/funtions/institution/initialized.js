//	class initialized data
	function getBildingInfo(){
		$.ajax({
			type 	 : "GET",
			url      : "building/load",
			success  : function(resonse) {
				var data = resonse.data;
				$('#buildingId').empty();
				for (var i = 0; i < data.length; i++) {
					$('#buildingId').append('<option value=' + data[i].buildingId + '>' + data[i].buildName + '</option>');
				}
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
			}
		});
	}
	
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
	}