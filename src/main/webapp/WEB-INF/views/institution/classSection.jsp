<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
	        <script type="text/javascript" src="<c:url value='/resources/js/jschool/institution/insClassSection.js' />"></script> 
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
					Section Used For</span>            	
				</div>
            </div>
            <div class="box-body">
        <form name="addInsClassSectionForm" action="#" method="post" class="form-horizontal" id="addInsClassSectionForm" enctype="multipart/form-data">
				<input type="hidden" id="csrfToken" value="${_csrf.token}"/>
						<input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="insShiftId">Select Shift<span class="require-field"></span></label>
			<div class="col-sm-8">
				<select name="insShiftId" class="form-control" id="insShiftId">

				</select>
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label" for="classId">Select Class<span class="require-field"></span></label>
			<div class="col-sm-8">
				<select name="classId" class="form-control" id="classId">

				</select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="secName">Section Name</label>
			<div class="col-sm-8">
				<input id="secName" class="form-control " type="text" value="" name="secName">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="details">Note</label>
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
    	<!-- =========================== Search Combo Section Start ======================== -->
	<div class="box-body"> 
		<div class="form-group col-md-3">
			<label for="classId"> Used For</label>			
			<select name="classId" class="form-control roomUsedId" id="classId">
			</select>
		</div>
  	</div>
 	<!-- =========================== Search Combo Section END ========================== -->
 
    
    
        <div class="box-body">
		<div class="box-body table-responsive">
            <table id="classSectionTable" class="table table-bordered table-striped">
               <!-- table body part dynamically call from databases function
               server side processing -->
            </table>
        </div>
	</div>
	
	</jsp:body>
</t:dashboard>
