
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	//call class initialized
	getClass();
	$("#addNewInstitutionForm").submit(function(event) {
		
		event.preventDefault();
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
		
		
		
		var token = $('#csrfToken').val();
		var header = $('#csrfHeader').val();
		/*	
		 * if in spring application csrf enable
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
				console.log(resonse.data);
				alert(resonse.message);
				data = null;
				
				console.log("Ajax is success.....");
				document.getElementById("addNewInstitutionForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				alert("Add falied");
//						$("#msg").html(e.message);
				
				console.log("Ajax is failed.....");
				data = null;
				document.getElementById("addNewInstitutionForm").reset()
			}
		});
		
	});
	
});