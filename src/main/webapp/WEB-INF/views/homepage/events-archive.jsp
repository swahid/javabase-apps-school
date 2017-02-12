<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:mainpage>
<jsp:attribute name="header">

</jsp:attribute>
<jsp:body>
    <!--=========== BEGIN COURSE BANNER SECTION ================-->
    <section id="imgBanner">
      <h2>Events Archive</h2>
    </section>
    <!--=========== END COURSE BANNER SECTION ================-->
    
    <!--=========== BEGIN COURSE BANNER SECTION ================-->
    <section id="courseArchive">
      <div class="container">
        <div class="row">
          <!-- start course content -->
          <div class="col-lg-8 col-md-8 col-sm-8">
            <div class="courseArchive_content">
              <!-- start blog archive  -->
              <div class="row">
                <!-- start single blog archive -->
                <div class="col-lg-12 col-12 col-sm-12">
                  <div class="single_blog_archive wow fadeInUp">
                    <div class="blogimg_container">
                      <a href="#" class="blog_img">
                        <img alt="img" src="<c:url value='/resources/images/homepage/blog.jpg'/>">
                      </a>
                    </div>
                    <h2 class="blog_title"><a href="events-single.html"> Curabitur ac dictum nisl eu hendrerit ante</a></h2>
                    <div class="blog_commentbox">
                      <p><i class="fa fa-clock-o"></i>Time: 7pm,15 March 2015</p>
                      <p><i class="fa fa-map-marker"></i>Location: London,UK</p>                      
                    </div>
                    <p class="blog_summary">Duis erat purus, tincidunt vel ullamcorper ut, consequat tempus nibh. Proin condimentum risus ligula, dignissim mollis tortor hendrerit vel. Aliquam...</p>
                    <a class="blog_readmore" href="events-single.html">Read More</a>
                  </div>
                </div>
                <!-- End single blog archive -->
                <!-- start single blog archive -->
                <div class="col-lg-12 col-12 col-sm-12">
                  <div class="single_blog_archive wow fadeInUp">
                    <div class="blogimg_container">
                      <a href="#" class="blog_img">
                        <img alt="img" src="<c:url value='/resources/images/homepage/blog.jpg'/>">
                      </a>
                    </div>
                    <h2 class="blog_title"><a href="events-single.html"> Curabitur ac dictum nisl eu hendrerit ante</a></h2>
                    <div class="blog_commentbox">
                      <p><i class="fa fa-clock-o"></i>Time: 7pm</p>
                      <p><i class="fa fa-map-marker"></i>Location: London,UK</p>                      
                    </div>
                    <p class="blog_summary">Duis erat purus, tincidunt vel ullamcorper ut, consequat tempus nibh. Proin condimentum risus ligula, dignissim mollis tortor hendrerit vel. Aliquam...</p>
                    <a class="blog_readmore" href="events-single.html">Read More</a>
                  </div>
                </div>
                <!-- End single blog archive -->
                <!-- start single blog archive -->
                <div class="col-lg-12 col-12 col-sm-12">
                  <div class="single_blog_archive wow fadeInUp">
                    <div class="blogimg_container">
                      <a href="#" class="blog_img">
                        <img alt="img" src="<c:url value='/resources/images/homepage/blog.jpg'/>">
                      </a>
                    </div>
                    <h2 class="blog_title"><a href="events-single.html"> Curabitur ac dictum nisl eu hendrerit ante</a></h2>
                    <div class="blog_commentbox">
                      <p><i class="fa fa-clock-o"></i>Time: 7pm</p>
                      <p><i class="fa fa-map-marker"></i>Location: London,UK</p>                      
                    </div>
                    <p class="blog_summary">Duis erat purus, tincidunt vel ullamcorper ut, consequat tempus nibh. Proin condimentum risus ligula, dignissim mollis tortor hendrerit vel. Aliquam...</p>
                    <a class="blog_readmore" href="events-single.html">Read More</a>
                  </div>
                </div>
                <!-- start single blog archive -->
              </div>
              <!-- end blog archive  -->
              <!-- start previous & next button -->
              <div class="single_blog_prevnext">
                <a href="#" class="prev_post wow fadeInLeft animated" style="visibility: visible; animation-name: fadeInLeft;"><i class="fa fa-angle-left"></i>Previous</a>
                <a href="#" class="next_post wow fadeInRight animated" style="visibility: visible; animation-name: fadeInRight;">Next<i class="fa fa-angle-right"></i></a>
              </div>
            </div>
          </div>
          <!-- End course content -->

          <!-- start course archive sidebar -->
          <div class="col-lg-4 col-md-4 col-sm-4">
            <div class="courseArchive_sidebar">
              <!-- start single sidebar -->
              <div class="single_sidebar">
                <h2>Popular Events <span class="fa fa-angle-double-right"></span></h2>
                <ul class="news_tab">
                  <li>
                    <div class="media">
                      <div class="media-left">
                        <a href="#" class="news_img">
                          <img alt="img" src="<c:url value='/resources/images/homepage/news.jpg'/>" class="media-object">
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
                        <a href="#" class="news_img">
                          <img alt="img" src="<c:url value='/resources/images/homepage/news.jpg'/>" class="media-object">
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
                        <a href="#" class="news_img">
                          <img alt="img" src="<c:url value='/resources/images/homepage/news.jpg'/>" class="media-object">
                        </a>
                      </div>
                      <div class="media-body">
                       <a href="#">Dummy text of the printing and typesetting industry</a>
                       <span class="feed_date">28.02.15</span>                
                      </div>
                    </div>
                  </li>                  
                </ul>
              </div>
              <!-- End single sidebar -->
              <!-- start single sidebar -->
              <div class="single_sidebar">
                <h2>Category <span class="fa fa-angle-double-right"></span></h2>
                <ul>
                  <li><a href="#">Food</a></li>
                  <li><a href="#">Technology</a></li>
                  <li><a href="#">Fashion</a></li>
                  <li><a href="#">Business</a></li>
                  <li><a href="#">Games</a></li>
                </ul>
              </div>
              <!-- End single sidebar -->
              <!-- start single sidebar -->
              <div class="single_sidebar">
                <h2>Tags <span class="fa fa-angle-double-right"></span></h2>
                <ul class="tags_nav">
                  <li><a href="#"><i class="fa fa-tags"></i>Creative</a></li>
                  <li><a href="#"><i class="fa fa-tags"></i>News</a></li>
                  <li><a href="#"><i class="fa fa-tags"></i>Technology</a></li>
                  <li><a href="#"><i class="fa fa-tags"></i>Art</a></li>
                  <li><a href="#"><i class="fa fa-tags"></i>Audio</a></li>
                  <li><a href="#"><i class="fa fa-tags"></i>video</a></li>
                </ul>
              </div>
              <!-- End single sidebar -->
              <!-- start single sidebar -->
              <div class="single_sidebar">
                <h2>Sponsor Add <span class="fa fa-angle-double-right"></span></h2>
                <a class="side_add" href="#"><img src="<c:url value='/resources/images/homepage/side-add.jpg'/>" alt="img"></a>
              </div>
              <!-- End single sidebar -->
            </div>
          </div>
          <!-- start course archive sidebar -->
        </div>
      </div>
    </section>
    <!--=========== END COURSE BANNER SECTION ================-->
    
    </jsp:body>
</t:mainpage>