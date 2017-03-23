
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	//call teacher's Post initialized
	jbf.combo.teacherPostCombo('#teacherPostCombo','teachersPost/load');
	
	
//	datatable load at page load
	teacherDatatable();
	
	$("#addTeacherForm").submit(function(event) {
		
		// form redirect stop
		event.preventDefault();
		
		//call form validation code
		var status =jbf.form.validate('#addTeacherForm');
		if (!status) {
			return;
		}
		// get form data
		var data = {}
		data["designation"]  = $("#teacherPostCombo").val(),
		data["email"]    		= $("#email").val(),
		data["firstname"]       = $("#firstname").val(),
		data["lastname"]	    = $("#lastname").val(),
		data["phoneno"] 	    = $("#phoneno").val(),
		url = "teacher/add";
		
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
				teacherDatatable();
				document.getElementById("addTeacherForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				error("Add falied");
				
				
			}
		});
		
	});
	

	
	function teacherDatatable(param) {
		var url = 'teacher/load';
		$('#teacherTable').dataTable({
			destroy	: true,
	        data	: jbf.ajax.load(url, param),
	        columns	: [{
		        	title	: 'Designation',
		        	data	: 'designation'
				},{
					title	: 'E-mail Address',
					data	: 'email'
				},{
					title	: 'First Name',
					data	: 'firstname'
				},{
					title	: 'Last Name',
					data	: 'lastname'
		    	},{
		    		title	: 'Contact No',
		    		data	: 'phoneno'
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