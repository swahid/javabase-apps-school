<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
	        <script type="text/javascript" src="<c:url value='/resources/js/jschool/user/user.js' />"></script> 
	</jsp:attribute>
	<jsp:attribute name="contentHeader">

	</jsp:attribute>
	<jsp:body>
	<div class="row">
	<div class="col-md-12">
		<div class="box box-default" data-collapsed="0">
        	<div class="box-header with-border">
            	<div class="box-title">
            		<span><i class="fa fa-user"></i>
					Manage User</span>            	
				</div>
				<!-- Button trigger modal -->
				<input type="button" class="btn btn-primary pull-right" data-toggle="modal" data-target="#userModal" value="Add Users" />
			</div>
	<!-- =========================== End Header ======================== -->
	<!-- =========================== Start body Content ================ -->
	
    <!-- =========================== Search Datatable Start ============ -->
	<div class="box-body">
		<div class="box-body table-responsive">
            <table id="userTable" class="table table-bordered table-striped">
            </table>
        </div><!-- /.box-body -->
       
	</div>
 <!-- =========================== Search Datatable Room END ========================== -->
        </div>
        <!-- ==================================./ box body end ==================================== -->
<!-- =================================== Modal ========================================= -->
<div class="modal fade" id="userModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
        <h4 class="modal-title" id="myModalLabel"> <span><i class="fa fa-user"></i></span> Add User</h4>
      </div>
      <div class="modal-body">
      <form action="#" method="post" class="form-horizontal" id="addUserForm">
		<div class="form-group">
			<label class="col-sm-4 control-label" for="firstName">First Name<span class="require-field">*</span></label>
			<div class="col-sm-6">
				<input id="firstName" class="form-control validate[required] text-input" type="text" name="firstName">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="lastName">LastName<span class="require-field">*</span></label>
			<div class="col-sm-6">
				<input id="lastName" class="form-control validate[required] text-input" type="text" name="lastName">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="gender">Gender<span class="require-field">*</span></label>
			<div class="col-sm-6">
				<input id="gender" name="gender" class="validate[required]" type="radio" value="M"> Male&nbsp;&nbsp;
				<input id="gender" name="gender" class="validate[required]" type="radio" value="M"> Female
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="email">Email <span class="require-field">*</span></label>
			<div class="col-sm-6">
				<input id="email" class="form-control validate[required,custom[email]] text-input" type="email" name="email">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="username">Username<span class="require-field">*</span></label>
			<div class="col-sm-6">
				<input id="username" class="form-control validate[required] text-input" type="text" name="username" autocomplete="off">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="password">Password<span class="require-field">*</span></label>
			<div class="col-sm-6">
				<input id="password" class="form-control validate[required] text-input" type="password" name="password" autocomplete="off">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="retypePassword">Re-Password<span class="require-field">*</span></label>
			<div class="col-sm-6">
				<input id="retypePassword" class="form-control validate[required,equals[password]] text-input" type="password" name="retypePassword" autocomplete="off">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="rollCombo">Select Roll<span class="require-field">*</span></label>
			<div class="col-sm-6">
            <select name="rollCombo" class="form-control select2 text-input" id="roleCombo" style="width: 100%">
            </select>
			</div>
		</div>
		<div class="col-sm-offset-4 col-sm-6">
		<input id="createUser" type="hidden" value="${user.username}">
        </div>
      </form>
        
      </div>
      <div class="modal-footer">
        <button class="btn btn-success" id="userSubmit">Add User</button>
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
