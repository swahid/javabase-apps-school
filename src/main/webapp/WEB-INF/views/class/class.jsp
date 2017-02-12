<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
    <!-- DATA TABES SCRIPT -->
    <script src=<c:url value="/resources/js/jschool/class/class.js"/> type="text/javascript"></script>
	</jsp:attribute>

	<jsp:attribute name="contentHeader">
      <h2 class="page-header">Manage Class</h2>
	</jsp:attribute>
	<jsp:body>
      <!-- START CUSTOM TABS -->
      <div class="row">
        <div class="col-md-12">
          <!-- Custom Tabs -->
          <div class="nav-tabs-custom">
            <ul class="nav nav-tabs">
              <li class="active"><a href="#tab_1" data-toggle="tab">Class List</a></li>
              <li><a href="#tab_2" data-toggle="tab">Add Class</a></li>
            </ul>
            <div class="tab-content">
            <!-- ===================== tab 1 Start =========================== -->
              <div class="tab-pane active" id="tab_1">
                <!-- =========================== Search Datatable Class Start ======================== -->
				<div class="box-body table-responsive box box-primary" >
			            <table id="classDatatable" class="table table-bordered table-striped">
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
				</div>
	        	<!-- /.box-body -->
			 <!-- =========================== Search Datatable Class END ========================== -->
              </div>
              <!-- /.tab-pane -->
              <!-- ===================== tab 1 END =========================== -->
              <!-- ===================== tab 2 END =========================== -->
              
              <div class="tab-pane" id="tab_2">
                <!-- Horizontal Form -->
		          <div class="box box-primary">
		            <!-- form start -->
		            <form class="form-horizontal">
		              <div class="box-body">
		                <div class="form-group">
		                  <label for="className" class="col-sm-4 control-label">Class Name</label>
		
		                  <div class="col-sm-6">
		                    <input type="text" class="form-control" id="className" placeholder="Class Name">
		                  </div>
		                </div>
		                <div class="form-group">
		                  <label for="classShift" class="col-sm-4 control-label">Select Shift</label>
		                  <div class="col-sm-6">
		                    <input type="text" class="form-control" id="classShift" placeholder="classShift">
		                  </div>
		                </div>
		                 <div class="form-group">
		                  <label for="classSection" class="col-sm-4 control-label">Class Section</label>
		                  <div class="col-sm-6">
		                    <input type="text" class="form-control" id="classSection" placeholder="Class Section">
		                  </div>
		                </div>
		                 <div class="form-group">
		                  <label for="classDescription" class="col-sm-4 control-label">Class Description</label>
		                  <div class="col-sm-6">
		                    <input type="text" class="form-control" id="classDescription" placeholder="Class Description">
		                  </div>
		                </div>
		                <div class="form-group">
		                  <div class="col-sm-offset-4 col-sm-6">
		                    <button type="submit" class="btn btn-info">Add Class</button>
		                  </div>
		                </div>
		              </div>
		              <!-- /.box-body -->
		            </form>
		          </div>
		          <!-- /.box -->
              </div>
              <!-- ===================== tab 2 end =========================== -->
              
              <!-- /.tab-pane -->
<!--               <div class="tab-pane" id="tab_3">
                Lorem Ipsum is simply dummy text of the printing and typesetting industry.
                Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,
                when an unknown printer took a galley of type and scrambled it to make a type specimen book.
                It has survived not only five centuries, but also the leap into electronic typesetting,
                remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset
                sheets containing Lorem Ipsum passages, and more recently with desktop publishing software
                like Aldus PageMaker including versions of Lorem Ipsum.
              </div> -->
              <!-- /.tab-pane -->
              
              
            </div>
            <!-- /.tab-content -->
          </div>
          <!-- nav-tabs-custom -->
        </div>
        <!-- /.col -->
        </div>
      <!-- /.row -->
      <!-- END CUSTOM TABS -->
	</jsp:body>
</t:dashboard>
