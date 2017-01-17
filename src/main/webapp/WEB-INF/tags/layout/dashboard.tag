<%@tag description="iTrack Layout" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<%@attribute name="sidebar" fragment="true" %>
<%@attribute name="contentHeader" fragment="true" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>School Management System</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <%@ include file="/WEB-INF/tags/layout/includeHeader.jsp"%>
    <jsp:invoke fragment="header"/>
  </head>
  <!--
  BODY TAG OPTIONS:
  =================
  Apply one or more of the following classes to get the
  desired effect
  |---------------------------------------------------------|
  | SKINS         | skin-blue                               |
  |               | skin-black                              |
  |               | skin-purple                             |
  |               | skin-yellow                             |
  |               | skin-red                                |
  |               | skin-green                              |
  |---------------------------------------------------------|
  |LAYOUT OPTIONS | fixed                                   |
  |               | layout-boxed                            |
  |               | layout-top-nav                          |
  |               | sidebar-collapse                        |
  |               | sidebar-mini                            |
  |---------------------------------------------------------|
  -->
<body class="hold-transition skin-black sidebar-mini">
    <c:url var="index" value="/" />
    <div class="wrapper">

      <!-- Main Header -->
      <header class="main-header">

        <!-- Logo -->
        <a href="http://javabase.info" class="logo" target="_blank">
          <!-- mini logo for sidebar mini 50x50 pixels -->
          <span class="logo-mini"><b>Logo</b></span>
          <!-- logo for regular state and mobile devices -->
          <span class="logo-lg">School Managemant </span>
        </a>

        <!-- Header Navbar -->
        <nav class="navbar navbar-static-top" role="navigation">
        <!-- Sidebar toggle button-->
          <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
          </a>
          <!-- Navbar Right Menu -->
          <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
              
              <!-- User Account Menu -->
              <li class="dropdown user user-menu">
                <!-- Menu Toggle Button -->
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  <!-- The user image in the navbar-->
                  <img src='<c:url value="/resources/images/avatar.png"/>' class="user-image" alt="User Image">
                  <!-- hidden-xs hides the username on small devices so only the image appears. -->
                  <span class="hidden-xs">${user.username}</span>
                </a>
                <ul class="dropdown-menu">
                  <!-- The user image in the menu -->
                  <li class="user-header">
                    <img src="<c:url value="/resources/images/avatar.png"/>" class="img-circle" alt="User Image">
                    <p>
                      ${user.firstName} ${user.lastName} - ${user.role.rolename}
                      <small>Member since ${user.regdate}</small>
                    </p>
                  </li>
                  <!-- Menu Footer-->
                  <li class="user-footer">
                    <div class="pull-left">
                      <a href="profile" class="btn btn-default btn-flat">Profile</a>
                    </div>
                    <div class="pull-right">
                      <a href='<c:url value="/logout"></c:url>' class="btn btn-default btn-flat">Sign out</a>
                    </div>
                  </li>
                </ul>
              </li>
            </ul>
          </div>
        </nav>
      </header>
      <!-- Left side column. contains the logo and sidebar -->
      <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
          <!-- Sidebar user panel (optional) -->
          <div class="user-panel">
            
          </div>

          <!-- Sidebar Menu -->
          <ul class="sidebar-menu">
            <li ><a href="${index}"><i class="fa fa-home"></i> <span>Home</span></a></li>
            <li class="active"><a href="#"><i class="fa fa-link"></i> <span>Dashboard</span></a></li>
            <li class="treeview">
              <a href="#"><i class="fa fa-link"></i> <span>Student</span> <i class="fa fa-angle-left pull-right"></i></a>
              <ul class="treeview-menu">
                <li><a href='<c:url value="/student/add"/>'>Admit Student</a></li>
                <li><a href='<c:url value="/student"/>'>Student Information</a></li>
                <li><a href="#">Student Promotion</a></li>
              </ul>
            </li>
            <li class="active"><a href='<c:url value="/teacher"/>'><i class="fa fa-link"></i> <span>Teacher</span></a></li>
            <li class="active"><a href='<c:url value="/parents"/>'><i class="fa fa-link"></i> <span>Parents</span></a></li>
            <%-- <li class="active"><a href='<c:url value="/class"/>'><i class="fa fa-link"></i> <span>Class</span></a></li>
            <li class="active"><a href='<c:url value="/subject"/>'><i class="fa fa-link"></i> <span>Subject</span></a></li>
            <li class="active"><a href='<c:url value="/routine"/>'><i class="fa fa-link"></i> <span>Routine</span></a></li>
            <li class="active"><a href='<c:url value="/attendence"/>'><i class="fa fa-link"></i> <span>Attendance</span></a></li>
            <li class="active"><a href='<c:url value="/exam"/>'><i class="fa fa-link"></i> <span>Exam</span></a></li>
            <li class="active"><a href='<c:url value="/marks"/>'><i class="fa fa-link"></i> <span>Manage Marks</span></a></li>
            <li class="active"><a href='<c:url value="/holiday"/>'><i class="fa fa-link"></i> <span>Holiday</span></a></li>
            <li class="active"><a href='<c:url value="/library"/>'><i class="fa fa-link"></i> <span>Library</span></a></li>
            <li class="active"><a href='<c:url value="/notice"/>'><i class="fa fa-link"></i> <span>Notice Board</span></a></li>
            <li class="active"><a href='<c:url value="/message"/>'><i class="fa fa-link"></i> <span>Messaging</span></a></li>
            --%> 
             <li class="treeview">
              <a href="#"><i class="fa fa-link"></i> <span>Institution</span> <i class="fa fa-angle-left pull-right"></i></a>
              <ul class="treeview-menu">
                <li><a href='<c:url value="/institution"/>'>Add Institution</a></li>
                <li><a href='<c:url value="/building"/>'>Building </a></li>
                <li><a href='<c:url value="/roomUsed"/>'>Room Used </a></li>
                <li><a href='<c:url value="/room"/>'>Room </a></li>
                <li><a href='<c:url value="/insShift"/>'>Shift </a></li>
                <li><a href='<c:url value="/insClass"/>'>Class </a></li>
                <li><a href='<c:url value="/classSection"/>'>Class Section</a></li>
                <li><a href='<c:url value="/insSystemRole"/>'>Role Names</a></li>
                <li><a href='<c:url value="/empPost"/>'>Employee Post</a></li>
              </ul>
            </li>
            <li class="active"><a href='<c:url value="/transport"/>'><i class="fa fa-link"></i> <span>Transport</span></a></li>
            <li class="active"><a href='<c:url value="/account"/>'><i class="fa fa-link"></i> <span>Account</span></a></li>
            <li class="active"><a href='<c:url value="/settings"/>'><i class="fa fa-link"></i> <span>Settings</span></a></li>
            
          </ul><!-- /.sidebar-menu -->
        </section>
        <!-- /.sidebar -->
      </aside>

      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
       		<jsp:invoke fragment="contentHeader"/>
        </section>

        <!-- Main content -->
        <section class="content">

          <!-- Your Page Content Here -->
            <jsp:doBody/>
        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->

    </div><!-- ./wrapper -->

  </body>
</html>
