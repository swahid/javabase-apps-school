<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
	
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
					Admission Form</span>            	
				</div>
            </div>
            <div class="box-body">
        <form name="student_form" action="" method="post" class="form-horizontal" id="student_form" enctype="multipart/form-data">
         		<input type="hidden" name="action" value="insert">
		<input type="hidden" name="role" value="student">
		<div class="form-group">
			<label class="col-sm-2 control-label" for="class_name">Class<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<select name="class_name" class="form-control validate[required]" id="class_name">
                	<option value="">Select Class</option>
        			<option value="1">One</option>
				 	<option value="2">Two</option>
				</select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="class_name">Class Section</label>
			<div class="col-sm-8">
        		<select name="class_section" class="form-control" id="class_section">
                 	<option value="">Select Class Section</option>
                 	<option value="sectionA">Section A</option>
                	<option value="sectionB">Section B</option>
                </select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="roll_id">Roll Number<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="roll_id" class="form-control validate[required]" type="text" value="" name="roll_id">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="first_name">First Name<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="first_name" class="form-control validate[required,custom[onlyLetterSp]] text-input" type="text" value="" name="first_name">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="middle_name">Middle Name</label>
			<div class="col-sm-8">
				<input id="middle_name" class="form-control " type="text" value="" name="middle_name">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="last_name">Last Name<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="last_name" class="form-control validate[required,custom[onlyLetterSp]] text-input" type="text" value="" name="last_name">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="gender">Gender<span class="require-field">*</span></label>
			<div class="col-sm-8">
							<label class="radio-inline">
			     <input type="radio" value="male" class="tog validate[required]" name="gender" checked="checked">Male			    </label>
			    <label class="radio-inline">
			      <input type="radio" value="female" class="tog validate[required]" name="gender">Female 
			    </label>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="birth_date">Date of birth<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="birth_date" class="form-control validate[required] hasDatepicker" type="text" name="birth_date" value="">
			</div>
		</div>		
		<div class="form-group">
			<label class="col-sm-2 control-label" for="address">Address<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="address" class="form-control validate[required]" type="text" name="address" value="">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="city_name">City<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="city_name" class="form-control validate[required]" type="text" name="city_name" value="">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="state_name">State</label>
			<div class="col-sm-8">
				<input id="state_name" class="form-control" type="text" name="state_name" value="">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="zip_code">Zip Code<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="zip_code" class="form-control  validate[required,custom[onlyLetterNumber]]" type="text" name="zip_code" value="">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="mobile_number">Mobile Number</label>
			<div class="col-sm-2">
			
			<input type="text" readonly value="+880" class="form-control text-input" name="phonecode">
			</div>
			<div class="col-sm-6">
				<input id="mobile_number" class="form-control text-input" type="text" name="mobile_number" value="">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="mobile_number">Alternet Mobile Number</label>
			<div class="col-sm-2">
			
			<input type="text" readonly value="+880" class="form-control text-input" name="alter_mobile_number">
			</div>
			<div class="col-sm-6">
				<input id="alternet_mobile_number" class="form-control text-input" type="text" name="alternet_mobile_number" maxlength="10" value="">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label " for="phone">Phone<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="phone" class="form-control validate[,custom[phone]] text-input" type="text" name="phone" value="">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label " for="email">Email<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="email" class="form-control validate[required,custom[email]] text-input" type="text" name="email" value="">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="username">User Name<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="username" class="form-control validate[required]" type="text" name="username" value="">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="password">Password<span class="require-field">*</span></label>
			<div class="col-sm-8">
				<input id="password" class="form-control validate[required]" type="password" name="password" value="">
			</div>
		</div>
		<!--<div class="form-group">
			<label class="col-sm-2 control-label" for="photo">Image</label>
			<div class="col-sm-2">
				
				<input type="text" id="smgt_user_avatar_url" class="form-control" name="smgt_user_avatar"  
				value="" />
				
			</div>	
				<div class="col-sm-3">
       				 <input id="upload_user_avatar_button" type="button" class="button" value="Upload image" />
       				 <span class="description">Upload image</span>
       		
			</div>
			<div class="clearfix"></div>
			
			<div class="col-sm-offset-2 col-sm-8">
                     <div id="upload_user_avatar_preview" >
	                     					        	<img alt="" src="http://www.mobilewebs.net/mojoomla/extend/wordpress/school/wp-content/plugins/school-management/assets/images/finel-logo6.png">
					        	    				</div>
   		 </div>
		</div>-->
		
		<div class="form-group">
			<label class="col-sm-2 control-label" for="photo">Image</label>
			<div class="col-sm-2">
				<input type="text" id="amgt_user_avatar_url" class="form-control" name="smgt_user_avatar" value="">
				<input type="hidden" class="form-control" name="hidden_upload_user_avatar_image" value="">
			</div>	
				<div class="col-sm-3">
       				 <input id="upload_user_avatar" name="upload_user_avatar_image" type="file">
       		</div>
			<div class="clearfix"></div>
			
			<div class="col-sm-offset-2 col-sm-8">
                     <div id="upload_user_avatar_preview">
	                     					        	<img alt="" src="http://www.mobilewebs.net/mojoomla/extend/wordpress/school/wp-content/plugins/school-management/assets/images/finel-logo6.png">
					        	    				</div>
   		 </div>
		</div>
		<div class="col-sm-offset-2 col-sm-8">
        	
        	<input type="submit" value="Add Student" name="save_student" class="btn btn-success">
        </div>
          	
        
        </form>
        </div>
        </div>
    </div>
    </div>
	</jsp:body>
</t:dashboard>
