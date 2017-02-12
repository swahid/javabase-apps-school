<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
    <!-- DATA TABES SCRIPT -->
    <script src=<c:url value="/resources/js/jschool/students.js"/> type="text/javascript"></script>
	</jsp:attribute>

	<jsp:body>
      <div class="row">
       <div class="col-xs-12">
		<div class="box box-default" data-collapsed="0">
        	<div class="box-header with-border">
            	<div class="box-title">
            		<i class="fa fa-group"></i>
					All Students            	
				</div>
            </div>
            
 <!-- =========================== End Header ======================== -->
 <!-- =========================== Search Combo Section Start ======================== -->
 	<div class="box-body"> 
        <form method="post">  
	    <div class="form-group col-md-3">
			<label for="class_id">Select Class</label>			
            <select name="class_id" id="class_list" class="form-control select2">
                <option value="">Select class Name</option>
                <option value="1">Five</option>
                <option value="2">Six</option>
            </select>
			
		</div>
		<div class="form-group col-md-3">
			<label for="class_section">Select Class Section</label>			
			<select name="class_section" class="form-control select2" id="class_section">
               	<option value="">Select Class Section</option>
			</select>
		</div>
          </form>
		  </div>
 <!-- =========================== Search Combo Section END ========================== -->
 
 
 <!-- =========================== Search Datatable Section Start ======================== -->
 <div class="box-body">
		<div class="box-body table-responsive">
             <table id="studentTable" class="table table-bordered table-striped">
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
                 </table>
          </div><!-- /.box-body -->
       
	</div>
 <!-- =========================== Search Datatable Section END ========================== -->
        </div>
    </div>
    </div>
	</jsp:body>
</t:dashboard>
