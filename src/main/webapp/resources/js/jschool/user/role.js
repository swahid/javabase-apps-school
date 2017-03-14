/*
 * Role function with jquery ajax 
 */
$(document).ready(function($) {
    
    userDatatable();
    
    //insert room info data
    $("button#roleSubmit").click(function(event) {
        event.preventDefault();
        
        var save = jbf.form.validate("#addRoleForm");
        if (!save) {
            return;
        }
        
        var data    = {},
            url     = "role/add";
        
        data["roleName"]    = $("#roleName").val();
        data["displayName"] = $("#displayName").val();
        data["description"] = $("#description").val();
        
        /*  
         * if in spring aplication csrf enable
         * send csrf parameter in header otherwise 405 error
         */
        $.ajax({
            type     : "POST",
            url      : url,
            data     : JSON.stringify(data),
            dataType : 'json',
            contentType: "application/json; charset=utf-8",
            success  : function(resonse) {
                userDatatable();
                document.getElementById("addRoleForm").reset();
                $("#roleModal").modal('hide'); 
                success(resonse.message);
            },
            error    : function(e) {
                console.log("ERROR: ",e);
                error("Insert falied");
            }
        });
        
    });
    /*
     * Datable get room function
     */
    function userDatatable(param) {
        var url = 'role/load';
        $('#roleTable').dataTable({
            destroy : true,
            data    : jbf.ajax.load(url, param),
            columns : [{
                    title   : 'Id',
                    data    : 'roleId'
                },{
                    title   : 'Role Name',
                    data    : 'roleName'
                },{
                    title   : 'Display Name',
                    data    : 'displayName'
                },{
                    title   : 'Description',
                    data    : 'description'
                }],
            columnDefs  : [
               {"className": "dt-center", "targets": "_all"}
            ]
        });
    };
    
});