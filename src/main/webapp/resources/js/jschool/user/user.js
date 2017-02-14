
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	
	// call roomDatabase function for initialized datatable
	userDatatable();
	
	//insert room info data
	$("button#userSubmit").click(function(event) {
		event.preventDefault();
		
		javascript: $('#addUserForm').validationEngine('attach');
        if (!$('#addUserForm').validationEngine('validate')) {
            return;
        }
		
		var data 	= {},
			role 	= {},
			privilege 	= {},
			
			url 	= "user/save";
		
		role["roleId"]		= $("#rollCombo").val();
		role["roleName"]	= $("#rollCombo option:selected").text();
		
		data["userName"]	= $("#username").val();
		data["password"]	= $("#retypePassword").val();
		data["email"]		= $("#email").val();
		data["firstName"]   = $("#firstName").val();
		data["lastName"] 	= $("#lastName").val();
		data["role"] 	    = role;
		
		/*	
		 * if in spring aplication csrf enable
		 * send csrf parameter in header otherwise 405 error
		 */
		$.ajax({
			type 	 : "POST",
			url      : url,
			data 	 : JSON.stringify(data),
			dataType : 'json',
			contentType: "application/json; charset=utf-8",
			success  : function(resonse) {
				success(resonse.message);
				roomDatatable();
				document.getElementById("addUserForm").reset();
				$("#roomModal").modal('hide'); 
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				alert("Insert falied");
			}
		});
		
	});
	/*
	 * Datable get room function
	 */
	function userDatatable(param) {
		var url = 'user/load';
		$('#userTable').dataTable({
			destroy	: true,
	        data	: jbf.ajax.load(url, param),
	        columns	: [{
		        	title	: 'Id',
		        	data	: 'userId'
				},{
					title	: 'UserName',
					data	: 'username'
				},{
					title	: 'Email',
					data	: 'email'
				},{
					title	: 'First Name',
					data	: 'firstName'
		    	},{
		    		title	: 'Last Name',
		    		data	: 'lastName'
		    	},{
					title	: 'Status',
					data	: 'active'
				},{
		    		title	: 'Since',
		    		data	: 'createDate',
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