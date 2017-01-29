package org.javabase.apps.controller.institutionSettings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InsShift;
import org.javabase.apps.entity.InstitutionInfo;
import org.javabase.apps.entity.User;
import org.javabase.apps.service.InsShiftService;
import org.javabase.apps.service.InstitutionInfoService;
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
@RequestMapping(value = "/insShift")
public class InsShiftController {
	
	@Autowired
	InsShiftService insShiftService;
	
	@Autowired
	InstitutionInfoService institutionInfoService;
	
	@Autowired
    UserService userservice;
	
	public User user;
	
	@RequestMapping(method = RequestMethod.GET)
    public String roomPage() {
        return "institution/insShift";
    }
	
	@ResponseBody
	@RequestMapping(value = "load",method = RequestMethod.GET)
	public Map<String, Object> allInsShift() {
		Map<String, Object> response= new HashMap<String, Object>();
		Map<String, Object> param= new HashMap<String, Object>();
		
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		if (principal instanceof UserDetails) {
			String username = ((UserDetails) principal).getUsername();
			 user = userservice.getUserByUsername(username);
		}
		param.put("entryUser", user.getUserid());
		
		List<InsShift> insShiftList = insShiftService.getAllInsShiftsByParam(param);
			
		response.put("success", true);
		response.put("data", insShiftList);
		return response;
		
	}
	
	@ResponseBody
	@RequestMapping(value="addInsShift", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody InsShift insShift) {
		Map<String, Object> response= new HashMap<String, Object>();
		Map<String, Object> param= new HashMap<String, Object>();
		
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		if (principal instanceof UserDetails) {
			String username = ((UserDetails) principal).getUsername();
			 user = userservice.getUserByUsername(username);
		}
		
		param.put("entryUser", user.getUserid());
		
		List<InstitutionInfo> instituteList = institutionInfoService.getAllInstitutionInfosByParam(param);
		
		if(instituteList.size()>0){
			insShift.setInsId(instituteList.get(0).getInsId());
		}
		
		Boolean save = insShiftService.addInsShift(insShift);
		
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
