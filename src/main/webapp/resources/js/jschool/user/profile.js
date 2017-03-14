
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
        data["emailPrimary"]= $("#emailPrimary").val();
        data["addressLine1"]= $("#addressLine1").val();
        data["addressLine2"]= $("#addressLine2").val();
        data["city"]        = $("#city").val();
        data["state"]       = $("#state").val();
        data["zipCode"]     = $("#zipCode").val();
        data["district"]    = $("#district").val();
        data["country"]     = $("#country").val();
        data["updateUser"]  = $("#username").val();
        data["updateDate"]  = new Date();
        
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
                location.href=window.location;
            },
            error    : function(e) {
                console.log("ERROR: ",e);
                error("update falied");
            }
        });
        
    });
    
    //update profile about details section
    $("#userAccountForm").submit(function(event) {
        event.preventDefault();
        
        
        var form = jbf.form.validate("#userAccountForm");
        if (!form) {
            return;
        }
        
        var data    = {},
        url     = "user/changePassword";
        
        data["userId"]      = $("#userId").val();
        data["username"]  = $("#username").val();
        data["password"]   = $("#confirmPassword").val();
        
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