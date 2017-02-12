<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:mainpage>
<jsp:attribute name="header">

</jsp:attribute>
<jsp:body>

    <!--=========== BEGIN COURSE BANNER SECTION ================-->
    <section id="imgBanner">
      <h2>Scholarship</h2>
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
                <!-- start single blog -->
                <div class="col-lg-12 col-12 col-sm-12">
                  <div class="single_blog">
                    <div class="blogimg_container">
                      <a href="#" class="blog_img">
                        <img alt="img" src="<c:url value='/resources/images/homepage/blog.jpg'/>">
                      </a>
                    </div>
                    <h2 class="blog_title"><a href="blog-single.html"> Curabitur ac dictum nisl eu hendrerit ante</a></h2>
                    <div class="blog_commentbox">
                      <p><i class="fa fa-user"></i>Richard Remus</p>
                      <p><i class="fa fa-calendar"></i>15 March 2015</p>
                      <a href="#"><i class="fa fa-comments"></i>20 Comments</a>
                    </div>
                    <p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).</p>
                    <blockquote>
                      <span class="fa fa-quote-left"></span>
                      Duis erat purus, tincidunt vel ullamcorper ut, consequat tempus nibh. Proin condimentum risus ligula, dignissim mollis tortor hendrerit vel.
                    </blockquote>
                    <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.</p>

                    <h3>This is example of H3</h3>
                    <h4>This is example of H4</h4>
                    <h5>This is example of H5</h5>
                    <h6>This is example of H6</h6>

                    <ul>
                      <li><span class="fa fa-angle-double-right"></span>There are many variations of passages</li>
                      <li><span class="fa fa-angle-double-right"></span>Lorem Ipsum generators</li>
                      <li><span class="fa fa-angle-double-right"></span>There are many variations of passages</li>
                      <li><span class="fa fa-angle-double-right"></span>The uses a dictionary of over 200 Latin words</li>
                      <li><span class="fa fa-angle-double-right"></span>Proin condimentum risus ligula</li>
                    </ul>                    
                  </div>                 
                </div>
                <!-- End single blog -->                
              </div>
              <!-- end blog archive  -->                       
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