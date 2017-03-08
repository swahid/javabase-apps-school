<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
	        <script type="text/javascript" src="<c:url value='/resources/js/jschool/user/role.js' />"></script> 
	</jsp:attribute>
	<jsp:attribute name="contentHeader">

	</jsp:attribute>
	<jsp:body>
	<div class="row">
	<div class="col-md-12">
		<div class="box box-default" data-collapsed="0">
        	<div class="box-header with-border">
            	<div class="box-title">
            		<span><i class="fa fa-role"></i>
					Manage User</span>            	
				</div>
				<!-- Button trigger modal -->
				<input type="button" class="btn btn-primary pull-right" data-toggle="modal" data-target="#roleModal" value="Add Role" />
			</div>
	<!-- =========================== End Header ======================== -->
	<!-- =========================== Start body Content ================ -->
	
    <!-- =========================== Search Datatable Start ============ -->
	<div class="box-body">
		<div class="box-body table-responsive">
            <table id="roleTable" class="table table-bordered table-striped">
            </table>
        </div><!-- /.box-body -->
       
	</div>
 <!-- =========================== Search Datatable Room END ========================== -->
        </div>
        <!-- ==================================./ box body end ==================================== -->
<!-- =================================== Modal ========================================= -->
<div class="modal fade" id="roleModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
        <h4 class="modal-title" id="myModalLabel"> <span><i class="fa fa-role"></i></span> Add User</h4>
      </div>
      <div class="modal-body">
      <form action="#" method="post" class="form-horizontal" id="addRoleForm">
		<div class="form-group">
			<label class="col-sm-4 control-label" for="roleName">Role Name<span class="require-field">*</span></label>
			<div class="col-sm-6">
				<input id="roleName" class="form-control validate[required] text-input" type="text">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="displayName">Role Display Name<span class="require-field">*</span></label>
			<div class="col-sm-6">
				<input id=displayName class="form-control text-input" type="text">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="lastName">Role Description</label>
			<div class="col-sm-6">
				<input id=description class="form-control validate[required] text-input" type="text">
			</div>
		</div>
		<div class="col-sm-offset-4 col-sm-6">
        </div>
      </form>
        
      </div>
      <div class="modal-footer">
        <button class="btn btn-success" id="roleSubmit">Add Role</button>
        <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
<!-- =================================== Modal ========================================= -->
    </div>
    </div>
	</jsp:body>
</t:dashboard>
