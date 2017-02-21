
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
//	call empPost info initialized method
	empPostDatatable();

	$("#addempPostForm").submit(function(event) {
		
		event.preventDefault();
		var data = {}
		data["postName"]    = $("#postName").val(),
		data["activity"]    = $("#activity").val(),
		data["details"]     = $("#details").val(),
		url = "empPost/add";
		
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
				empPostDatatable();
				document.getElementById("addempPostForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				error("Add falied");
				
				
			}
		});
		
	});
	
	function empPostDatatable(param) {
		var url = 'empPost/load';
		$('#empPostTable').dataTable({
			destroy	: true,
	        data	: jbf.ajax.load(url, param),
	        columns	: [{
		        	title	: 'Post Name',
		        	data	: 'postName'
				},{
					title	: 'Job',
					data	: 'activity'
				},{
					title	: 'Description',
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