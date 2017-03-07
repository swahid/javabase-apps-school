/**
 * 
 */
package org.javabase.apps.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version 1.0.0
 * @since   1.0.0
 */
@Controller
@RequestMapping(value="dashboard/profile")
public class UserProfileController {
    
    @RequestMapping(method=RequestMethod.GET)
    public String profile(Model model){
        
        return "user/profile";
    }

}
