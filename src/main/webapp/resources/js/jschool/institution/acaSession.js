
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
//	call Academic Session info initialized method
	$("#addAcaSessionForm").submit(function(event) {
		
		event.preventDefault();
		var data = {}
		data["session"]    = $("#session").val(),
		data["duration"]   = $("#duration").val(),
		data["level"]      = $("#level").val(),
		url = "acaSession/addAcaSession";
		
		
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
				acaSessionDatatable("#acaSessionTable", 'acaSession/load','' );
				console.log(resonse.data);
				alert(resonse.message);
				data = null;
				
				document.getElementById("addAcaSessionForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				alert("Add falied");
//						$("#msg").html(e.message);
				
				data = null;
				document.getElementById("addAcaSessionForm").reset()
			}
		});
		
	});
	

	// call classDatabase function for initialized datatable
	acaSessionDatatable("#acaSessionTable", 'acaSession/load','' );
	
	/*
	 * Datable get building function
	 */
	function acaSessionDatatable(id, url, value) {
		
		$(id).dataTable({
			destroy	: true,
	        data	: jbf.ajax.getLoadData(url, value),
	        columns	: [{
		        	title	: 'Id',
		        	data	: 'acaSessionId'
				},{
					title	: 'Section ',
					data	: 'session'
				},{
					title	: 'Duration',
					data	: 'duration'
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