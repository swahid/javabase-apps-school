
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
//	call insShift info initialized method
	$("#addInsShiftForm").submit(function(event) {
		
		event.preventDefault();
		var data = {}
		data["shiftName"]    = $("#shiftName").val(),
		data["startTime"]    = $("#startTime").val(),
		data["entTme"]       = $("#entTme").val(),
		data["details"] 	 = $("#details").val(),
		url = "insShift/addInsShift";
		
		
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
				shiftDatatable("#shiftTable", 'insShift/load','' );
				console.log(resonse.data);
				alert(resonse.message);
				data = null;
				
				document.getElementById("addInsShiftForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				alert("Add falied");
//						$("#msg").html(e.message);
				
				data = null;
				document.getElementById("addInsShiftForm").reset()
			}
		});
		
	});
	

	// call bshiftDatabase function for initialized datatable
	shiftDatatable("#shiftTable", 'insShift/load','' );
	
	/*
	 * Datable get building function
	 */
	function shiftDatatable(id, url, value) {
		
		$(id).dataTable({
			destroy	: true,
	        data	: jbf.ajax.getLoadData(url, value),
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