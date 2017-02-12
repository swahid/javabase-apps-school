/*$('.message a').click(function(){
   $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
});*/

/*
 * this method create for toggle visible sign in form 
 * and registration form on login page 
 */
function toggle_visibility() {
	$('form').animate({height: "toggle", opacity: "toggle"}, "slow");
}

/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
	$("#registerForm").submit(function(event) {
		
		event.preventDefault();
		var data = {}
		data["username"]   = $("#username").val(),
		data["password"]   = $("#password").val(),
		data["email"] 	   = $("#email").val(),
		url = "registration";
		
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
				var message = "registration Sucess";
				//				$("#msg").html(data.message);
				console.log(resonse.data);
				alert(resonse.message);
				data = null;
				document.getElementById("registerForm").reset()
			},
			error 	 : function(e) {
				console.log("ERROR: ",e);
				alert("registration falied");
//						$("#msg").html(e.message);
				data = null;
				document.getElementById("registerForm").reset()
			}
		});
		
	});
});