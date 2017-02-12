/**
 * 
 */
package org.javabase.apps.controller.homepage;

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
	
	@RequestMapping(method = RequestMethod.GET)
	private String indexPage(){
		return "homepage/index";
	}
}
