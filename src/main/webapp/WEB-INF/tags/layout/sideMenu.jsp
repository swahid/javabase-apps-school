<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>

<!-- =========================== Admin Role Menu Section START ========================= -->

<sec:authorize access="hasRole('ADMIN')">

<li class="header">MAIN NAVIGATION</li>
<li ><a href="${index}"><i class="fa fa-home"></i> <span>Home</span></a></li>
<li class="active"><a href="dashboard"><i class="fa fa-dashboard"></i> <span>Dashboard</span></a></li>
<li class="treeview">
  <a href="#"><i class="fa fa-link"></i> <span>Student</span> <i class="fa fa-angle-left pull-right"></i></a>
  <ul class="treeview-menu">
    <li><a href='<c:url value="/dashboard/student/add"/>'>Admit Student</a></li>
<li><a href='<c:url value="/dashboard/student"/>'>Student Information</a></li>
    <li><a href="#">Student Promotion</a></li>
  </ul>
</li>
<li class="active"><a href='<c:url value="/dashboard/teacher"/>'><i class="fa fa-link"></i> <span>Teacher</span></a></li>
<li class="active"><a href='<c:url value="/dashboard/parents"/>'><i class="fa fa-link"></i> <span>Parents</span></a></li>
<li class="treeview">
  <a href='<c:url value="/dashboard/class"/>'><i class="fa fa-link"></i> <span>Class</span> <i class="fa fa-angle-left pull-right"></i></a>
<ul class="treeview-menu">
  <li><a href='<c:url value="/dashboard/class/manage"/>'>Manage Class</a></li>
<li><a href='<c:url value="/dashboard/class/section"/>'>Manage Section</a></li>
<li><a href='<c:url value="/dashboard/class/syllabus"/>'>Manage Syllabus</a></li>
  </ul>
</li>
<li class="active"><a href='<c:url value="/dashboard/user"/>'><i class="fa fa-link"></i> <span>Manage User</span></a></li>
<%--             <li class="active"><a href='<c:url value="/dashboard/subject"/>'><i class="fa fa-link"></i> <span>Subject</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/routine"/>'><i class="fa fa-link"></i> <span>Routine</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/attendence"/>'><i class="fa fa-link"></i> <span>Attendance</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/exam"/>'><i class="fa fa-link"></i> <span>Exam</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/marks"/>'><i class="fa fa-link"></i> <span>Manage Marks</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/holiday"/>'><i class="fa fa-link"></i> <span>Holiday</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/library"/>'><i class="fa fa-link"></i> <span>Library</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/notice"/>'><i class="fa fa-link"></i> <span>Notice Board</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/message"/>'><i class="fa fa-link"></i> <span>Messaging</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/transport"/>'><i class="fa fa-link"></i> <span>Transport</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/account"/>'><i class="fa fa-link"></i> <span>Account</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/settings"/>'><i class="fa fa-link"></i> <span>Settings</span></a></li> --%>
<li class="treeview">
  <a href="#"><i class="fa fa-link"></i> <span>Setup</span> <i class="fa fa-angle-left pull-right"></i></a>
  <ul class="treeview-menu">
    <li><a href='<c:url value="/dashboard/institution"/>'>Add Institution</a></li>
<li><a href='<c:url value="/dashboard/building"/>'>Building </a></li>
<li><a href='<c:url value="/dashboard/roomUsed"/>'>Room Used </a></li>
<li><a href='<c:url value="/dashboard/room"/>'>Room </a></li>
<li><a href='<c:url value="/dashboard/shift"/>'>Shift </a></li>
<li><a href='<c:url value="/dashboard/insClass"/>'>Class </a></li>
<li><a href='<c:url value="/dashboard/classSection"/>'>Class Section</a></li>
<li><a href='<c:url value="/dashboard/acaSession"/>'>Academic Session</a></li>
<li><a href='<c:url value="/dashboard/insSystemRole"/>'>Role Names</a></li>
<li><a href='<c:url value="/dashboard/empPost"/>'>Employee Post</a></li>
  </ul>
</li>
</sec:authorize>
<!-- =========================== Admin Role Menu Section END =========================== -->


<!-- =========================== Student Role Menu Section START ========================= -->

<sec:authorize access="hasRole('STUDENT')">
<li class="header">MAIN NAVIGATION</li>
<li ><a href="${index}"><i class="fa fa-home"></i> <span>Home</span></a></li>
<li class="active"><a href="dashboard"><i class="fa fa-dashboard"></i> <span>Dashboard</span></a></li>
<li class="treeview">
  <a href="#"><i class="fa fa-link"></i> <span>Student</span> <i class="fa fa-angle-left pull-right"></i></a>
  <ul class="treeview-menu">
	<li><a href='<c:url value="/dashboard/student"/>'>Student Information</a></li>
  </ul>
