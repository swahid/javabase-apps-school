package org.javabase.apps.controller.classes.user;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="dashboard/user")
public class UserController {
	
	private static final Logger log = LoggerFactory.getLogger(RoomController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String users() {
		return "user/user";
	}
	
	@ResponseBody
	@RequestMapping(value="load",method=RequestMethod.GET)
	public Map<String, Object> loadUser() {
		Map<String, Object> response= new HashMap<String, Object>();
		try {
			List<User> userList = userService.getAllUsers();
			
			response.put("success", true);
			response.put("data", userList);
			response.put("draw", "1");
			response.put("recordsFiltered", "10");
			response.put("recordsTotal", userList.size());
			
		} catch (Exception e) {
			response.put("success", false);
			e.printStackTrace();
		}
		return response;
	}

}
