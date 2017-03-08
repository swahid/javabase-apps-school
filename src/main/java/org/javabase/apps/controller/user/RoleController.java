package org.javabase.apps.controller.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.Role;
import org.javabase.apps.service.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="dashboard/role")
public class RoleController {
    
    private static final Logger log = LoggerFactory.getLogger(RoleController.class);
	
	@Autowired
	RoleService roleService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String  role(){
	    return "user/role";
	}
	
	
	@ResponseBody
	@RequestMapping(value="load", method=RequestMethod.GET)
	public Map<String, Object> loadRole(){
		Map<String, Object> response = new HashMap<>();
		
		List<Role> roleList = roleService.getAllRoles();
		
		if (roleList.size()>0) {
			response.put("success", true);
			response.put("data", roleList);
		}else {
			response.put("success", false);
			response.put("message", "No Data Found");
		}
		return response; 
	}
	
	@ResponseBody
	@RequestMapping(value="add", method=RequestMethod.POST)
	public Map<String, Object> addRole(@RequestBody Role role){
	    Map<String, Object> response = new HashMap<>();
	    try {
	        boolean save = roleService.addRole(role);
	        
	        if (save) {
	            response.put("success", true);
	            response.put("message", "save success");
	        }else {
	            log.info("insert failed");
	            response.put("error", true);
	            response.put("message", "unable to save");
	        }
            
        } catch (Exception e) {
            log.info(e.getMessage(), e);
            response.put("error", true);
            response.put("message", "unable to save");
        }
	    return response; 
	}

}
