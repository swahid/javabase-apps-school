
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {

	getInsShiftData();
	getInsClassData();
//	call insClass info initialized method
	$("#addInsClassSectionForm").submit(function(event) {
		
		event.preventDefault();
		var data = {}
		data["classId"]    = $("#classId").val(),
		data["secName"]    = $("#secName").val(),
		data["details"]       = $("#details").val(),
		url = "classSection/addInsClassSection";
		
		
		var token = $('#csrfToken').val();
		var header = $('#csrfHeader').val();
		/*	
		 * if in spring aplication csrf enable
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
				classSectionDatatable("#classSectionTable", 'classSection/load','' );
				console.log(resonse.data);
				alert(resonse.message);
				data = null;
				
				document.getElementById("addInsClassSectionForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				alert("Add falied");
//						$("#msg").html(e.message);
				
				data = null;
				document.getElementById("addInsClassSectionForm").reset()
			}
		});
		
	});
	
	

	// call classDatabase function for initialized datatable
	classSectionDatatable("#classSectionTable", 'classSection/load','' );
	
	/*
	 * Datable get building function
	 */
	function classSectionDatatable(id, url, value) {
		
		$(id).dataTable({
			destroy	: true,
	        data	: jbf.ajax.getLoadData(url, value),
	        columns	: [{
		        	title	: 'Id',
		        	data	: 'secId'
				},{
					title	: 'Section ',
					data	: 'secName'
				},{
					title	: 'Note',
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
	
	//	 building select onChange Method
	$( "#classId" ).change(function() {
		var comboValues={};
		comboValues['classId']= $("#classId").val();
		
		roomDatatable("#classSectionTable", 'classSection/load', comboValues);
	});
});