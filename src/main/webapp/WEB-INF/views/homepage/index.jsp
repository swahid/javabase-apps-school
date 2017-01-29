<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
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
     <title>WpF Degree : Home</title>

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
                <li><a href="<c:url value='/dashboard'/>">Dashboard</a></li>
                </c:if>
                <li><a href="<c:url value='/home/course'/>">Course</a></li>
                <li><a href="<c:url value='/home/scholarship'/>">Scholarship</a></li>
                <li><a href="<c:url value='/home/events'/>">Events</a></li>
                <li><a href="<c:url value='/home/gallery'/>">Gallery</a></li>                
                <li><a href="<c:url value='/home/blog'/>">Blog</a></li>
<!--                 <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Page<span class="caret"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="404.html">404 Page</a></li>
                    <li><a href="#">Link Two</a></li>
                    <li><a href="#">Link Three</a></li>               
                  </ul>
                </li>        -->        
                <li><a href="<c:url value='/home/contact'/>">Contact</a></li>
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

    <!--=========== BEGIN SLIDER SECTION ================-->
    <section id="slider">
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="slider_area">
            <!-- Start super slider -->
            <div id="slides">
              <ul class="slides-container">                          
                <li>
                  <img src="<c:url value='/resources/images/homepage/slider/2.jpg'/>" alt="img2">
                   <div class="slider_caption">
                    <h2>Largest & Beautiful University</h2>
                    <p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.</p>
                    <a class="slider_btn" href="#">Know More</a>
                  </div>
                  </li>
                <!-- Start single slider-->
                <li>
                  <img src="<c:url value='/resources/images/homepage/slider/3.jpg'/>" alt="img3">
                   <div class="slider_caption slider_right_caption">
                    <h2>Better Education Environment</h2>
                    <p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters.Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search</p>
                    <a class="slider_btn" href="#">Know More</a>
                  </div>
                </li>
                <!-- Start single slider-->
                <li>
                  <img src="<c:url value='/resources/images/homepage/slider/4.jpg'/>" alt="img4">
                   <div class="slider_caption">
                    <h2>Find out you in better way</h2>
                    <p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters.Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search</p>
                    <a class="slider_btn" href="#">Know More</a>
                  </div>
                </li>
              </ul>
              <nav class="slides-navigation">
                <a href="#" class="next"></a>
                <a href="#" class="prev"></a>
              </nav>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!--=========== END SLIDER SECTION ================-->

    <!--=========== BEGIN ABOUT US SECTION ================-->
    <section id="aboutUs">
      <div class="container">
        <div class="row">
        <!-- Start about us area -->
        <div class="col-lg-6 col-md-6 col-sm-6">
          <div class="aboutus_area wow fadeInLeft">
            <h2 class="titile">About Us</h2>
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
          </div>
        </div>
        <div class="col-lg-6 col-md-6 col-sm-6">
          <div class="newsfeed_area wow fadeInRight">
            <ul class="nav nav-tabs feed_tabs" id="myTab2">
              <li class="active"><a href="#news" data-toggle="tab">News</a></li>
              <li><a href="#notice" data-toggle="tab">Notice</a></li>
              <li><a href="#events" data-toggle="tab">Events</a></li>         
            </ul>

            <!-- Tab panes -->
            <div class="tab-content">
              <!-- Start news tab content -->
              <div class="tab-pane fade in active" id="news">                
                <ul class="news_tab">
                  <li>
                    <div class="media">
                      <div class="media-left">
                        <a class="news_img" href="#">
                          <img class="media-object" src="<c:url value='/resources/images/homepage/news.jpg'/>" alt="newsImage">
                        </a>
                      </div>
                      <div class="media-body">
                       <a href="#">Dummy text of the printing and typesetting industry</a>
                       <span class="feed_date">27.02.15</span>
                      </div>
                    </div>                    
                  </li>
                  <li>
                    <div class="media">
                      <div class="media-left">
                        <a class="news_img" href="#">
                          <img class="media-object" src="<c:url value='/resources/images/homepage/news.jpg'/>" alt="newsImage">
                        </a>
                      </div>
                      <div class="media-body">
                       <a href="#">Dummy text of the printing and typesetting industry</a>
                       <span class="feed_date">28.02.15</span>
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="media">
                      <div class="media-left">
                        <a class="news_img" href="#">
                          <img class="media-object" src="<c:url value='/resources/images/homepage/news.jpg'/>" alt="newsImage">
                        </a>
                      </div>
                      <div class="media-body">
                       <a href="#">Dummy text of the printing and typesetting industry</a>
                       <span class="feed_date">28.02.15</span>
                      </div>
                    </div>
                  </li>
                </ul>                
                <a class="see_all" href="#">See All</a>
              </div>
              <!-- Start notice tab content -->  
              <div class="tab-pane fade " id="notice">
                <div class="single_notice_pane">
                  <ul class="news_tab">
                    <li>
                      <div class="media">
                        <div class="media-left">
                          <a class="news_img" href="#">
                            <img class="media-object" src="<c:url value='/resources/images/homepage/news.jpg'/>" alt="newsImage">
                          </a>
                        </div>
                        <div class="media-body">
                         <a href="#">Dummy text of the printing and typesetting industry</a>
                         <span class="feed_date">27.02.15</span>
                        </div>
                      </div>                   
                    </li>
                    <li>
                      <div class="media">
                        <div class="media-left">
                          <a class="news_img" href="#">
                            <img class="media-object" src="<c:url value='/resources/images/homepage/news.jpg'/>" alt="newsImage">
                          </a>
                        </div>
                        <div class="media-body">
                         <a href="#">Dummy text of the printing and typesetting industry</a>
                         <span class="feed_date">28.02.15</span>             
                        </div>
                      </div>
                    </li>
                    <li>
                      <div class="media">
                        <div class="media-left">
                          <a class="news_img" href="#">
                            <img class="media-object" src="<c:url value='/resources/images/homepage/news.jpg'/>" alt="newsImage">
                          </a>
                        </div>
                        <div class="media-body">
                         <a href="#">Dummy text of the printing and typesetting industry</a>
                         <span class="feed_date">28.02.15</span>             
                        </div>
                      </div>
                    </li>                                    
                  </ul>
                  <ul class="news_tab">
                    <li>
                      <div class="media">
                        <div class="media-left">
                          <a class="news_img" href="#">
                            <img class="media-object" src="<c:url value='/resources/images/homepage/news.jpg'/>" alt="newsImage">
                          </a>
                        </div>
                        <div class="media-body">
                         <a href="#">Contrary to popular belief, Lorem Ipsum is not simply random text</a>
                         <span class="feed_date">27.02.15</span>
                        </div>
                      </div>
                    </li>
                    <li>
                      <div class="media">
                        <div class="media-left">
                          <a class="news_img" href="#">
                            <img class="media-object" src="<c:url value='/resources/images/homepage/news.jpg'/>" alt="newsImage">
                          </a>
                        </div>
                        <div class="media-body">
                         <a href="#">Dummy text of the printing and typesetting industry</a>
                         <span class="feed_date">28.02.15</span>          
                        </div>
                      </div>
                    </li>
                    <li>
                      <div class="media">
                        <div class="media-left">
                          <a class="news_img" href="#">
                            <img class="media-object" src="<c:url value='/resources/images/homepage/news.jpg'/>" alt="newsImage">
                          </a>
                        </div>
                        <div class="media-body">
                         <a href="#">Contrary to popular belief, Lorem Ipsum is not simply random text</a>
                         <span class="feed_date">28.02.15</span>
                        </div>
                      </div>
                    </li>                                    
                  </ul>
                </div>               
              </div>
              <!-- Start events tab content -->
              <div class="tab-pane fade " id="events">
                <ul class="news_tab">
                  <li>
                    <div class="media">
                      <div class="media-left">
                        <a class="news_img" href="#">
                          <img class="media-object" src="<c:url value='/resources/images/homepage/news.jpg'/>" alt="newsImage">
                        </a>
                      </div>
                      <div class="media-body">
                       <a href="#">Dummy text of the printing and typesetting industry</a>
                       <span class="feed_date">27.02.15</span>
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="media">
                      <div class="media-left">
                        <a class="news_img" href="#">
                          <img class="media-object" src="<c:url value='/resources/images/homepage/news.jpg'/>" alt="newsImage">
                        </a>
                      </div>
                      <div class="media-body">
                       <a href="#">Dummy text of the printing and typesetting industry</a>
                       <span class="feed_date">28.02.15</span>                
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="media">
                      <div class="media-left">
                        <a class="news_img" href="#">
                          <img class="media-object" src="<c:url value='/resources/images/homepage/news.jpg'/>" alt="newsImage">
                        </a>
                      </div>
                      <div class="media-body">
                       <a href="#">Dummy text of the printing and typesetting industry</a>
                       <span class="feed_date">28.02.15</span>                
                      </div>
                    </div>
                  </li>                  
                </ul>
                <a class="see_all" href="#">See All</a>
              </div>
            </div>
          </div>
        </div>
      </div>
      </div>
    </section>
    <!--=========== END ABOUT US SECTION ================--> 

    <!--=========== BEGIN WHY US SECTION ================-->
    <section id="whyUs">
      <!-- Start why us top -->
      <div class="row">        
        <div class="col-lg-12 col-sm-12">
          <div class="whyus_top">
            <div class="container">
              <!-- Why us top titile -->
              <div class="row">
                <div class="col-lg-12 col-md-12"> 
                  <div class="title_area">
                    <h2 class="title_two">Why Us</h2>
                    <span></span> 
                  </div>
                </div>
              </div>
              <!-- End Why us top titile -->
              <!-- Start Why us top content  -->
              <div class="row">
                <div class="col-lg-3 col-md-3 col-sm-3">
                  <div class="single_whyus_top wow fadeInUp">
                    <div class="whyus_icon">
                      <span class="fa fa-desktop"></span>
                    </div>
                    <h3>Technology</h3>
                    <p>when an unknown printer took a galley of type and scrambled it to make a type specimen book</p>
                  </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-3">
                  <div class="single_whyus_top wow fadeInUp">
                    <div class="whyus_icon">
                      <span class="fa fa-users"></span>
                    </div>
                    <h3>Best Tutor</h3>
                    <p>when an unknown printer took a galley of type and scrambled it to make a type specimen book</p>
                  </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-3">
                  <div class="single_whyus_top wow fadeInUp">
                    <div class="whyus_icon">
                      <span class="fa fa-flask"></span>
                    </div>
                    <h3>Practical Training</h3>
                    <p>when an unknown printer took a galley of type and scrambled it to make a type specimen book</p>
                  </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-3">
                  <div class="single_whyus_top wow fadeInUp">
                    <div class="whyus_icon">
                      <span class="fa fa-support"></span>
                    </div>
                    <h3>Support</h3>
                    <p>when an unknown printer took a galley of type and scrambled it to make a type specimen book</p>
                  </div>
                </div>
              </div>
              <!-- End Why us top content  -->
            </div>
          </div>
        </div>        
      </div>
      <!-- End why us top -->

      <!-- Start why us bottom -->
      <div class="row">        
        <div class="col-lg-12 col-sm-12">
          <div class="whyus_bottom">            
            <div class="slider_overlay"></div>
            <div class="container">               
              <div class="skills">                
                <!-- START SINGLE SKILL-->
                <div class="col-lg-3 col-md-3 col-sm-3">
                 <div class="single_skill wow fadeInUp">
                   <div id="myStat" data-dimension="150" data-text="35%" data-info="" data-width="10" data-fontsize="25" data-percent="35" data-fgcolor="#999" data-bgcolor="#fff"  data-icon="fa-task"></div>
                    <h4>Repeate Learners</h4>                      
                  </div>
                </div>
                <!-- START SINGLE SKILL-->
                <div class="col-lg-3 col-md-3 col-sm-3">
                  <div class="single_skill wow fadeInUp">
                    <div id="myStathalf2" data-dimension="150" data-text="90%" data-info="" data-width="10" data-fontsize="25" data-percent="90" data-fgcolor="#999" data-bgcolor="#fff"  data-icon="fa-task"></div>
                    <h4>Success Rate</h4>
                  </div>
                </div>
                <!-- START SINGLE SKILL-->
                <div class="col-lg-3 col-md-3 col-sm-3">                 
                  <div class="single_skill wow fadeInUp">
                    <div id="myStat2" data-dimension="150" data-text="100%" data-info="" data-width="10" data-fontsize="25" data-percent="100" data-fgcolor="#999" data-bgcolor="#fff"  data-icon="fa-task"></div>
                    <h4>Student Engagement</h4>
                  </div>
                </div>
                <!-- START SINGLE SKILL-->
                <div class="col-lg-3 col-md-3 col-sm-3">                 
                  <div class="single_skill wow fadeInUp">
                    <div id="myStat3" data-dimension="150" data-text="65%" data-info="" data-width="10" data-fontsize="25" data-percent="65" data-fgcolor="#999" data-bgcolor="#fff"  data-icon="fa-task"></div>
                    <h4>Certified Courses</h4>
                  </div>
                </div>
              </div>
            </div>            
          </div>
        </div>        
      </div>
      <!-- End why us bottom -->
    </section>
    <!--=========== END WHY US SECTION ================-->

    <!--=========== BEGIN OUR COURSES SECTION ================-->
    <section id="ourCourses">
      <div class="container">
       <!-- Our courses titile -->
        <div class="row">
          <div class="col-lg-12 col-md-12"> 
            <div class="title_area">
              <h2 class="title_two">Our Courses</h2>
              <span></span> 
            </div>
          </div>
        </div>
        <!-- End Our courses titile -->
        <!-- Start Our courses content -->
        <div class="row">
          <div class="col-lg-12 col-md-12 col-sm-12">
            <div class="ourCourse_content">
              <ul class="course_nav">
                <li>
                  <div class="single_course">
                    <div class="singCourse_imgarea">
                      <img src="<c:url value='/resources/images/homepage/course-1.jpg'/>" />
                      <div class="mask">                         
                        <a href="#" class="course_more">View Course</a>
                      </div>
                    </div>
                    <div class="singCourse_content">
                    <h3 class="singCourse_title"><a href="#">Introduction To Matrix</a></h3>
                    <p class="singCourse_price"><span>$20</span> Per One Month</p>
                    <p>when an unknown printer took a galley of type and scrambled it to make a type specimen book</p>
                    </div>
                    <div class="singCourse_author">
                      <img src="<c:url value='/resources/images/homepage/author.jpg'/>" alt="author">
                      <p>Richard Remus, Teacher</p>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="single_course">
                    <div class="singCourse_imgarea">
                      <img src="<c:url value='/resources/images/homepage/course-2.jpg'/>" alt="course2"/>
                      <div class="mask">                         
                        <a href="#" class="course_more">View Course</a>
                      </div>
                    </div>
                    <div class="singCourse_content">
                    <h3 class="singCourse_title"><a href="#">Introduction To Matrix</a></h3>
                    <p class="singCourse_price"><span>$20</span> Per One Month</p>
                    <p>when an unknown printer took a galley of type and scrambled it to make a type specimen book</p>
                    </div>
                    <div class="singCourse_author">
                      <img src="<c:url value='/resources/images/homepage/author.jpg'/>" alt="author">
                      <p>Richard Remus, Teacher</p>
                    </div>
                  </div>
                </li> 
                <li>
                  <div class="single_course">
                    <div class="singCourse_imgarea">
                      <img src="<c:url value='/resources/images/homepage/course-1.jpg'/>" />
                      <div class="mask">                         
                        <a href="#" class="course_more">View Course</a>
                      </div>
                    </div>
                    <div class="singCourse_content">
                    <h3 class="singCourse_title"><a href="#">Introduction To Matrix</a></h3>
                    <p class="singCourse_price"><span>$20</span> Per One Month</p>
                    <p>when an unknown printer took a galley of type and scrambled it to make a type specimen book</p>
                    </div>
                    <div class="singCourse_author">
                      <img src="<c:url value='/resources/images/homepage/author.jpg'/>" alt="img">
                      <p>Richard Remus, Teacher</p>
                    </div>
                  </div>
                </li>  
                <li>
                  <div class="single_course">
                    <div class="singCourse_imgarea">
                      <img src="<c:url value='/resources/images/homepage/course-2.jpg'/>" />
                      <div class="mask">                         
                        <a href="#" class="course_more">View Course</a>
                      </div>
                    </div>
                    <div class="singCourse_content">
                    <h3 class="singCourse_title"><a href="#">Introduction To Matrix</a></h3>
                    <p class="singCourse_price"><span>$20</span> Per One Month</p>
                    <p>when an unknown printer took a galley of type and scrambled it to make a type specimen book</p>
                    </div>
                    <div class="singCourse_author">
                      <img src="<c:url value='/resources/images/homepage/author.jpg'/>" alt="img">
                      <p>Richard Remus, Teacher</p>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="single_course">
                    <div class="singCourse_imgarea">
                      <img src="<c:url value='/resources/images/homepage/course-1.jpg'/>" />
                      <div class="mask">                         
                        <a href="#" class="course_more">View Course</a>
                      </div>
                    </div>
                    <div class="singCourse_content">
                    <h3 class="singCourse_title"><a href="#">Introduction To Matrix</a></h3>
                    <p class="singCourse_price"><span>$20</span> Per One Month</p>
                    <p>when an unknown printer took a galley of type and scrambled it to make a type specimen book</p>
                    </div>
                    <div class="singCourse_author">
                      <img src="<c:url value='/resources/images/homepage/author.jpg'/>" alt="img">
                      <p>Richard Remus, Teacher</p>
                    </div>
                  </div>
                </li> 
                <li>
                  <div class="single_course">
                    <div class="singCourse_imgarea">
                      <img src="<c:url value='/resources/images/homepage/course-2.jpg'/>" />
                      <div class="mask">                         
                        <a href="#" class="course_more">View Course</a>
                      </div>
                    </div>
                    <div class="singCourse_content">
                    <h3 class="singCourse_title"><a href="#">Introduction To Matrix</a></h3>
                    <p class="singCourse_price"><span>$20</span> Per One Month</p>
                    <p>when an unknown printer took a galley of type and scrambled it to make a type specimen book</p>
                    </div>
                    <div class="singCourse_author">
                      <img src="<c:url value='/resources/images/homepage/author.jpg'/>" alt="img">
                      <p>Richard Remus, Teacher</p>
                    </div>
                  </div>
                </li>                
              </ul>
            </div>
          </div>
        </div>
        <!-- End Our courses content -->
      </div>
    </section>
    <!--=========== END OUR COURSES SECTION ================-->  

    <!--=========== BEGIN OUR TUTORS SECTION ================-->
    <section id="ourTutors">
      <div class="container">
       <!-- Our courses titile -->
        <div class="row">
          <div class="col-lg-12 col-md-12"> 
            <div class="title_area">
              <h2 class="title_two">Our Tutors</h2>
              <span></span> 
            </div>
          </div>
        </div>
        <!-- End Our courses titile -->

        <!-- Start Our courses content -->
        <div class="row">
          <div class="col-lg-12 col-md-12 col-sm-12">
            <div class="ourTutors_content">
              <!-- Start Tutors nav -->
              <ul class="tutors_nav">
                <li>
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src="<c:url value='/resources/images/homepage/author.jpg'/>" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Technology Teacher</span>
                      <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="#"></a></li>
                        <li><a class="fa fa-twitter" href="#"></a></li>
                        <li><a class="fa fa-instagram" href="#"></a></li>
                        <li><a class="fa fa-google-plus" href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src="<c:url value='/resources/images/homepage/course-1.jpg'/>" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Technology Teacher</span>
                      <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="#"></a></li>
                        <li><a class="fa fa-twitter" href="#"></a></li>
                        <li><a class="fa fa-instagram" href="#"></a></li>
                        <li><a class="fa fa-google-plus" href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src="<c:url value='/resources/images/homepage/author.jpg'/>" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Technology Teacher</span>
                      <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="#"></a></li>
                        <li><a class="fa fa-twitter" href="#"></a></li>
                        <li><a class="fa fa-instagram" href="#"></a></li>
                        <li><a class="fa fa-google-plus" href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src="<c:url value='/resources/images/homepage/course-1.jpg'/>" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Technology Teacher</span>
                      <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="#"></a></li>
                        <li><a class="fa fa-twitter" href="#"></a></li>
                        <li><a class="fa fa-instagram" href="#"></a></li>
                        <li><a class="fa fa-google-plus" href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src="<c:url value='/resources/images/homepage/author.jpg'/>" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Technology Teacher</span>
                      <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="#"></a></li>
                        <li><a class="fa fa-twitter" href="#"></a></li>
                        <li><a class="fa fa-instagram" href="#"></a></li>
                        <li><a class="fa fa-google-plus" href="#"></a></li>
                        <li><a class="fa fa-github" href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>
                <li>
                  <div class="single_tutors">
                    <div class="tutors_thumb">
                      <img src="<c:url value='/resources/images/homepage/course-1.jpg'/>" />                      
                    </div>
                    <div class="singTutors_content">
                      <h3 class="tutors_name">Jame Burns</h3>
                      <span>Technology Teacher</span>
                      <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry</p>
                    </div>
                    <div class="singTutors_social">
                      <ul class="tutors_socnav">
                        <li><a class="fa fa-facebook" href="#"></a></li>
                        <li><a class="fa fa-twitter" href="#"></a></li>
                        <li><a class="fa fa-instagram" href="#"></a></li>
                        <li><a class="fa fa-google-plus" href="#"></a></li>
                        <li><a class="fa fa-github" href="#"></a></li>
                      </ul>
                    </div>
                  </div>
                </li>                                             
              </ul>
            </div>
          </div>
        </div>
        <!-- End Our courses content -->
      </div>
    </section>
    <!--=========== END OUR TUTORS SECTION ================-->

    <!--=========== BEGIN STUDENTS TESTIMONIAL SECTION ================-->
    <section id="studentsTestimonial">
      <div class="container">
       <!-- Our courses titile -->
        <div class="row">
          <div class="col-lg-12 col-md-12"> 
            <div class="title_area">
              <h2 class="title_two">What our Student says</h2>
              <span></span> 
            </div>
          </div>
        </div>
        <!-- End Our courses titile -->

        <!-- Start Our courses content -->
        <div class="row">
          <div class="col-lg-12 col-md-12 col-sm-12">
            <div class="studentsTestimonial_content">              
              <div class="row">
                <!-- start single student testimonial -->
                <div class="col-lg-4 col-md-4 col-sm-4">
                  <div class="single_stsTestimonial wow fadeInUp">
                    <div class="stsTestimonial_msgbox">
                      <p>when an unknown printer took a galley of type and scrambled it to make a type specimen book</p>
                    </div>
                    <img class="stsTesti_img" src="<c:url value='/resources/images/homepage/author.jpg'/>" alt="img">
                    <div class="stsTestimonial_content">
                      <h3>Johnathan Doe</h3>                      
                      <span>Ex. Student</span>
                      <p>Software Department</p>
                    </div>
                  </div>
                </div>
                <!-- End single student testimonial -->
                <!-- start single student testimonial -->
                <div class="col-lg-4 col-md-4 col-sm-4">
                  <div class="single_stsTestimonial wow fadeInUp">
                    <div class="stsTestimonial_msgbox">
                      <p>when an unknown printer took a galley of type and scrambled it to make a type specimen book.scrambled it to make a type specimen book</p>
                    </div>
                    <img class="stsTesti_img" src="<c:url value='/resources/images/homepage/author.jpg'/>" alt="img">
                    <div class="stsTestimonial_content">
                      <h3>Johnathan Doe</h3>                      
                      <span>Ex. Student</span>
                      <p>Software Department</p>
                    </div>
                  </div>
                </div>
                <!-- End single student testimonial -->
                <!-- start single student testimonial -->
                <div class="col-lg-4 col-md-4 col-sm-4">
                  <div class="single_stsTestimonial wow fadeInUp">
                    <div class="stsTestimonial_msgbox">
                      <p>when an unknown printer took a galley of type and scrambled it to make a type specimen book</p>
                    </div>
                    <img class="stsTesti_img" src="<c:url value='/resources/images/homepage/author.jpg'/>" alt="img">
                    <div class="stsTestimonial_content">
                      <h3>Johnathan Doe</h3>                      
                      <span>Ex. Student</span>
                      <p>Software Department</p>
                    </div>
                  </div>
                </div>
                <!-- End single student testimonial -->
              </div>
            </div>
          </div>
        </div>
        <!-- End Our courses content -->
      </div>
    </section>
    <!--=========== END STUDENTS TESTIMONIAL SECTION ================-->    
    
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
                <p>Designed by <a href="http://wpfreeware.com/" rel="nofollow">Wpfreeware.com</a></p>
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