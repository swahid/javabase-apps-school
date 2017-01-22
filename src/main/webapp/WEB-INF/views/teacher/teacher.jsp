<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
	<!-- DATA TABES SCRIPT -->
    <script src=<c:url value="/resources/js/jschool/teacher.js"/> type="text/javascript"></script>
	</jsp:attribute>
	<jsp:attribute name="contentHeader">

	</jsp:attribute>
	<jsp:body>
	<div class="row">
	<div class="col-md-12">
		<div class="box box-default" data-collapsed="0">
        	<div class="box-header with-border">
            	<div class="box-title">
            		<i class="fa fa-group"></i>
					All Teacher            	
				</div>
            </div>
 <!-- =========================== Search Combo Section Start ======================== -->
 		<div class="box-body"> 
	   		<button class="btn btn-info pull-right" >Add Teacher</button>
		</div>
 <!-- =========================== Search Combo Section END ========================== -->
 
 
 <!-- =========================== Search Datatable Section Start ======================== -->
 <div class="box-body">
		<div class="box-body table-responsive" style="width: auto;">
             <table id="teacherTable" class="table table-bordered table-striped">
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
 <!-- =========================== Search Datatable Section END ========================== -->
        </div>
    </div>
    </div>
	</jsp:body>
</t:dashboard>
