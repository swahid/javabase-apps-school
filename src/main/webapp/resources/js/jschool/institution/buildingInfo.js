
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	$("#addNewBuildingForm").submit(function(event) {
		
		event.preventDefault();
		var data = {}
		data["buildName"]          = $("#buildName").val(),
		data["totalRoom"]          = $("#totalRoom").val(),
		data["floor"] 	           = $("#floor").val(),
		data["constructionType"]   = $("#constructionType").val(),
		data["details"] 	       = $("#details").val(),
		data["entryUser"] 	       = $("#entryUser").val(),
		url = "building/addNewbuilding";
		
		
		
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
				buildingDatatable("#buildingTable", 'building/load','' );
				alert(resonse.message);
				data = null;
				
				document.getElementById("addNewBuildingForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				alert("Add falied");
//						$("#msg").html(e.message);
				
				data = null;
				document.getElementById("addNewBuildingForm").reset()
			}
		});
		
	});
	
	// call buildingDatabase function for initialized datatable
	buildingDatatable("#buildingTable", 'building/load','' );
	
	/*
	 * Datable get building function
	 */
	function buildingDatatable(id, url, value) {
		
		$(id).dataTable({
			destroy	: true,
	        data	: jbf.ajax.getLoadData(url, value),
	        columns	: [{
		        	title	: 'Building Id',
		        	data	: 'buildingId'
				},{
					title	: 'Building Name',
					data	: 'buildName'
				},{
					title	: 'Total Room',
					data	: 'totalRoom'
				},{
					title	: 'Seat',
					data	: 'floor'
		    	},{
		    		title	: 'Room Used',
		    		data	: 'constructionType'
		    	},{
		    		title	: 'Room Used',
		    		data	: 'details'
		    	},{
		    		title	: 'Date',
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