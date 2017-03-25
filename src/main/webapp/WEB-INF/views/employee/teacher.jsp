<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
	        <script type="text/javascript" src="<c:url value='/resources/js/jschool/employee/teacher.js' />"></script> 
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
					Teacher Entry</span>            	
				</div>
            </div>
            <div class="box-body">
        <form name="addTeacherForm" action="#" method="post" class="form-horizontal" id="addTeacherForm" enctype="multipart/form-data">
				<input type="hidden" id="csrfToken" value="${_csrf.token}"/>
				<input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
				<!-- Get User information like userid or user name -->
				<input type="hidden" id="userId" value="${user.userId}"/>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="teacherEmpCombo">Select Teacher <span class="require-field">*</span></label>
			<div class="col-sm-8">
            <select name="teacherEmpCombo" class="form-control select2 text-input" id="teacherEmpCombo" style="width: 100%">
            <!-- 	Option data will come from js file -->
            </select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="teacherEmpCombo">Select  Post <span class="require-field">*</span></label>
			<div class="col-sm-8">
            <select name="teacherPostCombo" class="form-control select2 text-input" id="teacherPostCombo" style="width: 100%">
            <!-- 	Option data will come from js file -->
            </select>
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
            <table id="teacherTable" class="table table-bordered table-striped">
            </table>
        </div><!-- /.box-body -->
	</div>
	</jsp:body>
</t:dashboard>
