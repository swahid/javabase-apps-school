
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	
	buildingDatatable();
	
	$("#addNewBuildingForm").submit(function(event) {
		
		// form redirect stop
		event.preventDefault();
		
		//call form validation code
		var status =jbf.form.validate('#addNewBuildingForm');
		if (!status) {
			return;
		}
		// get form data
		var data = {}
		data["buildName"]     	 = $("#buildName").val(),
		data["totalRoom"]        = $("#totalRoom").val(),
		data["floor"] 	  		 = $("#floor").val(),
		data["constructionType"] = $("#constructionType").val(),
		data["details"] 	   	 = $("#details").val(),
		url = "building/add";
		
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
				
				buildingDatatable();
				document.getElementById("addNewBuildingForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				error("Add falied");
				
				
			}
		});
		
	});
	
	
	function buildingDatatable(param) {
		var url = 'building/view';
		$('#buildingTable').dataTable({
			destroy	: true,
	        data	: jbf.ajax.load(url, param),
	        columns	: [{
		        	title	: 'Building Name',
		        	data	: 'buildName'
				},{
					title	: 'Total Room',
					data	: 'totalRoom'
				},{
					title	: 'Floor',
					data	: 'floor'
				},{
					title	: 'Construction',
					data	: 'constructionType'
		    	},{
		    		title	: 'Description',
		    		data	: 'details'
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