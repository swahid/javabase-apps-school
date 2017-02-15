<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:dashboard>
	<jsp:attribute name="header">
	
	<!-- Page specific script -->
	<script>
	  $(function () {
	
	    /* initialize the calendar
	     -----------------------------------------------------------------*/
	    //Date for the calendar events (dummy data)
	    var date = new Date();
	    var d = date.getDate(),
	        m = date.getMonth(),
	        y = date.getFullYear();
	    $('#calendar').fullCalendar({
	      header: {
	        left: 'prev,next today',
	        center: 'title',
	        right: 'month,agendaWeek,agendaDay'
	      },
	      buttonText: {
	        today: 'today',
	        month: 'month',
	        week: 'week',
	        day: 'day'
	      }
	
	    });
	
	    
	  });
	</script>
	</jsp:attribute>
	
	<jsp:body>
	<sec:authorize access="hasRole('ADMIN') or hasRole('TEACHER') or hasRole('STUDENT')">
	<sec:authorize access="hasAuthority('read')">
	      <!-- Info boxes -->
      <div class="row">
        <div class="col-md-3 col-sm-6 col-xs-12">
          <div class="info-box student">
	          <div class="info-box-stats">
				<p class="counter">341</p>
				<span class="info-box-title">Student</span>
			  </div>
            <!-- /.info-box-content -->
          </div>
          <!-- /.info-box -->
        </div>
        <!-- /.col -->
        <div class="col-md-3 col-sm-6 col-xs-12">
          <div class="info-box teacher">
            <div class="info-box-stats">
				<p class="counter">20</p>
				<span class="info-box-title">Teacher</span>
			  </div>
            <!-- /.info-box-content -->
          </div>
          <!-- /.info-box -->
        </div>
        <!-- /.col -->

        <!-- fix for small devices only -->
        <div class="clearfix visible-sm-block"></div>

        <div class="col-md-3 col-sm-6 col-xs-12">
          <div class="info-box parent">
            <div class="info-box-stats">
				<p class="counter">50</p>
				<span class="info-box-title">Parent</span>
			  </div>
            <!-- /.info-box-content -->
          </div>
          <!-- /.info-box -->
        </div>
        <!-- /.col -->
        <div class="col-md-3 col-sm-6 col-xs-12">
          <div class="info-box attendence">
            <div class="info-box-stats">
				<p class="counter">200</p>
				<span class="info-box-title">Attendance</span>
			  </div>
            <!-- /.info-box-content -->
          </div>
          <!-- /.info-box -->
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->
      
	<!-- =======================Info boxes End =================================== -->
	
	<div class="row">
        <div class="col-md-8">
          <div class="box box-primary">
            <div class="box-body no-padding">
              <!-- THE CALENDAR -->
              <div id="calendar"></div>
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /. box -->
        </div>
        <!-- /.col -->
         <div class="col-md-4">
				<div class="panel panel-white">
					<div class="panel-heading">
						<h3 class="panel-title">Notice</h3>
						
					</div>
					<div class="panel-body">
										<div class="events">
					<div class="calendar-event"> 
					<p>
					Farewell party					</p>
					</div>
					</div>
										<div class="events">
					<div class="calendar-event"> 
					<p>
					Summer vacation					</p>
					</div>
					</div>
										</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="panel panel-white">
					<div class="panel-heading">
						<h3 class="panel-title">Holiday List</h3>
						
					</div>
					<div class="panel-body">
										<div class="events">
					<div class="calendar-event"> 
					<p>
					New Year Day					</p>
					</div>
					</div>
										<div class="events">
					<div class="calendar-event"> 
					<p>
					Good Friday					</p>
					</div>
					</div>
										<div class="events">
					<div class="calendar-event"> 
					<p>
					Summer Vacation					</p>
					</div>
					</div>
										</div>
				</div>
			</div>
        <!-- /.col -->
      </div>
      <!-- /.row -->
      </sec:authorize>
	</sec:authorize>
	</jsp:body>
</t:dashboard>
