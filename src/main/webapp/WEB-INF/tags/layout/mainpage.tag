<%@tag description="iTrack Mainpage Layout" pageEncoding="UTF-8" language="java"%>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!--=============================================== 
    Template Design By WpFreeware Team.
    Author URI : http://www.wpfreeware.com/
    ====================================================-->

    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
     <title>School Management : Home</title>

    <!-- Mobile Specific Metas
    ================================================== -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Favicon -->
    <link rel="shortcut icon" type="image/icon" href="<c:url value='/resources/images/homepage/wpf-favicon.png'/>"/>

    <!-- CSS
    ================================================== -->       
    <!-- Bootstrap css file-->
    <link href="<c:url value='/resources/css/homepage/bootstrap.min.css'/>" rel="stylesheet">
    <!-- Font awesome css file-->
    <link href="<c:url value='/resources/css/homepage/font-awesome.min.css'/>" rel="stylesheet">
    <!-- Superslide css file-->
    <link href="<c:url value='/resources/css/homepage/superslides.css'/>" rel="stylesheet">
    <!-- Slick slider css file -->
    <link href="<c:url value='/resources/css/homepage/slick.css'/>" rel="stylesheet">
    <!-- Circle counter cdn css file -->
    <link rel='stylesheet prefetch' href='https://cdn.rawgit.com/pguso/jquery-plugin-circliful/master/css/jquery.circliful.css'>  
    <!-- smooth animate css file -->
    <link href="<c:url value='/resources/css/homepage/animate.css'/>" rel="stylesheet">
    <!-- preloader -->
    <link href="<c:url value='/resources/css/homepage/queryLoader.css'/>" rel="stylesheet">
    <!-- gallery slider css -->
    <link href="<c:url value='/resources/css/homepage/jquery.tosrus.all.css'/>" rel="stylesheet" type="text/css" media="all">
    <!-- Default Theme css file -->
    <link id="switcher" href="<c:url value='/resources/css/homepage/themes/default-theme.css'/>" rel="stylesheet">
    <!-- Main structure css file -->
    <link href="<c:url value='/resources/css/homepage/style.css'/>" rel="stylesheet">
   
    <!-- Google fonts -->
    <link href='http://fonts.googleapis.com/css?family=Merriweather' rel='stylesheet' type='text/css'>   
    <link href='http://fonts.googleapis.com/css?family=Varela' rel='stylesheet' type='text/css'>    

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
 	<jsp:invoke fragment="header"/>
  </head>
  <body>
	<sec:authorize var="loggedIn" access="isAuthenticated()" />
    <!-- SCROLL TOP BUTTON -->
    <a class="scrollToTop" href="#"></a>
    <!-- END SCROLL TOP BUTTON -->

    <!--=========== BEGIN HEADER SECTION ================-->
    <header id="header">
      <!-- BEGIN MENU -->
      <div class="menu_area">
        <nav class="navbar navbar-default navbar-fixed-top" role="navigation">  <div class="container">
            <div class="navbar-header">
              <!-- FOR MOBILE VIEW COLLAPSED BUTTON -->
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <!-- LOGO -->
              <!-- TEXT BASED LOGO -->
              <a class="navbar-brand" href="<c:url value='/home'/>">School <span>Sample</span></a>              
              <!-- IMG BASED LOGO  -->
               <!-- <a class="navbar-brand" href="index.html"><img src="img/logo.png" alt="logo"></a>  -->            
                     
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul id="top-menu" class="nav navbar-nav navbar-right main-nav">
                <li class="active"><a href="<c:url value='/home'/>">Home</a></li>
                <c:if test="${loggedIn}">
                <li><a href="<c:url value='/dashboard/'/>">Dashboard</a></li>
                </c:if>
                <li><a href="<c:url value='/course'/>">Course</a></li>
                <li><a href="<c:url value='/scholarship'/>">Scholarship</a></li>
                <li><a href="<c:url value='/events'/>">Events</a></li>
                <li><a href="<c:url value='/gallery'/>">Gallery</a></li>                
                <li><a href="<c:url value='/blog'/>">Blog</a></li>
