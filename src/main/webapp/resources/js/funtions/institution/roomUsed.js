
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
//	call building info initialized method
	$("#addNewRoomUsedForm").submit(function(event) {
		
		event.preventDefault();
		var data = {}
		data["usedName"]        = $("#usedName").val(),
		data["details"] 	    = $("#details").val(),
		data["entryUser"] 	    = $("#entryUser").val(),
		url = "roomUsed/addNewRoomUsed";
		
		
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
				roomUsedDatatable("#roomUsedTable", 'roomUsed/load','' );
				console.log(resonse.data);
				alert(resonse.message);
				data = null;
				
				document.getElementById("addNewRoomUsedForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				alert("Add falied");
//						$("#msg").html(e.message);
				
				data = null;
				document.getElementById("addNewRoomUsedForm").reset()
			}
		});
		
	});
	
	// call buildingDatabase function for initialized datatable
	roomUsedDatatable("#roomUsedTable", 'roomUsed/load','' );
	
	/*
	 * Datable get building function
	 */
	function roomUsedDatatable(id, url, value) {
		
		$(id).dataTable({
			destroy	: true,
	        data	: jbf.ajax.getLoadData(url, value),
	        columns	: [{
		        	title	: 'Used Id',
		        	data	: 'roomUsedId'
				},{
					title	: 'Name',
					data	: 'usedName'
				},{
					title	: 'Description',
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