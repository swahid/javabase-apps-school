
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	//call class initialized
	jbf.combo.shiftCombo('#shiftCombo','shift/load');
	
	$("#shiftCombo").on('change', function (evt) {
	    var selectShiftParam = "shiftParam=" +($(this).select2('val'));
	    
	    jbf.combo.loadClass('#classCombo','insClass/load',selectShiftParam);
	    
	  })
	
	
	
	
//	datatable load at page load
	sectionDatatable();
	
	$("#addSectionForm").submit(function(event) {
		
		// form redirect stop
		event.preventDefault();
		
		//call form validation code
		var status =jbf.form.validate('#addSectionForm');
		if (!status) {
			return;
		}
		// get form data
		var data = {}
		data["shiftClaId"]  = $("#classCombo").val(),
		data["secName"]     = $("#secName").val(),
		data["details"]     = $("#details").val(),
		url = "section/add";
		
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
				sectionDatatable();
				document.getElementById("addSectionForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				error("Add falied");
				
				
			}
		});
		
	});
	

	
	function sectionDatatable(param) {
		var url = 'section/load';
		$('#sectionDataTable').dataTable({
			destroy	: true,
	        data	: jbf.ajax.load(url, param),
	        columns	: [{
		        	title	: 'Shift Name',
		        	data	: 'shiftClaId'
				},{
					title	: 'Class Name',
					data	: 'secName'
				},{
					title	: 'Section Name',
					data	: 'secName'
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