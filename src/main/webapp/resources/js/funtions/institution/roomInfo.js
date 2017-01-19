
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	
//	call building info initialized method
	jbf.init.getBildingInfo('.buildingId','');
	
//	call roomused info initialized method
	jbf.init.getRoomUsedData('.roomUsedId','');
	
	// call roomDatabase function for initialized datatable
	roomDatatable("#roomTable", 'room/load','' );
	
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
			beforeSend: function(xhr) {
		        xhr.setRequestHeader("Accept", "application/json");
		        xhr.setRequestHeader("Content-Type", "application/json");
		        xhr.setRequestHeader(header.csrfHeader, header.csrfToken);
		    },
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
	/*$("button#roomSubmit").click(function(event) {
		event.preventDefault();
		
		jbf.form.validate('#addNewRoomForm');
		
		var data = {},
		    url = "room/addNewRoom";
		
		data["buildingId"]	= $("#buildingId").val();
		data["roomUsedId"] 	= $("#roomUsedId").val();
		data["floorNo"] 	= $("#floorNo").val();
		data["roomName"]    = $("#roomName").val();
		data["roomNo"] 	    = $("#roomNo").val();
		data["totalSeat"]  	= $("#totalSeat").val();
		data["size"] 	    = $("#size").val();
		data["entryUser"]	= $("#entryUser").val();
		data["usedFor"] 	= $("#roomUsedId option:selected").text();
		data["token"] 	    = $("#csrfToken").text();
		data["header"] 	    = $("#csrfHeader").text();
		
		var status = jbf.ajax.post(url, data);
		if (status) {
			roomDatatable();
			$("addNewRoomForm").reset();
			$("#roomModal").modal('hide'); 
		}else {
			$("addNewRoomForm").reset();
		}
		
	});*/
	
	/*
	 * Datable get room function
	 */
	function roomDatatable(id, url, value) {
		
		$(id).dataTable({
			destroy	: true,
	        data	: jbf.ajax.getLoadData(url, value),
	        columns	: [{
		        	title	: 'Room Id',
		        	data	: 'roomId'
				},{
					title	: 'Room Name',
					data	: 'roomName'
				},{
					title	: 'Room No',
					data	: 'roomNo'
				},{
					title	: 'Seat',
					data	: 'totalSeat'
		    	},{
		    		title	: 'Room Used',
		    		data	: 'usedFor'
		    	},{
		    		title	: 'Date',
		    		data	: 'entryDate',
		    		render  : function (date) {
		    			if (date) {
		    				return moment(date).format("DD MMM YYYY");
						}else{
							return "";
						}
		    		}
		    	}
	        ],
	        columnDefs	: [
               {"className": "dt-center", "targets": "_all"}
            ]
	    });
	};
	
	//	 building select onChange Method
	$( "#buildingId" ).change(function() {
		var comboValues={};
		comboValues['buildingId']= $("#buildingId").val();
		comboValues['roomUsedId']= $("#roomUsedId").val();
		
		roomDatatable("#roomTable", 'room/load', comboValues);
	});
	
	//	 roomused select onChange Method
	$( "#roomUsedId" ).change(function() {
		var comboValues={};
		comboValues['buildingId']= $("#buildingId").val();
		comboValues['roomUsedId']= $("#roomUsedId").val();
		
		roomDatatable("#roomTable", 'room/load', comboValues);
	});
});