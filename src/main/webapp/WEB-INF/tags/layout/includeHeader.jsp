<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- ***********************************
------REQUIRED DEPENDENCY START -------

**************************************** -->
	
	<!-- JQUERY 2.1.4 -->
    <script src='<c:url value="/resources/jquery/2.1.4/jquery.min.js"/>'></script>
    
	<!-- Bootstrap 3.3.5 -->
    <link rel="stylesheet" href='<c:url value="/resources/css/bootstrap.min.css"/>'>
    <script src='<c:url value="/resources/js/bootstrap.min.js"/>'></script>
    
    
    <!-- JQUERY-UI SCRIPT 1.12.1-->
    <link href='<c:url value="/resources/plugins/jquery-ui/jquery-ui.min.css"/>' rel="stylesheet" type="text/css" />
    <link href=<c:url value="/resources/plugins/jquery-ui/jquery-ui.structure.min.css"/> rel="stylesheet" type="text/css" />
    <link href=<c:url value="/resources/plugins/jquery-ui/jquery-ui.theme.min.css"/> rel="stylesheet" type="text/css" />
    <script src=<c:url value="/resources/plugins/jquery-ui/jquery-ui.min.js"/> type="text/javascript"></script>
    
    
    <!-- Font Awesome -->
    <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css'>
    <!-- Ionicons -->
    <link rel='stylesheet' href='https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css'>
    
    
    <!-- =================================
    --- ADMINLTE THEME DEPENDENCY START---
    =====================================-->
    <!-- Admin LTE Skin -->
    <link rel='stylesheet' href='<c:url value="/resources/css/skins/skin-black.min.css"/>'>
    <!-- Theme style -->
    <link rel='stylesheet' href='<c:url value="/resources/css/AdminLTE.min.css"/>'>
    <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
          page. However, you can choose any other skin. Make sure you
          apply the skin class to the body tag so the changes take effect.
     -->
    <!-- Admin LTE APP JS -->
   	<script src='<c:url value="/resources/js/app.js"/>'></script>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src='https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js'></script>
        <script src='https://oss.maxcdn.com/respond/1.4.2/respond.min.js'></script>
    <![endif]-->
    
    <!-- ==========================ADMINLTE THEME DEPENDENCY END===============================-->
    
    <!-- =================================== 
    --- EXTERNAL PLUGIN DEPENDENCY START ---
    ======================================== -->
    
    <!-- BOOTSTRAP-SLIDER -->
    <link href='<c:url value="/resources/plugins/bootstrap-slider/slider.css"/>' rel='stylesheet'>
    <script src=<c:url value="/resources/plugins/bootstrap-slider/bootstrap-slider.js"/> type="text/javascript"></script>
    
    <!-- COLORPICKER -->
    <link href='<c:url value="/resources/plugins/colorpicker/bootstrap-colorpicker.min.css"/>' rel='stylesheet'>
    <script src=<c:url value="/resources/plugins/colorpicker/bootstrap-colorpicker.min.js"/> type="text/javascript"></script>
    
    <!-- MOMENT-->
    <script src=<c:url value="/resources/plugins/moment/moment.min.js"/> type="text/javascript"></script>
	<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script> -->
	
    <!-- DATA TABLES -->
    <link rel='stylesheet' href='<c:url value="/resources/css/datatables/dataTables.css"/>'>
    <link rel="stylesheet" href='<c:url value="/resources/css/datatables/dataTables.bootstrap.css"/>' />
    <link rel='stylesheet' href='<c:url value="/resources/css/datatables/dataTables.editor.min.css"/>'>
    <link rel='stylesheet' href='<c:url value="/resources/css/datatables/dataTables.responsive.css"/>'>
    <link rel='stylesheet' href='<c:url value="/resources/css/datatables/dataTables.tableTools.css"/>'>
    <script src=<c:url value="/resources/plugins/datatables/jquery.dataTables.min.js"/> type="text/javascript"></script>
    
    <!-- DATEPICKER -->
    <link rel='stylesheet' href='<c:url value="/resources/plugins/datepicker/datepicker3.css"/>'>
    <script src=<c:url value="/resources/plugins/datepicker/bootstrap-datepicker.js"/> type="text/javascript"></script>
    
    
    <!-- DATERANGE PICKER -->
    <link  href='<c:url value="/resources/plugins/daterangepicker/daterangepicker.css"/>' rel='stylesheet'>
    <script src='<c:url value="/resources/plugins/daterangepicker/daterangepicker.js"/>' type="text/javascript"></script>
    
    
    <!-- FASTCLICK -->
    <script src='<c:url value="/resources/plugins/fastclick/fastclick.min.js"/>' type="text/javascript"></script>
    
    
    <!-- fullCalendar 2.2.5-->
  	<link rel="stylesheet" href='<c:url value="/resources/plugins/fullcalendar/fullcalendar.min.css"/>'>
 	<link rel="stylesheet" href='<c:url value="/resources/plugins/fullcalendar/fullcalendar.print.css"/>' media="print">
    <script src=<c:url value="/resources/plugins/fullcalendar/fullcalendar.min.js"/> type="text/javascript"></script>
	
    <!-- Notification SCRIPT -->
    <script src=<c:url value="/resources/plugins/notification/notify.min.js"/> type="text/javascript"></script>
   
   
    <!-- Imageupload -->
	<link rel="stylesheet" href='<c:url value="/resources/plugins/imageupload/css/bootstrap-imageupload.min.css"/>'>
    <script src=<c:url value="/resources/plugins/imageupload/js/bootstrap-imageupload.min.js"/> type="text/javascript"></script>
    
    <!-- SELECT2 -->
	<link rel="stylesheet" href='<c:url value="/resources/plugins/select2/select2.min.css"/>'>
    <script src=<c:url value="/resources/plugins/select2/select2.full.min.js"/> type="text/javascript"></script>
   
   	<!-- SLIMSCROLL -->
   	<script src='<c:url value="/resources/plugins/slimScroll/jquery.slimscroll.min.js"/>' type="text/javascript"></script>
   
   
   	<!-- timepicker -->
    <link rel="stylesheet" href='<c:url value="/resources/plugins/timepicker/bootstrap-timepicker.min.css"/>'>
    <script src=<c:url value="/resources/plugins/timepicker/bootstrap-timepicker.min.js"/> type="text/javascript"></script>
    
    
   	<!-- VALIDATE -->
    <link rel="stylesheet" href='<c:url value="/resources/plugins/validation/css/validationEngine.jquery.css"/>'>
   	<script src=<c:url value="/resources/plugins/validation/js/jquery.validationEngine.js"/> type="text/javascript"></script>
   	<script src=<c:url value="/resources/plugins/validation/js/jquery.validationEngine-en.js"/> type="text/javascript"></script>
    
    <!-- ========================== EXTERNAL PLUGIN DEPENDENCY END ===============================-->
    
    <!-- ========================================
    ---- SCHOOL MANEGEMENT CUSTOM DEPENDENCY ----
    =============================================-->
    
    <!-- ===================== CUSTOM CSS ======================-->
    <!-- POPUP CSS -->
    <link rel='stylesheet' href='<c:url value="/resources/css/popup.css"/>'>
    <!-- School Style CSS -->
    <link rel="stylesheet" href='<c:url value="/resources/css/jschool.css"/>'>
    
    
    <!-- ==============
    ---- CUSTOM JS ----
    =================== -->
    <!-- comboialized custom js script -->
    <script src="<c:url value='/resources/js/jschool/jbf/ajax.js' />" type="text/javascript"></script>
    <script src="<c:url value='/resources/js/jschool/jbf/date.js' />" type="text/javascript"></script>
    <script src="<c:url value='/resources/js/jschool/jbf/form.js' />" type="text/javascript"></script>
    <script src="<c:url value='/resources/js/jschool/jbf/combo.js' />" type="text/javascript"></script>
    <script src="<c:url value='/resources/js/jschool/jbf/initialized.js' />" type="text/javascript"></script>
    
    
    
    
    <!-- ==========================SCHOOL MANEGEMENT CUSTOM DEPENDENCY END===============================-->
    
