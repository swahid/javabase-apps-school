package org.javabase.apps.controller.employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.TeacherDetails;
import org.javabase.apps.entity.User;
import org.javabase.apps.service.TeacherDetailsService;
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
@RequestMapping(value = "dashboard/teacher")
public class TeacherController {
	
	private static final Logger log=LoggerFactory.getLogger(TeacherController.class);
	
	@Autowired
	UserService userservice;
	
	@Autowired
	TeacherDetailsService teacherDetailsService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String studentPage() {
        return "employee/teacher";
    }
	
	@ResponseBody
	@RequestMapping(value = "load",method = RequestMethod.GET)
	public Map<String, Object> allTeacher() {
		Map<String, Object> response= new HashMap<String, Object>();
		
		List<TeacherDetails> teacherList = teacherDetailsService.getAllTeacherDetailss();
			
		response.put("success", true);
		response.put("data", teacherList);
		return response;
		
	}
	
	@ResponseBody
	@RequestMapping(value="add", method = RequestMethod.POST)
	public Map<String, Object> registration(@RequestBody Map<String, String> entity) {
		Map<String, Object> response= new HashMap<String, Object>();
		
		int userID   = Integer.parseInt(entity.get("userID"));
		String designation   = entity.get("designation");
		
		TeacherDetails teacherDetails=new TeacherDetails();
		User user=userservice.getUserById(userID);
		teacherDetails.setUser(user);
		teacherDetails.setDesignation(designation);
		
		Boolean save = teacherDetailsService.addTeacherDetails(teacherDetails);
		
		if (save) {
			response.put("suceess", true);
	        response.put("message", "Add Teacher Sucess");
			return response;
		}else {
			response.put("error", true);
	        response.put("message", "Add Teacher Failed");
			return response;
		}
	}
	
	
}
