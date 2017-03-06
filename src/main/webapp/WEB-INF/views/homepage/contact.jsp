<%@ include file="/WEB-INF/tags/layout/includes.jsp"%>
<t:mainpage>
<jsp:attribute name="header">

</jsp:attribute>
<jsp:body>

    <!--=========== BEGIN COURSE BANNER SECTION ================-->
    <section id="imgBanner">
      <h2>Contact</h2>
    </section>
    <!--=========== END COURSE BANNER SECTION ================-->
    
    <!--=========== BEGIN CONTACT SECTION ================-->
    <section id="contact">
      <div class="container">
       <div class="row">
          <div class="col-lg-12 col-md-12"> 
            <div class="title_area">
              <h2 class="title_two">We are Wpf Degree</h2>
              <span></span> 
              <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book</p>
            </div>
          </div>
       </div>
       <div class="row">
         <div class="col-lg-8 col-md-8 col-sm-8">
           <div class="contact_form wow fadeInLeft">
              <form class="submitphoto_form">
                <input type="text" class="wp-form-control wpcf7-text" placeholder="Your name">
                <input type="email" class="wp-form-control wpcf7-email" placeholder="Email address">          
                <input type="text" class="wp-form-control wpcf7-text" placeholder="Subject">
                <textarea class="wp-form-control wpcf7-textarea" cols="30" rows="10" placeholder="What would you like to tell us"></textarea>
                <input type="submit" value="Submit" class="wpcf7-submit">
              </form>
           </div>
         </div>
         <div class="col-lg-4 col-md-4 col-sm-4">
           <div class="contact_address wow fadeInRight">
             <h3>Address</h3>
             <div class="address_group">
               <p>200 Lincoln Ave, Salinas, CA 93901</p>
               <p>Phone: 662-807-9585</p>
               <p>Email:contact@wpfdegree.com</p>
             </div>
             <div class="address_group">
              <ul class="footer_social">
                <li><a href="#" class="soc_tooltip" title="" data-placement="top" data-toggle="tooltip" data-original-title="Facebook"><i class="fa fa-facebook"></i></a></li>
                <li><a href="#" class="soc_tooltip" title="" data-placement="top" data-toggle="tooltip" data-original-title="Twitter"><i class="fa fa-twitter"></i></a></li>
                <li><a href="#" class="soc_tooltip" title="" data-placement="top" data-toggle="tooltip" data-original-title="Google+"><i class="fa fa-google-plus"></i></a></li>
                <li><a href="#" class="soc_tooltip" title="" data-placement="top" data-toggle="tooltip" data-original-title="Linkedin"><i class="fa fa-linkedin"></i></a></li>
                <li><a href="#" class="soc_tooltip" title="" data-placement="top" data-toggle="tooltip" data-original-title="Youtube"><i class="fa fa-youtube"></i></a></li>
                </ul>
             </div>
           </div>
         </div>
       </div>
      </div>
    </section>
    <!--=========== END CONTACT SECTION ================-->

    <!--=========== BEGIN GOOGLE MAP SECTION ================-->
    <section id="googleMap">
      <iframe width="100%" height="500" src="https://www.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=200+Lincoln+Ave,+Salinas,+CA,+USA&amp;aq=&amp;sll=30.977609,-95.712891&amp;sspn=42.157377,86.572266&amp;ie=UTF8&amp;hq=&amp;hnear=200+Lincoln+Ave,+Salinas,+California+93901-2639&amp;t=m&amp;z=14&amp;ll=36.674837,-121.657691&amp;output=embed"></iframe>
    </section>
    <!--=========== END GOOGLE MAP SECTION ================-->

  </jsp:body>
</t:mainpage>