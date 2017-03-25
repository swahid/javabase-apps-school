<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
	        <script type="text/javascript" src="<c:url value='/resources/js/jschool/institution/subject.js' />"></script> 
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
					Subject Info Entry</span>            	
				</div>
            </div>
            <div class="box-body">
        <form name="addSubjectForm" action="#" method="post" class="form-horizontal" id="addSubjectForm" enctype="multipart/form-data">
				<input type="hidden" id="csrfToken" value="${_csrf.token}"/>
				<input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
				<!-- Get User information like userid or user name -->
				<input type="hidden" id="userId" value="${user.userId}"/>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="classCombo">Select Class <span class="require-field">*</span></label>
			<div class="col-sm-8">
            <select name="classCombo" class="form-control select2 text-input" id="classCombo" style="width: 100%">
            	<!-- Option data will come from js file -->
            </select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="subTitle">Subject Title<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="subTitle" class="form-control validate[required]" type="text" value="" name="subTitle">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="subCode">Subject Code</label>
			<div class="col-sm-8">
				<input id="subCode" class="form-control " type="text" value="" name="subCode">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="subName">Subject Name</label>
			<div class="col-sm-8">
				<input id="subName" class="form-control " type="text" value="" name="subName">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="last_name">Description</label>
			<div class="col-sm-8">
				<input id="active" class="form-control type="text" value="" name="active">
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
            <table id="subjectTable" class="table table-bordered table-striped">
            </table>
        </div><!-- /.box-body -->
	</div>
	</jsp:body>
</t:dashboard>
