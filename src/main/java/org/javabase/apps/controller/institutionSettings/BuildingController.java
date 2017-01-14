package org.javabase.apps.controller.institutionSettings;

import java.util.HashMap;
import java.util.Map;

import org.javabase.apps.entity.BuildingInfo;
import org.javabase.apps.service.BuildingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping(method = RequestMethod.GET)
    public String buildingPage() {
        return "institution/building";
    }
	
	@ResponseBody
	@RequestMapping(value="addNewbuilding", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody BuildingInfo buildingInfo) {
		Map<String, Object> response= new HashMap<String, Object>();
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
