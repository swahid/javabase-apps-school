<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
	        <script type="text/javascript"
			src="<c:url value='/resources/js/jschool/institution/room.js' />"></script> 
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
					Room Info Entry</span>            	
				</div>
            </div>
            <div class="box-body">
        <form name="addNewRoomForm" action="#" method="post"
							class="form-horizontal" id="addNewRoomForm"
							enctype="multipart/form-data">
				<input type="hidden" id="csrfToken" value="${_csrf.token}" />
				<input type="hidden" id="csrfHeader" value="${_csrf.headerName}" />
				<!-- Get User information like userid or user name -->
				<input type="hidden" id="userId" value="${user.userId}" />
		<div class="form-group">
			<label class="col-sm-2 control-label" for="buildingCombo">Select uilding<span class="require-field">*</span></label>
			<div class="col-sm-8">
            <select name="buildingCombo" class="form-control select2 text-input" id="buildingCombo" style="width: 100%">
            	<!-- Option data will come from js file -->
            </select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="roomUsedCombo">Room Used For<span class="require-field">*</span></label>
			<div class="col-sm-8">
            <select name="roomUsedCombo" class="form-control select2 text-input" id="roomUsedCombo" style="width: 100%">
            	<!-- Option data will come from js file -->
            </select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="roll_id">Floor No<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="floorNo" class="form-control validate[required]" type="text" value="" name="floorNo">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="first_name"> Room Nmae<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="roomName" class="form-control validate[required]" type="text" value="" name="roomName">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="middle_name">Room No</label>
			<div class="col-sm-8">
				<input id="roomNo" class="form-control " type="text" value="" name="roomNo">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="last_name">Total Seat<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="totalSeat" class="form-control validate[required]" type="text" value="" name="totalSeat">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="last_name">Room Size<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="size" class="form-control validate[required]" type="text" value="" name="size">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="last_name">Room Used For<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="usedFor" class="form-control validate[required]" type="text" value="" name="usedFor">
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
            <table id="roomTable"
					class="table table-bordered table-striped">
            </table>
        </div>
			<!-- /.box-body -->
	</div>
	</jsp:body>
</t:dashboard>
