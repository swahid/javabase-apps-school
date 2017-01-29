package org.javabase.apps.controller.setup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.BuildingInfo;
import org.javabase.apps.entity.InstitutionInfo;
import org.javabase.apps.entity.User;
import org.javabase.apps.service.BuildingInfoService;
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
@RequestMapping(value = "/building")
public class BuildingController {
	
	@Autowired
	BuildingInfoService buildingInfoService;
	
	@Autowired
	InstitutionInfoService institutionInfoService;
	
	@Autowired
    UserService userservice;
	
	public User user;
	
	@RequestMapping(method = RequestMethod.GET)
    public String buildingPage() {
        return "institution/building";
    }
	
	@ResponseBody
	@RequestMapping(value = "/load",method = RequestMethod.GET)
	public Map<String, Object> classInfo() {
		Map<String, Object> response= new HashMap<String, Object>();
		Map<String, Object> param= new HashMap<String, Object>();
		
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		if (principal instanceof UserDetails) {
			String username = ((UserDetails) principal).getUsername();
			 user = userservice.getUserByUsername(username);
		}
		
		param.put("entryUser", user.getUserid());
		
		List<BuildingInfo> buildingListOnInstitute = buildingInfoService.getAllBuildingInfosByParam(param);
		
		response.put("success", true);
		response.put("data", buildingListOnInstitute);
		
		return response;
	}
	
	@ResponseBody
	@RequestMapping(value="addNewbuilding", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody BuildingInfo buildingInfo) {
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
			buildingInfo.setInsId(instituteList.get(0).getInsId());
		}
		
						
		Boolean save = buildingInfoService.addBuildingInfo(buildingInfo);
		
		if (save) {
			response.put("suceess", true);
	        response.put("message", "Add Building Sucess");
			return response;
		}else {
			response.put("error", true);
	        response.put("message", "Add Building Failed");
			return response;
		}
		
	}
	
}
