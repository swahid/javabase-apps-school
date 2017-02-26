<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
	        <script type="text/javascript" src="<c:url value='/resources/js/jschool/institution/shift.js' />"></script> 
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
					Shift Entry</span>            	
				</div>
            </div>
            <div class="box-body">
        <form name="addNewShiftForm" action="#" method="post" class="form-horizontal" id="addNewShiftForm" enctype="multipart/form-data">
				<input type="hidden" id="csrfToken" value="${_csrf.token}"/>
				<input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
				<!-- Get User information like userid or user name -->
				<input type="hidden" id="userId" value="${user.userId}"/>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="roll_id">Shift Name<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="shiftName" class="form-control validate[required]" type="text" value="" name="shiftName">
			</div>
		</div>
		 <!-- time Picker -->
		<div class="form-group">
			<label class="col-sm-2 control-label" for="middle_name">Start Time</label>
			<div class="col-sm-8">
				<div class="input-group bootstrap-timepicker">
	                <input type="text" class="form-control timepicker" id="startTime">
	                <div class="input-group-addon">
	                <i class="fa fa-clock-o"></i>
	                </div>
	            </div>
            </div>
		</div>
		 <!-- time Picker -->
		<div class="form-group">
			<label class="col-sm-2 control-label" for="middle_name">End Time</label>
			<div class="col-sm-8">
				<div class="input-group bootstrap-timepicker">
	                <input type="text" class="form-control timepicker" id="endTime">
	                <div class="input-group-addon">
	                <i class="fa fa-clock-o"></i>
	                </div>
	            </div>
            </div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="last_name">Description<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="details" class="form-control validate[required,custom[onlyLetterSp]] text-input" type="text" value="" name="details">
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
            <table id="shiftTable" class="table table-bordered table-striped">
            </table>
        </div><!-- /.box-body -->
	</div>
	</jsp:body>
</t:dashboard>
