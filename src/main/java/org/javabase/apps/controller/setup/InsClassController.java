package org.javabase.apps.controller.setup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InsClass;
import org.javabase.apps.entity.User;
import org.javabase.apps.service.InsClassService;
import org.javabase.apps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "dashboard/insClass")
public class InsClassController {
	
	@Autowired
	InsClassService insClassService;
	
	@Autowired
    UserService userservice;
	
	public User user;
	
	@RequestMapping(method = RequestMethod.GET)
    public String roomPage() {
        return "institution/insClass";
    }
	
	@ResponseBody
	@RequestMapping(value = "load",method = RequestMethod.GET)
	public Map<String, Object> allInsClass() {
		Map<String, Object> response= new HashMap<String, Object>();
		Map<String, Object> param= new HashMap<String, Object>();
		
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		if (principal instanceof UserDetails) {
			String username = ((UserDetails) principal).getUsername();
			 user = userservice.getUserByUsername(username);
		}
		param.put("entryUser", user.getUserid());
		
		List<InsClass> insClassList = insClassService.getAllInsClasssByParam(param);
			
		response.put("success", true);
		response.put("data", insClassList);
		return response;
		
	}
	
	@ResponseBody
	@RequestMapping(value="addInsClass", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody InsClass insClass) {
		Map<String, Object> response= new HashMap<String, Object>();
		Boolean save = insClassService.addInsClass(insClass);
		
		if (save) {
			response.put("suceess", true);
	        response.put("message", "Add Class Sucess");
			return response;
		}else {
			response.put("error", true);
	        response.put("message", "Add Class Failed");
			return response;
		}
		
	}
	
}
