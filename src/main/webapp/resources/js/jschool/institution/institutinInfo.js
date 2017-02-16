
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	//call class initialized
//	jbf.combo.loadClass('#classId','class/load');
	
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
				document.getElementById("addNewInstitutionForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				error("Add falied");
				
				
			}
		});
		
	});
	
});