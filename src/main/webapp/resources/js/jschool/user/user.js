
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	
	// userDataTable	
	$('#userTable').dataTable();
	
	//insert room info data
	$("button#roomSubmit").click(function(event) {
		event.preventDefault();
		
		javascript: $('#addNewRoomForm').validationEngine('attach');
        if (!$('#addNewRoomForm').validationEngine('validate')) {
            return;
        }
		
		var data 	= {},
			header 	= {},
			url 	= "room/addNewRoom";
		
		data["buildingId"]       = $("#buildingModal").val();
		data["roomUsedId"] 	     = $("#roomUsedModal").val();
		data["floorNo"] 	     = $("#floorNo").val();
		data["roomName"]         = $("#roomName").val();
		data["roomNo"] 	         = $("#roomNo").val();
		data["totalSeat"]  		 = $("#totalSeat").val();
		data["size"] 	         = $("#size").val();
		data["entryUser"] 	     = $("#entryUser").val();
		data["usedFor"] 	     = $("#roomUsedModal option:selected").text();

		
		header.csrfToken = $('#csrfToken').val();
		header.csrfHeader = $('#csrfHeader').val();
		/*	
		 * if in spring aplication csrf enable
		 * send csrf parameter in header otherwise 405 error
		 */
		$.ajax({
			type 	 : "POST",
			url      : url,
			data 	 : JSON.stringify(data),
			dataType : 'json',
			success  : function(resonse) {
				success(resonse.message);
				roomDatatable("#roomTable", 'room/load','' );
				document.getElementById("addNewRoomForm").reset();
				 $("#roomModal").modal('hide'); 
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				alert("Insert falied");
				document.getElementById("addNewRoomForm").reset()
			}
		});
		
	});
	
});