/**
 * 
 */
package org.javabase.apps.controller.homepage;

import javax.servlet.http.HttpSession;

import org.javabase.apps.entity.User;
import org.javabase.apps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author medisys
 *
 */
@Controller
@RequestMapping(value= {"/", "/home"} )
public class HomepageController {
	
	@Autowired
    UserService userservice;
    
    @Autowired
    HttpSession response;
	@RequestMapping(method = RequestMethod.GET)
	private String indexPage(){
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

    	if (principal instanceof UserDetails) {
    		String username = ((UserDetails) principal).getUsername();
    		User user = userservice.getUserByUsername(username);
    	    response.setAttribute("user", user);
    	}
		return "homepage/index";
	}
}
