package org.javabase.apps.controller.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.controller.setup.RoomController;
import org.javabase.apps.entity.User;
import org.javabase.apps.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="dashboard/user")
public class UserController {
	
	private static final Logger log = LoggerFactory.getLogger(RoomController.class);
	
	@Autowired
	UserService userservice;
	
	@RequestMapping(method=RequestMethod.GET)
	public String users() {
		return "user/user";
	}
	
	@ResponseBody
	@RequestMapping(value="load",  method=RequestMethod.GET)
	public Map<String, Object> loadUser(){
		Map<String, Object> response = new HashMap<>();
		List<User> userList = userservice.getAllUsers();
		if (userList.size()>0) {
			User user = userList.get(0);
			response.put("success", true);
			response.put("data", userList);
			response.put("roleName", user.getRole().getRolename());
		}else {
			response.put("success", false);
			response.put("message", "No Data Found");
		}
		
		return response; 
	}
	@ResponseBody
	@RequestMapping(value="save",  method=RequestMethod.POST)
	public Map<String, Object> saveUser(@RequestBody Map<String, Map<String, Object>> param){
		Map<String, Object> response = new HashMap<>();
		log.info(param.get("userName").toString());
		return response; 
	}
}
