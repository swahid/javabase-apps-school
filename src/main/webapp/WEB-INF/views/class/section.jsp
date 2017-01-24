<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
	        <script type="text/javascript" src="<c:url value='/resources/js/jschool/class/section.js' />"></script> 
	</jsp:attribute>
	<jsp:attribute name="contentHeader">

	</jsp:attribute>
	<jsp:body>
	<div class="row">
	<div class="col-md-12">
		<div class="box box-default" data-collapsed="0">
        	<div class="box-header with-border">
            	<div class="box-title">
            		<span><i class="fa fa-section"></i>
					Class Rooms</span>            	
				</div>
				<!-- Button trigger modal -->
				<input type="button" class="btn btn-primary pull-right" data-toggle="modal" data-target="#sectionModal" value="Add Section" />
			</div>
	<!-- =========================== End Header ======================== -->
	<!-- =========================== Start body Content ======================== -->
	
	
	
 		<!-- =========================== Search Combo Section Start ======================== -->
 	<div class="box-body"> 
	    <div class="form-group col-md-3">
			<label for="classCombo"> Select Class </label>			
            <select name="classCombo" class="form-control classCombo select2" id="classCombo">
            </select>
			
		</div>
		<div class="form-group col-md-3">
			<label for="classShiftCombo">Select Shift</label>			
			<select name="classShiftCombo" class="form-control classShiftCombo select2" id="classShiftCombo">
			</select>
		</div>
  	</div>
 	<!-- =========================== Search Combo Section END ========================== -->
 
 
    <!-- =========================== Search Datatable Room Start ======================== -->
	<div class="box-body">
		<div class="box-body table-responsive">
            <table id="sectionDatatable" class="table table-bordered table-striped">
               <!-- table body part dynamically call from databases function
               server side processing -->
               <thead>
                   <tr>
                       <th>Rendering engine</th>
                       <th>Browser</th>
                       <th>Platform(s)</th>
                       <th>Engine version</th>
                       <th>CSS grade</th>
                   </tr>
               </thead>
               <tbody>
                   <tr>
                       <td>Trident</td>
                       <td>Internet
                           Explorer 4.0</td>
                       <td>Win 95+</td>
                       <td> 4</td>
                       <td>X</td>
                   </tr>
                   <tr>
                       <td>Trident</td>
                       <td>Internet
                           Explorer 5.0</td>
                       <td>Win 95+</td>
                       <td>5</td>
                       <td>C</td>
                   </tr>
                <tbody>
            </table>
        </div><!-- /.box-body -->
       
	</div>
 <!-- =========================== Search Datatable Room END ========================== -->
        </div>
        <!-- ==================================./ box body end ==================================== -->
<!-- =================================== Modal ========================================= -->
<div class="modal fade" id="sectionModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
        <h4 class="modal-title" id="myModalLabel"> <span><i class="fa fa-plus"></i></span> Add Section</h4>
      </div>
      <div class="modal-body">
      <form action="#" method="post" class="form-horizontal" id="addNewRoomForm" autocomplete="off" spellcheck="true">
				<input type="hidden" id="csrfToken" value="${_csrf.token}"/>
				<input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
				<input type="hidden" id="entryUser" value="${user.userid}"/>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="classModal">Select Class<span class="require-field">*</span></label>
			<div class="col-sm-6">
				<select name="classModal" id="classModal" class="form-control classCombo select2" style="width: 100%">
            	</select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="classShiftModal">Select Shift<span class="require-field">*</span></label>
			<div class="col-sm-6">
				<select name="classShiftModal" class="form-control classShiftCombo select2" id="classShiftModal" style="width: 100%">
			</select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="floorNo"> Floor No<span class="require-field">*</span></label>
			<div class="col-sm-6">
				<input id="floorNo" class="form-control validate[required,custom[number]]" type="text" name="floorNo">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="sectionName"> Room Name<span class="require-field">*</span></label>
			<div class="col-sm-6">
				<input id="sectionName" class="form-control validate[required] text-input" type="text" name="sectionName">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="sectionNo">Room No. <span class="require-field">*</span></label>
			<div class="col-sm-6">
				<input id="sectionNo" class="form-control validate[required,custom[number]] text-input" type="text" value="" name="sectionNo">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="totalSeat">Total Seat<span class="require-field">*</span></label>
			<div class="col-sm-6">
				<input id="totalSeat" class="form-control validate[required,custom[number]] text-input" type="text" name="totalSeat">
			</div>
		</div>
		<div class="col-sm-offset-4 col-sm-6">
        </div>
      </form>
        
      </div>
      <div class="modal-footer">
        <button class="btn btn-success" id="sectionSubmit">submit</button>
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
