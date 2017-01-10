<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
	
	</jsp:attribute>

	<jsp:body>
	<div class="row">
	<div class="col-md-12">
		<div class="box box-default" data-collapsed="0">
        	<div class="box-header with-border">
            	<div class="box-title">
            		<i class="fa fa-plus"></i>
					All Students            	
				</div>
            </div>
 <!-- =========================== Search Combo Section Start ======================== -->
 <div class="box-body"> 
        <form method="post">  
	    <div class="form-group col-md-3">
			<label for="class_id">Select Class</label>			
            <select name="class_id" id="class_list" class="form-control select2">
                <option value=" ">Select class Name</option>
                <option value="1">Five</option>
                <option value="2">Six</option>
            </select>
			
		</div>
		<div class="form-group col-md-3">
			<label for="class_id">Select Class Section</label>			
			<select name="class_section" class="form-control validate[required]" id="class_section">
               	<option value="">Select Class Section</option>
			</select>
		</div>
	<div class="form-group col-md-3 button-possition">
    	<label for="subject_id">&nbsp;</label>
      	<input type="submit" value="Search" name="subject_id" class="button-possition">
    </div>
       
          </form>
		  </div>
 <!-- =========================== Search Combo Section END ========================== -->
 
 
 <!-- =========================== Search Datatable Section Start ======================== -->
 <div class="box-body">
		<div class="table-responsive">
        <div id="students_list_wrapper" class="dataTables_wrapper">
        <div class="dataTables_length" id="students_list_length">
        <label>Show <select name="students_list_length" aria-controls="students_list" class=""><option value="10">10</option><option value="25">25</option><option value="50">50</option><option value="100">100</option></select> entries</label></div><div id="students_list_filter" class="dataTables_filter"><label>Search:<input type="search" class="" placeholder="" aria-controls="students_list"></label></div><table id="students_list" class="display dataTable dtr-inline collapsed" role="grid" aria-describedby="students_list_info" style="width: 100%;">
        <thead>
        	<tr role="row"><th class="sorting_disabled" rowspan="1" colspan="1" aria-label="Photo" style="width: 70px;">Photo</th><th class="sorting_asc" tabindex="0" aria-controls="students_list" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Student Name: activate to sort column descending" style="width: 141px;">Student Name</th><th class="sorting" tabindex="0" aria-controls="students_list" rowspan="1" colspan="1" aria-label=" Roll No.: activate to sort column ascending" style="width: 114px;"> Roll No.</th><th class="sorting" tabindex="0" aria-controls="students_list" rowspan="1" colspan="1" aria-label=" Student Email: activate to sort column ascending" style="width: 167px;"> Student Email</th><th class="sorting" tabindex="0" aria-controls="students_list" rowspan="1" colspan="1" aria-label=" Class: activate to sort column ascending" style="width: 50px;"> Class</th><th class="sorting" tabindex="0" aria-controls="students_list" rowspan="1" colspan="1" aria-label=" Section: activate to sort column ascending" style="width: 63px;"> Section</th></tr>
        </thead>
 
        <tfoot>
            <tr><th rowspan="1" colspan="1">Photo</th><th rowspan="1" colspan="1">Student Name</th><th rowspan="1" colspan="1"> Roll No.</th><th rowspan="1" colspan="1"> Student Email</th><th rowspan="1" colspan="1"> Class</th><th rowspan="1" colspan="1"> Section</th></tr>
        </tfoot>
 
        <tbody>
        <tr role="row" class="odd">
				<td class="user_image text-center"><img src="http://www.mobilewebs.net/mojoomla/extend/wordpress/school/wp-content/uploads/school_assets/1477162269-pimg-in.png" height="50px" width="50px" class="img-circle"></td>
                <td class="name sorting_1">ABCTCET Kanojia</td>
				<td class="roll_no">68465</td>
				<td class="email">idiplomads@gmail.com</td>
				<td class="name">Five</td>
				<td class="name"></td>
                
                              	 
			               </tr><tr role="row" class="even">
				<td class="user_image text-center"><img src="http://www.mobilewebs.net/mojoomla/extend/wordpress/school/wp-content/uploads/school_assets/1478854732-pimg-in.jpg" height="50px" width="50px" class="img-circle"></td>
                <td class="name sorting_1">Abhi Singh</td>
				<td class="roll_no">066</td>
				<td class="email">abhijeetpsingh@hotmail.com</td>
				<td class="name">Five</td>
				<td class="name">No Section</td>
                
                              	 
			               </tr><tr role="row" class="odd">
				<td class="user_image text-center"><img src="http://www.mobilewebs.net/mojoomla/extend/wordpress/school/wp-content/uploads/school_assets/1467568803-pimg-in.jpg" height="50px" width="50px" class="img-circle"></td>
                <td class="name sorting_1">Abhishek Mishra</td>
				<td class="roll_no">FIVE3456</td>
				<td class="email">abhijee00@gmail.com</td>
				<td class="name">Five</td>
				<td class="name">Section A</td>
                
                              	 
			               </tr><tr role="row" class="even">
				<td class="user_image text-center"><img src="http://www.mobilewebs.net/mojoomla/extend/wordpress/school/wp-content/plugins/school-management/assets/images/finel-logo6.png" height="50px" width="50px" class="img-circle"></td>
                <td class="name sorting_1">Adam Bilal</td>
				<td class="roll_no">438934</td>
				<td class="email">adamc@itm247.com</td>
				<td class="name">Six</td>
				<td class="name">No Section</td>
                
                              	 
			               </tr><tr role="row" class="odd">
				<td class="user_image text-center"><img src="http://www.mobilewebs.net/mojoomla/extend/wordpress/school/wp-content/uploads/school_assets/1469472690-pimg-in.jpg" height="50px" width="50px" class="img-circle"></td>
                <td class="name sorting_1">Adolf buneri</td>
				<td class="roll_no">2012677664</td>
				<td class="email">mda@yashoo.com</td>
				<td class="name">Five</td>
				<td class="name">No Section</td>
                
                              	 
			               </tr><tr role="row" class="even">
				<td class="user_image text-center"><img src="http://www.mobilewebs.net/mojoomla/extend/wordpress/school/wp-content/plugins/school-management/assets/images/finel-logo6.png" height="50px" width="50px" class="img-circle"></td>
                <td class="name sorting_1">ahsan Gujjar</td>
				<td class="roll_no">1548</td>
				<td class="email">malik@gmail.com</td>
				<td class="name">Six</td>
				<td class="name">No Section</td>
                
                              	 
			    </tr><tr role="row" class="odd">
				<td class="user_image text-center"><img src="http://www.mobilewebs.net/mojoomla/extend/wordpress/school/wp-content/uploads/school_assets/1467145563-pimg-in.jpg" height="50px" width="50px" class="img-circle"></td>
                <td class="name sorting_1">Andy Olmedo</td>
				<td class="roll_no">2014</td>
				<td class="email">ingo@msn.com</td>
				<td class="name">Five</td>
				<td class="name">No Section</td>
                
                              	 
			    </tr><tr role="row" class="even">
				<td class="user_image text-center"><img src="http://www.mobilewebs.net/mojoomla/extend/wordpress/school/wp-content/plugins/school-management/assets/images/finel-logo6.png" height="50px" width="50px" class="img-circle"></td>
                <td class="name sorting_1">asdgfsdfg sdfgsdfgsdfgsdfg</td>
				<td class="roll_no">23</td>
				<td class="email">agenciaclave@gmail.com</td>
				<td class="name">Six</td>
				<td class="name">No Section</td>
                
                              	 
			    </tr><tr role="row" class="odd">
				<td class="user_image text-center"><img src="http://www.mobilewebs.net/mojoomla/extend/wordpress/school/wp-content/plugins/school-management/assets/images/finel-logo6.png" height="50px" width="50px" class="img-circle"></td>
                <td class="name sorting_1">asim g</td>
				<td class="roll_no">12345</td>
				<td class="email">asimjutt78@gmail.com</td>
				<td class="name">Five</td>
				<td class="name">No Section</td>
                
                              	 
                </tr><tr role="row" class="even">
				<td class="user_image text-center"><img src="http://www.mobilewebs.net/mojoomla/extend/wordpress/school/wp-content/uploads/school_assets/1476121496-pimg-in.JPG" height="50px" width="50px" class="img-circle"></td>
                <td class="name sorting_1">Avnish Suryavanshi</td>
				<td class="roll_no">0011</td>
				<td class="email">avnishtest@gmail.com</td>
				<td class="name">Five</td>
				<td class="name">No Section</td>
                
                              	 
               </tr>
               </tbody>
        
        </table><div class="dataTables_info" id="students_list_info" role="status" aria-live="polite">Showing 1 to 10 of 83 entries</div><div class="dataTables_paginate paging_simple_numbers" id="students_list_paginate"><a class="paginate_button previous disabled" aria-controls="students_list" data-dt-idx="0" tabindex="0" id="students_list_previous">Previous</a><span><a class="paginate_button current" aria-controls="students_list" data-dt-idx="1" tabindex="0">1</a><a class="paginate_button " aria-controls="students_list" data-dt-idx="2" tabindex="0">2</a><a class="paginate_button " aria-controls="students_list" data-dt-idx="3" tabindex="0">3</a><a class="paginate_button " aria-controls="students_list" data-dt-idx="4" tabindex="0">4</a><a class="paginate_button " aria-controls="students_list" data-dt-idx="5" tabindex="0">5</a><span class="ellipsis">…</span><a class="paginate_button " aria-controls="students_list" data-dt-idx="6" tabindex="0">9</a></span><a class="paginate_button next" aria-controls="students_list" data-dt-idx="7" tabindex="0" id="students_list_next">Next</a></div></div>
        </div>
       
	</div>
 <!-- =========================== Search Datatable Section END ========================== -->
        </div>
    </div>
    </div>
	</jsp:body>
</t:dashboard>
