
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	//call class initialized
//	jbf.combo.loadClass('#classId','class/load');
	
	
//	datatable load at page load
	institutionDatatable();
	
	$("#addNewInstitutionForm").submit(function(event) {
		
		// form redirect stop
		event.preventDefault();
		
		//call form validation code
		var status =jbf.form.validate('#addNewInstitutionForm');
		if (!status) {
			return;
		}
		// get form data
		var data = {}
		data["categoryId"]     = $("#categoryId").val(),
		data["insName"]        = $("#insName").val(),
		data["insCode"] 	   = $("#insCode").val(),
		data["upazila"] 	   = $("#upazila").val(),
		data["category"] 	   = $("#category").val(),
		data["situated"] 	   = $("#situated").val(),
		data["address"] 	   = $("#address").val(),
		data["postalCode"] 	   = $("#postalCode").val(),
		data["mailAddress"]    = $("#mailAddress").val(),
		data["webAddress"] 	   = $("#webAddress").val(),
		url = "institution/addNewInstitution";
		
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
				institutionDatatable();
				document.getElementById("addNewInstitutionForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				error("Add falied");
				
				
			}
		});
		
	});
	

	
	function institutionDatatable(param) {
		var url = 'institution/load';
		$('#institutionTable').dataTable({
			destroy	: true,
	        data	: jbf.ajax.load(url, param),
	        columns	: [{
		        	title	: 'Name',
		        	data	: 'insName'
				},{
					title	: 'Code',
					data	: 'insCode'
				},{
					title	: 'Upazila',
					data	: 'upazila'
				},{
					title	: 'Institution Type',
					data	: 'category'
		    	},{
		    		title	: 'Established',
		    		data	: 'situated'
		    	},{
		    		title	: 'Postal Address',
		    		data	: 'address'
		    	},{
		    		title	: 'Postal Code',
		    		data	: 'postalCode'
		    	},{
		    		title	: 'E-mail',
		    		data	: 'mailAddress'
		    	},{
		    		title	: 'Web Address',
		    		data	: 'webAddress'
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