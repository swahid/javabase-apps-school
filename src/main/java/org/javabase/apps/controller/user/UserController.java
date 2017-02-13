package org.javabase.apps.controller.user;

import java.util.List;

import org.javabase.apps.controller.setup.RoomController;
import org.javabase.apps.entity.User;
import org.javabase.apps.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="dashboard/user")
public class UserController {
	
	private static final Logger log = LoggerFactory.getLogger(RoomController.class);
	
	@Autowired
	UserService userservice;
	
	@RequestMapping(method=RequestMethod.GET)
	public String users(Model mv) {
		List<User> userList = userservice.getAllUsers();;
		mv.addAttribute("userTable", userList);
		return "user/user";
	}
}