</li>
<li class="active"><a href='<c:url value="/dashboard/teacher"/>'><i class="fa fa-link"></i> <span>Teacher</span></a></li>
<li class="active"><a href='<c:url value="/dashboard/parents"/>'><i class="fa fa-link"></i> <span>Parents</span></a></li>
<li class="treeview">
<a href='<c:url value="/dashboard/class"/>'><i class="fa fa-link"></i> <span>Class</span> <i class="fa fa-angle-left pull-right"></i></a>
<%-- <ul class="treeview-menu">
  <li><a href='<c:url value="/dashboard/class/manage"/>'>Manage Class</a></li>
<li><a href='<c:url value="/dashboard/class/section"/>'>Manage Section</a></li>
<li><a href='<c:url value="/dashboard/class/syllabus"/>'>Manage Syllabus</a></li>
  </ul> --%>
</li>
<%--             <li class="active"><a href='<c:url value="/dashboard/subject"/>'><i class="fa fa-link"></i> <span>Subject</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/routine"/>'><i class="fa fa-link"></i> <span>Routine</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/attendence"/>'><i class="fa fa-link"></i> <span>Attendance</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/exam"/>'><i class="fa fa-link"></i> <span>Exam</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/marks"/>'><i class="fa fa-link"></i> <span>Manage Marks</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/holiday"/>'><i class="fa fa-link"></i> <span>Holiday</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/library"/>'><i class="fa fa-link"></i> <span>Library</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/notice"/>'><i class="fa fa-link"></i> <span>Notice Board</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/message"/>'><i class="fa fa-link"></i> <span>Messaging</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/transport"/>'><i class="fa fa-link"></i> <span>Transport</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/account"/>'><i class="fa fa-link"></i> <span>Account</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/settings"/>'><i class="fa fa-link"></i> <span>Settings</span></a></li> --%>
</sec:authorize>
<!-- =========================== Student Role Menu Section END =========================== -->



<!-- =========================== Teacher Role Menu Section START ========================= -->


<sec:authorize access="hasRole('TEACHER')">

<li class="header">MAIN NAVIGATION</li>
<li ><a href="${index}"><i class="fa fa-home"></i> <span>Home</span></a></li>
<li class="active"><a href="dashboard"><i class="fa fa-dashboard"></i> <span>Dashboard</span></a></li>
<li class="treeview">
  <a href="#"><i class="fa fa-link"></i> <span>Student</span> <i class="fa fa-angle-left pull-right"></i></a>
  <ul class="treeview-menu">
    <li><a href='<c:url value="/dashboard/student/add"/>'>Admit Student</a></li>
<li><a href='<c:url value="/dashboard/student"/>'>Student Information</a></li>
    <li><a href="#">Student Promotion</a></li>
  </ul>
</li>
<li class="active"><a href='<c:url value="/dashboard/teacher"/>'><i class="fa fa-link"></i> <span>Teacher</span></a></li>
<li class="active"><a href='<c:url value="/dashboard/parents"/>'><i class="fa fa-link"></i> <span>Parents</span></a></li>
<li class="treeview">
  <a href='<c:url value="/dashboard/class"/>'><i class="fa fa-link"></i> <span>Class</span> <i class="fa fa-angle-left pull-right"></i></a>
<ul class="treeview-menu">
  <li><a href='<c:url value="/dashboard/class/manage"/>'>Manage Class</a></li>
<li><a href='<c:url value="/dashboard/class/section"/>'>Manage Section</a></li>
<li><a href='<c:url value="/dashboard/class/syllabus"/>'>Manage Syllabus</a></li>
  </ul>
</li>
<li class="active"><a href='<c:url value="/dashboard/user"/>'><i class="fa fa-link"></i> <span>Manage User</span></a></li>
<%--             <li class="active"><a href='<c:url value="/dashboard/subject"/>'><i class="fa fa-link"></i> <span>Subject</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/routine"/>'><i class="fa fa-link"></i> <span>Routine</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/attendence"/>'><i class="fa fa-link"></i> <span>Attendance</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/exam"/>'><i class="fa fa-link"></i> <span>Exam</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/marks"/>'><i class="fa fa-link"></i> <span>Manage Marks</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/holiday"/>'><i class="fa fa-link"></i> <span>Holiday</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/library"/>'><i class="fa fa-link"></i> <span>Library</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/notice"/>'><i class="fa fa-link"></i> <span>Notice Board</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/message"/>'><i class="fa fa-link"></i> <span>Messaging</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/transport"/>'><i class="fa fa-link"></i> <span>Transport</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/account"/>'><i class="fa fa-link"></i> <span>Account</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/settings"/>'><i class="fa fa-link"></i> <span>Settings</span></a></li> --%>
<li class="treeview">
  <a href="#"><i class="fa fa-link"></i> <span>Setup</span> <i class="fa fa-angle-left pull-right"></i></a>
  <ul class="treeview-menu">
    <li><a href='<c:url value="/dashboard/institution"/>'>Add Institution</a></li>
