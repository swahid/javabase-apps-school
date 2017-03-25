
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	//call teacher's Post initialized
	jbf.combo.teacherPostCombo('#teacherPostCombo','teachersPost/load');
	jbf.combo.teacherEmpCombo('#teacherEmpCombo','employee/tload');

	
	
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
		data["userID"] 	    = $("#teacherEmpCombo").val(),// userId is identifer as teacher
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
		    		title	: 'Subject',
					data	: 'designation'
				},{
					title	: 'First Name',
					data	: 'user.firstName'
				},{
					title	: 'Last Name',
					data	: 'user.lastName'
		    	},{
		    		title	: 'User Name',
		    		data	: 'user.username'
		    	},{
		    		title	: 'E-mail Address',
		    		data	: 'user.email'
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