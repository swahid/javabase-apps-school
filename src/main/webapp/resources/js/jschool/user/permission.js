/*
 * role permission script
*/

$(document).ready(function($) {
    
    permissiontable();
    rolePermissiontable();
    userPermissiontable();
    
});

/*
 * Datable get permission function
 */
function permissiontable(param) {
    var url = 'permssion/load';
    $('#permissiontable').dataTable({
        destroy : true,
        data    : jbf.ajax.load(url, param),
        columns : [{
            title   : 'Id',
            data    : 'permId'
        },{
            title   : 'Pemission Name',
            data    : 'permName'
        },{
            title   : 'Display Name',
            data    : 'displayName'
        },{
            title   : 'Description',
            data    : 'description'
        },{
            title   : 'Permission Code',
            data    : 'permCode'
        },{
            title   : 'Flag',
            data    : 'flag'
        }],
        columnDefs  : [
            {"className": "dt-center", "targets": "_all"}
        ]
    });
};
/*
 * Datable get role permission function
 */
function rolePermissiontable(param) {
    var url = 'rolepermssion/load';
    $('#rolePermissiontable').dataTable({
        destroy : true,
        data    : jbf.ajax.load(url, param),
        columns : [{
                title   : 'Id',
                data    : 'rolePermId'
            }/*,{
                title   : 'Role Name',
                data    : 'role.roleName'
            },{
                title   : 'Permission Name',
                data    : 'permission.permName'
            }*/,{
                title   : 'Acive',
                data    : 'isActive'
            }],
        columnDefs  : [
           {"className": "dt-center", "targets": "_all"}
        ]
    });
};

/*
 * Datable get user prmission function
 */
function userPermissiontable(param) {
    var url = 'userpermssion/load';
    $('#userPermissiontable').dataTable({
        destroy : true,
        data    : jbf.ajax.load(url, param),
        columns : [{
                title   : 'Id',
                data    : 'userRoleId'
            }/*,{
                title   : 'User Name',
                data    : 'user.username'
            },{
                title   : 'Permission Name',
                data    : 'permission.permName'
            }*/,{
                title   : 'Acive',
                data    : 'isActive'
            }],
        columnDefs  : [
           {"className": "dt-center", "targets": "_all"}
        ]
    });
};