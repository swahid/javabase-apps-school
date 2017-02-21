<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
	        <script type="text/javascript" src="<c:url value='/resources/js/jschool/institution/session.js' />"></script> 
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
					Session Form</span>            	
				</div>
            </div>
            <div class="box-body">
        <form name="addSessionForm" action="#" method="post" class="form-horizontal" id="addSessionForm" enctype="multipart/form-data">
				<input type="hidden" id="csrfToken" value="${_csrf.token}"/>
						<input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="session">Session<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="session" class="form-control validate[required,custom[onlyLetterSp]] text-input" type="text" value="" name="session">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="duration">Duration</label>
			<div class="col-sm-8">
				<input id="duration" class="form-control " type="text" value="" name="duration">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="level">Level </label>
			<div class="col-sm-8">
				<input id="level" class="form-control " type="text" value="" name="level">
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
      <div class="box-body">
		<div class="box-body table-responsive">
            <table id="sessionTable" class="table table-bordered table-striped">
               <!-- table body part dynamically call from databases function
               server side processing -->
            </table>
        </div>
	</div>
	</jsp:body>
</t:dashboard>
