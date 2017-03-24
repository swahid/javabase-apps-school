<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
	        <script type="text/javascript" src="<c:url value='/resources/js/jschool/employee/employee.js' />"></script> 
	</jsp:attribute>
	<jsp:attribute name="contentHeader">

	</jsp:attribute>
	<jsp:body>
	<div class="row">
	<div class="col-md-12">
		<div class="box box-default" data-collapsed="0">
        	<div class="box-header with-border">
            	<div class="box-title">
            		<span><i class="fa fa-plus"></i>
					Teacher Entry</span>            	
				</div>
            </div>
            <div class="box-body">
        <form name="addEmployeeForm" action="#" method="post" class="form-horizontal" id="addEmployeeForm" enctype="multipart/form-data">
				<input type="hidden" id="csrfToken" value="${_csrf.token}"/>
				<input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
				<!-- Get User information like userid or user name -->
				<input type="hidden" id="userId" value="${user.userId}"/>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="teacherPostCombo">Employee Added As </label>
			<div class="col-sm-8">
            <select name="employeePostCombo" class="form-control select2 text-input" id="employeePostCombo" style="width: 100%">
            <!-- 	Option data will come from js file -->
            </select>
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label" for="employeeID">Employee ID</label>
			<div class="col-sm-8">
				<input id="employeeID" class="form-control" type="text" value="" name="employeeID">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="email">Email Address</label>
			<div class="col-sm-8">
				<input id="email" class="form-control" type="text" value="" name="email">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="firstname">First Name</label>
			<div class="col-sm-8">
				<input id="firstname" class="form-control " type="text" value="" name="firstname">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="lastName">Last Name</label>
			<div class="col-sm-8">
				<input id="lastName" class="form-control " type="text" value="" name="lastName">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="gender">Gender</label>
			<div class="col-sm-8">
				<input id="gender" name="gender" class="validate[required]" type="radio" value="M"> Male&nbsp;&nbsp;
				<input id="gender" name="gender" class="validate[required]" type="radio" value="M"> Female
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="rollCombo">Select Roll<span class="require-field">*</span></label>
			<div class="col-sm-8">
            <select name="rollCombo" class="form-control select2 text-input" id="rollCombo" style="width: 100%">
            </select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="username">User Name</label>
			<div class="col-sm-8">
				<input id="username" class="form-control " type="text" value="" name="username">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="password">Password</label>
			<div class="col-sm-8">
				<input id="password" class="form-control " type="text" value="" name="password">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="phoneno">Phone Number</label>
			<div class="col-sm-8">
				<input id="phoneno" class="form-control " type="text" value="" name="phoneno">
			</div>
		</div>
		<div class="col-sm-10 control-label">
		<input id="createUser" type="hidden" value="${user.username}">
        </div>
		<div class="col-sm-offset-2 col-sm-8">
        	
        	<input type="submit" value="Save" name="save_ins_information" class="btn btn-success">
        </div>
        </form>
        </div>
        </div>
    </div>
    </div>
        <!-- =========================== Search Datatable Start ======================== -->
	<div class="box-body">
		<div class="box-body table-responsive">
            <table id="EmployeesTable" class="table table-bordered table-striped">
            </table>
        </div>/.box-body
	</div>
	</jsp:body>
</t:dashboard>
