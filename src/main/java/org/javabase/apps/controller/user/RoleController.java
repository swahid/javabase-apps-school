package org.javabase.apps.controller.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.Role;
import org.javabase.apps.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="dashboard/role")
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
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

}
