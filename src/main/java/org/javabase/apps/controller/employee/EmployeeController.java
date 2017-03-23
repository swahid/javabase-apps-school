package org.javabase.apps.controller.employee;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.Employees;
import org.javabase.apps.entity.Role;
import org.javabase.apps.entity.TeacherDetails;
import org.javabase.apps.entity.User;
import org.javabase.apps.entity.UserInformation;
import org.javabase.apps.service.EmployeesService;
import org.javabase.apps.service.TeacherDetailsService;
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
@RequestMapping(value = "dashboard/employee")
public class EmployeeController {
	
	private static final Logger log=LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	UserService userservice;
	
	@Autowired
	EmployeesService employeesService;
	
	@Autowired
	UserInformationService userInformationService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String studentPage() {
        return "employee/employee";
    }
	
	@ResponseBody
	@RequestMapping(value = "load",method = RequestMethod.GET)
	public Map<String, Object> allTeacher() {
		Map<String, Object> response= new HashMap<String, Object>();
		
		List<Employees> teacherList = employeesService.getAllEmployeess();
			
		response.put("success", true);
		response.put("data", teacherList);
		return response;
		
	}
	
	@ResponseBody
	@RequestMapping(value="add", method = RequestMethod.POST)
	public Map<String, Object> registration(@RequestBody Map<String, String> entity) {
		Map<String, Object> response= new HashMap<String, Object>();
		
		 
		String userName    = entity.get("username");
		String password    = entity.get("password");
		String email       = entity.get("email");
		String firstName   = entity.get("firstname");
		String lastName    = entity.get("lastName");
		String gender      = entity.get("gender");
		String createUser  = entity.get("createUser");
		String phoneno 	   = entity.get("phoneno");
		Date createDate    = new Date();
		String roleId      = entity.get("roleId");
		String employeeID  = entity.get("employeeID");
		String empPsot     = entity.get("empPost");
		Role role 		   = new Role();
		User user 		   = new User();
		UserInformation userInfo= new UserInformation();
		Employees employees=new Employees();
		
		
		
		role.setRoleId(Integer.valueOf(1));
//		role.setRoleId(1);
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
		
		log.info(entity.get("empPost"));
		
		userInfo.setEmailPrimary(email);
        userInfo.setFirstName(firstName);
        userInfo.setLastName(lastName);
        userInfo.setGender(gender);
        userInfo.setEntryUser(createUser);
        
        employees.setEmployeeID(employeeID);
//        employees.setEpmloyeePost FIX ME
        
        log.info("all  variable initialized");
        
		boolean save = userservice.addUser(user);
		
		if (save) {
		    
			 log.info("user saved");
			 
		    user = userservice.getUserByUsername(userName);
		    userInfo.setUser(user);
		    
		    userInformationService.save(userInfo);
		   
		    log.info("userinfo saved");
		    
		    employees.setUser(user);
		    employeesService.addEmployees(employees);
		    
		    log.info("user added as a employee");
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
