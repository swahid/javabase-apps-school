
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	
	shiftDatatable();
	
	$("#addNewShiftForm").submit(function(event) {
		
		// form redirect stop
		event.preventDefault();
		
		//call form validation code
		var status =jbf.form.validate('#addNewShiftForm');
		if (!status) {
			return;
		}
		// get form data
		var data = {}
		data["shiftName"]    = $("#shiftName").val(),
		data["startTime"]    = $("#startTime").val(),
		data["entTme"]       = $("#endTime").val(),
		data["details"] 	 = $("#details").val(),
		url = "shift/add";
		
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
				
				shiftDatatable();
				document.getElementById("addNewShiftForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				error("Add falied");
				
				
			}
		});
		
	});
	
	
	function shiftDatatable(param) {
		var url = 'shift/load';
		$('#shiftTable').dataTable({
			destroy	: true,
	        data	: jbf.ajax.load(url, param),
	        columns	: [{
	        	title	: 'Shift Id',
	        	data	: 'insShiftId'
			},{
				title	: 'Shift Name',
				data	: 'shiftName'
			},{
				title	: 'Start Time',
				data	: 'startTime'
			},{
				title	: 'End Time',
				data	: 'entTme'
	    	},{
	    		title	: 'Note',
	    		data	: 'details'
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
});