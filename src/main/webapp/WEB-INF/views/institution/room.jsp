<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
	        <script type="text/javascript" src="<c:url value='/resources/js/funtions/institution/roomInfo.js' />"></script> 
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
					Room Info Form</span>            	
				</div>
            </div>
            <div class="box-body">
        <form name="addNewRoomForm" action="#" method="post" class="form-horizontal" id="addNewRoomForm" enctype="multipart/form-data">
				<input type="hidden" id="csrfToken" value="${_csrf.token}"/>
						<input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="buildingId">Building Name<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<select name="buildingId" class="form-control validate[required]" id="buildingId"><!-- 
                	<option value="">Select Building</option>
        			<option value="1">Science</option>
        			<option value="2">North Bhaban</option>
				 	<option value="3">Middle Bhaban</option> -->
				</select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="roomUsedId">Used For<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<select name="roomUsedId" class="form-control validate[required]" id="roomUsedId">
                	<!-- <option value="">Select Building</option>
        			<option value="1">Library</option>
        			<option value="2">Class Room</option>
				 	<option value="3">LAB</option>
				 	<option value="4">Teachers Room</option> -->
				</select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="floorNo"> Floor No<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="floorNo" class="form-control validate[required,custom[onlyLetterSp]] text-input" type="text" value="" name="floorNo">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="roomName"> Room Name<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="roomName" class="form-control validate[required,custom[onlyLetterSp]] text-input" type="text" value="" name="roomName">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="roomNo">Room No.</label>
			<div class="col-sm-8">
				<input id="roomNo" class="form-control " type="text" value="" name="roomNo">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="totalSeat">Total Seat<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="totalSeat" class="form-control validate[required,custom[onlyLetterSp]] text-input" type="text" value="" name="totalSeat">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="size">Size <span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="size" class="form-control validate[required,custom[onlyLetterSp]] text-input" type="text" value="" name="size">
			</div>
		</div>
		<div class="col-sm-offset-2 col-sm-8">
        	
        	<input type="submit" value="Save" name="save_ins_information" class="btn btn-success">
        </div>
        </form>
        </div>
        <!-- =========================== Search Datatable Room Start ======================== -->
 		<div class="box-body">
		<div class="box-body table-responsive">
             <table id="roomTable" class="table table-bordered table-striped">
                <!-- table body part dynamically call from databases function
                server side processing -->
              </table>
          </div><!-- /.box-body -->
       
	</div>
 <!-- =========================== Search Datatable Room END ========================== -->
        </div>
    </div>
    </div>
	</jsp:body>
</t:dashboard>