<!--                 <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Page<span class="caret"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="404.html">404 Page</a></li>
                    <li><a href="#">Link Two</a></li>
                    <li><a href="#">Link Three</a></li>               
                  </ul>
                </li>        -->        
                <li><a href="<c:url value='/contact'/>">Contact</a></li>
                <c:choose>
				    <c:when test="${loggedIn}">
		                <li><a href="<c:url value='/logout'/>">Logout</a></li>
				    </c:when>
				    <c:otherwise>
		                <li><a href="<c:url value='/login'/>">Login</a></li>
				    </c:otherwise>
				</c:choose>
              </ul>           
            </div><!--/.nav-collapse -->
          </div>     
        </nav>  
      </div>
      <!-- END MENU -->    
    </header>
    <!--=========== END HEADER SECTION ================--> 

      <jsp:doBody></jsp:doBody>
    
    <!--=========== BEGIN FOOTER SECTION ================-->
    <footer id="footer">
      <!-- Start footer top area -->
      <div class="footer_top">
        <div class="container">
          <div class="row">
            <div class="col-ld-3  col-md-3 col-sm-3">
              <div class="single_footer_widget">
                <h3>About Us</h3>
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
              </div>
            </div>
            <div class="col-ld-3  col-md-3 col-sm-3">
              <div class="single_footer_widget">
                <h3>Community</h3>
                <ul class="footer_widget_nav">
                  <li><a href="#">Our Tutors</a></li>
                  <li><a href="#">Our Students</a></li>
                  <li><a href="#">Our Team</a></li>
                  <li><a href="#">Forum</a></li>
                  <li><a href="#">News &amp; Media</a></li>
                </ul>
              </div>
            </div>
            <div class="col-ld-3  col-md-3 col-sm-3">
              <div class="single_footer_widget">
                <h3>Others</h3>
                <ul class="footer_widget_nav">
                  <li><a href="#">Link 1</a></li>
                  <li><a href="#">Link 2</a></li>
                  <li><a href="#">Link 3</a></li>
                  <li><a href="#">Link 4</a></li>
                  <li><a href="#">Link 5</a></li>
                </ul>
              </div>
            </div>
            <div class="col-ld-3  col-md-3 col-sm-3">
              <div class="single_footer_widget">
                <h3>Social Links</h3>
                <ul class="footer_social">
                  <li><a data-toggle="tooltip" data-placement="top" title="Facebook" class="soc_tooltip" href="#"><i class="fa fa-facebook"></i></a></li>
                  <li><a data-toggle="tooltip" data-placement="top" title="Twitter" class="soc_tooltip"  href="#"><i class="fa fa-twitter"></i></a></li>
                  <li><a data-toggle="tooltip" data-placement="top" title="Google+" class="soc_tooltip"  href="#"><i class="fa fa-google-plus"></i></a></li>
                  <li><a data-toggle="tooltip" data-placement="top" title="Linkedin" class="soc_tooltip"  href="#"><i class="fa fa-linkedin"></i></a></li>
                  <li><a data-toggle="tooltip" data-placement="top" title="Youtube" class="soc_tooltip"  href="#"><i class="fa fa-youtube"></i></a></li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- End footer top area -->

      <!-- Start footer bottom area -->
      <div class="footer_bottom">
        <div class="container">
          <div class="row">
            <div class="col-lg-6 col-md-6 col-sm-6">
              <div class="footer_bootomLeft">
                <p> Copyright &copy; All Rights Reserved</p>
              </div>
            </div>
            <div class="col-lg-6 col-md-6 col-sm-6">
              <div class="footer_bootomRight">
                <p>Designed by <a href="http://wpfreeware.com/" rel="nofollow">Javabase.org</a></p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- End footer bottom area -->
    </footer>
    <!--=========== END FOOTER SECTION ================--> 

  

    <!-- Javascript Files
    ================================================== -->

    <!-- initialize jQuery Library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Preloader js file -->
    <script src="<c:url value='/resources/js/homepage/queryloader2.min.js'/>" type="text/javascript"></script>
    <!-- For smooth animatin  -->
    <script src="<c:url value='/resources/js/homepage/wow.min.js'/>" type="text/javascript"></script>
    <!-- Bootstrap js -->
    <script src="<c:url value='/resources/js/homepage/bootstrap.min.js'/>" type="text/javascript"></script>
    <!-- slick slider -->
    <script src="<c:url value='/resources/js/homepage/slick.min.js'/>" type="text/javascript"></script>
    <!-- superslides slider -->
    <script src="<c:url value='/resources/js/homepage/jquery.easing.1.3.js'/>" type="text/javascript"></script>
    <script src="<c:url value='/resources/js/homepage/jquery.animate-enhanced.min.js'/>" type="text/javascript"></script>
    <script src="<c:url value='/resources/js/homepage/jquery.superslides.min.js'/>" type="text/javascript" charset="utf-8"></script>
    <!-- for circle counter -->
    <script src='https://cdn.rawgit.com/pguso/jquery-plugin-circliful/master/js/jquery.circliful.min.js'></script>
    <!-- Gallery slider -->
    <script src="<c:url value='/resources/js/homepage/jquery.tosrus.min.all.js'/>" type="text/javascript" charset="utf-8"></script>
   
    <!-- Custom js-->
    <script src="<c:url value='/resources/js/homepage/custom.js'/>" type="text/javascript" charset="utf-8"></script>
    <!--=============================================== 
    Template Design By WpFreeware Team.
    Author URI : http://www.wpfreeware.com/
    ====================================================-->


  </body>
</html>