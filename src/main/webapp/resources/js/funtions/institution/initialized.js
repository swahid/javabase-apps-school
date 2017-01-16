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
	
//	get all roomUsed data
	function getRoomUsedData(){
		$.ajax({
			type 	 : "GET",
			url      : "roomUsed/load",
			success  : function(resonse) {
				var data = resonse.data;
				$('#roomUsedId').empty();
				for (var i = 0; i < data.length; i++) {
					$('#roomUsedId').append('<option value=' + data[i].roomUsedId + '>' + data[i].usedName + '</option>');
				}
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
			}
		});
	}
	
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