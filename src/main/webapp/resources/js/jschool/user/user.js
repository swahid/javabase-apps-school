
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	
	//load RoleCombo
	jbf.combo.loadRole('#roleCombo','role/load');
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
			
			url 	= "user/adduser";
		
		role["roleId"]		= $("#roleCombo").val();
		
		data["userName"]	= $("#username").val();
		data["password"]	= $("#retypePassword").val();
		data["email"]		= $("#email").val();
		data["firstName"]   = $("#firstName").val();
		data["lastName"] 	= $("#lastName").val();
		data["createDate"] 	    = new Date();
//		data["role"] 	    = role;
		
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
				userDatatable();
				document.getElementById("addUserForm").reset();
				$("#roomModal").modal('hide'); 
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				error("Insert falied");
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
					title	: 'Type',
					data	: 'role.displayName'
				},{
					title	: 'Status',
					data	: 'active',
					render  : function (status) {
		    			if (status) {
		    				return "Active";
						}else{
							return "Inactive";
						}
		    		}
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