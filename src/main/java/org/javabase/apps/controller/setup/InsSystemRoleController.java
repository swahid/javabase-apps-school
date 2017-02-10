package org.javabase.apps.controller.setup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InsSysRole;
import org.javabase.apps.service.InsSysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "dashboard/insSystemRole")
public class InsSystemRoleController {
	
	@Autowired
	InsSysRoleService insSysRoleService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String insRolePage() {
        return "institution/insSystemRole";
    }
	
	@ResponseBody
	@RequestMapping(value = "load",method = RequestMethod.GET)
	public Map<String, Object> allInsShift() {
		Map<String, Object> response= new HashMap<String, Object>();
		
		List<InsSysRole> InsSysRoleList = insSysRoleService.getAllInsSysRoles(); 
			
		response.put("success", true);
		response.put("data", InsSysRoleList);
		return response;
		
	}
	
	@ResponseBody
	@RequestMapping(value="addInsSyetemRole", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody InsSysRole insSysRole) {
		Map<String, Object> response= new HashMap<String, Object>();
		Boolean save = insSysRoleService.addInsSysRole(insSysRole);
		
		if (save) {
			response.put("suceess", true);
	        response.put("message", "Add Shift Sucess");
			return response;
		}else {
			response.put("error", true);
	        response.put("message", "Add Shift Failed");
			return response;
		}
		
	}
	
}
