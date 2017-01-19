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
            		<span><i class="fa fa-room"></i>
					Class Rooms</span>            	
				</div>
				<!-- Button trigger modal -->
				<input type="button" class="btn btn-primary pull-right" data-toggle="modal" data-target="#roomModal" value="Add Class Rooms" />
			</div>
	<!-- =========================== End Header ======================== -->
	<!-- =========================== Start body Content ======================== -->
	
	
	
 		<!-- =========================== Search Combo Section Start ======================== -->
 	<div class="box-body"> 
	    <div class="form-group col-md-3">
			<label for="buildingId">Select Class</label>			
            <select name="buildingId" id="buildingId" class="form-control buildingId">
            </select>
			
		</div>
		<div class="form-group col-md-3">
			<label for="roomUsedId">Select Class Section</label>			
			<select name="roomUsedId" class="form-control roomUsedId" id="roomUsedId">
			</select>
		</div>
	<div class="form-group col-md-3">
    	<label for="roomSearch">&nbsp;</label>
      	<button type="submit" id="roomSearch" class="btn btn-success">Search</button>
    </div>
		  </div>
 <!-- =========================== Search Combo Section END ========================== -->
 
 
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
        <!-- ==================================./ box body end ==================================== -->
<!-- =================================== Modal ========================================= -->
<div class="modal fade" id="roomModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
        <h4 class="modal-title" id="myModalLabel"> <span><i class="fa fa-plus"></i></span> Add Class Room</h4>
      </div>
      <div class="modal-body">
      <form action="#" method="post" class="form-horizontal" id="addNewRoomForm" autocomplete="off" spellcheck="true">
				<input type="hidden" id="csrfToken" value="${_csrf.token}"/>
				<input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
				<input type="hidden" id="entryUser" value="${user.userid}"/>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="buildingId">Building Name<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<select name="buildingModal" class="form-control validate[required] buildingId" id="buildingModal">
				</select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="roomUsedId">Used For<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<select name="roomUsedModal" class="form-control  validate[required] roomUsedId" id="roomUsedModal">
				</select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="floorNo"> Floor No<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="floorNo" class="form-control validate[required,custom[number]]" type="text" name="floorNo">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="roomName"> Room Name<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="roomName" class="form-control validate[required] text-input" type="text" name="roomName">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="roomNo">Room No. <span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="roomNo" class="form-control validate[required,custom[number]] text-input" type="text" value="" name="roomNo">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="totalSeat">Total Seat<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="totalSeat" class="form-control validate[required,custom[number]] text-input" type="text" name="totalSeat">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="size">Size</label>
			<div class="col-sm-8">
				<input id="size" class="form-control" type="text" value="" name="size">
			</div>
		</div>
		<div class="col-sm-offset-2 col-sm-8">
        </div>
      </form>
        
      </div>
      <div class="modal-footer">
        <button class="btn btn-success" id="roomSubmit">submit</button>
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
<!-- =================================== Modal ========================================= -->
    </div>
    </div>
	</jsp:body>
</t:dashboard>
