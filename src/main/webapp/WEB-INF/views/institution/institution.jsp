<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
	        <script type="text/javascript" src="<c:url value='/resources/js/jschool/institution/institution.js' />"></script> 
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
					Institution Info Entry</span>            	
				</div>
            </div>
            <div class="box-body">
        <form name="addNewInstitutionForm" action="#" method="post" class="form-horizontal" id="addNewInstitutionForm" enctype="multipart/form-data">
				<input type="hidden" id="csrfToken" value="${_csrf.token}"/>
				<input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
				<!-- Get User information like userid or user name -->
				<input type="hidden" id="userId" value="${user.userId}"/>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="class_name">Institution Type<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<select name="classId" class="form-control validate[required] select2" id="classId">
                	<option value="">Select Class</option>
        			<option value="1">Primary</option>
        			<option value="2">High School</option>
				 	<option value="3">College</option>
				</select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="roll_id">Institution Name</label>
			<div class="col-sm-8">
				<input id="insName" class="form-control" type="text" value="" name="insName">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="first_name"> Code</label>
			<div class="col-sm-8">
				<input id="insCode" class="form-control" type="text" value="" name="insCode">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="middle_name">Upazial</label>
			<div class="col-sm-8">
				<input id="upazila" class="form-control " type="text" value="" name="upazila">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="last_name">Catagory</label>
			<div class="col-sm-8">
				<input id="category" class="form-control  text-input" type="text" value="" name="category">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="last_name">Established</label>
			<div class="col-sm-8">
				<input id="situated" class="form-control text-input" type="text" value="" name="situated">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="last_name">Address</label>
			<div class="col-sm-8">
				<input id="address" class="form-control text-input" type="text" value="" name="address">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="last_name">Postal Code</label>
			<div class="col-sm-8">
				<input id="postalCode" class="form-control text-input" type="text" value="" name="postalCode">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="last_name">Mail Address</label>
			<div class="col-sm-8">
				<input id="mailAddress" class="form-control text-input" type="text" value="" name="mailAddress">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="last_name">Web Address</label>
			<div class="col-sm-8">
				<input id="webAddress" class="form-control text-input" type="text" value="" name="webAddress">
			</div>
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
            <table id="institutionTable" class="table table-bordered table-striped">
            </table>
        </div><!-- /.box-body -->
	</div>
	</jsp:body>
</t:dashboard>
