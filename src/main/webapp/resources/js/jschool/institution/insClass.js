
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	//For load institution
	getInsShiftData();
//	call insClass info initialized method
	$("#addInsClassForm").submit(function(event) {
		
		event.preventDefault();
		var data = {}
		data["insShiftId"]    = $("#insShiftId").val(),
		data["className"]    = $("#className").val(),
		data["details"]       = $("#details").val(),
		url = "insClass/addInsClass";
		
		
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
				classDatatable("#classTable", 'insClass/load','' );				
				console.log(resonse.data);
				alert(resonse.message);
				data = null;
				
				document.getElementById("addInsClassForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				alert("Add falied");
//						$("#msg").html(e.message);
				
				data = null;
				document.getElementById("addInsClassForm").reset()
			}
		});
		
	});
	

	// call classDatabase function for initialized datatable
	classDatatable("#classTable", 'insClass/load','' );
	
	/*
	 * Datable get building function
	 */
	function classDatatable(id, url, value) {
		
		$(id).dataTable({
			destroy	: true,
	        data	: jbf.ajax.getLoadData(url, value),
	        columns	: [{
		        	title	: 'Class Id',
		        	data	: 'classId'
				},{
					title	: 'Shift ',
					data	: 'insShiftId'
				},{
					title	: 'Class Name',
					data	: 'className'
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