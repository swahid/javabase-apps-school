
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	//call insClass initialized
	jbf.combo.shiftCombo('#shiftCombo','shift/load');
	
	
	$("#shiftCombo").on('change', function(){
	    var shiftId = "shiftId="+this.value;
	    
	    jbf.combo.loadClass('#classCombo','insClass/loadbyShift',shiftId);
	  });
	
//	datatable load at page load
	classOnShiftDatatable();
	
	$("#addClassOnShiftForm").submit(function(event) {
		
		// form redirect stop
		event.preventDefault();
		
		//call form validation code
		var status =jbf.form.validate('#addClassOnShiftForm');
		if (!status) {
			return;
		}
		// get form data
		var data = {}
		data["classId"]  = $("#classCombo").val(),
		data["insShiftId"]    = $("#shiftCombo").val(),
		url = "classOnShift/add";
		
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
				classOnShiftDatatable();
				document.getElementById("addClassOnShiftForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				error("Add falied");
				
				
			}
		});
		
	});
	

	
	function classOnShiftDatatable(param) {
		var url = 'classOnShift/load';
		$('#classOnShiftTable').dataTable({
			destroy	: true,
	        data	: jbf.ajax.load(url, param),
	        columns	: [{
		        	title	: 'Class Name',
		        	data	: 'classId'
				},{
					title	: 'Shift Name',
					data	: 'insShiftId'
				},{
		    		title	: 'Entry Date',
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