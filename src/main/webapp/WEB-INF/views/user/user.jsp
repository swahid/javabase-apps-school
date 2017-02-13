<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
	        <script type="text/javascript" src="<c:url value='/resources/js/jschool/user/user.js' />"></script> 
	</jsp:attribute>
	<jsp:attribute name="contentHeader">

	</jsp:attribute>
	<jsp:body>
	<div class="row">
	<div class="col-md-12">
		<div class="box box-default" data-collapsed="0">
        	<div class="box-header with-border">
            	<div class="box-title">
            		<span><i class="fa fa-user"></i>
					Manage User</span>            	
				</div>
				<!-- Button trigger modal -->
				<input type="button" class="btn btn-primary pull-right" data-toggle="modal" data-target="#userModal" value="Add Users" />
			</div>
	<!-- =========================== End Header ======================== -->
	<!-- =========================== Start body Content ======================== -->
	
	
	
 		<!-- =========================== Search Combo Section Start ======================== -->
<!--  	<div class="box-body"> 
	    <div class="form-group col-md-3">
			<label for="buildingId"> BUilding</label>			
            <select name="buildingId" id="buildingId" class="form-control buildingId">
            </select>
			
		</div>
		<div class="form-group col-md-3">
			<label for="userUsedId"> Used For</label>			
			<select name="userUsedId" class="form-control userUsedId" id="userUsedId">
			</select>
		</div>
  	</div> -->
 	<!-- =========================== Search Combo Section END ========================== -->
 
 
    <!-- =========================== Search Datatable Room Start ======================== -->
	<div class="box-body">
		<div class="box-body table-responsive">
            <table id="userTable" class="table table-bordered table-striped">
               <thead>
                     <tr>
                         <th>User Id</th>
                         <th>Username</th>
                         <th>Email</th>
                         <th>First Name</th>
                         <th>Last Name</th>
                         <th>User Type</th>
                         <th>Member Since</th>
                     </tr>
                 </thead>
                 <tbody>
                     <c:forEach var="userValue" items="${userTable}">
                     	<tr>
                     		<td>${userValue.userid}</td>
                     		<td>${userValue.username}</td>
                     		<td>${userValue.email}</td>
                     		<td>${userValue.firstName}</td>
                     		<td>${userValue.lastName}</td>
                     		<td>${userValue.role.rolename}</td>
                     		<td>${userValue.regdate}</td>
                     	</tr>
                     </c:forEach>
                 </tbody>
            </table>
        </div><!-- /.box-body -->
       
	</div>
 <!-- =========================== Search Datatable Room END ========================== -->
        </div>
        <!-- ==================================./ box body end ==================================== -->
<!-- =================================== Modal ========================================= -->
<div class="modal fade" id="userModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
        <h4 class="modal-title" id="myModalLabel"> <span><i class="fa fa-plus"></i></span> Add User</h4>
      </div>
      <div class="modal-body">
      <form action="#" method="post" class="form-horizontal" id="addUserForm" spellcheck="true">
				<input type="hidden" id="csrfToken" value="${_csrf.token}"/>
				<input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
				<input type="hidden" id="entryUser" value="${user.userid}"/>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="floorNo"> First Name<span class="require-field">*</span></label>
			<div class="col-sm-6">
				<input id="firstName" class="form-control validate[required,custom[number]]" type="text" name="firstName">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="userName"> LastName<span class="require-field">*</span></label>
			<div class="col-sm-6">
				<input id="lastName" class="form-control validate[required] text-input" type="text" name="lastName">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="userNo">Email <span class="require-field">*</span></label>
			<div class="col-sm-6">
				<input id="email" class="form-control validate[required,custom[number]] text-input" type="email" value="" name="email">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="totalSeat">Username<span class="require-field">*</span></label>
			<div class="col-sm-6">
				<input id="username" class="form-control validate[required]" type="text" name="username" autocomplete="off">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="totalSeat">Password<span class="require-field">*</span></label>
			<div class="col-sm-6">
				<input id="password" class="form-control validate[required]" type="password" name="password" autocomplete="off">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="totalSeat">Re-Password<span class="require-field">*</span></label>
			<div class="col-sm-6">
				<input id="retypePassword" class="form-control validate[required]" type="password" name="retypePassword" autocomplete="off">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-4 control-label" for="roleCombo">Select Roll<span class="require-field">*</span></label>
			<div class="col-sm-6">
            <select name="rollCombo" class="form-control select2" id="roleCombo" style="width: 100%">
            	<option value="1"> Admin</option>
            	<option value="2"> Student</option>
            	<option value="3"> Teacher</option>
            	<option value="4"> Parent</option>
            	<option value="5"> Staff</option>
            </select>
			</div>
		</div>
		<div class="col-sm-offset-4 col-sm-6">
        </div>
      </form>
        
      </div>
      <div class="modal-footer">
        <button class="btn btn-success" id="userSubmit">Add</button>
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
