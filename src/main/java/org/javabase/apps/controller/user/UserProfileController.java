/**
 * 
 */
package org.javabase.apps.controller.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.javabase.apps.controller.setup.RoomController;
import org.javabase.apps.entity.UserInformation;
import org.javabase.apps.service.UserInformationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version 1.0.0
 * @since   1.0.0
 */
@Controller
@RequestMapping(value="dashboard/profile")
public class UserProfileController {
    
    private static final Logger log = LoggerFactory.getLogger(RoomController.class);
    
    @Autowired
    UserInformationService service;
    
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
            boolean update = service.update(userInformation);
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

}
