/**
 * 
 */
package org.javabase.apps.controller.user;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.javabase.apps.entity.UserInformation;
import org.javabase.apps.service.UserInformationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version 1.0.0
 * @since   1.0.0
 */
@Controller
@RequestMapping(value="dashboard/profile")
public class UserProfileController {
    
    private static final Logger log = LoggerFactory.getLogger(UserProfileController.class);
    
    @Autowired
    UserInformationService service;
    
    @Autowired
    HttpSession session;
    
    @RequestMapping(method=RequestMethod.GET)
    public String profile(HttpSession session){
        
        return "user/profile";
    }
    
    @ResponseBody
    @RequestMapping(value="update", method=RequestMethod.PUT)
    public Map<String, Object> updateInformation(@RequestBody UserInformation userInformation, HttpSession session){
        Map<String, Object> response = new HashMap<>();
        session.removeAttribute("userInfo");
        try {
            
            UserInformation entity = service.getUserInfoById(userInformation.getUserId());
            
            entity.setFirstName(userInformation.getFirstName());
            entity.setLastName(userInformation.getLastName());
            entity.setFatherName(userInformation.getFatherName());
            entity.setMotherName(userInformation.getMotherName());
            entity.setBirthdate(userInformation.getBirthdate());
            entity.setPhoneHome(userInformation.getPhoneHome());
            entity.setPhoneMobile(userInformation.getPhoneMobile());
            entity.setEmailPrimary(userInformation.getEmailPrimary());
            entity.setAddressLine1(userInformation.getAddressLine1());
            entity.setAddressLine2(userInformation.getAddressLine2());
            entity.setCity(userInformation.getCity());
            entity.setState(userInformation.getState());
            entity.setDistrict(userInformation.getDistrict());
            entity.setZipCode(userInformation.getZipCode());
            entity.setCountry(userInformation.getCountry());
            
            
            boolean update = service.update(entity);
            if (update) {
                
                session.setAttribute("userInfo", service.getUserInfoById(userInformation.getUserId()));
                response.put("success", true);
                response.put("message", "save success");
            }else {
                log.info("insert failed");
                response.put("error", true);
                response.put("message", "unable to save");
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            response.put("error", true);
            response.put("message", "unable to save");
        }
        
        return response;
    }
    
    @RequestMapping(value="uploadLogo", method=RequestMethod.POST)
    public String uploadLogo(@RequestParam("avaterLogo") MultipartFile file, HttpServletRequest request,
            @RequestParam("userId") int userId, RedirectAttributes redirectAttributes) {
        try {
            
            String saveDirectory=request.getSession().getServletContext().getRealPath("/")+"resources\\images\\user\\";
            
            UserInformation user = service.getUserInfoById(userId);
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            String fileName = file.getOriginalFilename();
            fileName = fileName.substring(fileName.indexOf("."));
            fileName = user.getUser().getUsername()+"_logo"+fileName;
            
            
            Path path = Paths.get(saveDirectory + fileName);
            Files.write(path, bytes);
            
            user.setUserLogo(fileName);
            service.update(user);
            
            
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + fileName + "'");
            
            session.setAttribute("userInfo", service.getUserInfoById(user.getUserId()));
            return "redirect:/dashboard/profile";
        } catch (Exception e ) {
            redirectAttributes.addFlashAttribute("message","Max Limit Exceed");
            log.error(e.getMessage(), e);
            return "redirect:/dashboard/profile";
        }
        
    }
    @RequestMapping(value="uploadBanner", method=RequestMethod.POST)
    public String uploadBanner(@RequestParam("userbanner") MultipartFile file, HttpServletRequest request,
            @RequestParam("userId") int userId, RedirectAttributes redirectAttributes) {
        
       try {
           
           String saveDirectory=request.getSession().getServletContext().getRealPath("/")+"resources\\images\\user\\";
           
           UserInformation user = service.getUserInfoById(userId);

           // Get the file and save it somewhere
           byte[] bytes = file.getBytes();
           
           String fileName = file.getOriginalFilename();
           fileName = fileName.substring(fileName.indexOf("."));
           fileName = user.getUser().getUsername()+"_banner"+fileName;
           
           Path path = Paths.get(saveDirectory + fileName);
           Files.write(path, bytes);
           
           user.setUserBanner(fileName);
           service.update(user);
           
           redirectAttributes.addFlashAttribute("message",
                   "You successfully uploaded '" + fileName + "'");

           session.setAttribute("userInfo", service.getUserInfoById(user.getUserId()));
           return "redirect:/dashboard/profile";
       } catch (IOException e) {
           redirectAttributes.addFlashAttribute("message","Max Limit Exceed 1MB");
           log.error(e.getMessage(), e);
           return "redirect:/dashboard/profile";
       }
       
   }

}
