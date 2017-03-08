<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>

<!-- =========================== Admin Role Menu Section START ========================= -->

<sec:authorize access="hasRole('ADMIN')">

<li class="header">MAIN NAVIGATION</li>
<li><a href='<c:url value="/home"/>'><i class="fa fa-home"></i> <span>Home</span></a></li>
<li class="active"><a href='<c:url value="/dashboard"/>'><i class="fa fa-dashboard"></i> <span>Dashboard</span></a></li>
<li class="treeview">
	<a href="#"><i class="fa fa-link"></i> <span>Student</span> <i class="fa fa-angle-left pull-right"></i></a>
	<ul class="treeview-menu">
	  <li><a href='<c:url value="/dashboard/student/add"/>'>Admit Student</a></li>
	  <li><a href='<c:url value="/dashboard/student"/>'>Student Information</a></li>
	  <li><a href="#">Student Promotion</a></li>
	</ul>
</li>
<li><a href='<c:url value="/dashboard/teacher"/>'><i class="fa fa-link"></i> <span>Teacher</span></a></li>
<li><a href='<c:url value="/dashboard/parents"/>'><i class="fa fa-link"></i> <span>Parents</span></a></li>
<li class="treeview">
    <a href="#"><i class="fa fa-link"></i> <span>Class</span> <i class="fa fa-angle-left pull-right"></i></a>
    <ul class="treeview-menu">
	    <li><a href='<c:url value="/dashboard/class/manage"/>'>Manage Class</a></li>
		<li><a href='<c:url value="/dashboard/class/section"/>'>Manage Section</a></li>
		<li><a href='<c:url value="/dashboard/class/syllabus"/>'>Manage Syllabus</a></li>
	</ul>
</li>
<li class="treeview">
    <a href="#"><i class="fa fa-user"></i> <span>Manage User</span> <i class="fa fa-angle-left pull-right"></i></a>
	<ul class="treeview-menu">
	    <li><a href='<c:url value="/dashboard/role"/>'><i class="fa fa-link"></i> <span>User Role</span></a></li>
	    <li><a href='<c:url value="/dashboard/user"/>'><i class="fa fa-people"></i> <span>Add User</span></a></li>
	    <li><a href='<c:url value="/dashboard/permission"/>'><i class="fa fa-link"></i> <span>Permission</span></a></li>
	</ul>
</li>
<li class="treeview">
	<a href="#"><i class="fa fa-gear"></i> <span>Setup</span> <i class="fa fa-angle-left pull-right"></i></a>
	<ul class="treeview-menu">
		<li><a href='<c:url value="/dashboard/institution"/>'>Add Institution</a></li>
		<li><a href='<c:url value="/dashboard/building"/>'>Building </a></li>
		<li><a href='<c:url value="/dashboard/roomUsed"/>'>Room Used </a></li>
		<li><a href='<c:url value="/dashboard/room"/>'>Room </a></li>
		<li><a href='<c:url value="/dashboard/shift"/>'>Shift </a></li>
		<li><a href='<c:url value="/dashboard/insClass"/>'>Class </a></li>
		<li><a href='<c:url value="/dashboard/subject"/>'>Subject </a></li>
		<li><a href='<c:url value="/dashboard/classOnShift"/>'>Class On Shift </a></li>
		<li><a href='<c:url value="/dashboard/section"/>'>Class Section</a></li>
		<li><a href='<c:url value="/dashboard/session"/>'>Academic Session</a></li>
		<li><a href='<c:url value="/dashboard/empPost"/>'>Employee Post</a></li>
		<li><a href='<c:url value="/dashboard/teachersPost"/>'>Teachers Post</a></li>
	</ul>
</li>
</sec:authorize>
<!-- =========================== Admin Role Menu Section END =========================== -->


<!-- =========================== Student Role Menu Section START ========================= -->

<sec:authorize access="hasRole('STUDENT')">

</sec:authorize>
<!-- =========================== Student Role Menu Section END =========================== -->



<!-- =========================== Teacher Role Menu Section START ========================= -->


<sec:authorize access="hasRole('TEACHER')">

</sec:authorize>
<!-- =========================== Teacher Role Menu Section END =========================== -->



<!-- =========================== Staff Role Menu Section START ========================= -->

<sec:authorize access="hasRole('STAFF')">


</sec:authorize>
<!-- =========================== Staff Role Menu Section END =========================== -->


<!-- =========================== DEVELOPER Role Menu Section START ========================= -->

<sec:authorize access="hasRole('DEVELOPER')">

</sec:authorize>
<!-- =========================== DEVELOPER Role Menu Section END =========================== -->


