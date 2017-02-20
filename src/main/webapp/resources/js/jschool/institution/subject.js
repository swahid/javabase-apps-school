
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	//call class initialized
	jbf.combo.loadClass('#classCombo','insClass/load');
	
	
//	datatable load at page load
	subjectDatatable();
	
	$("#addSubjectForm").submit(function(event) {
		
		// form redirect stop
		event.preventDefault();
		
		//call form validation code
		var status =jbf.form.validate('#addSubjectForm');
		if (!status) {
			return;
		}
		// get form data
		var data = {}
		data["classId"]  = $("#classCombo").val(),
		data["subTitle"]    = $("#subTitle").val(),
		data["subCode"]     = $("#subCode").val(),
		data["subName"] 	= $("#subName").val(),
		data["active"] 	    = $("#active").val(),
		url = "subject/add";
		
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
				subjectDatatable();
				document.getElementById("addSubjectForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				error("Add falied");
				
				
			}
		});
		
	});
	

	
	function subjectDatatable(param) {
		var url = 'subject/load';
		$('#subjectTable').dataTable({
			destroy	: true,
	        data	: jbf.ajax.load(url, param),
	        columns	: [{
		        	title	: 'Class Name',
		        	data	: 'classId'
				},{
					title	: 'Subject Title',
					data	: 'subTitle'
				},{
					title	: 'Subject Code',
					data	: 'subCode'
				},{
					title	: 'Subject Name',
					data	: 'subName'
		    	},{
		    		title	: 'Status',
		    		data	: 'active'
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