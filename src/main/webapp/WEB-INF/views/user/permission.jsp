<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
    <!-- DATA TABES SCRIPT -->
    <script src=<c:url value="/resources/js/jschool/user/permission.js"/> type="text/javascript"></script>
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
              <li class="active"><a href="#tab_1" data-toggle="tab">Permission</a></li>
              <li><a href="#tab_2" data-toggle="tab">Role Permission</a></li>
              <li><a href="#tab_3" data-toggle="tab">User Permission</a></li>
            </ul>
            <div class="tab-content">
            <!-- ===================== tab 1 Start =========================== -->
              <div class="tab-pane active" id="tab_1">
                <!-- =========================== Search Datatable Class Start ======================== -->
				<div class="box-body table-responsive box box-primary" >
			         <table id="permissiontable" class="table table-bordered table-striped">
			               <!-- table body part dynamically call from databases function
			               server side processing -->
	           		 </table>
				</div>
	        	<!-- /.box-body -->
			 <!-- =========================== Search Datatable Class END ========================== -->
              </div>
              <!-- /.tab-pane -->
              <!-- ===================== tab 1 END =========================== -->
              
              <!-- ===================== tab 2 START ========================= -->
              
              <div class="tab-pane" id="tab_2">
                <div class="box-body table-responsive box box-primary" >
                     <table id="rolePermissiontable" class="table table-bordered table-striped">
                           <!-- table body part dynamically call from databases function
                           server side processing -->
                     </table>
                </div>
              </div>
              <!-- ===================== tab 2 end =========================== -->
              
              <!-- ===================== tab 3 START ========================= -->
              
              <div class="tab-pane" id="tab_2">
                <div class="box-body table-responsive box box-primary" >
                     <table id="userPermissiontable" class="table table-bordered table-striped">
                           <!-- table body part dynamically call from databases function
                           server side processing -->
                     </table>
                </div>
              </div>
              <!-- ===================== tab 3 end =========================== -->
              
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
