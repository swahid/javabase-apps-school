
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
//	call building info initialized method
	getBildingInfo();
	$("#addNewRoomForm").submit(function(event) {
		
		event.preventDefault();
		var data = {}
		data["buildingId"]       = $("#buildingId").val(),
		data["roomUsedId"] 	     = $("#roomUsedId").val(),
		data["roomName"]         = $("#roomName").val(),
		data["roomNo"] 	         = $("#roomNo").val(),
		data["totalSeat"]  		 = $("#totalSeat").val(),
		data["size"] 	         = $("#size").val(),
		data["usedFor"] 	     = $("#usedFor").val(),
		url = "room/addNewRoom";
		
		
		var token = $('#csrfToken').val();
		var header = $('#csrfHeader').val();
		/*	
		 * if in spring aplication csrf enable
		 * send csrf parameter in header otherwise 405 error
		 */
		$.ajax({
			type 	 : "POST",
			url      : url,
			data 	 : JSON.stringify(data),
			dataType : 'json',
			beforeSend: function(xhr) {
		        xhr.setRequestHeader("Accept", "application/json");
		        xhr.setRequestHeader("Content-Type", "application/json");
		        xhr.setRequestHeader(header, token);
		    },
			success  : function(resonse) {
				var message = "Add Success";
				//				$("#msg").html(data.message);
				console.log(resonse.data);
				alert(resonse.message);
				data = null;
				
				document.getElementById("addNewRoomForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				alert("Add falied");
//						$("#msg").html(e.message);
				
				data = null;
				document.getElementById("addNewRoomForm").reset()
			}
		});
		
	});
});