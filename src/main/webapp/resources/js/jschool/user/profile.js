
/*
 * registration function with jquery ajax 
 */
$(document).ready(function($) {
    
    //update profile about details section
    $("#userAboutForm").submit(function(event) {
        event.preventDefault();
        
        var data    = {},
            url     = "profile/update";
        
        data["userId"]      = $("#userId").val();
        data["firstName"]   = $("#firstName").val();
        data["lastName"]    = $("#lastName").val();
        data["fatherName"]  = $("#fatherName").val();
        data["motherName"]  = $("#motherName").val();
        data["phoneHome"]   = $("#phoneHome").val();
        data["birthdate"]   = $("#birthdate").val();
        data["emailPrimary"]  = $("#emailPrimary").val();
        data["entryUser"]    = $("#username").val();
        data["entryDate"]    = new Date();
        
        /*  
         * if in spring aplication csrf enable
         * send csrf parameter in header otherwise 405 error
         */
        $.ajax({
            type     : "PUT",
            url      : url,
            data     : JSON.stringify(data),
            dataType : 'json',
            contentType: "application/json; charset=utf-8",
            success  : function(resonse) {
                success(resonse.message);
            },
            error    : function(e) {
                console.log("ERROR: ",e);
                error("update falied");
            }
        });
        
    });
    
});