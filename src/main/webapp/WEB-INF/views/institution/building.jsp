<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
	        <script type="text/javascript" src="<c:url value='/resources/js/funtions/institution/buildingInfo.js' />"></script> 
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
					Building Info Form</span>            	
				</div>
            </div>
            <div class="box-body">
        <form name="addNewBuildingForm" action="#" method="post" class="form-horizontal" id="addNewBuildingForm" enctype="multipart/form-data">
				<input type="hidden" id="csrfToken" value="${_csrf.token}"/>
				<input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
				<input type="hidden" id="entryUser" value="${user.userid}"/>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="buildName">Building Name<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="buildName" class="form-control validate[required]" type="text" value="" name="buildName">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="totalRoom"> Total Room<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="totalRoom" class="form-control validate[required,custom[onlyLetterSp]] text-input" type="text" value="" name="totalRoom">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="floor">Floor</label>
			<div class="col-sm-8">
				<input id="floor" class="form-control " type="text" value="" name="floor">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="constructionType">Construction Type<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="constructionType" class="form-control validate[required,custom[onlyLetterSp]] text-input" type="text" value="" name="constructionType">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="details">Description <span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="details" class="form-control validate[required,custom[onlyLetterSp]] text-input" type="text" value="" name="details">
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
            <table id="buildingTable" class="table table-bordered table-striped">
               <!-- table body part dynamically call from databases function
               server side processing -->
            </table>
        </div>
	</div>
	</jsp:body>
</t:dashboard>
