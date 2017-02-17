
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	
	roomUsedDatatable();
	
	$("#addNewRoomUsedForm").submit(function(event) {
		
		// form redirect stop
		event.preventDefault();
		
		//call form validation code
		var status =jbf.form.validate('#addNewRoomUsedForm');
		if (!status) {
			return;
		}
		// get form data
		var data = {}
		data["usedName"]       = $("#usedName").val(),
		data["details"]        = $("#details").val(),
		url = "roomUsed/add";
		
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
				
				roomUsedDatatable();
				document.getElementById("addNewRoomUsedForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				error("Add falied");
				
				
			}
		});
		
	});
	
	
	function roomUsedDatatable(param) {
		var url = 'roomUsed/load';
		$('#roomUsedTable').dataTable({
			destroy	: true,
	        data	: jbf.ajax.load(url, param),
	        columns	: [{
		        	title	: 'Building Name',
		        	data	: 'usedName'
				},{
					title	: 'Total Room',
					data	: 'details'
				},{
		    		title	: 'Entry Date',
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