<li><a href='<c:url value="/dashboard/building"/>'>Building </a></li>
<li><a href='<c:url value="/dashboard/roomUsed"/>'>Room Used </a></li>
<li><a href='<c:url value="/dashboard/room"/>'>Room </a></li>
<li><a href='<c:url value="/dashboard/insShift"/>'>Shift </a></li>
<li><a href='<c:url value="/dashboard/insClass"/>'>Class </a></li>
<li><a href='<c:url value="/dashboard/classSection"/>'>Class Section</a></li>
<li><a href='<c:url value="/dashboard/acaSession"/>'>Academic Session</a></li>
<li><a href='<c:url value="/dashboard/insSystemRole"/>'>Role Names</a></li>
<li><a href='<c:url value="/dashboard/empPost"/>'>Employee Post</a></li>
  </ul>
</li>

</sec:authorize>
<!-- =========================== Teacher Role Menu Section END =========================== -->



<!-- =========================== Staff Role Menu Section START ========================= -->

<sec:authorize access="hasRole('STAFF')">
<li class="header">MAIN NAVIGATION</li>
<li ><a href="${index}"><i class="fa fa-home"></i> <span>Home</span></a></li>
<li class="active"><a href="dashboard"><i class="fa fa-dashboard"></i> <span>Dashboard</span></a></li>
<li class="treeview">
  <a href="#"><i class="fa fa-link"></i> <span>Student</span> <i class="fa fa-angle-left pull-right"></i></a>
  <ul class="treeview-menu">
    <li><a href='<c:url value="/dashboard/student/add"/>'>Admit Student</a></li>
<li><a href='<c:url value="/dashboard/student"/>'>Student Information</a></li>
    <li><a href="#">Student Promotion</a></li>
  </ul>
</li>
<li class="active"><a href='<c:url value="/dashboard/teacher"/>'><i class="fa fa-link"></i> <span>Teacher</span></a></li>
<li class="active"><a href='<c:url value="/dashboard/parents"/>'><i class="fa fa-link"></i> <span>Parents</span></a></li>
<li class="treeview">
  <a href='<c:url value="/dashboard/class"/>'><i class="fa fa-link"></i> <span>Class</span> <i class="fa fa-angle-left pull-right"></i></a>
<ul class="treeview-menu">
  <li><a href='<c:url value="/dashboard/class/manage"/>'>Manage Class</a></li>
<li><a href='<c:url value="/dashboard/class/section"/>'>Manage Section</a></li>
<li><a href='<c:url value="/dashboard/class/syllabus"/>'>Manage Syllabus</a></li>
  </ul>
</li>
<li class="active"><a href='<c:url value="/dashboard/user"/>'><i class="fa fa-link"></i> <span>Manage User</span></a></li>
<%--             <li class="active"><a href='<c:url value="/dashboard/subject"/>'><i class="fa fa-link"></i> <span>Subject</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/routine"/>'><i class="fa fa-link"></i> <span>Routine</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/attendence"/>'><i class="fa fa-link"></i> <span>Attendance</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/exam"/>'><i class="fa fa-link"></i> <span>Exam</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/marks"/>'><i class="fa fa-link"></i> <span>Manage Marks</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/holiday"/>'><i class="fa fa-link"></i> <span>Holiday</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/library"/>'><i class="fa fa-link"></i> <span>Library</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/notice"/>'><i class="fa fa-link"></i> <span>Notice Board</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/message"/>'><i class="fa fa-link"></i> <span>Messaging</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/transport"/>'><i class="fa fa-link"></i> <span>Transport</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/account"/>'><i class="fa fa-link"></i> <span>Account</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/settings"/>'><i class="fa fa-link"></i> <span>Settings</span></a></li> --%>
<li class="treeview">
  <a href="#"><i class="fa fa-link"></i> <span>Setup</span> <i class="fa fa-angle-left pull-right"></i></a>
  <ul class="treeview-menu">
    <li><a href='<c:url value="/dashboard/institution"/>'>Add Institution</a></li>
