
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	//call teacher's Post initialized
	jbf.combo.employeePostCombo('#employeePostCombo','empPost/load');
	jbf.combo.loadRole('#rollCombo','role/load');
	
	
//	datatable load at page load
	employeesDatatable();
	
	$("#addEmployeeForm").submit(function(event) {
		
		// form redirect stop
		event.preventDefault();
		
		//call form validation code
		var status =jbf.form.validate('#addEmployeeForm');
		if (!status) {
			return;
		}
		// get form data
		var data = {}
		data["empPost"]  		= $("#employeePostCombo").val(),
		data["employeeID"]  	= $("#employeeID").val(),
		data["email"]       	= $("#email").val(),
		data["firstname"]	    = $("#firstname").val(),
		data["lastName"] 	    = $("#lastName").val(),
		data["gender"] 	    	= $("#gender").val();
		data["username"] 	    = $("#username").val(),
		data["password"] 	    = $("#password").val(),
		data["phoneno"] 	    = $("#phoneno").val(),
		data["createUser"] 		= $("#createUser").val();
		data["roleId"] 	    	= $("#rollCombo").val();
		url = "employee/add";
		
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
				employeesDatatable();
				document.getElementById("addEmployeeForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				error("Add falied");
				
				
			}
		});
		
	});
	

	
	function employeesDatatable(param) {
		var url = 'employee/load';
		$('#EmployeesTable').dataTable({
			destroy	: true,
	        data	: jbf.ajax.load(url, param),
	        columns	: [{
		        	title	: 'Employee ID',
		        	data	: 'employeeID'
				},{
					title	: 'First Name',
					data	: 'user.firstName'
				},{
					title	: 'Last Name',
					data	: 'user.lastName'
		    	},{
		    		title	: 'Role',
		    		data	: 'user.role.roleName'
		    	},{
		    		title	: 'User Name',
		    		data	: 'user.username'
		    	},{
		    		title	: 'E-mail Address',
		    		data	: 'user.email'
		    	},{
		    		title	: 'Since',
		    		data	: 'user.createDate',
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