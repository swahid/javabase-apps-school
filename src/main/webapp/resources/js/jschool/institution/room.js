
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	//call class initialized
	jbf.combo.loadBuilding('#buildingCombo','building/load');
	jbf.combo.loadRoomUsed('#roomUsedCombo','roomUsed/load');
	
	
//	datatable load at page load
	roomDatatable();
	
	$("#addNewRoomForm").submit(function(event) {
		
		// form redirect stop
		event.preventDefault();
		
		//call form validation code
		var status =jbf.form.validate('#addNewRoomForm');
		if (!status) {
			return;
		}
		// get form data
		var data = {}
		data["buildingId"]     = $("#buildingCombo").val(),
		data["roomUsedId"]     = $("#roomUsedCombo").val(),
		data["floorNo"] 	   = $("#floorNo").val(),
		data["roomName"] 	   = $("#roomName").val(),
		data["roomNo"] 	       = $("#roomNo").val(),
		data["totalSeat"] 	   = $("#totalSeat").val(),
		data["size"] 	       = $("#size").val(),
		data["usedFor"]        = $("#usedFor").val(),
		data["webAddress"] 	   = $("#webAddress").val(),
		url = "room/add";
		
		console.log(data);
		/*
		 * this part for csrf token now closed but dont removed from code
		 * apply future in code 
		 */ 
		
		/*var token = $('#csrfToken').val();
		var header = $('#csrfHeader').val();*/
		/*	
		 * if in spring application csrf enable
		 * send csrf parameter in header otherwise 405 error
		 */
		$.ajax({
			type 	 : "POST",
			url      : url,
			data 	 : JSON.stringify(data),
			dataType : 'json',
			contentType: "application/json; charset=utf-8",
			/*beforeSend: function(xhr) {
		        xhr.setRequestHeader("Accept", "application/json");
		        xhr.setRequestHeader("Content-Type", "application/json");
		        xhr.setRequestHeader(header, token);
		    },*/
			success  : function(resonse) {
				var message = resonse.message;
				//success notification
				success(message);
				roomDatatable();
				document.getElementById("addNewRoomForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				error("Add falied");
				
				
			}
		});
		
	});
	

	
	function roomDatatable(param) {
		var url = 'room/load';
		$('#roomTable').dataTable({
			destroy	: true,
	        data	: jbf.ajax.load(url, param),
	        columns	: [{
		        	title	: 'Building Name',
		        	data	: 'buildingId'
				},{
					title	: 'Used Type',
					data	: 'roomUsedId'
				},{
					title	: 'Floor No',
					data	: 'floorNo'
				},{
					title	: 'Room Nmae',
					data	: 'roomName'
		    	},{
		    		title	: 'Room No',
		    		data	: 'roomNo'
		    	},{
		    		title	: 'Total seat',
		    		data	: 'totalSeat'
		    	},{
		    		title	: 'Room Size',
		    		data	: 'size'
		    	},{
		    		title	: 'Used',
		    		data	: 'usedFor'
		    	},{
		    		title	: 'Since',
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
	
});