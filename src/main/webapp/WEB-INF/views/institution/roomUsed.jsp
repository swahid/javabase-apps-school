<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
	        <script type="text/javascript" src="<c:url value='/resources/js/funtions/institution/roomUsed.js' />"></script> 
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
					Room Used For</span>            	
				</div>
            </div>
            <div class="box-body">
        <form name="addNewRoomUsedForm" action="#" method="post" class="form-horizontal" id="addNewRoomUsedForm" enctype="multipart/form-data">
				<input type="hidden" id="csrfToken" value="${_csrf.token}"/>
						<input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="usedName"> Used Type<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="usedName" class="form-control validate[required,custom[onlyLetterSp]] text-input" type="text" value="" name="usedName">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="details">Description</label>
			<div class="col-sm-8">
				<input id="details" class="form-control " type="text" value="" name="details">
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
	</jsp:body>
</t:dashboard>
