package org.javabase.apps.controller.user;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.Role;
import org.javabase.apps.entity.User;
import org.javabase.apps.entity.UserInformation;
import org.javabase.apps.service.UserInformationService;
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
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userservice;
	
	@Autowired
	UserInformationService userInformationService;
	
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
			response.put("success", true);
			response.put("data", userList);
		}else {
			response.put("success", false);
			response.put("message", "No Data Found");
		}
		
		return response; 
	}
	@ResponseBody
	@RequestMapping(value="adduser",  method=RequestMethod.POST)
	public Map<String, Object> saveUser(@RequestBody Map<String, String> entity){
		Map<String, Object> response = new HashMap<>();
		
		String userName   = entity.get("userName");
		String password   = entity.get("password");
		String email      = entity.get("email");
		String firstName  = entity.get("firstName");
		String lastName   = entity.get("lastName");
		String gender     = entity.get("gender");
		String createUser = entity.get("createUser");
		Date createDate   = new Date();
		String roleId     = entity.get("roleId");
		Role role = new Role();
		User user = new User();
		UserInformation userInfo= new UserInformation();
		
		role.setRoleId(Integer.valueOf(roleId));
		user.setUsername(userName);
		user.setPassword(password);
		user.setEmail(email);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setCreateDate(createDate);
		user.setActive(true);
		user.setCredintialNonExpired(true);
		user.setAccountNonExpired(true);
		user.setNonLocked(true);
		user.setUserInformation(userInfo);
		user.setRole(role);
		
		userInfo.setEmailPrimary(email);
        userInfo.setFirstName(firstName);
        userInfo.setLastName(lastName);
        userInfo.setGender(gender);
        userInfo.setEntryUser(createUser);
        
		
		boolean save = userservice.addUser(user);
		
		if (save) {
		    
		    user = userservice.getUserByUsername(userName);
		    userInfo.setUser(user);
		    userInformationService.save(userInfo);
		    
		    response.put("success", true);
		    response.put("message", "save success");
        }else {
            log.info("insert failed");
            response.put("error", true);
            response.put("message", "unable to save");
        }
		
		return response; 
	}
	
	@ResponseBody
    @RequestMapping(value="changePassword",  method=RequestMethod.PUT)
    public Map<String, Object> saveUser(@RequestBody User user){
        Map<String, Object> response = new HashMap<>();
        
        String password = user.getPassword();
        
        System.out.println("passowrd" + password);
        
        user = userservice.getUserById(user.getUserId());
        user.setPassword(password);
        boolean update = userservice.updateUser(user);
        
        if (update) {
            response.put("success", true);
            response.put("message", "save success");
        }else {
            log.info("insert failed");
            response.put("error", true);
            response.put("message", "unable to save");
        }
        
        return response; 
    }
}