<li><a href='<c:url value="/dashboard/building"/>'>Building </a></li>
<li><a href='<c:url value="/dashboard/roomUsed"/>'>Room Used </a></li>
<li><a href='<c:url value="/dashboard/room"/>'>Room </a></li>
<li><a href='<c:url value="/dashboard/insShift"/>'>Shift </a></li>
<li><a href='<c:url value="/dashboard/insClass"/>'>Class </a></li>
<li><a href='<c:url value="/dashboard/classSection"/>'>Class Section</a></li>
<li><a href='<c:url value="/dashboard/acaSession"/>'>Academic Session</a></li>
<li><a href='<c:url value="/dashboard/insSystemRole"/>'>Role Names</a></li>
<li><a href='<c:url value="/dashboard/empPost"/>'>Employee Post</a></li>
  </ul>
</li>

</sec:authorize>
<!-- =========================== Staff Role Menu Section END =========================== -->


<!-- =========================== DEVELOPER Role Menu Section START ========================= -->

<sec:authorize access="hasRole('DEVELOPER')">
<li class="header">MAIN NAVIGATION</li>
<li ><a href="${index}"><i class="fa fa-home"></i> <span>Home</span></a></li>
<li class="active"><a href="dashboard"><i class="fa fa-dashboard"></i> <span>Dashboard</span></a></li>
<li class="treeview">
  <a href="#"><i class="fa fa-link"></i> <span>Student</span> <i class="fa fa-angle-left pull-right"></i></a>
  <ul class="treeview-menu">
    <li><a href='<c:url value="/dashboard/student/add"/>'>Admit Student</a></li>
<li><a href='<c:url value="/dashboard/student"/>'>Student Information</a></li>
    <li><a href="#">Student Promotion</a></li>
  </ul>
</li>
<li class="active"><a href='<c:url value="/dashboard/teacher"/>'><i class="fa fa-link"></i> <span>Teacher</span></a></li>
<li class="active"><a href='<c:url value="/dashboard/parents"/>'><i class="fa fa-link"></i> <span>Parents</span></a></li>
<li class="treeview">
  <a href='<c:url value="/dashboard/class"/>'><i class="fa fa-link"></i> <span>Class</span> <i class="fa fa-angle-left pull-right"></i></a>
<ul class="treeview-menu">
  <li><a href='<c:url value="/dashboard/class/manage"/>'>Manage Class</a></li>
<li><a href='<c:url value="/dashboard/class/section"/>'>Manage Section</a></li>
<li><a href='<c:url value="/dashboard/class/syllabus"/>'>Manage Syllabus</a></li>
  </ul>
</li>
<li class="active"><a href='<c:url value="/dashboard/user"/>'><i class="fa fa-link"></i> <span>Manage User</span></a></li>
<%--             <li class="active"><a href='<c:url value="/dashboard/subject"/>'><i class="fa fa-link"></i> <span>Subject</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/routine"/>'><i class="fa fa-link"></i> <span>Routine</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/attendence"/>'><i class="fa fa-link"></i> <span>Attendance</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/exam"/>'><i class="fa fa-link"></i> <span>Exam</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/marks"/>'><i class="fa fa-link"></i> <span>Manage Marks</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/holiday"/>'><i class="fa fa-link"></i> <span>Holiday</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/library"/>'><i class="fa fa-link"></i> <span>Library</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/notice"/>'><i class="fa fa-link"></i> <span>Notice Board</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/message"/>'><i class="fa fa-link"></i> <span>Messaging</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/transport"/>'><i class="fa fa-link"></i> <span>Transport</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/account"/>'><i class="fa fa-link"></i> <span>Account</span></a></li>
            <li class="active"><a href='<c:url value="/dashboard/settings"/>'><i class="fa fa-link"></i> <span>Settings</span></a></li> --%>
<li class="treeview">
  <a href="#"><i class="fa fa-link"></i> <span>Setup</span> <i class="fa fa-angle-left pull-right"></i></a>
  <ul class="treeview-menu">
    <li><a href='<c:url value="/dashboard/institution"/>'>Add Institution</a></li>
<li><a href='<c:url value="/dashboard/building"/>'>Building </a></li>
<li><a href='<c:url value="/dashboard/roomUsed"/>'>Room Used </a></li>
<li><a href='<c:url value="/dashboard/room"/>'>Room </a></li>
<li><a href='<c:url value="/dashboard/insShift"/>'>Shift </a></li>
<li><a href='<c:url value="/dashboard/insClass"/>'>Class </a></li>
<li><a href='<c:url value="/dashboard/classSection"/>'>Class Section</a></li>
<li><a href='<c:url value="/dashboard/acaSession"/>'>Academic Session</a></li>
<li><a href='<c:url value="/dashboard/insSystemRole"/>'>Role Names</a></li>
<li><a href='<c:url value="/dashboard/empPost"/>'>Employee Post</a></li>
  </ul>
</li>
</sec:authorize>
<!-- =========================== DEVELOPER Role Menu Section END =========================== -->


